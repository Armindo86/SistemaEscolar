package TrabalhoBanco.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Universidade")

public class Universidade {
	@Id
	@SequenceGenerator(name="pk_seq_universidade",sequenceName="id_pk_universidade", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_seq_universidade")
	@Column(name="Cod_Universidade", unique=true, nullable=false)
	private Integer id;
	
	@Column(name = "nome_Universidade")
	private String nome_Universidade = "";
	
	/*@OneToMany(mappedBy="universidade")
	private Set<Curso> cursos;*/
	
	public Universidade(String nome_Universidade) {
		this.setNome(nome_Universidade);
	}
	
	public String getNome() {
		return nome_Universidade;
	}

	public void setNome(String nome_Universidade) {
		this.nome_Universidade = nome_Universidade;
	}
	
}
