package org.DariaRyabinina;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tag("SimpleTests")
@DisplayName("Простые тесты")
public class SimpleTest {

    public static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

    @DisplayName("Простой тест")
    @Test
    void simpleTest1() {
        LOG.info("Test1 complete");
    }
}
