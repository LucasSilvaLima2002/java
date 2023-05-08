public class Maiornumero{
public static void main(String[] args) {
    int numero = 100;
    int[] vetor = {97,32,48,53,99};
    int indice = 0;
    int menor = 0;

    for (int i = 0; i < vetor.length; i++) {
        int x = numero - vetor[i];
        menor = numero - vetor[0];

     

        if(menor > x){
            menor = x;
            indice = i;
        }
    }
   System.out.println(menor);
}
}