import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lisiyang on 17/7/11.
 * https://leetcode.com/problems/implement-queue-using-stacks/#/description
 * 232. Implement Queue using Stacks
 */
public class Implement_Queue_using_Stacks {
    /** Initialize your data structure here. */
//    private int size;
//    private List<Integer> myQueue;
    private Stack<Integer> myQueue;
    public Implement_Queue_using_Stacks() {
//        myQueue = new ArrayList<>();
//        size = 0;
        myQueue = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
//        myQueue.add(x);
//        size++;
//        if (myQueue.empty()){
//            myQueue.push(x);
//        }
//        else {
            Stack<Integer> temp = new Stack<>();
            while (!myQueue.empty()){
                temp.push(myQueue.pop());
            }
            myQueue.push(x);
            while (!temp.empty()){
                myQueue.push(temp.pop());
            }
//        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return myQueue.pop();
    }

    /** Get the front element. */
    public int peek() {
        return myQueue.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return myQueue.empty();
    }
}
