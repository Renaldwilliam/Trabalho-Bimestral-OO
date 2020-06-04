package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import entities.Disciplina;
import entities.Pessoa;
import entities.Professor;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Date y1 = sdf1.parse("23/12/2000");
		
		Pessoa p1 = new Pessoa("renald", "4658898", y1);
		System.out.println(p1.getIdade());
		
		Professor p2 = new Professor("Renald", "55665", y1, "45565", "Junior", 2500.00, 55.00);
		
		System.out.println(p2.getnRegistro());
		
		Disciplina d1 = new Disciplina("Estrutura De Dados",45, p2);
		
		System.out.println(d1);
	}

}
