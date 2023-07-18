import java.time.LocalDate;

public class SecretariaAdmnistrativa extends Secretaria{
    public SecretariaAdmnistrativa(String nome, String rg, LocalDate dtNascimento, String cpf, double salario) {
        super(nome, rg, dtNascimento, cpf, salario);
    }

    @Override
    public double getBonificacao(){

        double secretariaAdm = salario * 1.5;
        return secretariaAdm;
    }


    @Override
    public String toString() {
        return "SecretariaAdmnistrativa{" +
                "cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", dtNascimento=" + dtNascimento +
                '}';
    }
}
