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
@Table(name = "Materia")

public class Materia {
	@Id
	@SequenceGenerator(name="pk_seq_materia",sequenceName="id_pk_materia", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_seq_materia")
	@Column(name="cod_materia", unique=true, nullable=false)
	private Integer id;
	
	@Column(name = "nome")
	private String nome_materia = "";
	
	@Column(name ="cod_curso")
	private int cod_curso;

	
	public Materia(String nome_materia,int cod_curso ) {
		this.setNome(nome_materia);
		this.setCodCurso(cod_curso);
		}
	
	public String getNome() {
		return nome_materia;
	}

	public void setNome(String nome_materia) {
		this.nome_materia = nome_materia;
	}
	
	public int getCodCurso() {
		return cod_curso;
	}

	public void setCodCurso(int cod_curso) {
		this.cod_curso = cod_curso;
	}
	
}
