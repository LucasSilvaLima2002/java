package br.com.fiap.Model;

import java.util.List;
import java.util.Vector;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADOS")
public class Estado {

	@Id
	@Column(name = "uf")
	private String uf;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@OneToMany(mappedBy = "estado")
	private List<Cidade> cidades;
	
	/*-----------------------GETTERS AND SETTERS-----------------------*/
	
	public void setNome(String nome)
	{ this.nome = nome; }
	
	public String getNome()
	{ return this.nome; }
	
	public void setUf(String uf)
	{ this.uf = uf; }
	
	public String getUf()
	{ return this.uf; }
	
	public Vector<String> getData()
	{
		Vector<String> data = new Vector<String>();
		data.add(nome);
		data.add(uf);
		return data;
	}
	
	@Override
	public String toString() {
		return this.nome + " - " + this.uf;
	}
}
