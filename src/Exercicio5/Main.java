package Exercicio5;

public class Main {
    public static void main(String[] args) {

        double[] ponto = new double[2];
        ponto[0] = 2;
        ponto[1] = 3.464;
        Circulo circulo = new Circulo(4, ponto);
        circulo.inflar(2, ponto);
        circulo.desinflar(2, ponto);

    }
}
