import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Created by lisiyang on 17/7/2.
 */
public class StackTest {
    public static void main(String[] args) {
        String str = "(((";
        System.out.println(legal(str));
        List<String> list = new ArrayList<>();

    }

    public static boolean legal(String str) {
        Stack<Character> stack = new Stack<>();
//        boolean foundBracket = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                stack.push(str.charAt(i));
            if (str.charAt(i) == ')') {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
//        if (!foundBracket) return false;
    }
}
