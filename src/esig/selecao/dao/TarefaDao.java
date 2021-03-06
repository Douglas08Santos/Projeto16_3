package esig.selecao.dao;

import java.util.List;

import javax.persistence.EntityManager;

import esig.selecao.modelo.Tarefa;

/*
 * Classe responsavel pro fazer as alterações no banco de dados
 */
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
		tarefa = em.merge(tarefa);
		em.remove(tarefa);
		em.getTransaction().commit();
		em.close();
		
	}
}
