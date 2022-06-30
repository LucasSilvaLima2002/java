package br.com.fiap.Model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "CIDADES")
public class Cidade {
	
	@Id
	@Column(name = "codigo")
	@SequenceGenerator(name = "SEQCIDADE", sequenceName = "SEQ_CIDADES", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQCIDADE")
	private Long codigo;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "estado_codigo", nullable = false)
	private Estado estado;
	
	@OneToMany(mappedBy = "cidade")
	private List<Bairro> bairros;
	
	/*-----------------------GETTERS AND SETTER-----------------------*/
	
	public void setNome(String nome)
	{ this.nome = nome; }
	
	public String getNome()
	{ return this.nome; }
	
	public void setEstado(Estado estado)
	{ this.estado = estado; }
	
	public Estado getEstado()
	{ return this.estado; }
	
	public Long getCodigo()
	{
		return this.codigo;
	}
}
