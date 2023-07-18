import java.util.Scanner;

public class TesteEx01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Retangulo retangulo = new Retangulo(0, 0, null);
        Quadrado quadrado = new Quadrado(0, null);
        Triangulo triangulo = new Triangulo(0, 0, null);
        Circulo circulo = new Circulo(0, null);

        System.out.println();
        System.out.print("Digite o valor para o lado1 do Retangulo: ");
        double lado1 = scan.nextDouble();
        System.out.print("Digite o valor para o lado2 do Retangulo: ");
        double lado2 = scan.nextDouble();
        System.out.print("Digite a cor desse retangulo: ");
        String cor = scan.next();
        
        retangulo.setLado1(lado1);
        retangulo.setLado2(lado2);
        retangulo.setCor(cor);

        System.out.println();
        System.out.println(retangulo);
        System.out.println("Área do Retangulo: " + retangulo.areaRetangulo() + "\nCor do Retangulo: " + retangulo.cor);
        System.out.println();

        System.out.print("Digite o lado do Quadrado: ");
        double lado0 = scan.nextDouble();
        System.out.print("Digite a cor do Quadrado: ");
        String corQuadrado = scan.next();

        quadrado.setCor(corQuadrado);
        quadrado.setLado1(lado0);
        quadrado.setLado2(lado0);

        System.out.println();
        System.out.println("O comprimento dos lados do Quadrado total: "+quadrado.getLado1()+"Cm");
        System.out.println("Cor do Quadrado: "+ quadrado.cor);
        
        System.out.println();
        System.out.print("Digite o valor da base do Triângulo: ");
        double base = scan.nextDouble();
        System.out.print("Digite o valor da Altura do Triângulo: ");
        double altura = scan.nextDouble();
        System.out.print("Digite a cor do Triângulo: ");
        String corTriangulo = scan.next();

        triangulo.setAltura(altura);
        triangulo.setBase(base);
        triangulo.setCor(corTriangulo);

        System.out.println();
        System.out.println(triangulo);
        System.out.println("A área do Triângulo: "+triangulo.areaTriangulo());
        System.out.println("A cor do Triângulo: "+triangulo.getCor());
        System.out.println();

        System.out.print("Digite o raio do Círculo: ");
        double raio = scan.nextDouble();
        System.out.print("Digite a cor co Círculo: ");
        String corCirculo = scan.next();

        circulo.setCor(corCirculo);
        circulo.setRaio(raio);

        System.out.println();
        System.out.println(circulo);
        System.out.println("Área do Círculo: "+circulo.areaCirculo());
        System.out.println("Diametro: "+circulo.getDiametro());
        System.out.println("");
    }

}
