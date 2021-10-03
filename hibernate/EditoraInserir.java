package TrabalhoBanco.hibernate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import TrabalhoBanco.control.ModelController;
import TrabalhoBanco.model.Editora;



public class EditoraInserir {
Scanner ler = new Scanner(System.in);
	
	private ModelController modelCtr = new ModelController();

	public void close() {
		modelCtr.close();
	}

	public void clean() {
		modelCtr.deleteAll();
	}

	public void inserts() {
		
	
		Editora ins = new Editora("Editora Intriseca");
		modelCtr.insert(ins);
		
		ins = new Editora("Editora Campus");
		modelCtr.insert(ins);
	}

	public static void main(String[] args) {
		EditoraInserir ex = new EditoraInserir();
		ex.clean();
		ex.inserts();
		ex.close();
	}


}
