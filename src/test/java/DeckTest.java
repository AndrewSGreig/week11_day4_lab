import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    private Deck deck;

    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.QUEEN);
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void testThatWeCanAddACard(){
        deck.addCard(card);
        assertEquals(1, deck.cardCount());
    }

    @Test
    public void testPopulateDeck() {
        SuitType[] suits= SuitType.values();
        RankType[] ranks = RankType.values();
        System.out.println(suits.toString());
        System.out.println(ranks);
        for (int i = 0; i > suits.length; i ++ ){
            System.out.println(suits.toString());

        }
    }
}
