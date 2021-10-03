package TrabalhoBanco.hibernate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import TrabalhoBanco.control.ModelController;
import TrabalhoBanco.model.Aluno;



public class AlunoInserir {
	Scanner ler = new Scanner(System.in);
	
	private ModelController modelCtr = new ModelController();

	public void close() {
		modelCtr.close();
	}

	public void clean() {
		modelCtr.deleteAll();
	}

	public void inserts() {
		
	
		Aluno teste = new Aluno("everton",1,2,2015,2020);
		modelCtr.insert(teste);
		
		teste = new Aluno("joao",1,2,2015,2018);
		modelCtr.insert(teste);
		
		teste = new Aluno("roberto",1,2,2013,2019);
		modelCtr.insert(teste);
		
		teste = new Aluno("jeison",1,2,2014,2021);
		modelCtr.insert(teste);
		
		teste = new Aluno("everton",1,2,2015,2020);
		modelCtr.insert(teste);
		
	}

	public static void main(String[] args) {
		AlunoInserir ex = new AlunoInserir();
		ex.clean();
		ex.inserts();
		ex.close();
	}

}