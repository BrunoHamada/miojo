public class Arvore {
    private Elemento ele;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore(){}

    public Arvore(Elemento ele){
        this.ele=ele;
        this.direita=null;
        this.esquerda=null;
        System.out.println("Criei a arvore com o elemento: "+ele.getValor());
    }
    public boolean isEmpty(){
        return (this.ele==null);
    }

    public void adicionar(Elemento novo){
        //verifica se a arvore está vazia
        if(isEmpty()){
            ele=novo;
            //se a arvore já tiver elemento vamos criar uma arvore
        }else{
            Arvore novaArvore= new Arvore(novo);//estará a direita ou a esquerda
            if(novo.getValor()<this.ele.getValor()){//se o novo valor for menor que o elemento

                if(this.esquerda==null){//uma folha
                    this.esquerda=novaArvore;
                    System.out.println("O elemento: "+novo.getValor()+" adicionado á esquerda do valor: "+this.ele.getValor());
                }else{
                    this.esquerda.adicionar(novo);
                }
            } else if (novo.getValor()>this.ele.getValor()) {
                if(this.direita==null){
                    this.direita=novaArvore;
                    System.out.println("O elemento: "+novo.getValor()+" adicionado á direita do valor "+this.ele.getValor());
                }else {
                    this.direita.adicionar(novo);
                }
            }
        }
    }
}
