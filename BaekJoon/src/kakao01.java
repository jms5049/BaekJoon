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
        
        
        return answer;
    }
}