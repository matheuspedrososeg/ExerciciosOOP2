package Exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pais brasil = new Pais("BR", "Brasil", 8510000, 215300000);
        Pais portugal = new Pais("PRT", "Brasil", 92152 , 10410000);


        // metodo de mostrar fronteiras
        ArrayList<String> fronteirasPortugal = new ArrayList<>();
        fronteirasPortugal.add("Espanha");
        portugal.fronteiras(fronteirasPortugal);

        // teste metodo densidade
        System.out.println("Densidade populacional: " + portugal.density(portugal.getPopulacao(), portugal.getDimensao()));

        // metodo igualdade de ISO
        System.out.println("Os países são iguais?" + "\n" + brasil.equals(portugal));
    }
}
