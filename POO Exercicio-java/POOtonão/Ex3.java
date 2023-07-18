//Bruno Hamada de Freitas
class pessoaFisica {
    String nome = "Bruno";
    int idade = 26;
    int CPF = 452641368;
}
public class Ex3{

    public static void main(String[] args) {
        pessoaFisica obj = new pessoaFisica();
    
        System.out.print("O número do meu CPF é "+obj.CPF);
        System.out.print(", eu sou "+obj.nome);
        System.out.println(" e tenho "+obj.idade+" anos.");
    }
    
}
    


