package esig.selecao.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * Criação do Hibernate Manager para conexão com o BD
 */
public class HibernateUtil {
	
	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("tarefas");
		
		return factory.createEntityManager();
		
		 
	}
}
