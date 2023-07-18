import java.time.LocalDate;

public class Presidente extends Funcionario{

    private SecretariaExecutiva Se;

    public Presidente (String nome, String rg, LocalDate dtNascimento, String cpf, double salario, SecretariaExecutiva Se){
        super(nome, rg, dtNascimento, cpf, salario);
    }

    @Override
    public double getBonificacao() {

        double presidente = salario * 5;
        return presidente;
    }

    @Override
    public String toString() {
        return "Presidente{" +
                "cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", dtNascimento=" + dtNascimento +
                '}';
    }
}
