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
	private Tarefa tarefa = new Tarefa();
	private List<Tarefa> tarefas = new ArrayList<Tarefa>();

	public String adicionar() {	
		new TarefaDao().adicionar(tarefa);
		tarefas.add(tarefa);
		tarefa = new Tarefa();
		
		FacesContext.getCurrentInstance().addMessage("", 
				new FacesMessage("Salvo"));
		return "lista?faces-redirect=true";
			
	}
	
	public String getDataAtual() {
		return new SimpleDateFormat("dd/MM/yyyy")
				.format(new Date());
	}
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