package esig.selecao.dao;

import javax.persistence.EntityManager;

import esig.selecao.modelo.Tarefa;

public class TarefaDao {
	
	public void adicionar(Tarefa tarefa) {
		EntityManager em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.merge(tarefa);
		em.getTransaction().commit();
		em.close();
	}
}
