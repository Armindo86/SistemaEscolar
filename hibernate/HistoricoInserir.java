package TrabalhoBanco.hibernate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import TrabalhoBanco.control.ModelController;
import TrabalhoBanco.model.Historico;

public class HistoricoInserir {

Scanner ler = new Scanner(System.in);
	
	private ModelController modelCtr = new ModelController();

	public void close() {
		modelCtr.close();
	}

	public void clean() {
		modelCtr.deleteAll();
	}

	public void inserts() {
		
	
		Historico ins = new Historico(1,1,1,1,1);
		modelCtr.insert(ins);
		
		ins = new Historico(2,1,2,1,1);
		modelCtr.insert(ins);
		
		ins = new Historico(3,1,3,1,1);
		modelCtr.insert(ins);
		
		ins = new Historico(4,1,4,1,1);
		modelCtr.insert(ins);
	}

	public static void main(String[] args) {
		HistoricoInserir ex = new HistoricoInserir();
		ex.clean();
		ex.inserts();
		ex.close();
	}



}
