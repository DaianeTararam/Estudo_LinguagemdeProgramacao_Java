import javax.swing.JOptionPane;

/*Data: 27/02/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
Mostre a mensagem de acordo com a média:

a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”.
 */
public class LT01_EstDecisao21 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, media;
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 1ª nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 2ª nota: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 3ª nota: "));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 4ª nota: "));
        
        media = (nota1 + nota2 + nota3 + nota4)/ 4;
        
        if (media >= 6){
            JOptionPane.showMessageDialog(null, "Aluno APROVADO!"); 
        }else if(media >= 3 && media < 6){
            JOptionPane.showMessageDialog(null, "Aluno deverá fazer EXAME!");
        }else if (media < 3) {
            JOptionPane.showMessageDialog(null, "Aluno REPROVADO!");
        }
    }
}
