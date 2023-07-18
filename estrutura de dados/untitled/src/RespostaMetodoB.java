public class RespostaMetodoB {
    public static void main(String[] args) {

        System.out.println(metodoB(5,1));
    }
    public static int metodoB(int n, int m){
        if (m>n){
            return 0;
        }
        if (m==n){
            return n;
        }
        return (metodoB(n-1,m+1)+(n+m));
    }
}
