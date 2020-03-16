package esig.selecao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;

import esig.selecao.dao.HibernateUtil;
import esig.selecao.modelo.Tarefa;


/*
 * Classe usada para adicionar elementos direto no banco de dados
 * 
 */
public class PreencherTarefa {
	
	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		
		Tarefa tarefa1 = geraTarefa("Tarefa 1", "Essa é a tarefa 1", "18/3/2019", false);
		Tarefa tarefa2 = geraTarefa("Tarefa 2", "Essa é a tarefa 2", "18/3/2019", true);
		Tarefa tarefa3 = geraTarefa("Tarefa 3", "Essa é a tarefa 3", "18/3/2019", true);
		Tarefa tarefa4 = geraTarefa("Tarefa 4", "Essa é a tarefa 4", "18/3/2019", false);
		
		em.persist(tarefa1);
		em.persist(tarefa2);
		em.persist(tarefa3);
		em.persist(tarefa4);
		
		
		em.getTransaction().commit();
		em.close();
	}
	
	public static Tarefa geraTarefa(String nome, String descricao, String data, Boolean prioridade){
		Tarefa tarefa = new Tarefa();
		tarefa.setNome(nome);
		tarefa.setData(parseData(data));
		tarefa.setPrioridade(prioridade);
		return tarefa;
		
	}

	private static Date parseData(String data) {
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			return calendar.getTime();
		} catch (ParseException e) {
			throw new IllegalArgumentException(e);
		}
		
	}
		
}


