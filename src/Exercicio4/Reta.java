package Exercicio4;

public class Reta {
    double angular;
    double linear;

    public Reta(double angular, double linear) {
        this.angular = angular;
        this.linear = linear;
    }

    int pontoX;
    int pontoY;

    public Reta(int pontoX, int pontoY) {
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }
    public String equals() {
        return null;
    }
    public void print(Reta x) {
        System.out.println(x);
    }

    @Override
    public String toString() {
        return "Reta: [" +
                "X=" + pontoX +
                ", Y=" + pontoY +
                ']';
    }

    public double getAngular() {
        return angular;
    }

    public void setAngular(double angular) {
        this.angular = angular;
    }

    public double getLinear() {
        return linear;
    }

    public void setLinear(double linear) {
        this.linear = linear;
    }
}
