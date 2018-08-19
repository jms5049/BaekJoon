import java.util.*;

public class p11723 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input;
        String x = null;
        
        while(n>0) {
            input = sc.nextLine();
            if(input.substring(0).equals("add")) {
                x = add(x,Integer.parseInt(input.substring(1)));
            }
            else if(input.substring(0).equals("check")) {
                x = check(x,Integer.parseInt(input.substring(1)));
            }
            else if(input.substring(0).equals("remove")) {
                x = remove(x,Integer.parseInt(input.substring(1)));
            }
            else if(input.substring(0).equals("toggle")) {
                x = toggle(x,Integer.parseInt(input.substring(1)));
            }
            else if(input.substring(0).equals("all")) {
                x = all(x,Integer.parseInt(input.substring(1)));
            }
            else if(input.substring(0).equals("empty")) {
                x = empty(x);
            }
            n--;
        }
    }
    
    static String add(String x, int b) {
        if(!x.contains(Integer.toString(b)))
            x = x + b;
        return x;        
    }
    static String check(String x, int b) {
        if(x.contains(Integer.toString(b)))
            x.
        return x;        
    }
    static String remove(String x, int b) {
        return x;        
    }
    static String toggle(String x, int b) {
        return x;        
    }
    static String all(String x, int b) {
        return x;        
    }
    static String empty(String x) {
        x = null;
        return x;        
    }
    

}
