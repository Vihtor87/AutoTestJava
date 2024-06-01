package demo.lesson1;

import org.junit.jupiter.api.*;

/*
    Демонстрация работы ЖЦ тестов
 */
public class ExampleLFDemoTest {

    @BeforeAll
    @Disabled
    static void init() {
        System.out.println("init test run");
    }

    @BeforeEach
    @Disabled
    void beforeEach() {
        System.out.println("beforeEach test run");
    }

    @Test
    @Disabled
    void exampleFirstTest() {
        //given
        //when
        System.out.println("exampleFirstTest test run");
        //then
    }

    @Test
    @Disabled
    void exampleSecondTest() {
        //given
        //when
        System.out.println("exampleSecondTest test run");
        //then
    }

    @AfterEach
    @Disabled
    void afterEach() {
        System.out.println("afterEach test run");
    }

    @AfterAll
    @Disabled
    static void exit() {
        System.out.println("exit test run");
    }
}
