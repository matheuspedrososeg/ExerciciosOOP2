package Exercicio4;

public class Reta {
    double angular;
    double linear;
    int ponto;
    int ponto1;

    public Reta(double angular, double linear) {
        this.angular = angular;
        this.linear = linear;
    }

    public Reta(int ponto, int ponto1) {
        this.ponto = ponto;
        this.ponto1 = ponto1;
    }

    // y = mx + c

    public String verificador(Reta x) {
        double y =  angular * x.getPonto() + linear;


        if (y == x.getPonto1()) {
            return "O ponto dado está incluso na reta.";
        }

        return null;
    }
    public void print(Reta x) {
        System.out.println(x);
    }

    @Override
    public String toString() {
        return "Reta[" +
                "angular=" + angular +
                ", linear=" + linear +
                "]";
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

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    public int getPonto1() {
        return ponto1;
    }

    public void setPonto1(int ponto1) {
        this.ponto1 = ponto1;
    }
}
