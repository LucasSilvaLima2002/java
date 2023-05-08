import java.security.SecureRandom;

public class DeckOfCard {

   
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private Card[] deck = new Card[NUMBER_OF_CARDS];

    private static final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCard() {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        currentCard = 0; // a primeira Card distribuída será o deck[0]

        for (int count = 0; count < deck.length; count++)
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
    }

    public void shuffle() {
        currentCard = 0;

        for (int first = 0; first < NUMBER_OF_CARDS; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    public Card dealCard(){
        if (currentCard < deck.length) {
            return deck[currentCard++];
        }else{
            return null;
        }
    }
}
