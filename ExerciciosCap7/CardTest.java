public class CardTest {
    public static void main(String[] args) {

        DeckOfCard myDeckOfCards = new DeckOfCard();
        myDeckOfCards.shuffle();

        for (int i = 1; i < 52; i++) {
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (i % 4 == 0) 
            System.out.println();
            }
        }
    }

