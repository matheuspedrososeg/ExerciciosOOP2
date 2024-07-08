package Exercicio7;

import java.util.List;

public class Continente {
    String nome;
    List<Paises> paises;
    int populacao;
    int dimensao;

    public Continente(String nome, List<Paises> paises, int dimensao, int populacao) {
        this.nome = nome;
        this.paises = paises;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }
    public double densidade(int populacao, int dimensao) {
        double densidade = (double) populacao / dimensao;
        return densidade;
    }


    public Paises maiorPais(List<Paises> paises) {
        Paises maiorpais = new Paises(null, 0, 0);
        for (int i = 0; i < paises.size(); i++) {
            if (maiorpais.getDimensao() < paises.get(i).getDimensao()) {
                maiorpais = paises.get(i);
            }
        }
        return maiorpais;
    }
    public Paises menorPais(List<Paises> paises) {
        Paises menorpais = new Paises(null, 0, 999999999);
        for (int i = 0; i < paises.size(); i++) {
            if (menorpais.getDimensao() > paises.get(i).getDimensao()) {
                menorpais = paises.get(i);
            }
        }
        return menorpais;
    }
    public String populoso(List<Paises> paises) {
        Paises populoso = new Paises(null, 0, 0);
        for (int i = 0; i < paises.size(); i++) {
            if (populoso.getPopulacao() < paises.get(i).getPopulacao()) {
                populoso = paises.get(i);
            }
        }
        return "País mais populoso: " + populoso.getNome() + "\n" + "População: " + populoso.getPopulacao();
    }
    public String menosPopuloso(List<Paises> paises) {
        Paises menosPopuloso = new Paises(null, 999999999, 0);
        for (int i = 0; i < paises.size(); i++) {
            if (menosPopuloso.getPopulacao() > paises.get(i).getPopulacao()) {
                menosPopuloso = paises.get(i);
            }
        }
        return "Menos populoso: " + menosPopuloso.getNome() + "\n" + "População: " + menosPopuloso.getPopulacao();
    }
    public int Razao(Paises maior, Paises menor) {
        int razao;
        razao = maior.getDimensao() - menor.getDimensao();
        return razao;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Paises> getPaises() {
        return paises;
    }

    public void setPaises(List<Paises> paises) {
        this.paises = paises;
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
