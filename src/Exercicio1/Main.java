package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor.");
        int value = scanner.nextInt();
        System.out.println("Quanto deseja incrementar ao valor?");
        int increment = scanner.nextInt();
        Contador contador = new Contador();
        contador.setValue(value);

        System.out.println("Soma: " + contador.increment(value, increment));
        System.out.println(contador.getValue());
        System.out.println("Valor zerado: " + contador.toNull());

    }
}
