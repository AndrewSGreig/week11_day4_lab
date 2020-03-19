import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;
    private Card card;

    public Deck(){
        this.deck = new ArrayList<Card>();
    }

    public int cardCount(){
        return deck.size();
    }

    public void addCard(Card card){
        deck.add(card);
    }

}