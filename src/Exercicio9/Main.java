package Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        Conjunto conjunto = new Conjunto();
        lista.add("banana");


        System.out.println(conjunto.verificar("amendoim", lista));

    }
}
