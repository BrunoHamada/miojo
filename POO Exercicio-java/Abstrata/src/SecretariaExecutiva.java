import java.time.LocalDate;

public class SecretariaExecutiva extends Secretaria{
    public SecretariaExecutiva(String nome, String rg, LocalDate dtNascimento, String cpf, double salario) {
        super(nome, rg, dtNascimento, cpf, salario);
    }

    @Override
    public double getBonificacao() {

        double secretariaExec = salario * 2;
        return secretariaExec;
    }

    @Override
    public String toString() {
        return "SecretariaExecutiva{" +
                "cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", dtNascimento=" + dtNascimento +
                '}';
    }
}
