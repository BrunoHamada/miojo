import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args) {
        Banco conta1 = new Banco();
        Banco conta2 = new Banco();
        Banco conta3 = new Banco();

        conta1.setNome("Fernando");
        conta1.setIdade(29);
        conta1.setSexo("Masculino");
        conta1.setConta(1234);
        conta1.setContaConjunta("Não");
        conta1.setSaldo(1500.00);

        conta2.setNome("Maria");
        conta2.setIdade(45);
        conta2.setSexo("Feminino");
        conta2.setConta(5312);
        conta2.setContaConjunta("Sim");
        conta2.setSaldo(530.31);

        conta3.setNome("João");
        conta3.setIdade(54);
        conta3.setSexo("Masculino");
        conta3.setConta(9621);
        conta3.setContaConjunta("Sim");
        conta3.setSaldo(4325.12);

        while(1==1) {
            System.out.println("O que deseja? \nDigite (1) para Saque.\nDigite (2) para Depósito.");
            Scanner input = new Scanner(System.in);
            int decisao = input.nextInt();

            if (decisao == 1) {
                System.out.print("Digite o numero da conta: ");
                int conta = input.nextInt();
                double Valor = Banco.Saque();

                if (conta == 1 && Valor < conta1.getSaldo()) {
                    conta1.setSaldo(conta1.getSaldo() - Valor);
                    System.out.print("Nome: " + conta1.getNome() + "\nSaldo atual: " + conta1.getSaldo());
                }

                else if (conta == 2 && Valor < conta2.getSaldo()) {
                    conta2.setSaldo(conta2.getSaldo() - Valor);
                    System.out.print("Nome: " + conta2.getNome() + "\nSaldo atual: " + conta2.getSaldo());

                }

                else if (conta == 3 && Valor < conta3.getSaldo()) {
                    conta3.setSaldo(conta3.getSaldo() - Valor);
                    System.out.print("Nome: " + conta3.getNome() + "\nSaldo atual: " + conta3.getSaldo());

                }

                else {
                    System.out.println("Saldo insuficiente!");
                }
            }

            else if (decisao == 2) {
                System.out.print("Digite o numero da conta: ");
                int conta = input.nextInt();
                double Valor = Banco.Deposito();

                if (conta == 1) {
                    conta1.setSaldo(Valor + conta1.getSaldo());
                    System.out.print("Nome: " + conta1.getNome() + "\nSalvo atual: " + conta1.getSaldo());

                }

                else if (conta == 2) {
                    conta2.setSaldo(Valor + conta2.getSaldo());
                    System.out.print("Nome: " + conta2.getNome() + "\nSalvo atual: " + conta2.getSaldo());
                }

                else if (conta == 3) {
                    conta3.setSaldo(conta3.getSaldo() - Valor);
                    System.out.print("Nome: " + conta3.getNome() + "\nSaldo atual: " + conta3.getSaldo());

                }

            }
        }
    }
}


class Banco{
    private String nome;
    private String sexo;
    private int idade;
    private int conta;
    private String contaConjunta;
    private double saldo;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getContaConjunta() {
        return contaConjunta;
    }
    public void setContaConjunta(String contaConjunta) {
        this.contaConjunta = contaConjunta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    static double Saque(){
        System.out.print("Digite o valor do saque: ");
        Scanner input = new Scanner(System.in);
        double Valor = input.nextDouble();
        return Valor;

    }
    static double Deposito(){
        System.out.print("Digite o valor do depósito: ");
        Scanner input = new Scanner(System.in);
        double Valor = input.nextDouble();
        return Valor;
    }
}



