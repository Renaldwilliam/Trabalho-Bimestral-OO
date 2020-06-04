package entities;

public class Disciplina {

	private String nome;
	private Integer cargaHoraria;
	private Professor professor;
	
	public Disciplina() {
	}

	public Disciplina(String nome, Integer cargaHoraria, Professor professor) {
		super();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", professor=" + professor + "]";
	}
	
	
}
