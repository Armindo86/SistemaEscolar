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
@Table(name = "Editora")

public class Editora {
	
			@Id
			@SequenceGenerator(name="pk_seq_editora",sequenceName="id_pk_editora", allocationSize=1)
			@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_seq_editora")
			@Column(name="cod_editora", unique=true, nullable=false)
			private Integer id;
			
			@Column(name = "nome")
			private String nome = "";
			
			public Editora(String nome ) {
				this.setNome(nome);

				}
			
			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

}
