package Exercicio2;

public class Ponto2D {

    double abcissa; // x
    double ordenada; // y

    int pontoX;
    int pontoY;

    public Ponto2D() {

    }

    public Ponto2D(double abcissa, double ordenada) {
        this.abcissa = abcissa;
        this.ordenada = ordenada;
    }

    public Ponto2D(int pontoX, int pontoY) {
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }

    public int mover(int x, int y) {
        double moveX = abcissa += x;
        double moveY = ordenada += y;

        System.out.println("Posição X: " + moveX);
        System.out.println("Posição Y: " + moveY);

        return 0;
    }

    public int equals(int x, int y, int x1, int y1) {
        if (x == x1) {
            System.out.println("Os eixos X são iguais!");
        }
        if (y == y1) {
            System.out.println("Os eixos Y são iguais!");
        }
        return 0;
    }

    public void print(Ponto2D ponto) {
        System.out.println(ponto.toString());
    }

    public String distancia(double x, double y, int x1, int y1) {

        double distanciaX = x - x1;
        double distanciaY = y - y1;

        return "A distância entre os eixos X é de: " + distanciaX + "\n" +
                "A distância entre os eixos Y é de: " + distanciaY;
    }

    @Override
    public String toString() {
        return "X: " + abcissa
                + "\nY: " + ordenada + ".";
    }


    public int getPontoX() {
        return pontoX;
    }

    public void setPontoX(int pontoX) {
        this.pontoX = pontoX;
    }

    public int getPontoY() {
        return pontoY;
    }

    public void setPontoY(int pontoY) {
        this.pontoY = pontoY;
    }

    public double getAbcissa() {
        return abcissa;
    }

    public void setAbcissa(double abcissa) {
        this.abcissa = abcissa;
    }

    public double getOrdenada() {
        return ordenada;
    }

    public void setOrdenada(double ordenada) {
        this.ordenada = ordenada;
    }
}
