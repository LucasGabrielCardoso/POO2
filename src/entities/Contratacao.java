package entities;

import java.util.Date;
import entities.enums.Cargo;
import entities.enums.Status;

public class Contratacao {
	private Date datal;
	private Cargo cargo;
	private Status status;
	private Funcionario funcionario;
	private Projeto projeto;
	
	public Contratacao(Date datal, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		this.datal = datal;
		this.cargo = cargo;
		this.status = Status.PENDENTE;	
		this.funcionario = funcionario;
		this.projeto = projeto;
		projeto.adicionarContratacao(this);
	}

	public Date getDatal() {
		return datal;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public Status getStatus() {
		return status;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Projeto getProjeto() {
		return projeto;
	}
	
	public void contratar() {
		if(this.status == Status.PENDENTE) {
			this.status = Status.CONTRATADO;
		}
	}
	
	public void demitir() {
		if(this.status == Status.CONTRATADO) {
			this.status = Status.DEMITIDO;
		}
	}

	@Override
	public String toString() {
		return "Contratacao [datal=" + datal + ", cargo=" + cargo + ", status=" + status + ", funcionario="
				+ funcionario + ", projeto=" + projeto + "]";
	}
		
}
