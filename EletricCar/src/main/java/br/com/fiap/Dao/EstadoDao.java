package br.com.fiap.Dao;

import java.util.List;

import javax.persistence.*;

import br.com.fiap.Model.Estado;

public class EstadoDao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("EletricCar");
	private EntityManager manager = factory.createEntityManager();
	
	public List<Estado> consultarTodos()
	{
		String jpql = "from Estado order by nome";
		TypedQuery<Estado> query = manager.createQuery(jpql, Estado.class);
		return query.getResultList();
	}
	
}
