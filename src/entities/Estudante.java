package entities;

import java.util.Date;

public class Estudante extends Pessoa {
	
	private String ra;
	private Integer periodo;
	private Curso curso;

	public Estudante() {
	}

	public Estudante(String nome, String cpf, Date dtNascimento, String ra, Integer periodo, Curso curso) {
		super(nome, cpf, dtNascimento);
		this.ra = ra;
		this.periodo = periodo;
		this.curso = curso;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	
	public String toString() {
		return "Estudante nome: " + super.getNome() + " Periodo: " + this.periodo  + " Curso: " + this.getCurso().getNomeCurso();
	}
	
	
}

