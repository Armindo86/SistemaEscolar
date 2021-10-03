package TrabalhoBanco.hibernate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import TrabalhoBanco.control.ModelController;
import TrabalhoBanco.model.Exemplar;

public class ExemplarInserir {

Scanner ler = new Scanner(System.in);
	
	private ModelController modelCtr = new ModelController();

	public void close() {
		modelCtr.close();
	}

	public void clean() {
		modelCtr.deleteAll();
	}

	public void inserts() {
		
	
		Exemplar ins = new Exemplar(1,2);
		modelCtr.insert(ins);
		
		ins = new Exemplar(1,2);
		modelCtr.insert(ins);
		
		ins = new Exemplar(1,2);
		modelCtr.insert(ins);
		
		ins = new Exemplar(1,2);
		modelCtr.insert(ins);
	}

	public static void main(String[] args) {
		ExemplarInserir ex = new ExemplarInserir();
		ex.clean();
		ex.inserts();
		ex.close();
	}



}
