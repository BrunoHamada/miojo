public class Arvores {
    private Elemento ele;
    private Arvores esquerda;
    private Arvores direita;

    public Arvores(){}

    public Arvores(Elemento ele){
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
            Arvores novaArvore= new Arvores(novo);//estará a direita ou a esquerda
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
    public boolean pesquisar(int valor){
        if(isEmpty()){
            return false;// lista vazia não tem o que buscar
        }
        if (this.ele.getValor()==valor){
            return true;// se o valor for igual a da raiz
        }else {
            if (valor < this.ele.getValor()){// se o valor for menor vai para esquerda
                if (this.esquerda== null){// se na esquerda não tiver valor
                    return false;// não achou
                }else {
                    return this.esquerda.pesquisar(valor);
                }
            } else if (valor > this.ele.getValor()) {
                if (this.direita== null){
                    return false;
                }
            }else{
                return this.direita.pesquisar(valor);
            }

        }
        return false;
    }
}
