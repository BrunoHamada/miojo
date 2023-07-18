public class RespostaMetodoA {
    public static void main(String[] args) {
        System.out.println(metodoA(5));
    }
    public static int metodoA(int n){
        if (n==1){
            return 1;
        }

        return metodoA(n-1)+n;
    }
}
