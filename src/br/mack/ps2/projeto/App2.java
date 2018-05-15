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
        List<String> ligas = new ArrayList<>();
        List<String> confederacoes = new ArrayList<>();
       
        
         //Teste       
         
       for(String dado: dados) {
            String[] info = dado.split(";");
            String nomeConfederacao = info[0];
            Confederacao confederacao = new Confederacao(nomeConfederacao);
            if (!confederacoes.contains(confederacao)) {
                 confederacoes.add(confederacao);
            }
            int indexConfederacao = confederacoes.indexOf(confederacao);
            
            String nomeLiga = new Liga(nomeLiga);
            Liga liga = new Liga(nomeLiga);
            if (!conferacoes.get(indexConferacao).getLigas().contains(liga)){
                confederacoes.get(indexConferacao).getLigas().add(liga)
            
            }
        }
       
       for (Confederacao conderacoes : confederacoes){
           System.out.println("Confederações: "+confed.getNome());
           for (Liga liga : confed.getLigas()){
               System.out.println("\t Liga: "+liga.getNome());
           
           }
       
       }
       
        // Fim Teste 
        
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
