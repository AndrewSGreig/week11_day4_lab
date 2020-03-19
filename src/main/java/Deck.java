import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;
    private Card card;
    private SuitType suit;
    private RankType rank;

    public Deck(SuitType suit, RankType rank){
        this.deck = new ArrayList<Card>();
        this.suit = suit;
        this.rank = rank;
    }

    public int cardCount(){
        return deck.size();
    }

    public void addCard(Card card){
        deck.add(card);
    }

    public void populateDeck(){
        SuitType[] suits= SuitType.values();
        RankType[] ranks = RankType.values();
        for (int suitsInt = 0; suitsInt < suits.length; suitsInt ++ ){

            for (int rankInt = 0; rankInt < ranks.length; rankInt ++){
                Card cardToBeAdded = new Card(suits[suitsInt], ranks[rankInt]);
                this.addCard(cardToBeAdded);
            }
        }
    }
}