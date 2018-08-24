import java.util.*;
import java.util.Map.Entry;
public class marathon {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant,completion));

    }

    private static String solution(String[] participant, String[] completion) {
        // TODO Auto-generated method stub
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i< participant.length; i++) {
            int dup = 1;
            if(map.containsKey(participant[i])) {
                dup++;
            }
            map.put(participant[i], dup);
        }
        
        for(int i = 0; i < completion.length; i++) {
            List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            for(Entry<String, Integer> entry : list) {
                if(entry.getKey() == completion[i]) {
                    map.put(entry.getKey(), entry.getValue()-1);
                }
            }
        }
        String answer = "";
        List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        for(Entry<String, Integer> entry : list) {
            if(entry.getValue() != 0) {
                answer = entry.getKey();
            }
        }
        
        return answer;
        
    }

}
