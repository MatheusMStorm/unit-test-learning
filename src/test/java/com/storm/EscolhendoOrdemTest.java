package com.storm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //--> Anotação para definir uma ordem
// @TestMethodOrder(MethodOrderer.MethodName.class) //--> Anotação para definir uma ordem por nome
// @TestMethodOrder(MethodOrderer.Random.class) //--> Anotação para definir uma ordem aleatória
// @TestMethodOrder(MethodOrderer.DisplayName.class) //--> Anotação para definir uma ordem, mas o nome de display será o texto que colocarmos na anotação
public class EscolhendoOrdemTest {
    // Escolhendo a ordem dos testes

    @Order(4) //--> determinando a ordem
    @Test
    void validarFluxoA() {
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validarFluxoB() {
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validarFluxoC() {
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validarFluxoD() {
        Assertions.assertTrue(true);
    }
}
