import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.Test;

public class MinStackTest {
    @Test
    public  void  testMinstack1() {
        MinStack minStack = new MinStack();
        
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        int c=minStack.min();
        assertEquals(1,c); 

    }
    @Test
    public  void  testMinstack2() {
        MinStack minStack = new MinStack();
        
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        minStack.pop();
        int c=minStack.min();
        assertEquals(2,c); 

    }
    @Test
    public  void  testMinstack3() {
        MinStack minStack = new MinStack();
        
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        minStack.pop();
        int c=minStack.min();
        assertEquals(1,c); 

    }
}

