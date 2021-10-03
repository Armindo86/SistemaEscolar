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
@Table(name = "Biblioteca")

public class Biblioteca {
		
		@Id
		@SequenceGenerator(name="pk_seq_biblioteca",sequenceName="id_pk_biblioteca", allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_seq_biblioteca")
		@Column(name="cod_biblioteca", unique=true, nullable=false)
		private Integer id;
		
		@Column(name = "nome")
		private String nome_biblioteca = "";
		
		@Column(name="cod_universidade")
		private int cod_universidade;

	
		public Biblioteca(String nome_biblioteca,int cod_universidade ) {
			this.setNome(nome_biblioteca);
			this.setCodUniversidade(cod_universidade);
			}
		
		public String getNome() {
			return nome_biblioteca;
		}

		public void setNome(String nome_biblioteca) {
			this.nome_biblioteca = nome_biblioteca;
		}
		
		public int getCodUniversidade() {
			return cod_universidade;
		}

		public void setCodUniversidade(int cod_universidade) {
			this.cod_universidade = cod_universidade;
		}
		
	}

