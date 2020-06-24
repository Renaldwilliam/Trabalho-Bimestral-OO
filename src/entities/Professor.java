package entities;

import java.util.Date;

/**
 * 
 * @author renald
 *
 */
public class Professor extends Pessoa{

	private String nRegistro;
	private String titulacao;
	private Double horasSemanais;
	private Double precoHora;
	
	public Professor() {
	}

	public Professor(String nome, String cpf, Date dtNascimento, String nRegistro, String titulacao,
			Double horasSemanais, Double precoHora) {
		super(nome, cpf, dtNascimento);
		this.nRegistro = nRegistro;
		this.titulacao = titulacao;
		this.horasSemanais = horasSemanais;
		this.precoHora = precoHora;
	}

	public String getnRegistro() {
		return nRegistro;
	}

	public void setnRegistro(String nRegistro) {
		this.nRegistro = nRegistro;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public Double getHorasSemanais() {
		return horasSemanais;
	}

	public void setHorasSemanais(Double horasSemanais) {
		this.horasSemanais = horasSemanais;
	}

	public Double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(Double precoHora) {
		this.precoHora = precoHora;
	}

	@Override
	public String toString() {
		return super.getNome();
	}
	
	

}
