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

public class App6 {
    public static void main(String[] args) {
        LeitorDadosJogadores leitor = new LeitorDadosJogadores();
        String[] dados = leitor.ler();
        List<String> ligas = new ArrayList<>();
        for(String dado: dados) {
            String[] info = dado.split(";");
            String liga = info[1];
            if (!ligas.contains(liga)) {
                ligas.add(liga);
            }
        }
        for (String liga: ligas) {        
            System.out.println("Nome da liga: " + liga);
        }
        System.out.println("Quantidade de ligas: " + ligas.size());
    }
}
