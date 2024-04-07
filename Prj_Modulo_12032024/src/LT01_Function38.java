import javax.swing.JOptionPane;

/*Data: 16/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba 100 números inteiros reais. Verifique e mostre o maior e o menos 
valor. Obs.: somente valores positivos.

 */
public class LT01_Function38 {
    public static void main(String[] args) {
        int cont;
        double num;
        String resultado;
        
        for(cont = 1; cont <= 100; cont++){
            num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + cont + "° número: \n(Digite números de 0 a 10.000)"));
            resultado = Function038(num);
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    static String Function038(double num){
        double maior;
        double menor;
        maior = 0;
        menor = Double.MAX_VALUE;
        if( num >= maior){
                maior = num;
            }
        if (num <= menor){
                menor = num;
        }
        return "O maior número é: " + maior + "\nO menor número é: " + menor;
    }
}
//não consegui fazer