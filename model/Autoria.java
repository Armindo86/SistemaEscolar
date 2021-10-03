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
@Table(name = "Autoria")

public class Autoria {
	@Id
	@Column(name="cod_autor", unique=true, nullable=false)
	private Integer Cod_Autor;
	
	
	@Column(name="isbn", unique=true, nullable=false)
	private Integer isbn;
	
	/*@ManyToOne
	@JoinColumn(name="cod_autor")
	private Autor autor;
	
	@ManyToOne
	@JoinColumn(name="isbn")
	private Livros livros;*/
			
			public Autoria(int Cod_Autor,int isbn ) {
				this.setCodAutor(Cod_Autor);
				this.setIsbn(isbn);
				}
			
			public int getCodAutoro() {
				return Cod_Autor;
			}

			public void setCodAutor(int Cod_Autor) {
				this.Cod_Autor = Cod_Autor;
			}
			
			public int getIsbn() {
				return isbn;
			}

			public void setIsbn(int isbn) {
				this.isbn = isbn;
			}

}
