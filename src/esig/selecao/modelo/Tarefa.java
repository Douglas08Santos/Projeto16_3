package esig.selecao.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tarefa {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private Date data;
	private Boolean finalizado = false;
	private Boolean prioridade = false;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Boolean getFinalizado() {
		return finalizado;
	}
	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}
	public Boolean getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(Boolean prioridade) {
		this.prioridade = prioridade;
	}
	
	
	
}
