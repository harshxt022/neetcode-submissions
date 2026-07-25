class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        int n = q1.size();
        for(int i = 0;i<n-1;i++){
            q2.offer(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return q2.poll();
    }
    
    public int top() {
        while (q1.size() > 1) {
          q2.offer(q1.poll());
        }
        int ans = q1.peek();
        q2.offer(q1.poll());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return ans;
    }
    
    public boolean empty() {
        if(q1.isEmpty() && q2.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */