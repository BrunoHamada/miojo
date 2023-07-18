
public class HealthProfile {
    //Declarando váriaveis
    private String nome, sobrenome, sexo, cpf;
    private double altura, peso;
    private int dia, mes, ano;

    //Construtor
    public HealthProfile(String nome, String sobrenome,String sexo, String cpf, double altura, double peso, int dia, int mes, int ano){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.altura = altura;
        this.peso = peso;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    //Getters e Setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}

    public int getDia() {return dia;}
    public void setDia(int dia) {this.dia = dia;}

    public int getMes() {return mes;}
    public void setMes(int mes) {this.mes = mes;}

    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    //Calculo da idade.
    public int getIdade(){
        int idade = 2022 - this.getAno();
        return idade;
    }

    // Calculo do IMC
    public double getIMC(){
        double IMC = getPeso()/(getAltura()*getAltura());
        return IMC;
    }

    // Calculo do Frequencia Cardiaca Maxima
    public double getFCM(){
        double FCM = 220 - getIdade();
        return FCM;
    }
}