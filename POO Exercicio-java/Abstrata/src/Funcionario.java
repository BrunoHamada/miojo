import java.time.LocalDate;

public abstract class Funcionario extends Pessoa{

    String cpf;
    double salario;

    public Funcionario(String nome, String rg, LocalDate dtNascimento, String cpf, double salario){
        super(nome, rg, dtNascimento);
        this.cpf=cpf;
        this.salario=salario;

    }

    public abstract double getBonificacao();
}
