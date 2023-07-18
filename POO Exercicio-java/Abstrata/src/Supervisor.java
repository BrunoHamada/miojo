import java.time.LocalDate;

public class Supervisor extends Gerente{
    public Supervisor(String nome, String rg, LocalDate dtNascimento, String cpf, double salario, SecretariaAdmnistrativa Sa) {
        super(nome, rg, dtNascimento, cpf, salario, Sa);
    }

}
