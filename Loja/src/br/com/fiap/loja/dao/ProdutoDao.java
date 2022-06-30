package br.com.fiap.loja.dao;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.model2.Produto;

public class ProdutoDao {

	public void inserir(Produto produto) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(produto);
		manager.getTransaction().commit();
		
	}
	
	
}
