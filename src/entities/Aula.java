package entities;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Aula {

	private String lab;
	private Date dataHora;
	private Disciplina disc;
	private Map<String, Estudante> alunosAula = new TreeMap<>();

	public Aula() {
	}

	public Aula(String lab, Date dataHora, Disciplina disc) {
		this.lab = lab;
		this.dataHora = dataHora;
		this.disc = disc;
	}

	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Disciplina getDisc() {
		return disc;
	}

	public void setDisc(Disciplina disc) {
		this.disc = disc;
	}

	public Map<String, Estudante> getAlunosAula() {
		return alunosAula;
	}

	public String recuperaAluno(String ra) {
		return alunosAula.get(ra).getNome();
	}
	
	public void insereAluno(Estudante aluno) {
		alunosAula.put(aluno.getRa(),aluno);
	}
	
}

