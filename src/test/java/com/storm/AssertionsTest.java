package com.storm;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
// Podemos importar os métodos de Assertions individualmente com "import static"
import org.junit.jupiter.api.Test;

public class AssertionsTest {
    // Mais algumas asserções

    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        // Comparando arrays (caso algum elemento seja diferente ou o tamanho dos arrays seja diferente, ele lança uma mensagem de erro na tela sobre o que era esperado e o que resultou)
        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        // Comparando null (verifica se um objeto é nulo)
        Assertions.assertNull(pessoa);

        Pessoa pessoa2 = new Pessoa("Matheus", LocalDate.now());

        // Comparando not null (verifica se um objeto não é nulo)
        Assertions.assertNotNull(pessoa2);
    }

    @Test
    void validarValoresDeTiposDiferentes() {
        double valor = 5.0;
        double valor2 = 5.0;

        // Comparando se valores são iguais (existem vários assertEquals que aceitam vários tipos)
        Assertions.assertEquals(valor, valor2);
    }
}
