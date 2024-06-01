package seminars.sem1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.max.seminars.sem1.*;
import org.max.seminars.sem1.type.Ranks;
import org.max.seminars.sem1.type.Suits;

public class GameTest {

    @Test
    @Disabled
    void testPlayerWinner() {
        //given
        Game game = new Game();
        //when
        game.getGamer().addCard(new Card(Ranks.ACE, Suits.CLUBS));
        game.getGamer().addCard(new Card(Ranks.TEN, Suits.HEARTS));
        game.getCasino().addCard(new Card(Ranks.JACK, Suits.HEARTS));
        game.getCasino().addCard(new Card(Ranks.FIVE, Suits.DIAMONDS));
        Player player = game.getWinner(game.getGamer(), game.getCasino());
        //then
        Assertions.assertEquals(game.getGamer(), player);
    }

    @Test
    @Disabled
    void testCasinoWinner() {
        //given
        Gamer gamer = new Gamer(3);
        Casino casino = new Casino(0);
        Game game = new Game(gamer, casino);
        //when
        gamer.addCard(new Card(Ranks.ACE, Suits.HEARTS));
        gamer.addCard(new Card(Ranks.SEVEN, Suits.DIAMONDS));
        casino.addCard(new Card(Ranks.TEN, Suits.HEARTS));
        casino.addCard(new Card(Ranks.NINE, Suits.CLUBS));
        casino.addCard(new Card(Ranks.TWO, Suits.CLUBS));
        //then
        Assertions.assertEquals(casino, game.getWinner(gamer, casino));

    }
}
