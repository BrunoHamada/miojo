public class ArvoreMain {
    public static void main(String[] args) {
        Arvores arvore=new Arvores(new Elemento(15));
        arvore.adicionar(new Elemento(25));
        arvore.adicionar(new Elemento(5));
        arvore.adicionar(new Elemento(30));
        arvore.adicionar(new Elemento(8));
        arvore.adicionar(new Elemento(20));
        arvore.adicionar(new Elemento(31));
        arvore.adicionar(new Elemento(6));


        if(arvore.pesquisar(30)){
            System.out.println("Existe");
        }else {
            System.out.println("Não existe");
        }
        //condição? valor se for verdadeiro : valor se for falso
        //double bonus = salario * (salario> 1000 ? 0.10 : 0.15);

        System.out.println("O elemento 6 "+(arvore.pesquisar(30) ? " existe?":"não existe"));
    }
}