import java.time.LocalDate;

public abstract class Secretaria extends Funcionario{


    public Secretaria(String nome, String rg, LocalDate dtNascimento, String cpf, double salario) {
        super(nome, rg, dtNascimento, cpf, salario);
    }


}
