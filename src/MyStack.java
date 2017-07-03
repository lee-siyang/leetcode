import java.util.LinkedList;
import java.util.List;

/**
 * Created by lisiyang on 17/7/3.
 */
public class MyStack<T> {
    LinkedList<T> store =  new LinkedList<>();

    public T pop(){
        if (!isEmpty()){
            return store.removeFirst();
        }
        return null;
    }

    public void push(T str){

        store.addFirst(str);
    }

    public boolean isEmpty(){
        return store.isEmpty();
    }

    public T peek(){

        return store.peek();

    }
}
