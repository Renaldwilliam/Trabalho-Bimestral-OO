package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		Date y1 = sdf1.parse("23/12/2000");
		
		Pessoa p1 = new Pessoa("renald", "4658898", y1);
		System.out.println(p1.getIdade());
		
	}

}
