package TrabalhoBanco.hibernate;

import java.util.Scanner;

import TrabalhoBanco.control.ModelController;
import TrabalhoBanco.hibernate.*;;

public class menu {
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
		
		int opcao=0;
				do{
				System.out.println("-------MENU------\n");
				System.out.println("1. Inserir\n");
				System.out.println("2. Deletar \n");
				System.out.println("3. Update\n");
				System.out.println("4. Listar\n");
				System.out.printf("Informe a opção: ");
				opcao = ler.nextInt();
				
				switch (opcao) {
				case 1:
					Inserir();
					break;
				case 2:
					Deletar();
					break;
				case 0:
					break;
				default:
					System.out.println("Opção Inválida!");
					break;
				}
			   }while(opcao!=0);
	
	}
	
	public static void Inserir(){
		AlunoInserir al = new AlunoInserir();
		AutorInserir au = new AutorInserir();
		AutoriaInserir aut = new AutoriaInserir();
		BibliotecaInserir bi = new BibliotecaInserir();
		CursoInserir cu = new CursoInserir();
		EditoraInserir ed = new EditoraInserir();
		ExemplarInserir ex = new ExemplarInserir();
		HistoricoInserir hi = new HistoricoInserir();
		LivrosInserir li = new LivrosInserir();
		MateriaInserir ma = new MateriaInserir();
		UniversidadeInserir un = new UniversidadeInserir();
		al.inserts();
		au.inserts();
		aut.inserts();
		bi.inserts();
		cu.inserts();
		ed.inserts();
		ex.inserts();
		hi.inserts();
		li.inserts();
		ma.inserts();
		un.inserts();
		
	}
	public static void Deletar(){
		
		ModelController mc = new ModelController();
		mc.deleteAll();
		
		
		
		
	}
	

	
	
}

