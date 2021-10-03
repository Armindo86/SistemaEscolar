package TrabalhoBanco.hibernate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import TrabalhoBanco.control.ModelController;
import TrabalhoBanco.model.Autor;

public class AutorInserir {
	
Scanner ler = new Scanner(System.in);
	
	private ModelController modelCtr = new ModelController();

	public void close() {
		modelCtr.close();
	}

	public void clean() {
		modelCtr.deleteAll();
	}

	public void inserts() {
		
	
		Autor ins = new Autor("Rick Riordan");
		modelCtr.insert(ins);
		
		ins = new Autor("George R.R Martin");
		modelCtr.insert(ins);
		
		ins = new Autor("Abraham Silberschatz");
		modelCtr.insert(ins);
		
		ins = new Autor("Henry F.Korth");
		modelCtr.insert(ins);
	}

	public static void main(String[] args) {
		AutorInserir ex = new AutorInserir();
		ex.clean();
		ex.inserts();
		ex.close();
	}


}
