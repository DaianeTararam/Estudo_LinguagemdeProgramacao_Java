import javax.swing.JOptionPane;
/*
* Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
* Data: 20/02/2024
* Programador(a): Daiane Tararam
* Versão 01
*/

/**
 *
 * @author FATEC ZONA LESTE
 */
public class LT01_EstSeq01 {
    public static void main (String args [ ] ) {
        int Lado, Quadrado; 
        Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado: "));
        Quadrado = (Lado * Lado);
        JOptionPane.showMessageDialog(null, "A área do quadrado é " + Quadrado);
    }
}