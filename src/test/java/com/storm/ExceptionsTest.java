package com.storm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    // Testando cenários de exceções

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta(1, 2);
        Conta contaDestino = new Conta(1, 3);

        TransferenciaEntreContas novaTransferencia = new TransferenciaEntreContas();

        // Os parâmetros são a classe da Exception e uma função lambda do que ele deve analisar
        Assertions.assertThrows(IllegalArgumentException.class, () -> 
                    novaTransferencia.transferir(contaOrigem, contaDestino, -1));
    }

    // Temos o AssertNotThrow para fazer o contrário
}
