package br.com.fiap.Dao;

import java.util.List;

import javax.persistence.*;
import javax.swing.JOptionPane;

import br.com.fiap.Model.Posto;

public class PostoDao {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("EletricCar");
	private EntityManager manager = factory.createEntityManager();
	
	public void cadastrar(Posto posto)
	{
		try 
		{
			manager.getTransaction().begin();
			manager.persist(posto);
			manager.getTransaction().commit();
		} catch (Exception e) 
		{ 
			if (manager.getTransaction().isActive())
				manager.getTransaction().rollback();
			
			JOptionPane.showMessageDialog(null, e.getMessage()); 
		} finally 
		{
			manager.close();
			factory.close();
		}
	}
	
	public List<Posto> consultarTodos()
	{
		String jpql = "FROM Posto";
		TypedQuery<Posto> query = manager.createQuery(jpql, Posto.class);
		return query.getResultList();
	}

}
