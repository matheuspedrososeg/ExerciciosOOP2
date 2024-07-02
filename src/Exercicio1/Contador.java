package Exercicio1;

public class Contador {
    private int value;

    public int toNull() {
        return this.value = 0;
    }
    public int increment(int value, int increment) {
        return value += increment;
    }

    public String getValue() {
        return "Value: " + value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
