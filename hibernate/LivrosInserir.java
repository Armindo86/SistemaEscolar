package TrabalhoBanco.hibernate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import TrabalhoBanco.control.ModelController;
import TrabalhoBanco.model.Livros;

public class LivrosInserir {
	
Scanner ler = new Scanner(System.in);
	
	private ModelController modelCtr = new ModelController();

	public void close() {
		modelCtr.close();
	}

	public void clean() {
		modelCtr.deleteAll();
	}

	public void inserts() {
		
	
		Livros ins = new Livros("a",2015,1);
		modelCtr.insert(ins);
		
		ins = new Livros("b",2015,1);
		modelCtr.insert(ins);
		
		ins = new Livros("c",2015,1);
		modelCtr.insert(ins);
		
		ins = new Livros("d",2015,1);
		modelCtr.insert(ins);
	}

	public static void main(String[] args) {
		LivrosInserir ex = new LivrosInserir();
		ex.clean();
		ex.inserts();
		ex.close();
	}



}
