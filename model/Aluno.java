package TrabalhoBanco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Aluno")

public class Aluno {
	
	@Id
	@SequenceGenerator(name="pk_id",sequenceName="id_pk", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_id")
	@Column(name="cod_aluno", unique=true, nullable=false)
	private Integer id;
	
	@Column(name = "nome_aluno")
	private String nome_aluno = "";
	
	@Column(name = "ano_entrada")
	private int ano_entrada;
	
	@Column(name = "tempo_maximo")
	private int tempo_maximo;
	
	@Column(name = "cod_universidade")
	private int cod_universidade;
	
	@Column(name = "cod_curso")
	private int cod_curso;
	
	
	public Aluno(String nome_aluno,int cod_universidade,int cod_curso,int ano_entrada,int tempo_maximo) {
		this.setNome(nome_aluno);
		this.setCodUni(cod_universidade);
		this.setEntra(ano_entrada);
		this.setTemMax(tempo_maximo);
		
	}
	
	
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome_aluno;
	}

	public void setNome(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}
	
	public int getCodUni() {
		return cod_universidade;
	}

	public void setCodUni(int cod_universidade) {
		this.cod_universidade = cod_universidade;
	}
	
	public int getCodCurso() {
		return cod_curso;
	}

	public void setCodCurso(int cod_curso) {
		this.cod_curso = cod_curso;
	}
	
	public int getTemMax() {
		return ano_entrada;
	}

	public void setTemMax(int ano_entrada) {
		this.ano_entrada = ano_entrada;
	}
	
	public int getEntra() {
		return tempo_maximo;
	}

	public void setEntra(int tempo_maximo) {
		this.tempo_maximo = tempo_maximo;
	}
	
	

}





