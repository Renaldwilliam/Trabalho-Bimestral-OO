package entities;

import java.util.Map;
import java.util.TreeMap;

public class AlunosCurso {

	private Curso curso;
	private Map<String, Estudante> alunosCurso = new TreeMap<>() ;
	
	public AlunosCurso() {
	}

	public AlunosCurso(Curso curso) {
		super();
		this.curso = curso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Map<String, Estudante> getAlunosCurso() {
		return alunosCurso;
	}

	
	public void insereAluno(Estudante estu) {
		alunosCurso.put(estu.getRa(), estu);
	}
	
	public String recuperaAluno(String ra) {
		return alunosCurso.get(ra).getNome();
	}
	
}
