public class Listas {

    private No primeiro;

    // Construtor

    public Listas(){
        primeiro= null;
    }

    // getter
    public No getPrimeiro() {
        return primeiro;
    }

    // Está vazia
    public boolean estaVazia(){
        //return  primeiro == null;

        if(primeiro == null){
            return true;
        }else {
            return false;
        }
    }

    // Insere primeiro
    public void insereprimeiro(int valor){
        No no1 = new No(valor);
        no1.setProximo(primeiro);
        primeiro= no1;
    }

    // Mostra lista
    public void mostrar(){
        if (estaVazia()){
            System.out.println();
            System.out.println("Lista vazia! não existe informação para mostrar.");
        }else{
            No cursor= primeiro;
            while(cursor != null){
                System.out.println(cursor.getInfo());
                cursor = cursor.getProximo();
            }
        }
    }

    // Inserir último
    public void inserirUltimo(int valor){
        if (estaVazia()){
            insereprimeiro(valor);
        }else {
            No cursor= primeiro;
            while(cursor.getProximo() != null){
                cursor = cursor.getProximo();
            }
            No no1 = new No(valor);
            cursor.setProximo(no1);
        }
    }

    // Insere depois
    public void insereDepois(No no, int valor){
        No no1 = new No(valor);
        no1.setProximo(no.getProximo());
        no.setProximo(no1);
    }

    // Métodos de Remoção
    public No removePrimeiro(){
        if (estaVazia()){
            System.out.println("Lista vazia! Não tem nada para remover.");
            return null;
        }else{
            No cursor = primeiro;
            primeiro = primeiro.getProximo();
            return cursor;
        }

    }

    // remover depois
    public void removerDepois(No no){
        if (estaVazia()){
            System.out.println("Lista vazia! Não tem nada para remover.");
        }else {

            No anterior = null;
            No cursor = primeiro;

            while (cursor.getProximo() != null){
                anterior = cursor;
                cursor = cursor.getProximo();

                if (cursor.equals(no)){

                    System.out.println("Informação a ser removida: "+cursor.getInfo());
                    System.out.println();
                    anterior.setProximo(cursor.getProximo());
                }
            }
        }

    }
}
