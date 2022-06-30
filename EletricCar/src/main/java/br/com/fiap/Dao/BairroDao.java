package br.com.fiap.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.Model.Bairro;

public class BairroDao {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("EletricCar");
	private EntityManager em = factory.createEntityManager();
	
	public void cadastrar(Bairro bairro)
	{
		try {
			
			em.getTransaction().begin();
			em.persist(bairro);
			em.getTransaction().commit();
			
		} catch(Exception e) {
			
			System.out.println("Erro ao cadastrar bairro: " + e.getMessage());
			em.getTransaction().rollback();
			
		} finally {
			em.close();
			factory.close();
		}
	}
	
	public Bairro consultarPorNome( String nome )
	{
		try {
			String jpql = "FROM Bairro where nome = '" + nome + "'";
			TypedQuery<Bairro> query = em.createQuery(jpql, Bairro.class);
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

}
