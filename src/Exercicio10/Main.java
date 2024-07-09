package Exercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira quantas colunas a sua matriz tem.");
        int col = scanner.nextInt();
        System.out.println("Insira quantas linhas a sua matriz tem.");
        int lin = scanner.nextInt();


        Matriz matriz = new Matriz(lin, col);
        matriz.criarMatriz(lin, col);

        for (int i = 0; i < matriz.getMatriz().length; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Insira um elemento na " + (i + 1) + "° linha.");
                int element = scanner.nextInt();
                matriz.getMatriz()[i][j] = element;
            }


        }

        System.out.println("Insira quantas colunas serão colocadas em sua próxima matriz.");
        int nCol = scanner.nextInt();
        System.out.println("Insira quantas linhas serão colocadas em sua próxima matriz.");
        int nLin = scanner.nextInt();
        Matriz matriz1 = new Matriz(nLin, nCol);
        matriz1.criarMatriz(nLin, nCol);

        for (int i = 0; i < matriz1.getMatriz().length; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.println("Insira um elemento na " + (i + 1) + "° linha.");
                int element = scanner.nextInt();
                matriz1.getMatriz()[i][j] = element;
            }


        }

        matriz.print(matriz);
        matriz1.print(matriz1);
        System.out.println(matriz.equals(matriz, matriz1));
        matriz.oposta(matriz);
        matriz.print(matriz);
    }

}






