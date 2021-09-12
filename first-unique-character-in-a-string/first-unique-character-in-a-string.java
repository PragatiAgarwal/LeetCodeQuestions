class Solution {
    public int firstUniqChar(String s) {
         if(s.length()==0){
            return -1;
        }
        HashMap<Character,Integer> charFreq = new HashMap<Character,Integer>();
        
        for(int i =0; i<s.length(); i++){
            if(charFreq.containsKey(s.charAt(i))){
                charFreq.put(s.charAt(i),charFreq.get(s.charAt(i))+1);
            }
            else charFreq.put(s.charAt(i),1);
        }
        
        for(int i =0; i<s.length(); i++){
            if(charFreq.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}