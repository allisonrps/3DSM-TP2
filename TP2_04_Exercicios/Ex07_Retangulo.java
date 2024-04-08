public class Ex07_Retangulo {
    double lado1;
    double lado2;
    private double area;
    private double perimetro;


    public Ex07_Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void calcularArea() {
        this.area = this.lado1 * this.lado2;
        System.out.println("Área do retângulo: " + this.area);
    }

    public void calcularPerimetro() {
        this.perimetro = 2 * (this.lado1 + this.lado2);
        System.out.println("Perímetro do retângulo: " + this.perimetro);
    }

}