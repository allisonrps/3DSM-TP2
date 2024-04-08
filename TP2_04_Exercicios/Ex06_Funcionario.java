public class Ex06_Funcionario {
    private String nome;
    private String matricula;
    double salario;
    private String dataAdmissao;
    private String cpf;
    private static final double INSS = 0.11; // 11%
    private static final double IR = 0.175; // 17,5%
    private static final double SALARIO_IR = 2500.00; // Limite

    public Ex06_Funcionario
        (String nome, String matricula, double salario, String dataAdmissao, String cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
    }
    public void receberAumento(double aumento) {
        this.salario += aumento;
    }
    public double calcularGanhoBrutoAnual() {
        return this.salario * 12;
    }
    public double calcularImposto() {
        double impostoINSS = this.salario * INSS * 12;
        double impostoIR = 0;
        if (this.salario > SALARIO_IR) {
            impostoIR = (this.salario - SALARIO_IR) * IR * 12;
        }
        return impostoINSS + impostoIR;
    }
    public double calcularGanhoLiquidoMensal() {
        double descontoINSS = this.salario * INSS;
        double descontoIR = 0;
        if (this.salario > SALARIO_IR) {
            descontoIR = (this.salario - SALARIO_IR) * IR;
        }
        return this.salario - descontoINSS - descontoIR;
    }
    public double calcularGanhoLiquidoAnual() {
        return this.calcularGanhoLiquidoMensal() * 12;
    }
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public double getSalario() {
        return salario;
    }
    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public String getCpf() {
        return cpf;
    }
    public static double getINSS() {
        return INSS;
    }
    public static double getIR() {
        return IR;
    }
    public static double getSALARIO_IR() {
        return SALARIO_IR;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salario=" + salario +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
