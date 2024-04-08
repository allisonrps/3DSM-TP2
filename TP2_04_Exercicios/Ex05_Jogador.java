public class Ex05_Jogador {
    private int id;
    private String nome;
    private String apelido;
    private String dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoes;
    private boolean suspenso;

    // Construtores
    public Ex05_Jogador() {
    }

    public Ex05_Jogador(int id, String nome, String apelido, String dataNascimento, int numero, String posicao, int qualidade,
            int cartoes, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoes = cartoes;
        this.suspenso = suspenso;
    }

    public boolean verificarCondicaoDeJogo() {
        return !suspenso;
    }

    public void aplicarCartao(int quantidade) {
        cartoes += quantidade;
        if (cartoes >= 3) {
            suspenso = true;
        }
    }

    public void cumprirSuspencao() {
        cartoes = 0;
        suspenso = false;
    }

    public void sofrerLesao() {
        int gravidade = (int) (Math.random() * 15) + 1;
        int reducao = (int) (qualidade * gravidade / 100.0);
        qualidade -= reducao;
        if (qualidade < 0) {
            qualidade = 0;
        }
    }

    // Getters e setters
    public String getStatusSuspenso() {
        return suspenso ? "Suspenso" : "Tá pra jogo";
    }

    public int getQualidade() {
        return qualidade;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicao() {
        return posicao;
    }
    
   public int getId() {
        return id;
    }

    public int getCartoes() {
        return cartoes;
    }

    // Método main para teste
    public static void main(String[] args) {
        Ex05_Jogador jogador1 = new Ex05_Jogador(1, "Jogador1", "Apelido1", "Nascimento", 10, "Atacante", 90, 0, false);

        jogador1.aplicarCartao(2);
        System.out.println("Jogador suspenso após aplicar cartões: " + jogador1.getStatusSuspenso());

        jogador1.cumprirSuspencao();
        System.out.println("Jogador após cumprir suspensão: " + jogador1.getStatusSuspenso());

        jogador1.sofrerLesao();
        System.out.println("Qualidade do jogador após sofrer lesão: " + jogador1.getQualidade());
    }
}
