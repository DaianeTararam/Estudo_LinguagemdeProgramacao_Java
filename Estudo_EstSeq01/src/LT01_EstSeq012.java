import javax.swing.JOptionPane;

/*Data: 21/02/2024
* @author: Daiane Tararam
* Versão 01
*/
/*  Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e 
* quantos anos terá daqui a 17 anos.
*/
public class LT01_EstSeq012 {
    public static void main(String[] args) {
        int anoNascimento, anoAtual, idade;
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano em que nasceu: " ));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano atual: " )); 
        idade = anoAtual - anoNascimento;
        JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos.");
        idade  = idade + 17;
        JOptionPane.showMessageDialog(null, "Em 17 anos você terá " + idade + " anos.");
    }
}
