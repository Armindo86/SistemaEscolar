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
@Table(name = "Historico")

public class Historico {
	
		@Id
		@Column(name="numero_semestre", unique=true, nullable=false)
		private Integer id;
		
		@Column(name = "cod_materia")
		private int cod_materia;
		
		@Column(name ="cod_aluno")
		private int cod_aluno;
		
		@Column(name ="nota")
		private int nota;
		
		@Column(name ="ano_semestre")
		private int ano_semestre;
		
		public Historico(int id,int cod_materia,int cod_aluno,int nota,int ano_semestre ) {
			this.setId(id);
			this.setCodMateria(cod_materia);
			this.setCodAluno(cod_aluno);
			this.setNota(nota);
			this.setSemestre(ano_semestre);
			}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		public int getCodMateria() {
			return cod_materia;
		}

		public void setCodMateria(int cod_materia) {
			this.cod_materia = cod_materia;
		}
		public int getCodAluno() {
			return cod_aluno;
		}

		public void setCodAluno(int cod_aluno) {
			this.cod_aluno = cod_aluno;
		}
		public int getNota() {
			return nota;
		}

		public void setNota(int nota) {
			this.nota = nota;
		}
		public int getSemestre() {
			return ano_semestre;
		}

		public void setSemestre(int ano_semestre) {
			this.ano_semestre = ano_semestre;
		}
		
	}
