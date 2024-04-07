import javax.swing.JOptionPane;

/*Data: 16/03/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba 2 números inteiros. Verifique e mostre todos os números primos 
existentes entre eles.

 */


 public class LT01_Function40 {
     public static void main(String[] args) {
         int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o menor número: "));
         int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o maior número: "));
 
         String primos = verificarNumerosPrimos(num1, num2);
 
         JOptionPane.showMessageDialog(null, primos);
     }
 
     static String verificarNumerosPrimos(int menor, int maior) {
         StringBuilder primosEncontrados = new StringBuilder();
 
         for (int num = menor; num <= maior; num++) {
             if (isPrimo(num)) {
                 primosEncontrados.append(num).append(" é PRIMO!\n");
             }
         }
 
         return primosEncontrados.toString();
     }
 
     static boolean isPrimo(int num) {
         if (num <= 1) {
             return false;
         }
 
         for (int i = 2; i <= Math.sqrt(num); i++) {
             if (num % i == 0) {
                 return false;
             }
         }
 
         return true;
     }
 }
 
