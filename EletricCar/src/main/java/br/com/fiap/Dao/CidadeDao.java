package br.com.fiap.Dao;

import javax.persistence.*;

import br.com.fiap.Model.Cidade;

public class CidadeDao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("EletricCar");
	private EntityManager manager = factory.createEntityManager();
	
	public void cadastrar(Cidade cidade)
	{
		try {
			
			manager.getTransaction().begin();
			manager.persist(cidade);
			manager.getTransaction().commit();
			
		} catch (Exception e) {
			
			System.out.println("Erro ao cadastrar cidade: " + e .getMessage());
			manager.getTransaction().rollback();
			
		} finally {
			
			manager.close();
			factory.close();
			
		}
	}
	
	public Cidade consultarPorNome( String nome )
	{
		try {
			String jpql = "FROM Cidade where nome = '" + nome + "'";
			TypedQuery<Cidade> query = manager.createQuery(jpql, Cidade.class);
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}
	
}
