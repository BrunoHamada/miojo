public class Circulo extends Figura{
    
    private double raio;


    public Circulo(double raio, String cor){

        this.raio=raio;
        this.cor=cor;
    }

    public double getRaio() {
        return raio;
    }


    public void setRaio(double raio) {
        this.raio = raio;
    }
    

    public double areaCirculo(){
        
        double area = 3.14 * raio * raio ;
        
        return area;
    }
    public double getDiametro(){

        double diametro = 2 * raio; 
        
        return diametro;
    }

    @Override
    public String toString() {
        return "Circulo [raio= " + raio + "]";
    }

    
}
