/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.ps2.projeto;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jogadoresliga.LeitorDadosJogadores;

/**
 *
 * @author 31755135
 */
public class Menu {
     public static void main(String[] args) {

        LeitorDadosJogadores leitor = new LeitorDadosJogadores();
        String[] dados = leitor.ler();
        List<Confederacao> confederacoes = new ArrayList();

        
        for (String dado : dados) {
            String[] registro = dado.split(";");

            
            Confederacao confederacao = new Confederacao(registro[0]);
            if (!confederacoes.contains(confederacao)) {
                confederacoes.add(confederacao);
            }

           
            Liga liga = new Liga(registro[1]);
            int indexOfConfederacao = confederacoes.indexOf(confederacao);
            if (!confederacoes.get(indexOfConfederacao).getLigas().contains(liga)) {
                confederacoes.get(indexOfConfederacao).addLiga(liga);
            }

           
            Time time = new Time(registro[2]);
            int indexOfLiga = confederacoes.get(indexOfConfederacao).ligas.indexOf(liga);
            if (!confederacoes.get(indexOfConfederacao).ligas.get(indexOfLiga).getTimes().contains(time)) {
                confederacoes.get(indexOfConfederacao).ligas.get(indexOfLiga).addTime(time);
            }

            
            Jogador jogador = new Jogador(registro[3], registro[4], registro[5]);
            int indexOfTimes = confederacoes.get(indexOfConfederacao).ligas.get(indexOfLiga).times.indexOf(time);
            if (!confederacoes.get(indexOfConfederacao).ligas.get(indexOfLiga).times.get(indexOfTimes).getJogadores().contains(jogador)) {
                confederacoes.get(indexOfConfederacao).ligas.get(indexOfLiga).times.get(indexOfTimes).addJogador(jogador);
            }
        }
        
        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        while(!sair){
            System.out.println("\nMENU PRINCIPAL: "
                    + "\n(1) Listar confederações"
                    + "\n(0) Sair");

            System.out.print("\nEscolha uma opção: ");
            int opt = sc.nextInt();

            while (opt < 0 || opt > 1) {
                System.out.print("\nOpção Inválida! Por favor, digite uma opção valida: ");
                opt = sc.nextInt();
            }

            if (opt == 1) {
                boolean saidaConfederacao = false;
                while(!saidaConfederacao){
                    System.out.println("\nLista de Confederações");
                    int cont = 1;
                    for(Confederacao conf : confederacoes){
                        System.out.println(" ( " + cont + " ) " + conf.getNome());
                        cont ++;
                    }
                    System.out.println("(0) Voltar");
                    System.out.print("\nEscolha uma opção: ");
                    int optConfederacao = sc.nextInt();
                    
                    while(optConfederacao < 0 || optConfederacao > cont-1){
                        System.out.print("\nOpção Inválida! Por favor, digite uma opção valida: ");
                        optConfederacao = sc.nextInt();
                    }

                    if(optConfederacao == 0){
                        saidaConfederacao = true;
                    }else{
                        boolean saidaLiga = false;
                        while(!saidaLiga){
                            cont = 1;
                            Confederacao confEscolhida = confederacoes.get(optConfederacao-1);
                            System.out.println("\nLista de Ligas da Confederação " + confEscolhida.getNome());
                            for(Liga liga : confEscolhida.getLigas()){
                                System.out.println(" ( " + cont + " ) " + liga.getNome());
                                cont ++;
                            }
                            System.out.println(" (0) Voltar");
                            System.out.print("\nEscolha uma opção: ");
                            
                            int optLiga = sc.nextInt();
                            while(optLiga < 0 || optLiga > cont-1){
                                System.out.print("\nDigite uma opção valida: ");
                                optLiga = sc.nextInt();
                            }
                            if(optLiga == 0){
                                saidaLiga = true;
                            } else{
                                Liga ligaEscolhida = confEscolhida.getLigas().get(optLiga-1);                            
                                boolean sairOptLiga = false;
                                while(!sairOptLiga){
                                    System.out.println("\nLiga " + ligaEscolhida.getNome() + " (Confederação " + confEscolhida.getNome() + "): "
                                                        + "\n (1) Listar times"
                                                        + "\n (2) Listar jogos"
                                                        + "\n (0) Voltar");
                                    System.out.print("\nEscolha uma opção: ");
                                    
                                    int opLiga = sc.nextInt();
                                    while(opLiga < 0 || opLiga > 2){
                                        System.out.print("\nDigite uma opção valida: ");
                                        opLiga = sc.nextInt();
                                    }
                                    switch (opLiga) {
                                        case 1:
                                            boolean saidaTime = false;
                                            while(!saidaTime){
                                                cont = 1;
                                                System.out.println("\nTimes da Liga " + ligaEscolhida.getNome() + " (Confederação " + confEscolhida.getNome() + "): ");
                                                for(Time time : ligaEscolhida.getTimes()){
                                                    System.out.println(" (" + cont + ") " + time.getNome());
                                                    cont ++;
                                                }
                                                System.out.println(" (0) Voltar");
                                                System.out.print("\nEscolha uma opção: ");
                                                
                                                int opTime = sc.nextInt();
                                                while(opTime < 0 || opTime > cont-1){
                                                    System.out.print("\nDigite uma opção valida: ");
                                                    opTime = sc.nextInt();
                                                }
                                                
                                                if(opTime == 0){
                                                    saidaTime = true;
                                                }else{
                                                    //apresentando os jogadores do time
                                                    Time esseTime = ligaEscolhida.getTimes().get(opTime-1);
                                                    boolean saidaJogador = false;
                                                    while(!saidaJogador){
                                                        cont = 1;
                                                        System.out.println("\nJogadores do time " + esseTime.getNome() + " (Liga " + ligaEscolhida.getNome() + " da Confederação " + confEscolhida.getNome() + "): ");
                                                        for(Jogador jogador : esseTime.getJogadores()){
                                                            System.out.println(" (" + cont + ") " + jogador.getNome());
                                                            cont ++;
                                                        }
                                                        System.out.println(" (0) Voltar");
                                                        System.out.print("\nEscolha uma opção: ");
                                                        int opJogador1 = sc.nextInt();
                                                        while(opJogador1 < 0 || opJogador1 > cont-1){
                                                            System.out.print("\nDigite uma opção valida: ");
                                                            opJogador1 = sc.nextInt();
                                                        }
                                                        
                                                        if(opJogador1 == 0){
                                                            saidaJogador = true;
                                                        } else{
                                                            //apresentando os dados do jogador escolhido
                                                            Jogador esseJogador = esseTime.getJogadores().get(opJogador1-1);
                                                            System.out.println("\n" + esseJogador.getNome() + " (do time " + esseTime.getNome() + ", Liga " + ligaEscolhida.getNome() + ", Confederação " + confEscolhida.getNome() + "): ");
                                                            System.out.println(" - Nascimento: " + esseJogador.getDataNasc()
                                                                    + "\n - Local nascimento: " + esseJogador.getLocalNasc());
                                                            System.out.print("\n Pressione 0 para voltar: ");
                                                            int opJogador = sc.nextInt();
                                                            while(opJogador < 0 || opJogador > 1){
                                                                System.out.print("\nDigite uma opção valida: ");
                                                                opJogador = sc.nextInt();
                                                            }
                                                            
                                                            if(opJogador == 0){
                                                                saidaJogador = true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }   break;
                                            
                                        case 2:
                                            System.out.println("\nJogos da Liga " + ligaEscolhida.getNome() + " (Confederação " + confEscolhida.getNome() + "): ");
                                            System.out.print(ligaEscolhida.organizarJogos());
                                            System.out.print("\nPressione 0 para voltar: ");
                                            int opJogador2 = sc.nextInt();
                                            while(opJogador2 != 0){
                                                System.out.print("\nDigite uma opção valida: ");
                                                opJogador2 = sc.nextInt();
                                            }   sairOptLiga = true;
                                            break;
                                        default:
                                            sairOptLiga = true;
                                            break;
                                    }
                              }     
                        }            
                      }            
                } 
                    
            }
            }else{
                System.out.println("\nObrigado!");
                sair = true;
              }
        }    
    }
}