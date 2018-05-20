import java.util.Scanner;

public class p9576 {
    static int[] student;
    static int[] book;
    static boolean[] visit;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int total = 0;
        int N, M, a, b;
        
        for(int i = 0; i<testcase; i++) {
            N = sc.nextInt();
            M = sc.nextInt();
            student = new int[M+1];
            book = new int[N+1];
            visit = new boolean[N+1];

            for(int k = 0; k<N; k++) {
                book[k] = -1;
                visit[k] = false;
            }
            for(int j = 0; j<M; j++) {
                student[j] = -1;        
            }
            for(int q = 0; q<M; q++) {
                a = sc.nextInt();
                b = sc.nextInt();
                for(int z = a; z<=b; z++) {
                    System.out.println(visit[b]);
                    if(dfs(z)) {
                        total++;
                    }
                    
                }
                
            }
            
        }
        
        System.out.println(total);
        
    }
    
    public static boolean dfs(int b) {
        if(visit[b]!=true) {
            visit[b]=true;
            return true;
        }
        else {
            return false;
        }
        
    }

}
