/*
Programador(a) : Daiane Tararam
Data: 12/03/2024
Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 */

import javax.swing.JOptionPane;
public class LT01_Procedure18 {
    static Integer maior, menor;
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
       Procedure018(num1, num2);
        JOptionPane.showMessageDialog(null, "O numero maior é: " + maior + " e o menor número é " + menor);
    }
        
    static void Procedure018(int num1, int num2){
        if (num1 > num2){
            maior  = num1;
            menor = num2;
        }else{
            maior = num2;
            menor = num1;
        }
        

    }
}
