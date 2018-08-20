import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        List<String> result = new ArrayList<String>();
        HashMap<String, String> recordMap = new HashMap<String,String>();
        
        //해시 맵에 등록
        for(int i = 0 ; i<record.length; i++) {
            // a는 레코드
            String[] temp = record[i].split(" ");
            //temp는 레코드 안에 문장을 공백 단위로 구분해서 문자하나씩
            if(temp[0].equals("Enter")) {
                recordMap.put(temp[1], temp[2]);
            }
            else if(temp[0].equals("Change")) {
                recordMap.replace(temp[1], temp[2]);
            }
        }

        for(int i = 0 ; i<record.length; i++) {
            String[] temp = record[i].split(" ");
            if(temp[0].equals("Enter")) {
                result.add(recordMap.get(temp[1])+"님이 들어왔습니다.");
            }
            else if(temp[0].equals("Leave")) {
                recordMap.remove("temp[1]");
                result.add(recordMap.get(temp[1])+"님이 나갔습니다.");
            }
        }
        
        String[] answer = result.toArray(new String[result.size()]);
        
        return answer;
    }
}