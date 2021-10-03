package TrabalhoBanco.hibernate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import TrabalhoBanco.control.ModelController;
import TrabalhoBanco.model.Biblioteca;

public class BibliotecaInserir {
	
	private ModelController modelCtr = new ModelController();

	public void close() {
		modelCtr.close();
	}

	public void clean() {
		modelCtr.deleteAll();
	}

	public void inserts() {
		
	
		Biblioteca ins = new Biblioteca("Setorial_Ufsc",1);
		modelCtr.insert(ins);
		
		ins = new Biblioteca("Setorial Udesc",2);
		modelCtr.insert(ins);

	}
	
	public static void main(String[] args) {
		BibliotecaInserir ex = new BibliotecaInserir();
		ex.clean();
		ex.inserts();
		ex.close();
	}


}
