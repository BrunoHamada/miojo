public class JogoCarta {
    public static void main(String[] args) {

        String[] nipes={"Ouros","Copas","Espadas","Paus"};
        String[] faces={"Az","2","3","4","5","6","7","8","9","10",
                "Valette","Dama","Rei"};

        // as linhas abaixo recuperam de forma aleatória o conteúdos dos arrays
        String nipe= nipes[(int) (Math.random()*4)];
        String face= faces[(int) (Math.random()*faces.length)];
        // a linha abaixo exibe a carta sorteada
        System.out.println();
        System.out.println("Carta selecionada:");
        System.out.println(face+" de "+nipe);
    }
}
