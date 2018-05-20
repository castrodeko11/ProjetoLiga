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

public class App2 {

 
    public static void main(String[] args) {
        LeitorDadosJogadores leitor = new LeitorDadosJogadores();
        String[] dados = leitor.ler();
        
        List<Confederacao>confederacoes = new ArrayList<>();
        
        for (String dado : dados) {
           String[] info = dado.split(";");
           String nomeConfederacao = info[0];
           Confederacao confederacao = new Confederacao(nomeConfederacao); // percorre o array e se nao tiver o item ele é add
           if(!confederacoes.contains(confederacao)){
               confederacoes.add(confederacao);
           }
           
        int indexConfederacao = confederacoes.indexOf(confederacao); // posição do array de 0 ate o fim
        
        String nomeLiga = info[1];
        Liga liga = new Liga(nomeLiga);
        if(!confederacoes.get(indexConfederacao).getLigas().contains(liga)){ // pega a liga e ve se ela esta na lista
            confederacoes.get(indexConfederacao).getLigas().add(liga); // // se nao tiver ela adciona na lista
           }

        }
        
        
    for (Confederacao confed : confederacoes){
        System.out.println("\t Liga: "+confed.getNome());
        for (Liga liga : confed.getLigas()){
            System.out.println("\t Liga: "+liga.getNome());
        }
    }
    }
    
}