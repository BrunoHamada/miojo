public class fundamentos {
    public static void main(String[] args) {

        // Aula 1 Part1.
        String nome = "Bruno Hamada";// As variaveis precisam ser inicializada para ser utilizada.
        // Variaveis do tipo String precisam ser utilizadas com "AS aspas duplas".

        int idade = 24;// Aceita apenas números inteiros.

        char sexo = 'M';// char é utilizado apenas para usar uma letra e só pode ser usado com 'aspas simples'.

        double temperatura = 27.668;// Aceita todos os tipos de valores númericos.

        String realidade = "Sensação térmica de 40°.";// Variavel booleana. Não sabe? vai saber se pesquisar.

        boolean arcondicionado = false;

        System.out.println("Uso de variáveis na linguagem Java");
        System.out.println("Exemplos:");
        System.out.println("Nome: " + nome +"\nIdade: " + idade +"\nSexo: " + sexo +"\nTemperatura: " + temperatura);
        // O a sinal de + é utilizado para unir(concatenar) as variaveis.
        System.out.println("Sensação térmica: " + realidade+"\nAr-condicionado = " + arcondicionado);
        System.out.println("========================================================================");
        System.out.println();

        // Aula 1 part 2.
        double i = 10;
        System.out.println("Operadores Aritiméticos e Atribuições");
        System.out.println("Exemplos:");
        System.out.println("i = " + i);
        System.out.println("i = " + i + " + 5 | i = " + (i + 5));
        System.out.println("i = " + i + " - 5 | i = " + (i - 5));
        System.out.println("i = " + i + " * 5 | i = " + (i * 5));
        System.out.println("i = " + i + " / 5 | i = " + (i / 5));
        System.out.println("i = " + i + " % 5 | i = " + (i % 5));// Resto da divisão.

        System.out.println("i +=         | i = " + (i += 5));
        System.out.println("i -=         | i = " + (i -= 5));
        System.out.println("i *=         | i = " + (i *= 5));
        System.out.println("i /=         | i = " + (i /= 5));

        i++;// Conta + mais 1 na variavel.
        System.out.println("i++          | i = " + i);
        i--;// Subtrai - 1 na variavel.
        System.out.println("i++          | i = " + i);

    }
}
