package liskovsubstitutionprinciple;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(4);
        retangulo.setBase(2);
        System.out.println("Área do Retângulo é: " + retangulo.getArea());

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(6);
        System.out.println("Área do Quadrado é: " + quadrado.getArea());

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(3);
        triangulo.setBase(5);
        System.out.println("Área do Triângulo é: " + triangulo.getArea());

    }
}
