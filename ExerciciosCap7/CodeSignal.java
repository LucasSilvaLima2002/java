public class CodeSignal {
    public static int solution(int year) {
        int ano;
        int calculo = year % 100;
        if (calculo >= 1) {
            ano = year / 100 + 1;
        } else {
            ano = year / 100;
        }
        return ano;
    }

    public static boolean solution2(String inputString) {
        boolean boll = false;
        String[] teste = inputString.split("");
        int index = inputString.length();

        switch (index) {
            case 0:
            case 1:
            case 2:
                if (teste[0].equals(teste[index - 1])) {
                    boll = true;
                }
                break;
            default:
                if (teste[0].equals(teste[index - 1]) && teste[1].equals(teste[index - 2])
                        && teste[2].equals(teste[index - 3]) && teste[3].equals(teste[index - 4])
                        && teste[4].equals(teste[index - 5]) && teste[5].equals(teste[index - 6])
                        && teste[6].equals(teste[index - 7])) {
                    boll = true;
                }

        }

        return boll;
    }

    public static boolean palindromo(String inputString) {
        boolean boll = false;
        String reversa = new StringBuffer(inputString).reverse().toString();
        if (inputString.equals(reversa)) {
            boll = true;
        }
        return boll;
    }

    public static int solution3(int[] inputArray) {
        int x = 1;
        int y = 1;
        int media;
        int menor = -100;

        for (int i = 0; i < inputArray.length - 1; i++) {
            x = inputArray[i];
            y = inputArray[i + 1];
            media = x * y;
            if (menor < media) {
                menor = media;
            }
        }
        return menor;

    }

    public static int solution4(int n) {
        int resp = 0;

        resp = (n * (4 * (n - 1))) / 2 + 1;

        return resp;
    }

    public static int solution5(int[] statues) {

        // ordem crescente
        int y = 0;
        int total = 0;
        int flag = 0;
        for (int i = 1; i < statues.length; i++) {

            for (int j = 0; j < i; j++) {
                if (statues[i] < statues[j]) {
                    flag = statues[i];
                    statues[i] = statues[j];
                    statues[j] = flag;
                }
            }

        }

        // contar quantos faltam
        for (int i = 1; i < statues.length; i++) {
            y = (statues[i] - statues[i - 1]) - 1;
            if (y != 0) {
                total += y;
            }

        }
        return total;
    }

    public static boolean solution6(int[] sequence) {
        boolean bool = true;
        int contador = 0;
        int indice = 0;
        int valor = 0;
        int aux = 0;

        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sequence[i] < sequence[j]) {
                    if (contador < 1) {
                        sequence[j] = 0;
                        indice = j;
                        contador++;
                    }

                }
                if (sequence[i] == sequence[j]) {
                    if (contador < 1) {
                        sequence[i] = 0;
                        indice = i;
                        contador++;
                    }

                }
            }
        }
        if (contador == 1) {
            for (int i = indice; i < sequence.length - 1; i++) {
                sequence[i] = sequence[i + 1];
                if (i == sequence.length - 2) {
                    sequence[i + 1] = 0;
                }

            }

        }
        contador = 0;
        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < i; j++) {
                if (contador < 1 && sequence[i] != 0) {
                    if (sequence[i] <= sequence[j]) {
                        aux = sequence[i];
                        sequence[i] = sequence[j];
                        sequence[j] = aux;
                        contador++;
                    }
                }
            }
        }
        if (contador == 1) {
            bool = false;
        } else {
            bool = true;
        }

        return bool;
    }

    public static int solution7(int[][] matrix) {
     int x = 0;
     int sum = 0;

     for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < j; j++) {
         sum += matrix[i][j];
        }
       }
               
        return sum;
    }

    public static void main(String[] args) {

        int[][] array = {{ 0,1,1,2}, {0,5,0,0}};

        System.out.println(solution7(array));
            
            
        }
        

    }


