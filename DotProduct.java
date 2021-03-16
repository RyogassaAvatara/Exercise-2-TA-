public class DotProduct {
    public static void main (String [] args) {

        int[] a = {1,2,2,1};
        int[] b = {1,3,4,5};
        int n = a.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * b[i];    
        }

        System.out.println(sum);
    }
}