package br.com.fiap.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BAIRROS")
public class Bairro {

	@Id
	@SequenceGenerator(name = "SEQBAIRRO", sequenceName = "SEQ_BAIRROS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQBAIRRO")
	@Column(name = "codigo")
	private Long codigo;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "cidade_codigo", nullable = false)
	private Cidade cidade;
	
	@OneToMany(mappedBy = "bairro")
	private List<Cep> ceps;
	
	/*---------------------GETTERS AND SETTERS-------------------*/
	
	public void setNome(String nome)
	{ this.nome = nome; }
	
	public String getNome()
	{ return this.nome; }
	
	public void setCidade(Cidade cidade)
	{ this.cidade = cidade; }
	
	public Cidade getCidade()
	{ return this.cidade; }
	
	public Long getCodigo()
	{
		return this.codigo;
	}
}
