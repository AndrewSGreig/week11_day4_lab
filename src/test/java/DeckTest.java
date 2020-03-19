import org.junit.Before;
import org.junit.Test;
import sun.lwawt.macosx.CSystemTray;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Test
    public void testShuffleDeck(){
        deck.populateDeck();
        Card originalCard = deck.getFirstCard();
        deck.shuffleDeck();
        Card newCard = deck.getFirstCard();
        assertNotEquals(originalCard, newCard);
    }

    @Test
    public void testDealFirstCard(){
        deck.populateDeck();
        assertNotEquals(null, deck.getFirstCard());
    }

}
