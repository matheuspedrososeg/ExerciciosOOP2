package Exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();



        Pessoa pai = new Pessoa("Pai");
        Pessoa pai2 = new Pessoa("Pai2");
        Pessoa mae = new Pessoa("Mãe");
        Pessoa pessoa = new Pessoa("Pessoa" , pai, mae);
        Pessoa pessoaIgual = new Pessoa("Pessoa" , pai2, mae);
        Pessoa pessoa1 = new Pessoa("Pessoa1" , pai, mae);

        System.out.println(pessoa.irmaos(pessoa1));
        System.out.println(pessoa.equals(pessoaIgual));
    }
}
