import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        ArrayList<Integer> apple = new ArrayList<>();
        int del = score.length % m;

        // 그래서 아예 처음부터 나머지는 버리고 시작하기로 함
        for(int i = 0; i < score.length; i++){
            apple.add(score[i]);
        }
        
        Collections.sort(apple, Collections.reverseOrder());
        
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        for(int i = m-1 ; i < apple.size() - del; i += m){
            if(hash.containsKey(apple.get(i))){
                hash.put(apple.get(i), hash.get(apple.get(i)) + 1);
            }else{
                hash.put(apple.get(i), 1);
            }            
        }
        
        Integer[] keys = hash.keySet().toArray(new Integer[0]);
        for (int i = 0; i < keys.length; i++) {
            Integer key = keys[i];
            Integer value = hash.get(key);
            int product = key * value * m;
            answer += product;

        }      
        return answer;
    }
}