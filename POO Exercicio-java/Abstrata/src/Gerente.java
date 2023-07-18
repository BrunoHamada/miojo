import java.time.LocalDate;

public class Gerente extends Funcionario{

    private SecretariaAdmnistrativa Sa;
    public Gerente(String nome, String rg, LocalDate dtNascimento, String cpf, double salario, SecretariaAdmnistrativa Sa) {
        super(nome, rg, dtNascimento, cpf, salario);
    }

    @Override
    public double getBonificacao() {

        double gerente = salario * 3;
        return gerente;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", dtNascimento=" + dtNascimento +
                '}';
    }
}
