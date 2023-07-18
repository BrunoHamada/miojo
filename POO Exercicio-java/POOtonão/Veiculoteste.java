public class Veiculoteste {
    public static void main(String[] args) {
       Veiculo v1 = new Veiculo();
       Onibus v2 = new Onibus();
       Caminhao v3 = new Caminhao();

       v1.setPlaca("BDE-6419");
       v1.setAno(1995);
       
       v2.setPlaca("CTD-6582");
       v2.setPassageiros(40);
       v2.setAno(1982);

       v3.setPlaca("BWE-2712");
       v3.setAno(2003);
       v3.setPesoCarga(1208);


       System.out.println();
       System.out.println("-----dados do Veículo-----");
       System.out.println("Placa: "+ v1.getPlaca());
       System.out.println("Ano: "+ v1.getAno());


       System.out.println("\n-----dados do Onibus-----");
       System.out.println("Qtde passageiros: "+ v2.getPassageiros());
       System.out.println("Placa: "+ v2.getPlaca());
       System.out.println("Ano: "+ v2.getAno());
       
       
        System.out.println("\n-----dados do Caminhão-----");
        System.out.println("Placa: "+ v3.getPlaca());
        System.out.println("Ano: "+ v3.getAno());
        System.out.println("Peso da carga: "+ v3.getPesoCarga());
        System.out.println();


    }
}
