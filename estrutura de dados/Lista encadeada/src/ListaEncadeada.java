public class ListaEncadeada {
    public static void main(String[] args) {

        Listas lista= new Listas();

        lista.insereprimeiro(10);
        lista.insereprimeiro(22);

        lista.inserirUltimo(33);
        lista.inserirUltimo(44);



        No no1 = lista.getPrimeiro(); //.getProximo();

        lista.insereDepois(no1, 99);

        System.out.println("Removi o primeiro num: "+lista.removePrimeiro().getInfo());
        lista.mostrar();

        lista.removerDepois(lista.getPrimeiro().getProximo());
        lista.mostrar();


        /*
        System.out.println(lista.estaVazia());
        System.out.println(lista.getPrimeiro().getInfo());
        System.out.println(lista.getPrimeiro().getProximo());
        */

        /* testando a classe Nó
        No no1= new No(10);

        No no2= new No(20);
        no1.setProximo(no2);
        System.out.println(no1.getInfo());
        System.out.println(no1.getProximo().getInfo());
        System.out.println(no2.getInfo());
        System.out.println(no2.getProximo());
*/
    }
}