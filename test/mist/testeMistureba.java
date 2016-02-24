/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mist;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fenix
 */
public class testeMistureba {
    // verifica se o usuario acertou as respostas
    @Test
    public void Comparar() {
        Misturando m = new Misturando();
        m.palavras();
        m.resposta();
        assertEquals("MEXE-MEXE", m.comparacao("MEXEMEXE"));
        assertEquals("LUIZA TOMÉ", m.comparacao("LUIZATOMÉ"));
        assertEquals("ATAQUE", m.comparacao("ATAQUE"));

    }
    // verifica se ao clicar no botao ele ira retorna o seu nome 

    // verifica se ao clicar no botao ele ira retorna o nome + "-"
    @Test
    public void visualizacao() {
        Misturando m = new Misturando();
        
        assertEquals("AT-", m.visualizacao("AT"));

    }
    //verifica se o usuario acertou a resposta ou errou
    // se acertou ira retornar false para o setvisible de seus botoes
    // se errou ira retorna false para o setvsible de seus botoes
    @Test
    public void botaoLimpar() {
        Misturando m = new Misturando();
        m.palavras();
        m.resposta();
        assertEquals(false, m.botaoLimpar("MEXE-MEXE"));
        assertEquals(true, m.botaoLimpar("MEXEUI"));
    }
}
