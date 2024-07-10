package com.storm;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;


public class CondicionaisTest {
    // Uso das condicionais (por variável de ambiente, SO ou JRE)

    @Test
    @EnabledIfEnvironmentVariable(named = "PROCESSOR_ARCHITECTURE", matches = "AMD64")
    void validarAlgoSomenteNoAmd64() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteNoSistemaWindows() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.OTHER)
    void validarAlgoSomenteNoJava22() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
