package TrabalhoBanco.hibernate;

import java.security.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import TrabalhoBanco.control.ModelController;
import TrabalhoBanco.model.Autor;
import TrabalhoBanco.model.Emprestimo;

public class EmprestimoInserir {
	
Scanner ler = new Scanner(System.in);
	
	private ModelController modelCtr = new ModelController();

	public void close() {
		modelCtr.close();
	}

	public void clean() {
		modelCtr.deleteAll();
	}

	public void inserts() {
		
		Timestamp t=(14/10/05)
		Emprestimo ins = new Emprestimo(t,1,2);
		modelCtr.insert(ins);
		
		ins = new  Emprestimo(t,1,2);;
		modelCtr.insert(ins);
		
		ins = new  Emprestimo(t,1,2);
		modelCtr.insert(ins);
		
		ins = new Emprestimo(t,1,2);
		modelCtr.insert(ins);
	}

	public static void main(String[] args) {
		AutorInserir ex = new AutorInserir();
		ex.clean();
		ex.inserts();
		ex.close();
	}



}
