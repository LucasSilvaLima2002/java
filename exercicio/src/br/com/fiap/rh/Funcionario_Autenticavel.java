package br.com.fiap.rh;

public class Funcionario_Autenticavel{

	 private String senha = "123456";
	
	 
	 public boolean autenticar (String senha) {
//		 if (this.senha== senha) {
//			 return true;
//		 }else {
//			 return false;}
		return this.senha == senha ?  true :  false;
	 }
}
