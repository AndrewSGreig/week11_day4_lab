import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    private Deck deck;
    private SuitType suitType;
    private RankType rankType;

    Card card;

    @Before
    public void before(){
        deck = new Deck(suitType, rankType);
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
    deck.populateDeck();
    assertEquals(52, deck.cardCount());
    }
}
