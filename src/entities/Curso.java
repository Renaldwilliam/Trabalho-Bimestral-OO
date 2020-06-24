package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author renald
 *
 */
public class Curso {
	
	private String nomeCurso;
	private List<Disciplina> disc = new ArrayList<>(); 
	
	public Curso() {
	}

	public Curso(String nomeCurso) {
		super();
		this.nomeCurso = nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public List<Disciplina> getDisciplina() {
		return disc;
	}
	
	public void inseriDisciplina(Disciplina dis) {
		disc.add(dis);
	}
	
	public void removeDisciplina(Disciplina dis) {
		disc.remove(dis);
	}

	@Override
	public String toString() {
		return "Curso [nomeCurso=" + nomeCurso + ", disc=" + disc + "]";
	}

	

}
