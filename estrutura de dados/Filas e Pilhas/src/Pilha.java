public class Pilha {
    int pedidos[];
    int topo;

    Pilha(int qtdePedidos){
         topo= -1;
        pedidos= new int[qtdePedidos];
    }
    public boolean cheia(){

        return (topo ==(pedidos.length-1));
    }

    public boolean vazia(){
        return (topo == -1);
    }
    public String toString(){
        String s= "[";

        for (int i= 0; i<=topo; i++){
            s= s + pedidos[i];

            if (i<topo){
               s= s + ',';
           } else{
                s= s+ "]";
            }
        }
        return s;
    }

    public void empilha(int recebePedido){
        if (!cheia()){
            topo++;
            pedidos[topo]= recebePedido;
        } else{
            System.out.println("Pilha cheia!");
        }
    }

    public int desimpilha(){
        int valor= -1;
        if (!vazia()){
            valor= pedidos[topo];
            pedidos[topo]= 0;
            topo --;
        } else{
            System.out.println("Pilha vazia!");
        }
        return valor;
    }
}




