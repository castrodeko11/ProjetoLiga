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
public class Time_1 {
    private String nome;
    private List<Jogador>jogadores;
    
    
    public void addJogador(Jogador jogador){
        this.jogadores.add(jogador);
    
    }
    
    public Time_1(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Time_1 other = (Time_1) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }


}
