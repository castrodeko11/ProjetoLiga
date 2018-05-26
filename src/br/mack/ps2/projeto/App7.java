/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.ps2.projeto;


import java.util.ArrayList;
import java.util.List;
import jogadoresliga.LeitorDadosJogadores;

public class App7 {
    public static void main(String[] args) {
        LeitorDadosJogadores leitor = new LeitorDadosJogadores();
        String[] dados = leitor.ler();
        List<String> confederacoes = new ArrayList<>();
        for(String dado: dados) {
            String[] info = dado.split(";");
            String confederacao = info[0];
            if (!confederacoes.contains(confederacao)) {
                confederacoes.add(confederacao);
            }
        }
        for (String confederacao: confederacoes) {        
            System.out.println("Nome da confederação: " + confederacao);
        }
        System.out.println("Quantidade de confederações: " + confederacoes.size());
    }
}

