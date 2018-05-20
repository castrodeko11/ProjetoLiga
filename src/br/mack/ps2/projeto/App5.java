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
import java.util.ArrayList;
import java.util.List;
import jogadoresliga.LeitorDadosJogadores;

public class App5 {
    public static void main(String[] args) {
        LeitorDadosJogadores leitor = new LeitorDadosJogadores();
        String[] dados = leitor.ler();
        List<String> times = new ArrayList<>();
        for(String dado: dados) {
            String[] info = dado.split(";");
            String time = info[2];
            if (!times.contains(time)) {
                times.add(time);
            }
        }
        for (String time: times) {        
            System.out.println("Nome do time: " + time);
        }
        System.out.println("Quantidade de times: " + times.size());
    }
}

