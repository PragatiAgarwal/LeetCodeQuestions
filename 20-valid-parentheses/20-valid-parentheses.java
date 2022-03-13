class Solution {
    public boolean isValid(String s) {
        //'(' push  ')' pop
        Stack<Character> stack = new Stack<Character>();
        int i = 0;
        
        do{
           // System.out.println("i = " + i + " "+ stack);
            if(s.charAt(i) == '(')
                stack.push(')');
            
            else if(s.charAt(i) == '{')
                stack.push('}');
            
            else if(s.charAt(i) == '[')
                stack.push(']');
            
            else if(stack.size() == 0 || stack.pop() != s.charAt(i) ){
                return false;
            }   
            i++;
            
        } while( i < s.length());
        if(stack.size()> 0){
            return false;
        }
        return true;
        
    }
}