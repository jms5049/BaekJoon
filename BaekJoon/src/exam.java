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
        
        int maxPoint=Math.max(points[0],Math.max(points[1], points[2]));
        
        for(int i = 0; i < points.length;i++) {
            if(points[0] == maxPoint && !answerList.contains(1))
                answerList.add(1);
            if(points[1] == maxPoint && !answerList.contains(2))
                answerList.add(2);
            if(points[2] == maxPoint && !answerList.contains(3))
                answerList.add(3);
        }
        
        int[] answer = new int[answerList.size()];
        int count = 0;
        for(int i : answerList) {
            answer[count++] = i;
        }
       
        return answer;
    }

}
