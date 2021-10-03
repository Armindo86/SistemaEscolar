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
@Table(name = "Exemplar")

public class Exemplar {

		@Id
		@SequenceGenerator(name="pk_seq_exemplar",sequenceName="id_pk_exemplar", allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_seq_exemplar")
		@Column(name="cod_exemplar", unique=true, nullable=false)
		private Integer id;
		
		@Column(name = "cod_biblioteca")
		private int cod_biblioteca;
		
		@Column(name ="isbn")
		private int isbn;
		
		public Exemplar(int cod_biblioteca,int isbn ) {
			this.setCodBiblioteca(cod_biblioteca);
			this.setIsbn(isbn);
			}
		
		public int getCodBiblioteca() {
			return cod_biblioteca;
		}

		public void setCodBiblioteca(int cod_biblioteca) {
			this.cod_biblioteca = cod_biblioteca;
		}
		
		public int getIsbn() {
			return isbn;
		}

		public void setIsbn(int isbn) {
			this.isbn = isbn;
		}
		
	}

