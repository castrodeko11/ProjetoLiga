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
public class Confederacao_1 {
    private String nome;
    private List<Liga> ligas;
    
    public void addLiga(Liga liga){
        this.ligas.add(liga);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
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
        final Confederacao_1 other = (Confederacao_1) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

   

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLigas(List<Liga> ligas) {
        this.ligas = ligas;
    }

    public String getNome() {
        return nome;
    }

    public List<Liga> getLigas() {
        return ligas;
    }

    public Confederacao_1(String nome) {
        this.nome = nome;
        this.ligas = new ArrayList<>();
    }
}
