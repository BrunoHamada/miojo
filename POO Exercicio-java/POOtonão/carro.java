class Carro{

    private String marca = "toyota";
    private String modelo = "AE86 - Trueno";
    private int ano = 1981;
    private String cor = "Branco";

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

        public static void main(String[] args) {
            Carro objCarro = new Carro();
            String marca = objCarro.getMarca();
            String modelo = objCarro.getModelo();
            int ano = objCarro.getAno();
            String cor = objCarro.getCor();

            System.out.println(marca);
            System.out.println(modelo);
            System.out.println(ano);
            System.out.println(cor);
        }
    }

