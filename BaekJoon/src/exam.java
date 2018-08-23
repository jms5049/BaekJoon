import java.util.ArrayList;

public class exam {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int[] answers = {1,2,3,4,5};
        solution(answers);

    }
    public static int[] solution(int[] answers) {
        
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        int[][] students = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };
        int[] points = new int[3];
        
        for(int i = 0; i<answers.length;i++) {
            if(students[0][i%5] == answers[i])
                points[0]++;
            if(students[1][i%8] == answers[i])
                points[1]++;
            if(students[2][i%10] == answers[i])
                points[2]++;
        }
        
        
       
        return answer;
    }

}
