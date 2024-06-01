package homeWorks.HW2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.max.homeWorks.HW2.FiveChanel;
import org.max.homeWorks.HW2.Follower;
import org.max.homeWorks.HW2.RbkChanel;

public class NewsTest {

    @Test
    void checkCountFollowers() {
        //given
        FiveChanel fiveChanel = new FiveChanel();
        RbkChanel rbkChanel = new RbkChanel();
        //when
        new Follower("Василий", fiveChanel);
        new Follower("Ирина", fiveChanel);
        new Follower("Дмитрий", fiveChanel);
        new Follower("Анастасия", rbkChanel);
        new Follower("Олег", rbkChanel);
        //then
        Assertions.assertEquals(3, fiveChanel.getFollowersList().size());
        Assertions.assertEquals(2, rbkChanel.getFollowersList().size());
    }

    @Test
    @Disabled
    void checkSendSmsToFollower() {
        //given
        FiveChanel fiveChanel = new FiveChanel();
        RbkChanel rbkChanel = new RbkChanel();
        //when
        new Follower("Василий", fiveChanel);
        new Follower("Анастасия", rbkChanel);
        fiveChanel.setNews("Send news Five");
        rbkChanel.setNews("Send news RBK");
        //then
        Assertions.assertEquals("Send news Five", fiveChanel.getTextNews());
        Assertions.assertEquals("Send news RBK", rbkChanel.getTextNews());
    }

}
