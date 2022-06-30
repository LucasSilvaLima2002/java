package br.com.fiap.fiap_movie;

import java.util.List;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;



public class MyRadioGroup extends JPanel {
	
    private List<String> opcoes;
    private ButtonGroup grupo = new ButtonGroup();

    public MyRadioGroup(List<String> opcoes ){
        super();
        this.opcoes = opcoes;
        init();
        setLayout(new GridLayout(3,1));
		setSize(300, 300);    
    }

    private void init(){
        opcoes.forEach(opcao -> {
            JRadioButton radio = new JRadioButton(opcao);
            this.add(radio);
            grupo.add(radio);
        });
    }
}