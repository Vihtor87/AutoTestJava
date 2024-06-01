package homeWorks.HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.max.homeWorks.HW1.Door;
import org.max.homeWorks.HW1.Game;
import org.max.homeWorks.HW1.Player;

import java.util.ArrayList;
import java.util.List;

public class GameTest {

    private final List<Door> doorList = new ArrayList<>();

    @BeforeEach
    @Disabled
    void getDoorList() {
        doorList.add(new Door(true));
        doorList.add(new Door(false));
        doorList.add(new Door(false));
    }

    @Test
    @Disabled
    void testLengthListDoor() {
        //given

        //when

        //then
        Assertions.assertEquals(3, doorList.size());
    }

    @Test
    @Disabled
    void testWinWithRisk() {
        //given
        Player player = new Player("Name", true);
        //when
        Game game = new Game(player, doorList);
        Door door = game.round(2);
        //then
        Assertions.assertTrue(door.isPrize());
    }

    @Test
    @Disabled
    void testWinWithoutRisk() {
        //given
        Player player = new Player("Name", false);
        //when
        Game game = new Game(player, doorList);
        Door door = game.round(0);
        //then
        Assertions.assertTrue(door.isPrize());
    }

    @Test
    @Disabled
    void testLooseWithRisk() {
        //given
        Player player = new Player("Name", true);
        //when
        Game game = new Game(player, doorList);
        Door door = game.round(0);
        //then
        Assertions.assertFalse(door.isPrize());
    }

    @Test
    @Disabled
    void testLooseWithoutRisk() {
        //given
        Player player = new Player("Name", false);
        //when
        Game game = new Game(player, doorList);
        Door door = game.round(1);
        //then
        Assertions.assertFalse(door.isPrize());
    }
}
