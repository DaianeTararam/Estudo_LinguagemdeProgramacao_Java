import javax.swing.JOptionPane;

/*Data: 10/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Calcule e mostre quantos anos serão necessários para que Ana seja maior que 
Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m 
e cresce 2 cm ao ano.


 */
public class LT01_EstRep43 {
    public static void main(String[] args) {
        double maria, ana;
        int anos;
        maria = 1.50;
        ana = 1.10;
        anos = 0;
        while (ana < maria){
            ana = ana + 0.03;
            maria = maria + 0.02;
            anos = anos + 1;
        }
        JOptionPane.showMessageDialog(null, "Levará "+ anos + " anos para Ana ficar maior que Maria!");
    }
    
}
