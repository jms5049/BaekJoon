import java.util.Scanner;

public class p2839 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        int userInput;
        int five = 0, three = 0;
        int remainer;
        userInput = sc.nextInt();
        
        while(true) {
            if(userInput % 5 == 0) {
                five = userInput/5;
                System.out.println(five+three);
                break;
            }
            else if (userInput < 0) {
                System.out.println("-1");
                break;
            }
            userInput -= 3;
            three++;
        }
    }

}
