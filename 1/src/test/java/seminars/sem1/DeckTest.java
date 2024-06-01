package seminars.sem1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.max.seminars.sem1.Deck;
import org.max.seminars.sem1.DeckService;
import org.max.seminars.sem1.exception.DeckEmptyException;

public class DeckTest {

    @Test
    @Disabled
    void checkException() throws DeckEmptyException {
        //give
        //вариант заполнения колоды вручную
        //List<Card> cards = new ArrayList<>();
        //Deck deck = new Deck(cards);

        DeckService deckService = new DeckService();
        Deck deck = deckService.getNewDeck();
        //when
        for (int i = 0; i < 52; i++) {
            deck.getCard();
        }
        //then
        Assertions.assertThrows(DeckEmptyException.class, () -> deck.getCard());
    }
}
