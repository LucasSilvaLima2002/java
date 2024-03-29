import java.security.SecureRandom;

public class Craps {
    
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {
        CONTINUE, WON, LOST
    };
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();
    

        switch (sumOfDice) {

            case SEVEN: // ganha com 7 no primeiro lançamento
            case YO_LEVEN: // ganha com 11 no primeiro lançamento
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // perde com 2 no primeiro lançamento
            case TREY: // perde com 3 no primeiro lançamento
            case BOX_CARS: // perde com 12 no primeiro lançamento
                gameStatus = Status.LOST;
                break;
            default: // não ganhou nem perdeu, portanto registra a pontuação
                gameStatus = Status.CONTINUE; // jogo não terminou
                myPoint = sumOfDice; // informa a pontuação
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else if (sumOfDice == SEVEN)
                gameStatus = Status.LOST;
        }

        if (gameStatus == Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");

    }

    public static int rollDice() {

        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n",
                die1, die2, sum);

        return sum;

    }
}
