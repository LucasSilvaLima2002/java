import java.security.SecureRandom;

public class DeckOfCard2 {

    private Card2[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;

    private static final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCard2() {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        deck = new Card2[NUMBER_OF_CARDS];
        currentCard = 0;
        for (int count = 0; count < deck.length; count++)
            deck[count] = new Card2(faces[count % 13], suits[count / 13]);
    }



public static void main(String[] args) {
    DeckOfCard2 deckOfCard = new DeckOfCard2();
    System.out.println(deckOfCard);

    
  
}
}
