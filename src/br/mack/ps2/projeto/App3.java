/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.ps2.projeto;



import jogadoresliga.LeitorDadosJogadores;

public class App3 {
    public static void main(String[] args) {
        LeitorDadosJogadores leitor = new LeitorDadosJogadores();
        String[] dados = leitor.ler();
        for(String dado: dados) {
            String[] info = dado.split(";");
            String nome = info[3];
            System.out.println("Nome do jogador: " + nome);
        }
        System.out.println("Quantidade de registros: " + dados.length);
    }
}

    

