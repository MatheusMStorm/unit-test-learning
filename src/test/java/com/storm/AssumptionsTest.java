package com.storm;

import org.junit.jupiter.api.*;

public class AssumptionsTest {
    // Assumptions = hipóteses

    @Test
    void validarAlgoSomenteNoUsuarioMatheus() {
        Assumptions.assumeFalse("moura".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
