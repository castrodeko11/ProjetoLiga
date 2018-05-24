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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Liga implements Serializable, Comparable<Liga> {
    private String nome;
    public List<Time> times = new ArrayList();
    public int nTimes;

    public Liga(){
        
    }
    
    public Liga(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Time> getTimes() {
        return times;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }
    
    public void addTime(Time time){
        this.times.add(time);
    }
    
    public String organizarJogos(){
        this.nTimes = this.times.size();
        if (nTimes <= 10){
            for(int t1 = 0; t1 < nTimes - 1; t1++){
                for(int t2 = t1 + 1; t2 < nTimes; t2++){
                    Jogos jogo1 = new Jogos(times.get(t1), times.get(t2));
                    Jogos jogo2 = new Jogos(times.get(t2), times.get(t1));
                    System.out.println(jogo1.getJogo());
                    System.out.println(jogo2.getJogo());
                }
            }
        }else{
            for(int t1 = 0; t1 < nTimes - 1; t1++){
                for(int t2 = t1 + 1; t2 < nTimes; t2++){
                    Jogos jogo = new Jogos(times.get(t1), times.get(t2));
                    System.out.println(jogo.getJogo());
                }
            }
          }
       return ""; 
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.times);
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
    

    @Override
    public int compareTo(Liga liga) {
      return this.nome.compareTo(liga.getNome());
    }
    
    
}