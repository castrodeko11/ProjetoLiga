/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.ps2.projeto;


import java.util.List;
import jogadoresliga.LeitorDadosJogadores;

public class App1 {

    public static void main(String[] args) {
        LeitorDadosJogadores leitor = new LeitorDadosJogadores();
        String[] dados = leitor.ler();
        for (String dado : dados) {
            System.out.println("Dados do jogador: " + dado);
        }
        System.out.println("Quantidade de registros: " + dados.length);
    }
}
