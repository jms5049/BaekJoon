import static java.util.Collections.reverseOrder;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class kakao03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = {3,1,2};
        System.out.println(solution(a,5));

    }
    
    public static int solution(int[] food_times, long k) {
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       for(int i = 0; i < food_times.length; i++) {
           map.put(i+1, food_times[i]);
       }
       //오름차순 정렬
       
       Map<Integer,Integer> finalMap = sortByValue(map);
       
       int total = 0;
       while(total < k) {
           
           Entry<Integer, Integer> min = finalMap.entrySet()
                   .stream()
                   .reduce((curr, nxt) -> curr.getValue() <= nxt.getValue() ? curr : nxt)
                   .get();
           
           if(min.getValue()>0) {
               total += min.getValue() * finalMap.size();
               finalMap.remove(min.getKey());
               for( Map.Entry<Integer, Integer> elem : finalMap.entrySet() ){                               
                       finalMap.put(elem.getKey(), (elem.getValue()-min.getValue()));
               }
               finalMap.values().removeIf(v -> v.equals(0));
                   
           }
       }
              int answer = 0;
       answer= total % finalMap.size();
       for( Map.Entry<Integer, Integer> elem : finalMap.entrySet() ){
           if(elem.getValue() == answer) 
               answer = elem.getKey();
       }
       
        
       return answer;
    }
    
    public static Map<Integer, Integer> sortByValue(Map<Integer,Integer> map){
        List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());
        
        Map<Integer, Integer> result = new LinkedHashMap<>();
        for(Entry<Integer, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;        
        
    }


}
