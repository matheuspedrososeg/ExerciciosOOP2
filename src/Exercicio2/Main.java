package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor X no plano cartesiano:");
        double x = scanner.nextInt();
        System.out.println("Agora o Y:");
        double y = scanner.nextInt();

        Ponto2D ponto = new Ponto2D(x, y);

        System.out.println("Insira um segundo ponto, X:");
        int x1 = scanner.nextInt();
        System.out.println("Y: ");
        int y1 = scanner.nextInt();

        Ponto2D ponto1 = new Ponto2D(x1, y1);

        ponto.print(ponto);
        ponto.equals((int) x, (int) y, x1, y1);

        System.out.println("Movendo posição do seu ponto inicial...");
        Thread.sleep(1200);
        System.out.println("Nova posição: ");
        double movimento = ponto.mover(ponto1.getPontoX(), ponto1.getPontoY());

        System.out.println(ponto.distancia(x, y, x1, y1));


    }
}
