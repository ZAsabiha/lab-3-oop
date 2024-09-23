import java.util.Stack;

public class MinStack {
  
    public Stack<Integer> mins=new Stack<>();
   
    public int min(){
        int ans=mins.peek();
        mins.pop();
        while(!mins.empty()){
            if(mins.peek()<ans){
                ans=mins.peek();
                
            }
            mins.pop();
        }
        return ans;

    }
  
      public void push(int value) {
       mins.push(value);
    }

    
    public void pop() {
        mins.pop();
     }

    
    
  
}
 