package br.com.fiap.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.fiap.Dao.BairroDao;
import br.com.fiap.Dao.CepDao;
import br.com.fiap.Dao.CidadeDao;
import br.com.fiap.Dao.PostoDao;
import br.com.fiap.Model.Bairro;
import br.com.fiap.Model.Cep;
import br.com.fiap.Model.Cidade;
import br.com.fiap.Model.Estado;
import br.com.fiap.Model.Posto;
import br.com.fiap.View.Janela;

public class BotaoListener implements ActionListener {

	private Janela view;
	private int index;
	
	public BotaoListener(Janela view)
	{
		this.view = view;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Estado estado = new Estado();
		index = view.getComboEstados().getSelectedIndex();
		estado.setNome(view.getComboEstados().getItemAt(index).getNome().toUpperCase());
		estado.setUf(view.getComboEstados().getItemAt(index).getUf().toUpperCase());
		
		Cidade cidade = new Cidade();
		cidade.setNome( view.getTxtCidade().getText().toUpperCase() );
		cidade.setEstado( estado );
		
		Bairro bairro = new Bairro();
		bairro.setNome( view.getTxtBairro().getText().toUpperCase() );
		
		Cidade cidadeResult = new CidadeDao().consultarPorNome( cidade.getNome() );
		if (cidadeResult != null)
			bairro.setCidade(cidadeResult);
		else
		{
			new CidadeDao().cadastrar(cidade);
			bairro.setCidade(cidade);
		}		
		
		Cep cep = new Cep();
		cep.setCep(view.getTxtCep().getText());		
		cep.setNomeRua(view.getTxtRua().getText().toUpperCase());				
		
		Bairro bairroResult = new BairroDao().consultarPorNome(bairro.getNome());
		if (bairroResult != null) 
			cep.setBairro(bairroResult);
		else
		{
			new BairroDao().cadastrar(bairro);
			cep.setBairro(bairro);
		}
		
		Posto posto = new Posto();
		posto.setNome(view.getTxtNome().getText().toUpperCase());
		
		index = view.getComboAvaliacao().getSelectedIndex();
		posto.setAvaliacao( view.getComboAvaliacao().getItemAt(index) );
		
		index = view.getComboTipoPlug().getSelectedIndex();
		posto.setTipoPlug( view.getComboTipoPlug().getItemAt(index) );
		
		posto.setPrecoKwh( Double.parseDouble( view.getTxtPrecoKwh().getText() ) );
		
		Cep cepResult = new CepDao().consultar(cep.getCep());
		if (cepResult != null)
			posto.setCep(cepResult);
		else
		{
			new CepDao().cadastrar(cep);
			posto.setCep(cep);
		}			
		
		posto.setNumeroRua(Integer.parseInt(view.getTxtNmrRua().getText()));
		posto.setComplemento(view.getTxtComplemento().getText().toUpperCase());		
		new PostoDao().cadastrar(posto);
		view.carregarDados();
		
	}

}
