package TrabalhoBanco.hibernate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import TrabalhoBanco.control.ModelController;
import TrabalhoBanco.model.Autoria;

public class AutoriaInserir {
	
Scanner ler = new Scanner(System.in);
	
	private ModelController modelCtr = new ModelController();

	public void close() {
		modelCtr.close();
	}

	public void clean() {
		modelCtr.deleteAll();
	}

	public void inserts() {
		
	
		Autoria ins = new Autoria(1,2);
		modelCtr.insert(ins);
		
		ins = new Autoria(2,3);
		modelCtr.insert(ins);
		
		ins = new Autoria(3,1);
		modelCtr.insert(ins);
		
		ins = new Autoria(4,4);
		modelCtr.insert(ins);
	}

	public static void main(String[] args) {
		AutoriaInserir ex = new AutoriaInserir();
		ex.clean();
		ex.inserts();
		ex.close();
	}

}
