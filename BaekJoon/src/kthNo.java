import java.util.ArrayList;
import java.util.Arrays;

public class kthNo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        System.out.println(solution(array, commands));

    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] command;
        int[] answer = new int[commands.length];
        int k;
        int start;
        int end;
        
        for(int i = 0; i < commands.length;i++) {
            command = commands[i];
            start = command[0]-1;
            end = command[1]-1;
            k = command[2]-1;
            int[] temp = new int[end-start+1];
            System.arraycopy(array, start, temp, 0, end-start+1);
            Arrays.sort(temp);
            answer[i] = temp[k];
        }
        
        return answer;
    }

}
