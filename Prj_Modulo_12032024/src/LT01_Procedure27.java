import javax.swing.JOptionPane;

/*Data: 12/032024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
Calcule e mostre a velocidade média em km/h.
 */
public class LT01_Procedure27 {
    static Integer numVoltas, extCircuito ;
    static Double velMedia, distanciaTotal, duracaoTotal, duracao; 
    public static void main(String[] args) {
        duracao = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual foi o tempo gasto de percurso? "));
        extCircuito = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos metros há no percurso feito? "));
        numVoltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Foram feitas quantas voltas? "));
        Procedure027();
        JOptionPane.showMessageDialog(null, "A velocidade média foi de " + velMedia + "km/h");
    }
    static void Procedure027(){
        distanciaTotal = (numVoltas * extCircuito) / 1000.0;
        duracaoTotal = duracao / 60;
        velMedia = distanciaTotal/ duracaoTotal;
        
    }
}
