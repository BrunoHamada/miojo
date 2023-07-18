import java.util.Scanner;
public class employeetest {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        employee s1 = new employee(null, null, 0);
        employee s2 = new employee(null, null, 0);

        System.out.println();
        System.out.print("Digite o primeiro nome do 1° trabalhador: ");
        String nome = scan.next();
        
        System.out.print("Digite o sobrenome do 1° trabalhador: ");
        String sNome = scan.next();
        
        System.out.print("Digite o valor do salário mensal do 1° trabalhador: ");
        double salario = scan.nextDouble();
       
        if (salario <=0){
        System.out.println("Valor de salário negativo!");
       }

        System.out.println();
        System.out.print("Digite o primeiro nome do 2° trabalhador: ");
        String nome2 = scan.next();
        
        System.out.print("Digite o Sobrenome do 2° trablhador: ");
        String sNome2 = scan.next();
        
        System.out.print("Digite o valor do salário mensal do 2° trabalhador: ");
        double salario2 = scan.nextDouble();
        if (salario <=0){
            System.out.println("Valor de salário negativo!");
        }

        s1.setNome(nome);
        s1.setSobrenome(sNome);
        s1.setSalarioMensal(salario);
        s2.setNome(nome2);
        s2.setSobrenome(sNome2);
        s2.setSalarioMensal(salario2);

        System.out.println();
        System.out.println("Nome completo do 1° trabalhador: "+s1.getNome()+" "+s1.getSobrenome()+
        "\nSalário mensal: "+s1.getSalarioMensal());
        System.out.println("Salário Anual: $"+s1.getsalarioAnual()+"\nSalário + aumento de 10%: $"+s1.getaumento());
        
        System.out.println("\nNome completo do 2° trabalhador: "+s2.getNome()+" "+s2.getSobrenome()
        +"\nSalario mensal: $"+s2.getSalarioMensal());
        System.out.println("Salário anual: $"+s2.getsalarioAnual()+"\nSalário + aumento de 10%: $"+s2.getaumento());
        System.out.println();

    }
}
