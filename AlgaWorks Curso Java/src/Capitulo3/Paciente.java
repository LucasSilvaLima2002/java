package Capitulo3;

public class Paciente {
	
	double peso;
	double altura;
	
	double calcularIndiceDeMassaCorporal() {
		double imc = peso / (altura * altura);
		return imc;
	}
	
	public void teste() {
		System.out.println("teste");
	}
	
	
		IMC calcularIndiceDeMassaCorporal1(){
		IMC imc = new IMC();
		double indice = peso / (altura * altura);
		
		if(indice < 19.5) {
			imc.abaixoDoPesoIdeal = true;
		}
			else if(indice < 25) {
			imc.pesoIdeal = true;
			}else{
				imc.obeso = true;
				
			}if(indice < 35) {
				imc.grauDeObesidade = "I";
			}else if(indice < 40){
				imc.grauDeObesidade = "II";
			}else {
				imc.grauDeObesidade = "III";
			}
			return imc;
	}
}


