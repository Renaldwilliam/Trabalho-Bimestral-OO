package entities;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author renald
 */
public class Pessoa {

	private String nome;
	private String cpf;
	private Date dtNascimento;
	
	public Pessoa() {
	}

	public Pessoa(String nome, String cpf, Date dtNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	public Integer getIdade() {
		GregorianCalendar hj=new GregorianCalendar();
		GregorianCalendar nascimento=new GregorianCalendar();
		if(getDtNascimento()!=null){
			nascimento.setTime(getDtNascimento());
		}		
		int anohj=hj.get(Calendar.YEAR);
		int anoNascimento= nascimento.get(Calendar.YEAR);
		return (anohj - anoNascimento);
	}
	
	
}
