package Exercicio10;

import java.util.Scanner;

public class Main {
    // metodo transposto só funciona caso a coluna seja maior que a quantidade de linhas, caso contrário, não ira preencher toda a transposta
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

        // testar metodos individualmente, pois pode ocorrer conflitos

//        matriz.print(matriz.copiar(matriz));
//        matriz.print(matriz.mulitplicar(matriz, matriz1));
//        matriz.print(matriz.somar(matriz, matriz1));
//        matriz.print(matriz.subtrair(matriz, matriz1));
//        System.out.println(matriz.diagonal(matriz));
//        System.out.println(matriz.identidade(matriz));
//        matriz.print(matriz);
//        matriz1.print(matriz1);
//        System.out.println(matriz.equals(matriz, matriz1));
//        matriz.print(matriz.transposta(matriz));
//        matriz.print(matriz.oposta(matriz));
    }

}






