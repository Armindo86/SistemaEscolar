package TrabalhoBanco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "Curso")

public class Curso {
	
	@Id
	@SequenceGenerator(name="pk_seq_curso",sequenceName="id_pk_curso", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_seq_curso")
	@Column(name="cod_curso", unique=true, nullable=false)
	private Integer id;
	
	@Column(name = "nome_Curso")
	private String nome_Curso = "";
	
	@Column(name ="duracao")
	private int duracao;
	
	@ManyToOne
	@JoinColumn(name="cod_universidade")
	private Universidade universidade;

	
	
	public Curso(String nome_curso,int duracao) {
		this.setNome(nome_curso);
		this.setDuracao(duracao);
		}
	
	public String getNome() {
		return nome_Curso;
	}

	public void setNome(String nome_Curso) {
		this.nome_Curso = nome_Curso;
	}
	
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
}
