/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.ps2.projeto;

import java.io.Serializable;
import java.util.Objects;


public class Jogos implements Serializable{
    private Time t1;
    private Time t2;
    
    public Jogos(){
    
    }
    
    public Jogos(Time t1, Time t2){
        this.t1 = t1;
        this.t2 = t2;
    }

    public String getJogo() {
        return t1.getNome() + " vs. " + t2.getNome();
    }

    public void setJogo(Time t1, Time t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.t1);
        hash = 53 * hash + Objects.hashCode(this.t2);
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
        final Jogos other = (Jogos) obj;
        if (!Objects.equals(this.t1, other.t1)) {
            return false;
        }
        return true;
    }

    
    
}
