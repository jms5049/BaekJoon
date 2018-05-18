import java.util.*;

public class p2217 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] ropes = new int[number];
        int max = 0;
        
        for (int i = 0; i< number; i++) {
            ropes[i]= sc.nextInt();
        }
        
        Arrays.sort(ropes);
        
        for (int i = 0; i<number; i++) {
            if(max < ropes[i] * (number-i)) {
                max = ropes[i]*(number-i);
            }
        }
        
        System.out.println(max);
        
    }

}
