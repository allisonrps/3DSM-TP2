public class Ex07_RetanguloMain {
 public static void main(String[] args) {
        Ex07_Retangulo novoRetangulo = new Ex07_Retangulo(10,5);
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
        System.out.println("-----------------------");
        novoRetangulo.lado2 = 7; 
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
        System.out.println("------------------------------");

        double[][] dimensoes = new double[][] {
            {9, 3},
            {4, 1},
            {8, 5},
            {9, 6},
            {5, 2}
        };

        for (double[] dimensao : dimensoes) {
            Ex07_Retangulo retangulo = new Ex07_Retangulo(dimensao[0], dimensao[1]);
            retangulo.calcularArea();
            retangulo.calcularPerimetro();
            System.out.println("___________________________________");
        }
    }
}
