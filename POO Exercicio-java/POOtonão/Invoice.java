public class Invoice {
    String descrição;
    String numeroItem;
    int quantItem;
    double preçoItem;
    
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    public String getNumeroItem() {
        return numeroItem;
    }
    public void setNumeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
    }
    public int getQuantItem() {
        return quantItem;
    }
    public void setQuantItem(int quantItem) {
        this.quantItem = quantItem;
    }
    public double getPreçoItem() {
        return preçoItem;
    }
    public void setPreçoItem(double preçoItem) {
        this.preçoItem = preçoItem;
    }

    public Invoice(String descrição, String numeroItem, int quantItem, double preçoItem){
       
       
    }

    public double getInvoiceAmount(){
        
        double total = quantItem * preçoItem;
        
        return total;
    }
}
