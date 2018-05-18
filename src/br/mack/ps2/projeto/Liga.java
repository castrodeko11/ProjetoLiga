/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.ps2.projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author 31755135
 */
public class Liga {
    private String nome;
    private List<Time> times;
    public  List<Jogo> jogos;
    
    public Liga(String nome){
        this.nome=nome;
        this.times=new ArrayList<>();
        this.jogos=new ArrayList<>();
    }
    
    public void addTime(Time time){
        this.times.add(time);
        this.jogos = jogos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Liga other = (Liga) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    public  Jogo organizarJogos()
    {
     int nTimes = times.size();
     int nJogos = jogos.size();
     for (int i=0;i<nTimes-1;i++){
         for(int j=i+1;j<nTimes;j++){
             nJogos++;
         }
         
     }
     jogos = new List<Jogo>();
     
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }

    public String getNome() {
        return nome;
    }

    public List<Time> getTimes() {
        return times;
    }   
    
}
