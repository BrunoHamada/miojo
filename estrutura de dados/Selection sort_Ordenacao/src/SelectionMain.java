public class SelectionMain {
    public static int[] vetorSelection = {3,6,8,1,4,0};
    public static void main(String[] args) {

        Ordenacao order = new Ordenacao();
        System.out.println("Ordenando: "+order.selectionSort(vetorSelection));
    }
}