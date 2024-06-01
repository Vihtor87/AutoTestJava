package demo.lesson2.pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.max.demo.lesson2.pattern.adapter.JsonAdapter;
import org.max.demo.lesson2.pattern.adapter.XMLAdapter;

import java.util.Date;

/**
 * Тест для демонстрации работы паттерна Адаптер
 */
public class AdapterTest {

    @Test
    @Disabled
    void jsonTest() {
        //given
        JsonAdapter adapter = new JsonAdapter();
        //when
        //then
        Assertions.assertNotNull(adapter);
    }

    @Test
    @Disabled
    void xmlTest() {
        //given
        XMLAdapter adapter = new XMLAdapter();
        //when
        //then
        Assertions.assertNotNull(adapter);
    }
}
