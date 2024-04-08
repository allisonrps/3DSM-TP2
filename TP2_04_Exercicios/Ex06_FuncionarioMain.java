public class Ex06_FuncionarioMain {
    
    public static void main(String[] args) {
        Ex06_Funcionario funcionario = new Ex06_Funcionario("Allison", "12233", 5500.00, "01/01/2010", "123.456.789-00");
        
        System.out.println("Nome:" + funcionario.getNome());
        funcionario.receberAumento(2000.00);
        System.out.println("Salário após aumento: " + funcionario.salario);
        System.out.println("Ganho bruto anual: " + funcionario.calcularGanhoBrutoAnual());
        System.out.println("Imposto anual: " + funcionario.calcularImposto());
        System.out.println("Ganho líquido mensal: " + funcionario.calcularGanhoLiquidoMensal());
        System.out.println("Ganho líquido anual: " + funcionario.calcularGanhoLiquidoAnual());
    }
}