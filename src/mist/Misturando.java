/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mist;

import javax.swing.JOptionPane;

/**
 *
 * @author Fenix
 */
public class Misturando {

    String[] palavras = new String[15]; // Criando um vetor palavras com 5 posições.
    String[] resposta = new String[palavras.length];
    int[] numerosSorteados = new int[3];

    public void palavras() {
        palavras[0] = "MEXEMEXE";
        palavras[1] = "LUIZATOMÉ";
        palavras[2] = "ATAQUE";
        palavras[3] = "DENTISTA";
        palavras[4] = "CONQUISTADOR";
        palavras[5] = "COMPUTADOR";
        palavras[6] = "URSOPOLAR";
        palavras[7] = "GOIABA";
        palavras[8] = "TONYRAMOS";
        palavras[9] = "BRIGADEIRO";
        palavras[10] = "ELEFANTE";
        palavras[11] = "INTELIGENTE";
        palavras[12] = "QUATRORODAS";
        palavras[13] = "MARZIPAN";
        palavras[14] = "DANSTULBACH";

    }

    public void resposta() {
        resposta[0] = "MEXE-MEXE";
        resposta[1] = "LUIZA TOMÉ";
        resposta[2] = "ATAQUE";
        resposta[3] = "DENTISTA";
        resposta[4] = "CONQUISTADOR";
        resposta[5] = "COMPUTADOR";
        resposta[6] = "URSO POLAR";
        resposta[7] = "GOIABA";
        resposta[8] = "TONY RAMOS";
        resposta[9] = "BRIGADEIRO";
        resposta[10] = "ELEFANTE";
        resposta[11] = "INTELIGENTE";
        resposta[12] = "QUATRORODAS";
        resposta[13] = "MARZIPAN";
        resposta[14] = "DAN STULBACH";
    }

    // Compara a resposta do usuario com o vetor palavras
    public String comparacao(String palavra) {

        String correto = "";

        for (int i = 0; i < palavras.length; i++) {
            if (palavra.equals(palavras[i])) {
                correto = resposta[i];

            }

        }

        return correto;
    }

    // Adicionando "-" entre as silabas.
    public String visualizacao(String letras) {
        return letras + "-";
    }

    // compara a resposta que o usuario obteve e devolve true ou false para o setvisible dos botoes 
    public boolean botaoLimpar(String palavra) {

        boolean limpar = true;

        for (int i = 0; i < resposta.length; i++) {
            if (palavra.equals(resposta[i])) {
                limpar = false;
            }
        }

        return limpar;
    }

    // Indica o fim de jogo.
    public boolean fimDeJogo(String resp1, String resp2, String resp3,
            String resp4, String resp5) {
        boolean fimJogo = false;
        int contador = 0;
        // Faz uma comparação entre as 5 resposta e adiciona 1 ao contador a cada resposta correta, quando contador for 
        // igual a 5 ele finaliza o jogo
        Misturando m = new Misturando();
        for (int i = 0; i < palavras.length; i++) {
            if (resp1.equals(resposta[i])) {
                contador = contador + 1;

            }
            if (resp2.equals(resposta[i])) {
                contador = contador + 1;
            }
            if (resp3.equals(resposta[i])) {
                contador = contador + 1;
            }
            if (resp4.equals(resposta[i])) {
                contador = contador + 1;
            }
            if (resp5.equals(resposta[i])) {
                contador = contador + 1;
            }

        }

        if (contador == 5) {
            fimJogo = true;
        }
        return fimJogo;
    }
        // gera numeros randomicos entre 1 a 3 para inicia qualquer um dos 3 jogos.
    public void escolherJogo() {

        int aleatorio = 0;

        JogoMisturando3 jogo3 = new JogoMisturando3();
        JogoMisturando2 jogo2 = new JogoMisturando2();
        JogoMisturando1 jogo1 = new JogoMisturando1();

        aleatorio = (int) (Math.random() * 3) + 1;

        if (aleatorio == 3) {
            jogo1.setVisible(false);
            jogo2.setVisible(false);
            jogo3.setVisible(true);
        } else if (aleatorio == 2) {
            jogo1.setVisible(false);
            jogo2.setVisible(true);
            jogo3.setVisible(false);
        } else {
            jogo2.setVisible(false);
            jogo1.setVisible(true);
            jogo3.setVisible(false);
        }

    }

}
