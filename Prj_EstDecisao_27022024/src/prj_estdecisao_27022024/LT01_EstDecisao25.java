import javax.swing.JOptionPane;

/*Data: 27/02/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba a hora de início e de final de um jogo (HH,MM) sabendo que o tempo máximo 
é de 24 horas e pode começar num dia e terminar noutro.
 */
public class LT01_EstDecisao25 {
    public static void main(String[] args) {
        int horaInicial, horaFinal, minutoInicial, minutoFinal, totalHoras, totalMinutos;
        horaInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a hora inicial do jogo (HH): "));
        minutoInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o minuto inicial do jogo (MM): "));
        horaFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a hora final do jogo (HH): "));
        minutoFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o minuto final do jogo (MM): "));
        
        if (horaInicial > horaFinal){
            totalHoras = (24 - horaInicial) + horaFinal;
        }else{ 
            totalHoras = horaFinal - horaInicial;
    }
        if(minutoInicial > minutoFinal){
            totalMinutos = (60 - minutoInicial)+ minutoFinal; 
        }else{
            totalMinutos = minutoFinal - minutoInicial;
        }
        JOptionPane.showMessageDialog(null, "O jogo durou " + totalHoras + ":" + totalMinutos + "hrs.");
        
    }   
}
