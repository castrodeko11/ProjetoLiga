/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.ps2.projeto;

/**
 *
 * @author SempreIT
 */
public class Jogo {
    private Time mandante;
    private Time visitante;
    public Jogo(Time m, Time v)
    {
        mandante =m;
        visitante=v;
    }
    
    @Override
    public String toString()
    {
        return "["+mandante+" vs. "+visitante+"]";
    }
}
