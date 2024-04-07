/*Data: 05/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 1 2 3 4 ... 64
Qte: 1 2 4 8 ... N

 */
public class LT01_EstRep39 {
    public static void main(String[] args) {
        int casa;
        long quantidade;
        quantidade = 1;

        for (casa = 1; casa <= 64; casa++){
            System.out.println("Casa: "+ casa + " - Quantidade: " + quantidade);
            quantidade = quantidade * 2;
        }
    }
}
