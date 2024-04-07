import javax.swing.JOptionPane;

/*Data: 27/02/2024
* Programador(a): Daiane Tararam
* Versão 01

Exercicio: Receba o preço atual e a média mensal de um produto. Calcule e mostre o 
novo preço sabendo que:
Venda Mensal          Preço Atual           Preço Novo
< 500                    < 30                  + 10%
>= 500 e < 1000       >= 30 e < 80             + 15%
>= 1000                 >= 80                  - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.

 */

public class LT01_EstDecisao28 {
    public static void main(String[] args) {
        double precoAtual, vendaMensal, novoPreco;
        precoAtual = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço atual do produto: "));
        vendaMensal = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de venda mensal do produto: "));
        if (vendaMensal < 500 && precoAtual < 30){
            novoPreco =  precoAtual * 1.10;
        }else if (vendaMensal >= 500 && vendaMensal < 1000 && precoAtual >=30 && precoAtual < 80){
            novoPreco = precoAtual *1.15;
        }else if (vendaMensal > 1000 && precoAtual >= 80){
            novoPreco = precoAtual * 0.95;    
        }else{
            novoPreco = precoAtual;
        }
        JOptionPane.showMessageDialog(null, "O novo preço será de : R$" + novoPreco);

    }
}
