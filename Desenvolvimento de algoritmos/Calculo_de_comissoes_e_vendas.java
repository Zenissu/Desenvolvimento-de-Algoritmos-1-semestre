package atividade_3;

import javax.swing.JOptionPane;

public class Calculo_de_comissoes_e_vendas {

    public static void main(String[] args) {

        int tamanho = 10;
        int[] num_pedido = new int[tamanho];
        String[] nome_v = new String[tamanho];
        String[] nome_c = new String[tamanho];
        double[] valor_p = new double[tamanho];
        int resp = 1;
        double vendas = 0;
        double comissao = 0;
        int contador = 0;
        String vendedor = null;
        int comissao_esp = 0;
        int i;
        while (resp == 1) {

            num_pedido[contador] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do " + (contador + 1) + "º pedido"));
            nome_v[contador] = JOptionPane.showInputDialog("Digite o nome do  " + (contador + 1) + "º vendedor");
            nome_c[contador] = JOptionPane.showInputDialog("Digite o nome do " + (contador + 1) + "º cliente");
            valor_p[contador] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do " + (contador + 1) + "º pedido"));

            vendas += valor_p[contador];
            comissao += valor_p[contador] * 0.05;
            contador++;

            resp = Integer.parseInt(JOptionPane.showInputDialog("Escreva 1 para continuar ou 2 para terminar o programa"));

            if (tamanho == num_pedido.length) {

                int[] num_pedido_novo = new int[tamanho * 2];
                String[] nome_v_novo = new String[tamanho * 2];
                String[] nome_c_novo = new String[tamanho * 2];
                double[] valor_p_novo = new double[tamanho * 2];

                for (i = 0; i < num_pedido.length; i++) {
                    num_pedido_novo[i] = num_pedido[i];
                    nome_v_novo[i] = nome_v[i];
                    nome_c_novo[i] = nome_c[i];
                    valor_p_novo[i] = valor_p[i];
                }
                num_pedido = num_pedido_novo;
                nome_v = nome_v_novo;
                nome_c = nome_c_novo;
                valor_p = valor_p_novo;
            }
        }

        resp = Integer.parseInt(JOptionPane.showInputDialog("Você deseja ver a comissão de um funcionario em especifico aperte 1 ?"));

        if (resp == 1) {
            vendedor = JOptionPane.showInputDialog("Escreva o nome do vendedor ");
            for (i = 0; i < nome_v.length; i++) {
                if (vendedor.equals(nome_v[i])) {
                    comissao_esp += valor_p[i] * 0.05;
                }
            }
        }

        System.out.println("Quantidade dos pedidos " + contador);
        System.out.println("Valor total das vendas " + vendas);
        System.out.println("Total de comissoes " + contador + " valor de todas comissoes " + comissao);

        // como não entendi se era a comissão de todos os produtos ou de apenas uma pessoa especifica acabei optando em fazer os dois.
        if (resp == 1) {
            System.out.println("Comissao do vendedor " + vendedor + " e igual a " + comissao_esp);
        }

        System.out.println("Vendas com desconto das comissoes " + (vendas - comissao));
    }
}
