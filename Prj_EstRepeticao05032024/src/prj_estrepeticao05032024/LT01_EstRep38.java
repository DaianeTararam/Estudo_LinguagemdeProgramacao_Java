import javax.swing.JOptionPane;

/*Data: 05/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba 100 números inteiros reais. Verifique e mostre o maior e o menos 
valor. Obs.: somente valores positivos.

 */
public class LT01_EstRep38 {
    public static void main(String[] args) {
        int cont;
        double num, maior, menor;
        maior = 0;
        menor = 10000;
        for(cont = 1; cont <= 100; cont++){
            num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + cont + "° número: \n(Digite números de 0 a 10.000)"));
            if( num >= maior){
                maior = num;
            }
            if (num <= menor){
                menor = num;
            }
        }
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior+ "\nO menor número é: " + menor);
    }
}
