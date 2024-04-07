import javax.swing.JOptionPane;

/*Data: 16/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e 
mostre o resultado da somatória dos números ímpares entre esses valores.
 */
public class LT01_Function35 {
    public static void main(String[] args) {
        int num1, num2, soma, maior, menor;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um segundo número: "));
        if( num1 > num2){
            maior = num1;
            menor = num2;
        }else{
            maior = num2;
            menor = num1;
        }
        soma = Function035(maior, menor);
        
        JOptionPane.showMessageDialog(null, "A soma dos números ímpares é " + soma);
    }
    static int Function035(int maior, int menor){
        int soma, contador;
        soma = 0;
        for(contador = maior; contador >= menor; contador-- ){
            if(contador%2 != 0){
                soma = soma + contador;   
            }
        }
        return soma;
    }
}