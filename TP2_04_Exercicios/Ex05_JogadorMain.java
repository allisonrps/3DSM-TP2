public class Ex05_JogadorMain {

    public static void main(String[] args) {
        Ex05_Jogador[] jogadores = new Ex05_Jogador[11];

        jogadores[0] = new Ex05_Jogador(1, "Weverton Pereira da Silva", "Weverton", "1997/04/13", 21, "Goleiro", 80, 0, false);
        jogadores[1] = new Ex05_Jogador(2, "Marcos Rocha", "Marcos Rocha", "1990/08/11", 2, "Lateral Direito", 75, 1, false);
        jogadores[2] = new Ex05_Jogador(3, "Gustavo Gomez", "Gomez", "1993/05/06", 15, "Zagueiro", 80, 2, false);
        jogadores[3] = new Ex05_Jogador(4, "Murilo Cerqueira", "Murilo", "1999/03/04", 4, "Zagueiro", 70, 0, false);
        jogadores[4] = new Ex05_Jogador(5, "Piquerez", "Piquerez", "1993/09/23", 6, "Lateral Esquerdo", 70, 2, false);
        jogadores[5] = new Ex05_Jogador(6, "Richard Rios", "Richard", "1992/05/18", 5, "Volante", 75, 0, false);
        jogadores[6] = new Ex05_Jogador(7, "José Rafael", "Zé Rafael", "1993/02/16", 8, "Meio-campista", 80, 1, false);
        jogadores[7] = new Ex05_Jogador(8, "Gabriel da Silva", "Gabriel Menino", "2000/09/13", 25, "Meio-campista", 75, 1, false);
        jogadores[8] = new Ex05_Jogador(9, "Raphael Veiga", "Veiga", "1995/11/19", 23, "Meio-campista", 80, 0, false);
        jogadores[9] = new Ex05_Jogador(10, "Endrick", "Endrik", "1994/07/08", 9, "Atacante", 70, 1, false);
        jogadores[10] = new Ex05_Jogador(11, "Ronielson", "Rony", "1995/07/11", 11, "Atacante", 85, 0, false);

        // Aplicando cartões
        for (Ex05_Jogador jogador : jogadores) {
            if (jogador != null) {
                jogador.aplicarCartao(1);
            }
        }

        // Exibindo a lista completa
        for (Ex05_Jogador jogador : jogadores) {
            if (jogador != null) {
                System.out.println("#" + jogador.getNumero() + " - " + jogador.getPosicao() + " - " + jogador.getNome() + " (" + jogador.getApelido() + ")" + " - (" + jogador.getDataNascimento() + ") - " + "Suspenso? " + jogador.getStatusSuspenso());
            }
        }
    }
}
