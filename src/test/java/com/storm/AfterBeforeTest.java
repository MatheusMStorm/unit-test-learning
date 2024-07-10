package com.storm;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

public class AfterBeforeTest {
    // Uso do After e Before
    // Exemplo com conexão e consulta em um banco de dados

    @BeforeAll //--> antes de tudo
    static void configuraConexao() {
        BancoDados.iniciarConexao();
    }

    @BeforeEach //--> antes de cada teste executar
    void insereDadosParaTeste() {
        BancoDados.inserir(new Pessoa("Matheus", LocalDate.of(2003, 8, 19)));
    }

    @AfterEach //--> depois que cada teste executar
    void removeDadosDoTeste() {
        BancoDados.remover();
    }
    
    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll //--> depois de tudo 
    static void finalizarConexao() {
        BancoDados.finalizarConexao();
    }
}
