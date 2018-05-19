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
 * @author 1146355
 */
public class Menu {
    private List<Confederacao> confederacoes;
    private static int indexConfederacaoAtual;
    private static int menuAtual;
    /*menu 
        principal 0
        confederacoes 1
        ligas 2
        times 3
        jogadores 4
       
    
    */

    public List<Confederacao> getConfederacoes() {
        return confederacoes;
    }

    public void setConfederacoes(List<Confederacao> confederacoes) {
        this.confederacoes = confederacoes;
    }

    public Menu() {
        this.confederacoes = new ArrayList<>();
        this.carregar();
    }
    
    public void carregar(){
        LeitorDadosJogadores leitor = new LeitorDadosJogadores();
        String[] dados = leitor.ler();
        for(String dado: dados) {
            String[] info = dado.split(";");
            Confederacao confederacao = new Confederacao(info[0]);
            if (!confederacoes.contains(confederacao)) {
                confederacoes.add(confederacao);
            }
            
            int indexOfConfederacao = this.confederacoes.indexOf(confederacao);
            confederacao = this.confederacoes.get(indexOfConfederacao);
            Liga liga = new Liga(info[1]);
            if(!confederacao.getLigas().contains(liga)){
                confederacao.getLigas().add(liga);
            }
        }

    }
    
    public static int manuPrincipal(){
        System.out.println("Menu Principal");
        System.out.println("(1) Listar Confederacoes");
        System.out.println("(2) Sair");
        System.out.println("Digite a opcao desejada: ");
        Scanner scan = new Scanner(System.in);
        int opc = Integer.parseInt(scan.nextLine());
        switch(opc){
            case 1:{ 
                    menuAtual = 1; //marcando o proximo menu  
                    break;
            }
            case 2:{System.exit(0);}
        }
        
        return menuAtual;
    }
    
    public static int menuConfederecao(List<Confederacao> confederacoes){
        System.out.println("Menu Confederacoes - escolha uma");
        for (int i = 0; i < confederacoes.size(); i++) {
            System.out.println("("+(i)+") - "+confederacoes.get(i).getNome());    
        }
        System.out.println("(S) Sair");
        System.out.println("Digite a opcao desejada: ");
        
        Scanner scan = new Scanner(System.in);
        String opc = scan.nextLine();
        if(opc.equalsIgnoreCase("S")){
            menuAtual=0; //setando o menu anterior
            return menuAtual;
        }
        
        if(Integer.parseInt(opc)<confederacoes.size()){
            indexConfederacaoAtual = Integer.parseInt(opc);
            menuAtual = 2;//´proximo menu
        }else{
            menuAtual = 1 ; //vai permanecer neste menu
        }

        return menuAtual;
        
    }
    
    public static void main(String[] args) {
        Menu m = new Menu();
        manuPrincipal();
        
        do{
            menuConfederecao(m.getConfederacoes());
        }while(menuAtual == 1);
        
    }
    
}
