package org.DariaRyabinina;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Tag("SimpleTests")
@DisplayName("Простые тесты")
public class SimpleTest {

    public static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

    @BeforeAll
    static void beforeAll() {
        LOG.info("Before All");

    }

    @BeforeEach
    void beforeEach() {
        LOG.info("Before Each");

    }

    @AfterAll
    static void afterAll() {
        LOG.info("After All");

    }

    @AfterEach
    void afterEach() {
        LOG.info("After Each");

    }

    @DisplayName("1 простой тест")
    @Test
    void simpleTest1() {
        LOG.info("Test1 complete");
    }

    @DisplayName("2 простой тест")
    @Test
    void simpleTest2() {
        LOG.info("Test2 complete");

    }
}
