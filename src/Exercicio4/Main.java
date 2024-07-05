package Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o coeficiente angular.");
        double angular = scanner.nextInt();
        System.out.println("Insira o coeficiente linear.");
        double linear = scanner.nextInt();

        Reta reta = new Reta(angular, linear);

        System.out.println("Escolha um ponto X.");
        int x = scanner.nextInt();
        System.out.println("Escolha um ponto Y.");
        int y = scanner.nextInt();

        Reta reta1 = new Reta(x, y);

        reta1.setPonto1(y);

        System.out.println(reta.verificador(reta1));
        reta.print(reta);

    }
}
