package com.storm;

import java.util.logging.Logger;

// Imaginando uma classe de conexão com banco de dados
public class BancoDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDados.class.getName());

    public static void iniciarConexao() {
        // iniciou
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao() {
        // finalizou
        LOGGER.info("Finalizou conexão");
    }

    public static void inserir(Pessoa pessoa) {
        // insere pessoa no DB
        LOGGER.info("Inseriu dados.");
    }

    public static void remover() {
        // remove pessoa no DB
        LOGGER.info("Removeu dados.");
    }
}