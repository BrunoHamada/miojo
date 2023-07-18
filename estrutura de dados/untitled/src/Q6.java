public class Q6 {
    public static void main(String[] args) {
        int[] v = {2,-4,7,0,-1,4};
        System.out.println(f(v,6));
    }

    public static int f (int[] v, int n){
        if (n==0){
            return 0;
        }else {
            int s = f(v,n-1);
            if (v[n-1] > 0)
                s = s + v[n-1];
            return s;
        }
    }
}