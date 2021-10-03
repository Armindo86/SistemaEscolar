package TrabalhoBanco.hibernate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import TrabalhoBanco.control.ModelController;
import TrabalhoBanco.model.Materia;

public class MateriaInserir {
	
Scanner ler = new Scanner(System.in);
	
	private ModelController modelCtr = new ModelController();

	public void close() {
		modelCtr.close();
	}

	public void clean() {
		modelCtr.deleteAll();
	}

	public void inserts() {
		
	
		Materia ins = new Materia("bANCO",1);
		modelCtr.insert(ins);
		
		ins = new Materia("INOVAÇÃO",2);
		modelCtr.insert(ins);
		
		ins = new Materia("Gestão",1);
		modelCtr.insert(ins);
		
		ins = new Materia("Programçaõ",2);
		modelCtr.insert(ins);
	}

	public static void main(String[] args) {
		MateriaInserir ex = new MateriaInserir();
		ex.clean();
		ex.inserts();
		ex.close();
	}



}
