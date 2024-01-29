
package atividade_3;

import javax.swing.JOptionPane;

public class Velocidade_do_veiculo {
public static void main(String[] args) {
    float km, h, velocidade;

km = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite os kilometros")); 
h = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite as horas de viagem"));

velocidade = km/h;

JOptionPane.showMessageDialog(null, "a velocidade do veiculo foi de: " +velocidade + " KM/h");
}
}
/*
algoritmo exercicio2

    início
        real km, h, velocidade

        escreva("Digite os Kilometros")
        leia(km)

        escreva("Digite as Horas")
        leia(h)

        velocidade = km/h 

        escreva( "a velocidade do veiculo foi de: " + velocidade + "KM/h")
    fim

*/
