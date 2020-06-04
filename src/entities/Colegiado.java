package entities;

import java.util.ArrayList;
import java.util.List;

public class Colegiado {
	
	private Curso curso;
	private List <Professor> prof = new ArrayList<>(); 
	
	public Colegiado() {
	}

	public Colegiado(Curso curso) {
		this.curso = curso;
		
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Professor> getProf() {
		return prof;
	}


	public void inseriProfessor(Professor profs) {
		prof.add(profs);
	}
	
	public void removeProfessor(Professor profs) {
		prof.remove(profs);
	}

	@Override
	public String toString() {
		return "Colegiado [curso=" + curso + ", prof=" + prof +  "]";
	}
	
}
