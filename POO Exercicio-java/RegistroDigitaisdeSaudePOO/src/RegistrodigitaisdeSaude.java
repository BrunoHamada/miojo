// Integrantes: Bruno, Christopher, Marcos, Nicoly, Nycolas Freitas, Polliany.
import java.util.Scanner;

public class RegistrodigitaisdeSaude {

    public static void main(String[] args) {
        //Instanciando as classes
        Scanner leia = new Scanner(System.in);
        HealthProfile p1 = new HealthProfile(null,null,null,null,0,0,0,0,0);

        //Criando as váriaveis
        String nome,sobrenome,sexo,cpf;
        double altura, peso;
        int dia, mes, ano;

        //Pedindo as informações do usuário
        System.out.println("Cadastro do paciente");
        System.out.print("Nome: ");
        nome = leia.next();
        System.out.print("Sobrenome: ");
        sobrenome = leia.next();
        System.out.print("Sexo: ");
        sexo = leia.next();
        System.out.print("CPF: ");
        cpf = leia.next();
        System.out.print("Altura: ");
        altura = leia.nextDouble();
        System.out.print("Peso: ");
        peso = leia.nextDouble();
        System.out.print("Dia de Nascimento: ");
        dia = leia.nextInt();
        System.out.print("Mês de Nascimento: ");
        mes = leia.nextInt();
        System.out.print("Ano de Nascimento: ");
        ano = leia.nextInt();

        p1.setNome(nome);
        p1.setSobrenome(sobrenome);
        p1.setSexo(sexo);
        p1.setCpf(cpf);
        p1.setAltura(altura);
        p1.setPeso(peso);
        p1.setDia(dia);
        p1.setMes(mes);
        p1.setAno(ano);

        //Printando todas as informações do usuário já com o calcúlo
        System.out.printf("\nNome completo do paciente: "+nome+" "+sobrenome+"\nSexo: "+sexo+ "\nidade: "+p1.getIdade()+
                "\nCPF: "+cpf+"\nAltura: "+altura+"\nPeso: "+peso+"\nIMC normal: 18,5Kg/M² a 24,9Kg/M²"+
                "\nIMC do paciente: "+String.format("%.02f", p1.getIMC())+
                "\nFrequência cardiaca do paciente: "+String.format("%.02f", p1.getFCM()));

    }
}
