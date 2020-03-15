package esig.selecao.dao;

import java.util.List;

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
	
	@SuppressWarnings("unchecked")
	public List<Tarefa>	listarTodos() {
		EntityManager em = HibernateUtil.getEntityManager();		
		return em.createQuery("SELECT t FROM Tarefa t").getResultList();
		
	}

	public void excluir(Tarefa tarefa) {
		EntityManager em = HibernateUtil.getEntityManager();	
		
		em.getTransaction().begin();
		em.remove(tarefa);
		em.getTransaction().commit();
		em.close();
		
	}
}
