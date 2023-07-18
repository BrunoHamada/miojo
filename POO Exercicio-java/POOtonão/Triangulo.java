public class Triangulo extends Figura{
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor){

        this.base=base;
        this.altura=altura;
        this.cor=cor;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double areaTriangulo(){

        double area = base * altura / 2;
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo [base= " + base + ", altura= " + altura + "]";
    }

    
}
