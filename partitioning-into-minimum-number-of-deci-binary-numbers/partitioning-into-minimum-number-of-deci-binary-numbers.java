class Solution {
    public int minPartitions(String n) {
        int digit = 0;
        for(char c : n.toCharArray()){
            //System.out.println(c);
            digit = Math.max(digit, c-48);
            //System.out.println(digit);
        }
        
        return digit;
    }
}