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
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        int opc;
        Scanner scan = new Scanner ( System.in );
        System.out.println(
                "MENU PRINCIPAL:\n" +
                "(1) Listar confederações\n" +
                "(0) SAIR\n" +
                "\n" +
                "Escolha uma opção: ");
        opc = scan.nextInt();
    }
    
}
