import javax.swing.JOptionPane;

/*Data: 27/02/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
Calcule e mostre a velocidade média em km/h.
 */
public class LT01_EstDecisao27 {
    public static void main(String[] args) {
        int numVoltas, extCircuito, duracao;
        double velMedia, distanciaTotal, duracaoTotal;
        duracao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual foi o tempo gasto de percurso? "));
        extCircuito = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos metros há no percurso feito? "));
        numVoltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Foram feitas quantas voltas? "));

        distanciaTotal = (numVoltas * extCircuito) / 1000.0;
        duracaoTotal = duracao / 60;

        velMedia = distanciaTotal/ duracaoTotal;
        JOptionPane.showMessageDialog(null, "A velocidade média foi de " + velMedia + "km/h");
    }
}
