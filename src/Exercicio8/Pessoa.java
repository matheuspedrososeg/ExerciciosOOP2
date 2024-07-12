package Exercicio8;

import java.util.List;
import java.util.Objects;

public class Pessoa {
    String nome;
    Pessoa pai;
    Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public void antecessora(Pessoa pessoa) {
        if (pessoa.getPai() == null && pessoa.getMae() == null) {
            System.out.println("Esta pessoa não tem antecessores atribuidos.");
        }
        else {
            System.out.println("Esta pessoa tem antecessores.");
        }
    }

    public boolean irmaos(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(pai, pessoa.pai) || Objects.equals(mae, pessoa.mae);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(mae, pessoa.mae);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
}
