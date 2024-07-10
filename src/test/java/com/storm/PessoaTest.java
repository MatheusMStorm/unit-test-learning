package com.storm;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    
     // Sempre que queremos testar algo, nós utilizamos a anotação "Test"
    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Matheus", LocalDate.of(2003, 8, 19));
        Assertions.assertEquals(20, pessoa.getIdade());
    }

    @Test
    void validarSeEhMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Matheus", LocalDate.of(2003, Month.AUGUST, 19));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa pessoa2 = new Pessoa("Júlia", LocalDate.of(2019, Month.AUGUST, 19));
        Assertions.assertFalse(pessoa2.ehMaiorDeIdade());
    }
}
