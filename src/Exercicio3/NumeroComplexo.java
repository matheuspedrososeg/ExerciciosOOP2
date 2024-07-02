package Exercicio3;

public class NumeroComplexo {

    int real;
    int imag;

    public NumeroComplexo(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public String somar(int x, int y, int x1, int y1) {
        int somaX = x + x1;
        int somaY = y + y1;
        if (somaY == 1) {
            return  "Resultado: " + somaX + " + " + "i.";
        }

        return "Resultado: " + somaX + " + " + somaY + "i.";
    }
    public String subtrair(int x, int y, int x1, int y1) {
        int subX = x - x1;
        int subY = y - y1;
        if (subY == 1) {
            return "Resultado: " + subX + " + " + "i.";
        }
        return "Resultado: " + subX + " + " + subY + "i.";
    }
    public double multiplicar(int a, int b, int c, int d) {
        
        return 0;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }
}
