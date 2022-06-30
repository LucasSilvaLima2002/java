package br.com.fiap.Model;

import javax.persistence.*;

@Entity
@Table(name = "CEP")
public class Cep {

	@Id
	@Column(name = "cep", nullable = false)
	private String cep;
	
	@Column(name = "nome_rua", nullable = false)
	private String nomeRua;
	
	@ManyToOne
	@JoinColumn(name = "bairro_codigo")
	private Bairro bairro;
	
	@OneToOne(mappedBy = "cep")
	private Posto posto;
	
	/*----------------------GETTERS AND SETTERS----------------------------*/
	
	public void setNomeRua(String nomeRua)
	{ this.nomeRua = nomeRua; }
	
	public String getNomeRua()
	{ return this.nomeRua; }
	
	public void setCep(String cep)
	{ this.cep = cep; }
	
	public String getCep()
	{ return this.cep; }
	
	public void setBairro(Bairro bairro)
	{ this.bairro = bairro; }
	
	public Bairro getBairro()
	{ return this.bairro; }
	
}
