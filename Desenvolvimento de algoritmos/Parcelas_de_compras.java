
package atividade_3;
import javax.swing.JOptionPane;

public class Parcelas_de_compras {
  public static void main(String[] args) {
        float preco_prod, prestmensal, juros, valorfina;
        int parcelas;
        preco_prod = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço do produto a vista: ")); 
        parcelas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de parcelas que deseja: "));

        juros = switch (parcelas) {
          case 1 -> 0;
          case 2, 3 -> 10;
          case 4, 5, 6, 7, 8, 9, 10 -> 20;
          default -> -1;
      };

        if (parcelas <= 1){
            JOptionPane.showMessageDialog(null, "Numero de Parcelas invalido");
        }
        else {
            valorfina = preco_prod + preco_prod * juros / 100 ;
            prestmensal = valorfina / parcelas;
            JOptionPane.showMessageDialog(null, "o valor final do produto é: " + valorfina );
            JOptionPane.showMessageDialog(null, "o valor das parcelas mensais são de: " + prestmensal);
            }
        }
        }


/*
inicio

real preco_prod, prest_mensal, juros, valor_final;
int parcelas;

escreva("Escreva o valor do produto: ")
leia(preco_prod)

escreva("Escreva o número de parcelas desejadas: ")
leia(parcelas)

escolha(parcelas){
 caso 1:
 juros = 0
 quebra
 caso 2:
 juros = 1
 caso 3:
 juros = 2
 quebra
 caso 4:
 juros = 3
 caso 5: 
 juros = 4
 caso 6:
 juros = 5
 caso 7:
 juros = 6
 caso 8:
 juros = 7
 caso 9:
 juros = 8
 caso 10:
 juros = 9
 caso 11:
 juros = 10
 break
senao
juros -1
}
 se (parcelas <= 1){
           escreva("Numero de Parcelas invalido");
        }
        senao{
            valorfinal = preco_prod + preco_prod * juros / 100 ;
            prest_mensal = valorfinal / parcelas;
            ("O valor com juros: " + valorfinal );
            ("Parcelas mensais: " + prest_mensal);
            }

*/