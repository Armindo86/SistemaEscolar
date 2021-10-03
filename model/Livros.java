package TrabalhoBanco.model;

import java.util.Set;

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
@Table(name = "Livros")

public class Livros {
	
		@Id
		@SequenceGenerator(name="pk_seq_livros",sequenceName="id_pk_livros", allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_seq_livros")
		@Column(name="isbn", unique=true, nullable=false)
		private Integer id;
		
		@Column(name = "titulo")
		private String titulo = "";
		
		@Column(name ="ano_lancamento")
		private int ano_lancamento;
		
		@Column(name ="cod_editora")
		private int cod_editora;
		
		/*@OneToMany(mappedBy="livros")
		private Set<Autoria> autoria;*/
		
		
		public Livros(String titulo,int ano_lancamento,int cod_editora ) {
			this.setTitulo(titulo);
			this.setAnoLancamento(ano_lancamento);
			this.setCodEditora(cod_editora);
			}
		
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public int getAnoLancamento() {
			return ano_lancamento;
		}

		public void setAnoLancamento(int ano_lancamento) {
			this.ano_lancamento = ano_lancamento;
		}
		
		public int getCodEditora() {
			return cod_editora;
		}

		public void setCodEditora(int cod_editora) {
			this.cod_editora = cod_editora;
		}
		
	}
