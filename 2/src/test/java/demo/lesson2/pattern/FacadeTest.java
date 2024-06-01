package demo.lesson2.pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.max.demo.lesson2.pattern.facade.Facade;
import org.max.demo.lesson2.pattern.facade.IFacade;

/**
 * Тест для демонстрации работы паттерна Фасад
 */
public class FacadeTest {

    @Test
    @Disabled
    void test() {
        //given
        IFacade algSimple = new Facade();
        IFacade algFull = new Facade();
        //when
        algSimple.runAlgorithmSimple();
        algFull.runAlgorithmFull();
        //then
        Assertions.assertEquals(2, algSimple.countSteps());
        Assertions.assertEquals(6, algFull.countSteps());
    }
}
