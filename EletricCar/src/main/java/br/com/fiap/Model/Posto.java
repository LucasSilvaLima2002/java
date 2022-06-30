package br.com.fiap.Model;

import java.util.Vector;

import javax.persistence.*;

@Entity
@Table(name = "POSTOS")
public class Posto {
	
	@Id
	@SequenceGenerator(name = "SEQPOSTO", sequenceName = "SEQ_POSTOS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQPOSTO")
	@Column(name = "codigo")
	private Long codigo;
	
	@Column(name = "nome")
	private String nome;
	
	@OneToOne
	@JoinColumn(name = "cep_codigo")
	private Cep cep;
	
	@Column(name = "numero_rua")
	private int numeroRua;
	
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name = "avaliacao")
	private int avaliacao;
	
	@Column(name = "tipo_plug")
	private String tipoPlug;
	
	@Column(name = "preco_kwh")
	private double precoKwh;
	
	public void setNome(String nome)
	{ this.nome = nome; }
	
	public String getNome()
	{ return this.nome; }
	
	public void setAvaliacao(int avaliacao)
	{ this.avaliacao = avaliacao; }
	
	public int getAvaliacao()
	{ return this.avaliacao; }
	
	public void setTipoPlug(String tipoPlug)
	{ this.tipoPlug = tipoPlug; }
	
	public String getTipoPlug()
	{ return this.tipoPlug; }
	
	public void setNumeroRua(int numeroRua)
	{ this.numeroRua = numeroRua; }
	
	public int getNumeroRua()
	{ return this.numeroRua; }
	
	public void setComplemento(String complemento)
	{ this.complemento = complemento; }
	
	public String getComplemento()
	{ return this.complemento; }
	
	public void setPrecoKwh(double precoKwh)
	{ this.precoKwh = precoKwh; }
	
	public double getPrecoKwh()
	{ return this.precoKwh; }

	public void setCep(Cep cep)
	{ this.cep = cep; }
	
	public Cep getCep()
	{ return this.cep; }
	
	public Vector<String> getData()
	{
		Vector<String> data = new Vector<String>();
		data.add(nome);
		data.add(cep.getNomeRua());
		data.add(String.valueOf(numeroRua));
		data.add(complemento);
		data.add(cep.getBairro().getNome());
		data.add(cep.getBairro().getCidade().getNome());
		data.add(cep.getBairro().getCidade().getEstado().getNome());
		data.add(cep.getBairro().getCidade().getEstado().getUf());
		data.add(String.valueOf(precoKwh));
		data.add(tipoPlug);
		data.add(String.valueOf(avaliacao));
		
		return data;
	}
}
