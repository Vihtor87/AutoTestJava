package demo.lesson2;

import org.junit.jupiter.api.*;

public abstract class AbstractTest {

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
