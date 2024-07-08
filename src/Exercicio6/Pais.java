package Exercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pais {
    String ISO;
    String nome;
    int populacao;
    int dimensao;

    public Pais(String ISO, String nome, int dimensao, int populacao) {
        this.ISO = ISO;
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(ISO, pais.ISO);

    }
    public double density(int populacao, int dimensao) {
        double densidade = (double) populacao / dimensao;
        return densidade;
    }
    public void fronteiras(ArrayList<String> fronteirasPais) {
        if (fronteirasPais.size() < 2) {
            System.out.println("A fronteira do país é:");
            for (int i = 0; i < fronteirasPais.size(); i++) {
                System.out.println(fronteirasPais.get(i));
                System.out.println();
            }
        }
        else {
            System.out.println("As fronteiras do país são:");
            for (int i = 0; i < fronteirasPais.size(); i++) {
                System.out.println(fronteirasPais.get(i));
                System.out.println();
            }
        }

    }

    public String getISO() {
        return ISO;
    }

    public void setISO(String ISO) {
        this.ISO = ISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getDimensao() {
        return dimensao;
    }

    public void setDimensao(int dimensao) {
        this.dimensao = dimensao;
    }
}
