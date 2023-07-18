public class ArrayVetorsimples {

    public static void main(String[] args) {
    String[] carros = {"Ferrari","Fusca","Camaro","Uno"};
    // indice do array    [0]      [1]     [2]     [3]
        System.out.println("Tamanho do array: "+carros.length);
        System.out.println("Carro: "+carros[1]);
        carros[1]= "Porsche"; // Modificando a lista.
        System.out.println("Carro: "+carros[1]);

        System.out.println("________________");
        System.out.println("Carros:");
        for(int i=0; i<carros.length; i++){
            System.out.println(carros[i]);// exibe todos os carros dentro do vetor.
        }
    }
}



