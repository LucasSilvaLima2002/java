package br.com.fiap.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.Model.Cep;

public class CepDao {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("EletricCar");
	private EntityManager manager = factory.createEntityManager();
	
	public void cadastrar(Cep cep)
	{
		try {
			
			manager.getTransaction().begin();
			manager.persist(cep);
			manager.getTransaction().commit();
			
		} catch (Exception e) {
			
			System.out.println("Erro ao cadastrar cep: " + e .getMessage());
			manager.getTransaction().rollback();
			
		} finally {
			
			manager.close();
			factory.close();
			
		}
	}
	
	public Cep consultar( String cep )
	{
		try {
			String jpql = "FROM Cep where cep = '" + cep + "'";
			TypedQuery<Cep> query = manager.createQuery(jpql, Cep.class);
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

}
