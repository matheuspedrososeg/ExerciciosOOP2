package Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        Conjunto conjunto = new Conjunto();

        // metodo verificar
        System.out.println(conjunto.verificar("amendoim", lista));
        lista.add("banana");
        lista.add("amendoim");
        lista.add("Kiwi");
        lista2.add("banana");
        lista2.add("amendoim");
        lista2.add("paçoca");

        // teste metodo inter

        List<String> inter = new ArrayList<>();
        conjunto.inter(inter, lista, lista2);
        conjunto.print(inter);

        System.out.println();

        // teste metodo uniao
        List<String> uniao = new ArrayList<>();
        conjunto.uniao(uniao, lista, lista2);
        conjunto.print(uniao);

        System.out.println();

        // teste metodo menos
        List<String> menos = new ArrayList<>();
        conjunto.menos(menos, lista, lista2);
        conjunto.print(menos);

    }
}
