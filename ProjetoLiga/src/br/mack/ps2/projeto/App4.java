/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.ps2.projeto;

/**
 *
 * @author 31755135
 */
import jogadoresliga.LeitorDadosJogadores;

public class App4 {
    public static void main(String[] args) {
        LeitorDadosJogadores leitor = new LeitorDadosJogadores();
        String[] dados = leitor.ler();
        for(String dado: dados) {
            String[] info = dado.split(";");
            String time = info[2];
            System.out.println("Nome do time: " + time);
        }
        System.out.println("Quantidade de registros: " + dados.length);
    }
}
