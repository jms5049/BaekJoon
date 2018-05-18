import java.util.Scanner;

public class p1547 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] cups = new int[3];
        int temp1 = 0, temp2 = 0, temp3;

        for(int i = 0; i < 3 ; i++) {
            cups[i] = i+1;
        }
        
        while(M>0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int i = 0; i < 3 ; i++) {
                if(cups[i]==x) {
                    temp1 = i;
                }
                if(cups[i]==y) {
                    temp2 = i;
                }
            }
            
            temp3 = cups[temp2];
            cups[temp2] = cups[temp1];
            cups[temp1] = temp3;
            
            M--;
        }
        
        System.out.println(cups[0]);

    }

}
