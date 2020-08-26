import java.util.Stack;

/**
 * 20.Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * @author caifx
 * @create Created in 22:37 2020/8/26
 * @modified By:
 **/
public class ValidParentheses {

    public boolean isValid(String s) {
        int vara = 93,varb = 41, varc=125;
        int[] parenArr= new int[126];
        parenArr[93]=91;
        parenArr[41]=40;
        parenArr[125]=123;
        if(s == null || s.length() == 0){
            return true;
        }

        Stack<Integer> stack = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == vara || s.charAt(i)== varb || s.charAt(i)==varc){
                if(stack.empty()||stack.pop()!=parenArr[s.charAt(i)]){
                    return false;
                }
            }else {
                stack.push((int)s.charAt(i));
            }
        }
        return stack.empty();
    }

}
