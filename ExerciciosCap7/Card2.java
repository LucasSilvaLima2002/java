public class Card2 {
    private final String face;
    private final String suit;

    public Card2(String cardFace, String cardSuit){
        this.face = cardFace;
        this.suit = cardSuit;
    }

    public String toString()
    {
        return face + " of " + suit;
    }

    public static void main(String[] args) {
        Card2 card = new Card2(null, null);
        System.out.println(card.toString());
    }
}
