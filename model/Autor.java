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
@Table(name = "Autor")

public class Autor {
			
	@Id
	@SequenceGenerator(name="pk_seq_autor",sequenceName="id_pk_autor", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_seq_autor")
	@Column(name="Cod_Autor", unique=true, nullable=false)
	private Integer id;
				
	@Column(name ="Nome")
	private String Nome;
	
	/*@OneToMany(mappedBy="autor")
	private Set<Autoria> autoria;*/
					
	public Autor(String Nome ) {
		this.setNome(Nome);
		}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	}
