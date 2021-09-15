class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    /** Initialize your data structure here. */
    public MyQueue() {
         s1 = new Stack<Integer>();
         s2 = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(!s1.isEmpty())
            s1.push(x);
        else {
            while(s2.size() > 0){
            s1.push(s2.pop());
            }
            s1.push(x);
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!s1.isEmpty()){
            while(s1.size()>0){
            s2.push(s1.pop());
            }
            return s2.pop();
        }
        else {
             return s2.pop();
        }
        
        //return -1;
    }
    
    /** Get the front element. */
    public int peek() {
        if(!s2.isEmpty()){
            return s2.peek();
        }
        
        else {
           while(s1.size() > 0){
            s2.push(s1.pop());
            }
            return s2.peek(); 
        }
        
        //return -1;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return (s1.isEmpty() && s2.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */