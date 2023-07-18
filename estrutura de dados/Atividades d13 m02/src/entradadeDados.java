package src;

import javax.swing.JOptionPane;

public class entradadeDados {

    public static void main(String[] args) {

        // Variaveis

        String nome;

        int idade;

        double salario;

        // EntradadeDados

        nome= JOptionPane.showInputDialog("Nome: ");

        idade= Integer.parseInt(JOptionPane.showInputDialog("Idade: "));

        salario= Double.parseDouble(JOptionPane.showInputDialog("Salário: "));

        // Saida

        System.out.println("Nome...: "+ nome);

        System.out.println("Idade..: "+ idade);

        System.out.println("Salário: "+ salario);

    }

}