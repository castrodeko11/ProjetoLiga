/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.ps2.projeto;

import java.util.Objects;

/**
 *
 * @author 31755135
 */
public class Jogador_1 {
    private String nome;
    private String dataNasscimento;
    private String localNascimento;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.dataNasscimento);
        hash = 53 * hash + Objects.hashCode(this.localNascimento);
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
        final Jogador_1 other = (Jogador_1) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.dataNasscimento, other.dataNasscimento)) {
            return false;
        }
        if (!Objects.equals(this.localNascimento, other.localNascimento)) {
            return false;
        }
        return true;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasscimento(String dataNasscimento) {
        this.dataNasscimento = dataNasscimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasscimento() {
        return dataNasscimento;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public Jogador_1(String nome, String dataNasscimento, String localNascimento) {
        this.nome = nome;
        this.dataNasscimento = dataNasscimento;
        this.localNascimento = localNascimento;
    }
}
