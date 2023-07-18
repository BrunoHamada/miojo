public class Recursividade {
    public static double somaArray(double[] array, int indice) {
        // Caso base: quando chegamos ao final do array
        if (indice == array.length - 1) {
            return array[indice];
        }

        // Chamada recursiva: soma o elemento atual com a soma dos elementos restantes
        return array[indice] + somaArray(array, indice + 1);
    }

    public static void main(String[] args) {
        double[] numeros = {2.5, 4.7, 1.2, 3.9, 5.1};

        double soma = somaArray(numeros, 0);

        System.out.println("A soma dos elementos do array é: " + soma);
    }
}
