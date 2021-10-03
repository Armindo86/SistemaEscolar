package TrabalhoBanco.hibernate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import TrabalhoBanco.control.ModelController;
import TrabalhoBanco.model.Universidade;


public class UniversidadeInserir {
	Scanner ler = new Scanner(System.in);
				
			private ModelController modelCtr = new ModelController();
		
			public void close() {
				modelCtr.close();
			}
		
			public void clean() {
				modelCtr.deleteAll();
			}
		
			public void inserts() {
					
				Universidade ins = new Universidade("UFSC");
				modelCtr.insert(ins);
				
				ins = new Universidade("UDESC");
				modelCtr.insert(ins);
				
			}
		
			public static void main(String[] args) {
				UniversidadeInserir ex = new UniversidadeInserir();
				ex.clean();
				ex.inserts();
				//ex.print();
				ex.close();
			}
		 }


