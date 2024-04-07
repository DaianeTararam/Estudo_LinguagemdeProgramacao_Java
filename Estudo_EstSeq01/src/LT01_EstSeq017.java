import javax.swing.JOptionPane;

/*Data: 23/02/2024
* @author: Daiane Tararam
* Versão 01
*/
/* Calcule a quantidade de litros gastos em uma viagem, sabendo que o 
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
*/
public class LT01_EstSeq017 {
    public static void main(String[] args) {
        int litros, km, tempo, velocidade;
        tempo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tempo de percurso: "));
        velocidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a velocidade média: "));
        km = velocidade * tempo;
        litros = km / 12;
        JOptionPane.showMessageDialog(null, "A quantidade de litros gastos na viagem foi de: " + litros +" litros.");


    }
}
