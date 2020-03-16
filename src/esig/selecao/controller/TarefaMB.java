package esig.selecao.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import esig.selecao.dao.TarefaDao;
import esig.selecao.modelo.Tarefa;



@ManagedBean
@SessionScoped
public class TarefaMB{	
	
	private Tarefa tarefa;// = new Tarefa();
	private List<Tarefa> tarefas = new ArrayList<Tarefa>();
	
	/*
	 * Construtor
	 */
	public TarefaMB() {
		tarefas = new TarefaDao().listarTodos();
		tarefa = new Tarefa();
	}
	
	//CREATE
	public String adicionar() {	
		new TarefaDao().adicionar(tarefa);
		tarefas = new TarefaDao().listarTodos();
		tarefa = new Tarefa();
		
		return "index?faces-redirect=true";
			
	}
	
	//UPDATE
	public void atualizarItem(Tarefa tarefa) {
		new TarefaDao().adicionar(tarefa);
	}
	
	public String editar(Tarefa tarefa) {
		this.tarefa = tarefa;
		return "index?faces-redirect=true";
	}
	
	//DELETE
	public String excluir(Tarefa tarefa) {
		new TarefaDao().excluir(tarefa);
		tarefas = new TarefaDao().listarTodos();
		return "index?faces-redirect=true";
		
	}
	/*
	 * Utilizida para determinar o dia atual, para que o
	 * usuario não adicione uma data anterior a data atual	
	 */
	public String getDataAtual() {
		return new SimpleDateFormat("dd/MM/yyyy")
				.format(new Date());
	}
	
	/*
	 * GETTERS E SETTERS
	 */
	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	
	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}	
	
}
