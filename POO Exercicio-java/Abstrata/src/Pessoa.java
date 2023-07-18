import java.time.LocalDate;

public abstract class Pessoa {


    String nome, rg;
    LocalDate dtNascimento;


    public Pessoa(String nome, String rg, LocalDate dtNascimento){

        this.nome=nome;
        this.rg=rg;
        this.dtNascimento=dtNascimento;

    }


    public abstract String toString();

}
