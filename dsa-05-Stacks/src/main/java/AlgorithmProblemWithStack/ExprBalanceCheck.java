package AlgorithmProblemWithStack;

import CustomStackImplementation.MyStack;

import java.util.Stack;

public class ExprBalanceCheck {
    public static void main(String[] args) {

        System.out.println(balanceCheck("(A*C) + ({V-M})"));//true
        System.out.println(new ExprBalanceCheck().isValid("(A*C) + ({V-M})"));
        System.out.println(balanceCheck("(A*C) + ({V-M}"));//false

        System.out.println(balanceCheckMine("(A*C) + ({V-M})"));//true
        System.out.println(balanceCheck("(A*C) + ({V-M}"));//false


    }

    public static boolean balanceCheck (String expr){
        // create a stack
        MyStack<Character> myStack=new MyStack<>();

        // iterate over expr
        for (int i = 0; i <expr.length() ; i++) {
            Character ch=expr.charAt(i);
            // filter non player chars
            if (ch!='('&& ch!='['&& ch!='{'&& ch!=')'&& ch!=']'&& ch!='}' ) continue ;
            // if it is a symbol tobe processed
            // if opening symbol push it to the stack
            if(ch=='('|| ch=='['|| ch=='{') {
                myStack.push(ch);
                continue;
            }
            // at this point this is a closing symbol
            // stack shouldnt be empty
            if (myStack.isEmpty()) return false;
            switch(ch) {
                case ')':
                    if(myStack.pop()!='(') return false;
                    break;
                case ']':
                    if(myStack.pop()!='[') return false;
                    break;
                case '}':
                    if(myStack.pop()!='{') return false;
                    break;
            }
        } // end of for

        // return if stack is empty
        return myStack.isEmpty();
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(Character.valueOf(')'));
            else if (c == '{')
                stack.push(Character.valueOf('}'));
            else if (c == '[')
                stack.push(Character.valueOf(']'));
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static boolean balanceCheckMine(String expr) {  // wrong solution--> it does not properly
        //create a stack
        int o1=0,o2=0,o3=0, o11=0,o22=0,o33=0;
        for (int i = 0; i < expr.length(); i++) {
            Character ch= expr.charAt(i);
            switch (ch) {
                case '(':
                    o1++;
                    break;
                case ')':
                    o11++;
                    break;
                case '[':
                    o2++;
                    break;
                case ']':
                    o22++;
                    break;
                case '{':
                    o3++;
                    break;
                case '}':
                    o33++;
                    break;
            }
        }
        if (o1==o11&&o2==o22&&o3==o33) return true;
        return false;
    }
}
