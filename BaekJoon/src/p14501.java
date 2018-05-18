import java.util.Scanner;

public class p14501 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] T = new int[N+1];
        int[] P = new int[N+1];
        int[] V = new int[N+2];
        
        for(int i = 1 ; i < N+1 ; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
            
        }
        
        for(int k = 1 ; k < N+1 ; k++) {
            for(int q = k+T[k] ; q <= N+1 ; q++) {
                V[q] = max(V[q], V[k]+P[k]);
            }
        }
        
        System.out.println(V[N+1]);

    }
    
    public static int max(int a, int b) {
        return (a > b ? a : b );
    }

}
