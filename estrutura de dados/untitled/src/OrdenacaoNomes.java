public class OrdenacaoNomes {

    public static void insertionSort(String[] alunos) {
        int n = alunos.length;
        for (int i = 1; i < n; i++) {
            String chave = alunos[i];
            int j = i - 1;

            while (j >= 0 && alunos[j].compareTo(chave) > 0) {
                //......................................^ inverter esse simbolo passa pra ordem decrescente!
                alunos[j + 1] = alunos[j];
                j--;
            }
            alunos[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        String[] alunos = {"Carlos", "Ana", "Fernanda", "Pedro", "Bianca"};

        System.out.println();
        System.out.println("Alunos em desordem:");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }


        insertionSort(alunos);
        System.out.println();
        System.out.println("Alunos em ordem alfabética:");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}




