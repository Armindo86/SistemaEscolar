package TrabalhoBanco.hibernate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import TrabalhoBanco.control.ModelController;
import TrabalhoBanco.model.Curso;
import TrabalhoBanco.model.Universidade;

public class CursoInserir {
Scanner ler = new Scanner(System.in);
	
	private ModelController modelCtr = new ModelController();

	public void close() {
		modelCtr.close();
	}

	public void clean() {
		modelCtr.deleteAll();
	}

	public void inserts() {
		
		Curso inserir = new  Curso("Tic",4);
		modelCtr.insert(inserir);	
		inserir = new Curso("Enc",6);
		modelCtr.insert(inserir);	
		inserir = new Curso("ENE",5);
		modelCtr.insert(inserir);	
		inserir = new Curso("FISIO",5);
		modelCtr.insert(inserir);	
		
	}

	public static void main(String[] args) {
		CursoInserir ex = new CursoInserir();
		ex.clean();
		ex.inserts();
		ex.close();
	}




}
