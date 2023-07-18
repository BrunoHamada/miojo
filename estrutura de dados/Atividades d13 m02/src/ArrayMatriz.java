public class ArrayMatriz {
    // Array multidimensional
    public static void main(String[] args) {
        String[][] agenda={{"José","91234-1234","professorjoseaassis@gmail.com"},
                {"Bruno","92222-2222","brunohamada@hmail.com"},
                {"Linus","96666-6666","tux@linux.com"}};

        // A linha abaixo recupera o telefone do José
        //System.out.println();
        //System.out.println(agenda[0][1]);

        // As estruturas abaixo percorrem os indices dos arrays
        for(int i=0; i< agenda.length;i++) {
            System.out.println("__________________________________");
            for (int j =0;j< agenda.length;j++){
                System.out.println(agenda[i][j]);
            }
        }
    }
}
