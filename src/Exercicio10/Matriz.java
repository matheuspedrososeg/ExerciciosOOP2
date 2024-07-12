package Exercicio10;

import java.util.Arrays;

public class Matriz {

    // metodo transposto só funciona caso a coluna seja maior que a quantidade de linhas, caso contrário, não ira preencher toda a transposta

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

    public boolean quadrada(Matriz matriz) {
        if (matriz.getColunas() == matriz.getLinhas()) {
            return true;
        }
        return false;
    }

    public Matriz transposta(Matriz matriz) {
        int c = matriz.getColunas();
        int l = matriz.getLinhas();
        Matriz newArray = new Matriz(c, l);
        newArray.criarMatriz(c, l);
        Matriz matriz1 = new Matriz(c, l);
        matriz1.criarMatriz(c, l);


        for (int i = 0; i < matriz1.getMatriz().length; i++) {
            for (int j = 0; j < matriz1.getMatriz().length; j++) {
                if (i == matriz.getMatriz().length) {
                    return newArray;
                }
                newArray.getMatriz()[j][i] = matriz.getMatriz()[i][j];
            }
        }
        return newArray;
    }

    public Matriz oposta(Matriz matriz) {
        for (int i = 0; i < matriz.getMatriz().length; i++) {
            for (int j = 0; j < matriz.getMatriz().length; j++) {
                matriz.getMatriz()[i][j] = matriz.getMatriz()[i][j] * -1;
            }
        }
        return matriz;
    }

    public Matriz nula(Matriz matriz) {
        for (int i = 0; i < matriz.getLinhas(); i++) {
            for (int j = 0; j < matriz.getColunas(); j++) {
                matriz.getMatriz()[i][j] = 0;
            }
        }
        return matriz;
    }

    public boolean identidade(Matriz matriz) {
        if (!matriz.quadrada(matriz)) {
            return false;
        }

        for (int i = 0; i < matriz.getLinhas(); i++) {
            for (int j = 0; j < matriz.getColunas(); j++) {
                if (matriz.getMatriz()[i][j] == 1) {
                    if (matriz.getMatriz().length == i + 1) {
                        break;
                    }
                    if (matriz.getMatriz()[i][j] == matriz.getMatriz()[i + 1][j + 1]) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public boolean diagonal(Matriz matriz) {
        if (!matriz.quadrada(matriz)) {
            return false;
        }
        for (int i = 0; i < matriz.getLinhas(); i++) {
            for (int j = 0; j < matriz.getColunas(); j++) {
                if (i != j) {
                    if (matriz.getMatriz()[i][j] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Matriz somar(Matriz matriz, Matriz matriz1) {
        if (matriz.getColunas() != matriz1.getColunas() && matriz.getLinhas() != matriz1.getLinhas()) {
            System.out.println("Não foi possivel efetuar a soma pois as proporções são diferentes.");
            return matriz;
        }
        for (int i = 0; i < matriz.getLinhas(); i++) {
            for (int j = 0; j < matriz.getColunas(); j++) {
                matriz.getMatriz()[i][j] = matriz.getMatriz()[i][j] + matriz1.getMatriz()[i][j];
            }
        }
        return matriz;
    }

    public Matriz subtrair(Matriz matriz, Matriz matriz1) {
        if (matriz.getColunas() != matriz1.getColunas() && matriz.getLinhas() != matriz1.getLinhas()) {
            System.out.println("Não foi possivel efetuar a subtração pois as proporções são diferentes.");
            return matriz;
        }
        for (int i = 0; i < matriz.getLinhas(); i++) {
            for (int j = 0; j < matriz.getColunas(); j++) {
                matriz.getMatriz()[i][j] = matriz.getMatriz()[i][j] - matriz1.getMatriz()[i][j];
            }
        }
        return matriz;
    }

    public Matriz mulitplicar(Matriz matriz, Matriz matriz1) {
        if (matriz.getColunas() != matriz1.getColunas() && matriz.getLinhas() != matriz1.getLinhas()) {
            System.out.println("Não foi possivel efetuar a multiplicação pois as proporções são diferentes.");
            return matriz;
        }
        for (int i = 0; i < matriz.getLinhas(); i++) {
            for (int j = 0; j < matriz.getColunas(); j++) {
                matriz.getMatriz()[i][j] = matriz.getMatriz()[i][j] * matriz1.getMatriz()[i][j];
            }
        }
        return matriz;
    }

    public Matriz copiar(Matriz matriz) {
        Matriz matriz1 = new Matriz(matriz.getLinhas(), matriz.getColunas());

        for (int i = 0; i < matriz.getLinhas(); i++) {
            for (int j = 0; j < matriz.getColunas(); j++) {
                matriz1.getMatriz()[i][j] = matriz.getMatriz()[i][j];

            }
        }
        return matriz1;
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
