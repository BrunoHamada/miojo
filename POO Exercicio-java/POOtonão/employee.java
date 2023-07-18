public class employee {
    
    String nome;
    String sobrenome;
    double salarioMensal;

    public employee(String nome, String sobrenome, double salarioMensal){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getsalarioAnual(){
        
        double salAnual = salarioMensal*12;
        
        return salAnual;
    }

    public double getaumento(){

        double salAnual = salarioMensal+(salarioMensal*0.1)*12;
        double aumento = salAnual;

        return aumento;
    }
}
