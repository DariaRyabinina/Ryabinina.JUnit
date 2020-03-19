package org.DariaRyabinina;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tag("ComplexTests")
@DisplayName("Сложные тесты")
public class ComplexTest {

    public static final Logger LOG = LoggerFactory.getLogger(ComplexTest.class);

    @ParameterizedTest
    @ValueSource(strings = {"Василий - 25", "Николай - 30"})
    void paramTest(String name) {
        LOG.info(name);

    }
}
