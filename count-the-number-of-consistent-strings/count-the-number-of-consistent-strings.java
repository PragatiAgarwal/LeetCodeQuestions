class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count = words.length;
        ArrayList<String> a = new ArrayList<String>();
        
        for(String w : words){
            
           for(char c : w.toCharArray()){
               if (allowed.indexOf(c) == -1){
                   count--;
                   break;
               }
           }
            
        }
        return count;
    }
}