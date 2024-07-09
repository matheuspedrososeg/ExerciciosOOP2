package Exercicio10;

import java.util.Arrays;

public class Matriz {
    int[][] matriz;
    int linhas;
    int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
    }
    public void criarMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        setMatriz(matriz);
        setLinhas(linhas);
        setColunas(colunas);
    }


    public void print(Matriz matriz) {
        System.out.println(Arrays.deepToString(matriz.getMatriz()));
    }
    public boolean equals(Matriz matriz, Matriz matriz1) {
        if (matriz.getColunas() != matriz1.getColunas() || matriz.getLinhas() != matriz1.getLinhas()) {
            return false;
        }
        for (int i = 0; i < matriz.getMatriz().length; i++) {
            for (int j = 0; j < matriz1.getMatriz().length; j++) {
                if (matriz.getMatriz()[i][j] != matriz1.getMatriz()[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
//    public Matriz transposta(Matriz matriz) {
//        int line = matriz.getLinhas();
//        int col = matriz.getColunas();
//
//        setLinhas(col);
//        setColunas(line);
//        int i = matriz.getMatriz()[getLinhas()][getColunas()];
//
//
//        return matriz;
//    }
    public Matriz oposta(Matriz matriz) {
        int[][] mm = new int[matriz.getLinhas()][matriz.getColunas()];
        for (int i = 0; i < matriz.getMatriz().length; i++) {
            for (int j = 0; j < matriz.getMatriz().length; j++) {
                int i1 = matriz.getMatriz()[i][j] * -1;

            }
        }
        return matriz;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
}
