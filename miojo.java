public class miojo {

    private String marca = "Naossei";

    private int tempo = 30;

    public String getMarca(){
        return marca;

    }
    public int getTempo(){
        return tempo;
    }

    public static void main(String[] args) {
        miojo objMiojo = new miojo();
        String marca = objMiojo.getMarca();
        int tempo = objMiojo.getTempo();

        System.out.println("A marca do miojo é " + objMiojo.marca + " e será necessario " + objMiojo.tempo +
                "Min. para ficar pronto");
    }
}
