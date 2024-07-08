package Exercicio7;


public class Paises {
    String nome;
    int populacao;
    int dimensao;

    public Paises(String nome, int populacao, int dimensao) {
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
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
