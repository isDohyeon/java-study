package level4.cardgame;

public class Card implements Comparable<Card> {
    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card otherCard) {
        if (this.rank != otherCard.rank) {
            return Integer.compare(this.rank, otherCard.rank);
        } else {
            return this.suit.compareTo(otherCard.suit);
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
