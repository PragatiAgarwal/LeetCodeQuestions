class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null){
            return 0;
        }
        s = s.trim();
        String res = "";
        for(char c : s.toCharArray()){
            if(c == ' '){
                res = "";
            }
            else {
                res += c;
            }
        }
        return res.length();
    }
}