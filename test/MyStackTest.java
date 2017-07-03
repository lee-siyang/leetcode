import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/3.
 */
public class MyStackTest {
    MyStack<String> myStack = new MyStack<>();

    @Before
    public void init(){
        myStack.push("aaa");
        myStack.push("bbb");
    }

    @Test
    public void testPop(){
        String ele = myStack.pop();
        assertEquals("bbb", ele);
        String ele2 = myStack.pop();
        assertEquals("aaa", ele2);
    }

    @Test
    public void testPeek(){
        String ele = myStack.peek();
        assertEquals("bbb",ele);
        myStack.push("ccc");
        ele=myStack.peek();
        assertEquals("ccc",ele);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        ele=myStack.peek();
        assertEquals(null,ele);
    }

    @Test
    public void testIsEmpty(){
        boolean isE = myStack.isEmpty();
        assertEquals(false,isE);
        myStack.pop();
        myStack.pop();
        isE = myStack.isEmpty();
        assertEquals(true,isE);

    }
}
