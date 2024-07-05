package Exercicio5;

public class Circulo {
    int raio;
    double[] ponto;

    public Circulo(int raio, double[] ponto) {
        this.raio = raio;
        this.ponto = ponto;
    }
    public void inflar(int x) {
        x += raio;
        System.out.println("Novo raio: " + x);
    }
    public void desinflar(int x) {
        x -= raio;
        System.out.println("Novo raio: " + x);
    }
    public void inflar(int x, double[] y) {

        double newRaio = x+= raio;

        double pontoNovo = (newRaio / raio) * y[0];
        double pontoNovo2 = (newRaio / raio) * y[1];

        System.out.println("Novo raio: " + newRaio + "\n" +
                "Nova posição do ponto: [" + pontoNovo + "," + pontoNovo2 + "].");
    }
    public void desinflar(int x, double[] y) {
        double oldRaio = raio;
        double newRaio = raio -= x;

        double pontoNovo = (newRaio / oldRaio) * y[0];
        double pontoNovo2 = (newRaio / oldRaio) * y[1];

        System.out.println("Novo raio: " + newRaio + "\n" +
                "Nova posição do ponto: [" + pontoNovo + "," + pontoNovo2 + "].");
    }
    public String area() {
        double area = Math.PI * Math.pow(raio, 2);
        return "Área: " + area;
    }
     public int getRaio() {
        return raio;
    }
}
