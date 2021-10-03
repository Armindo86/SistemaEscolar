package TrabalhoBanco.model;

import java.security.Timestamp;
import java.sql.Date;

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
@Table(name = "Emprestimo")


public class Emprestimo {

		@Id
		@Column(name="data", unique=true, nullable=false)
		private Timestamp id;
		
		@Column(name = "cod_exemplar")
		private int cod_exemplar;
		
		@Column(name ="cod_aluno")
		private int cod_aluno;
		
		
		public Emprestimo(Timestamp id,int cod_exemplar,int cod_aluno ) {
			this.setData(id);
			this.setCodExemplar(cod_exemplar);
			this.setCodAluno(cod_aluno);
			}
		
		public Timestamp getData() {
			return id;
		}

		public void setData(Timestamp id) {
			this.id = id;
		}
		
		public int getCodExemplar(){
			return cod_exemplar;
		}

		public void setCodExemplar(int cod_exemplar){
			this.cod_exemplar = cod_exemplar;
		}
		
		public int getCodAluno() {
			return cod_aluno;
		}

		public void setCodAluno(int cod_aluno) {
			this.cod_aluno = cod_aluno;
		}
		
	}
	