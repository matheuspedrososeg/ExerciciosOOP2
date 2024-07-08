package Exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Paises> paises = new ArrayList<>();
        Paises portugal = new Paises("Portugal", 10410000, 92152);
        paises.add(portugal);
        Paises espanha = new Paises("Espanha" , 47780000, 505935);
        paises.add(espanha);

        Continente Europa = new Continente("Europa", paises, 10530000, 746400000);
        // metodo tamanho país
        System.out.println("Maior país: " + Europa.maiorPais(paises).getNome());
        System.out.println("Menor país: " + Europa.menorPais(paises).getNome());

        // ddaos europa
        System.out.println("Dimensão Europa: " + Europa.getDimensao());
        System.out.println("População Europa: " + Europa.getPopulacao());
        System.out.println("Densidade Europa: " + Europa.densidade(Europa.getPopulacao(), Europa.getDimensao()));

        // metodos população de país.
        System.out.println(Europa.populoso(paises));
        System.out.println(Europa.menosPopuloso(paises));

        // metodo razao territorial
       System.out.println("Razão: " + Europa.Razao(Europa.maiorPais(paises) , Europa.menorPais(paises)));


        System.out.println("Lista de Países:");
        for (int i = 0; i < Europa.getPaises().size(); i++) {
            System.out.println(Europa.getPaises().get(i).getNome());
        }
    }
}
