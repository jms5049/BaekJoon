import java.util.*;
import java.util.Map.Entry;
import static java.util.Collections.reverseOrder;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] visit = new int[N+1];
        ArrayList<Double> fail = new ArrayList<Double>();
        //어디에 막혀잇는지
        Map<Integer,Double> hashMap = new HashMap<Integer,Double>();
        
        for(int i=0; i<stages.length; i++) {
            if(stages[i]<=N)
                visit[stages[i]]++;
        }
        int total = stages.length;
        for(int i=1; i<N+1;i++) {
            double temp;
            if(total > 0) {
                temp = (double)visit[i]/total;
            }
            else {
                temp = 0.0;
            }
            total -= visit[i];
            hashMap.put(i,temp);
        }
        
        Map<Integer,Double> finalMap = sortByValue(hashMap);
        
        return ejectKey(finalMap, answer);
    }

    private static int[] ejectKey(Map<Integer, Double> map, int[] answer) {
        int i = 0;
        List<Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        for(Entry<Integer, Double> entry : list) {
            answer[i++] = entry.getKey();
        }
        return answer;
    }



}