public class CardTest {

    public static void main(String[] args) {
        testCardCreation();
        testCardComparison();
    }

    private static void testCardCreation() {
        Card card1 = new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card card2 = new Card(Card.Value.QUEEN, Card.Suit.HEARTS);
        Card card3 = new Card(Card.Value.NINE, Card.Suit.CLUBS);

        assert card1.getValue() == Card.Value.ACE;
        assert card1.getSuit() == Card.Suit.SPADES;
        assert card2.getValue() == Card.Value.QUEEN;
        assert card2.getSuit() == Card.Suit.HEARTS;
        assert card3.getValue() == Card.Value.NINE;
        assert card3.getSuit() == Card.Suit.CLUBS;

        assert card1.toString().equals("ACE of SPADES");
        assert card2.toString().equals("QUEEN of HEARTS");
        assert card3.toString().equals("NINE of CLUBS");
    }

    private static void testCardComparison() {
        Card card1 = new Card(Card.Value.ACE, Card.Suit.SPADES);
        Card card2 = new Card(Card.Value.QUEEN, Card.Suit.HEARTS);
        Card card3 = new Card(Card.Value.NINE, Card.Suit.CLUBS);

        assert card1.beats(card2);
        assert !card2.beats(card1);
        assert card3.beats(card2);
        assert !card2.beats(card3);
        assert card1.beats(card3);
        assert !card3.beats(card1);
    }
}