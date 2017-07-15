import java.util.Stack;

/**
 * Created by lisiyang on 17/7/15.
 * https://leetcode.com/problems/valid-parentheses/#/description
 * 20. Valid Parentheses
 */
public class Valid_Parentheses {
    public boolean isValid(String s) {
        if (s.length()%2!=0) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c=='(')
                stack.push(')');
            else if (c=='[')
                stack.push(']');
            else if (c=='{')
                stack.push('}');
            else if (stack.isEmpty() || stack.pop()!=c)
                return false;
        }
        return stack.isEmpty();
    }
}
