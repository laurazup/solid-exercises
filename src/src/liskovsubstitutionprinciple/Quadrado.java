package liskovsubstitutionprinciple;

public class Quadrado implements Forma{

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return lado * lado;
    }
}
