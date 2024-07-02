package Exercicio3;

public class Main {
    public static void main(String[] args) {

        NumeroComplexo numero = new NumeroComplexo(5, 1);
        NumeroComplexo numero1 = new NumeroComplexo(2, -1);

        System.out.println(numero.somar(numero.getReal(), numero.getImag(), numero1.getReal(), numero1.getImag()));
        System.out.println(numero.subtrair(numero.getReal(), numero.getImag(), numero1.getReal(), numero1.getImag()));

    }
}
