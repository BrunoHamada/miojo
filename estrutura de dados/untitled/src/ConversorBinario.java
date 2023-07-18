public class ConversorBinario {

    public static String decBin(int numero) {
        if (numero == 0) {
            return "0";
        }

        if (numero == 1) {
            return "1";
        }

        int resto = numero % 2;
        int quociente = numero / 2;

        String parteBinaria = decBin(quociente);

        return parteBinaria + resto;
    }

    public static void main(String[] args) {
        int numeroDecimal = 5;
        String numeroBinario = decBin(numeroDecimal);

        System.out.println("O número binário de " + numeroDecimal + " é: " + numeroBinario);
    }
}
