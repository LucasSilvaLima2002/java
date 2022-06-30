package fiap.com.br.ProdutoDao;

import java.util.List;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fiap.com.br.Produto.Produto;

public class ProdutoDao {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("posto");
	
	
	EntityManager manager = factory.createEntityManager();
	
	
	public void inserir(Produto produto) {
		
		manager.getTransaction().begin();
		manager.persist(produto);
		manager.getTransaction().commit();
		
	}
	public List<Produto> listarTodos(){
		String jpql = "FROM Produto order by estado";
		TypedQuery<Produto> query = manager.createQuery(jpql, Produto.class);
		
		return query.getResultList();
	}
	public void apagar(Produto produto) {
		manager.getTransaction().begin();
		manager.persist(produto);
		manager.getTransaction().commit();
	}

}
