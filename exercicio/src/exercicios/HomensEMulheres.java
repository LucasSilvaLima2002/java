package exercicios;

public class HomensEMulheres {
	

	int sexo, qtMulheres=0, qtHomens=0;
    float altura, somaH=0, mediaHomens=0, maior=0, menor=0;
	
   public void quantidadeDeMulheres() {
	
	  
	   
	   if (sexo == 1) {
           qtMulheres++;
       } else if (sexo == 2) {
           qtHomens++;
           somaH = somaH + altura;
	   
}
	   System.out.println(qtMulheres);
	   System.out.println(qtHomens);
	
	
   }	
	
}
