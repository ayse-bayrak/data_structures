package AlgorithmProblemWithStack;

import CustomStackImplementation.MyStack;

public class ExprBalanceCheck {
    public static void main(String[] args) {

        System.out.println(balanceCheck("(A*C) + ({V-M})"));//true
        System.out.println(balanceCheck("(A*C) + ({V-M}"));//false

        System.out.println(balanceCheckMine("(A*C) + ({V-M})"));//true
        System.out.println(balanceCheck("(A*C) + ({V-M}"));//false

    }

    public static boolean balanceCheck(String expr) {
        //create a stack
        MyStack<Character> myStack= new MyStack<>();
        //iterate over expr
        for (int i = 0; i < expr.length(); i++) {
            Character ch = expr.charAt(i); //Expression = (A+B)- ((C*D)/ [F*(B/2)])
            //filter non player chars, ignore the letters
            //Algorithm will handle only: A[i]= () (() [()])
            if(ch!='('&&ch!='['&&ch!='{'&&ch!=')'&&ch!=']'&&ch!='}') continue;
            // if it is a symbol to be processed
            //if opening symbol
            if (ch=='('|| ch=='['||ch=='{') {
                myStack.push(ch);
                continue;
            }
            //at this point this is a closing symbol
            // stack shouldn't be empty
            if (myStack.isEmpty()) return false;
            //I need to check if they match or not
            switch (ch) {
                case ')':
                    if (myStack.pop()!='(') return false;
                    break;
                case ']':
                    if (myStack.pop()!='[') return false;
                    break;
                case '}':
                    if (myStack.pop()!='{') return false;
                    break;
            }
        } // end of for
        //return if stack is empty


        return myStack.isEmpty();
    }

    public static boolean balanceCheckMine(String expr) {  // it does not properly
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
