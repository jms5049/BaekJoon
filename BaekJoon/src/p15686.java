import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class point{
    int x;
    int y;
    point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class p15686 {
    
    static int[] min;
    static ArrayList<point> people;
    static ArrayList<point> chicken;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] graph = new int[N][N];
        int count = 0;
        int result = 0;
        people = new ArrayList<point>();
        chicken = new ArrayList<point>();
        
        for(int i = 0; i<N; i++) {
            for(int j = 0 ; j<N; j++) {
                graph[i][j] = sc.nextInt();
                if(graph[i][j]==1) {
                    people.add(new point(i,j));
                    count++;
                }
                if(graph[i][j]==2) {
                    chicken.add(new point(i,j));
                }
            }
        }
        
        min = new int[count];
        for(int i = 0; i<count; i++) {
            min[i] = Integer.MAX_VALUE;
        }
        
        if(chicken.size() > M) {
            dfs(M);
        }
        
        Iterator<point> it= chicken.iterator();
        
       
        
        for(int i = 0; i<count; i++) {
            result += min[i];
        }
        System.out.println(result);
        
    }

    private static void dfs(int M) {
        // TODO Auto-generated method stub
        Iterator<point> it = chicken.iterator();
        while(chicken.size() != M) {
            
        }
        while(it.hasNext()) {
            point chickentemp = it.next();
            for(int i = 0 ; i < people.size(); i++) {
                point peopletemp = people.get(i);
                getDist(chickentemp, peopletemp, i);
            }
            it.remove();
        }
        
    }

    private static void getDist(point chickentemp, point peopletemp, int i) {
        // TODO Auto-generated method stub
        
        int temp= Math.abs(chickentemp.x-peopletemp.x) + Math.abs(peopletemp.y-chickentemp.y);
        if(min[i]>temp) {
            min[i] = temp;
        }
    }

}
