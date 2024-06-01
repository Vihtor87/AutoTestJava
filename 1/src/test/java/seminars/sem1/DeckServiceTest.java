package seminars.sem1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.max.seminars.sem1.Deck;
import org.max.seminars.sem1.DeckService;


public class DeckServiceTest {

    @Test
    @Disabled
    void testDeckServiceGetDeck() {
        //given
        DeckService deckService = new DeckService();
        //when
        Deck deck = deckService.getNewDeck();
        //then
        Assertions.assertEquals(52, deck.getCards().size());
    }
}