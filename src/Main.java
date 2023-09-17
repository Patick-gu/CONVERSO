import FUNCOES.Funcao;
import FUNCOES.FuncaoTemperatura;

import javax.swing.*;

import static java.lang.System.exit;

public class Main
{
    public static void main(String[] args)
    {
        Funcao moedas = new Funcao();
        FuncaoTemperatura temperatura = new FuncaoTemperatura();

        while (true)
        {

            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura"}, "Escolha").toString();

            switch (opcao)
            {
                case "Conversor de Moeda":
                    String input = JOptionPane.showInputDialog("Insira um valor: ");
                    if (checar(input))
                    {
                        double valorRecebido = Double.parseDouble(input);
                        moedas.converterMoeda(valorRecebido);

                        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if (JOptionPane.OK_OPTION == resposta)
                        {
                            System.out.println("Escolha opção Afirmativa");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                            System.out.println("progama cancelado");
                            exit(0);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                break;

                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Insira um valor de temperatura para converter");
                    if (checar(input))
                    {
                        double valorRecebido = Double.parseDouble(input);
                        temperatura.converterTemperatura(valorRecebido);

                        int resposta;
                        resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if ((resposta == 0) && (checar(input)))
                        {
                            System.out.println("continuando");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                            System.out.println("cancelado");
                            exit(0);

                        }

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }


            }
        }

    }

    public static boolean checar(String input)
    {
        try
        {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0) ;
            return true;
        } catch (NumberFormatException e)
        {
            return false;
        }
    }
}


