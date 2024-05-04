import CustomStackImplementation.MyStack;

public class ExprBalanceCheck {
    public static void main(String[] args) {

        System.out.println(balanceCheck("(A*C) + ({V-M})"));//true
        System.out.println(balanceCheck("(A*C) + ({V-M}"));//false

    }

    public static boolean balanceCheck(String expr) {
        //create a stack
        MyStack<Character> myStack= new MyStack<>();
        //iterate over expr
        for (int i = 0; i < expr.length(); i++) {
            Character ch = expr.charAt(i);
            //filter non player chars
            if(ch!='('&&ch!='['&&ch!='{'&&ch!=')'&&ch!=']'&&ch!='}') continue;
            // if it is a symbol tobe processed
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

    public static boolean balanceCheckMine(String expr) {
        //create a stack
        MyStack<Character> myStack= new MyStack<>();
        //iterate over expr
        for (int i = 0; i < expr.length(); i++) {
            Character ch = expr.charAt(i);
            //filter non player chars
            if(ch!='('&&ch!='['&&ch!='{'&&ch!=')'&&ch!=']'&&ch!='}') continue;
            // if it is a symbol tobe processed
            //if opening symbol
            if (ch=='('|| ch=='['||ch=='{') {
                myStack.push(ch);
                continue;
            }
            // at this point this is a closing symbol
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
}
