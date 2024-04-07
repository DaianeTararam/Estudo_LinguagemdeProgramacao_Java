import javax.swing.JOptionPane;

/*Data: 12/03/2024
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

public class LT01_Procedure28 {
    static Double precoAtual, vendaMensal, novoPreco;
    public static void main(String[] args) {
        precoAtual = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço atual do produto: "));
        vendaMensal = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de venda mensal do produto: "));
        Procedure028();
        JOptionPane.showMessageDialog(null, "O novo preço será de : R$" + novoPreco);
    }
    static void Procedure028(){
        if (vendaMensal < 500 && precoAtual < 30){
            novoPreco =  precoAtual * 1.10;
        }else if (vendaMensal >= 500 && vendaMensal < 1000 && precoAtual >=30 && precoAtual < 80){
            novoPreco = precoAtual *1.15;
        }else if (vendaMensal > 1000 && precoAtual >= 80){
            novoPreco = precoAtual * 0.95;    
        }else{
            novoPreco = precoAtual;
        }
    }
}

