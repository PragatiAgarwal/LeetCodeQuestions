class Solution {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");            // Split the string when we came across '/'
        Stack<String> st = new Stack<>();
        for(String s: paths) {                             //iterating over the String to implement the conditions
            if(s.equals("")) continue;
            if(s.equals(".")) continue;
            if(s.equals("..")) 
                if(!st.isEmpty()) st.pop();  
                else continue;
            else st.add(s);
        }
        return "/" + String.join("/", st);         //return the new string from stack and adding '/' in between them.

    }
}