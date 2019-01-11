package Homework3.Stack.Stack.Queue;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new StackImpl(8);
        pushToStack(stack, "g");
        pushToStack(stack, "o");
        pushToStack(stack, "r");
        pushToStack(stack, "g");
        pushToStack(stack, "e");
        pushToStack(stack, "o");
        pushToStack(stack, "u");
        pushToStack(stack, "s");


        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.getSize());

        while ( !stack.isEmpty() ) {
            System.out.println(stack.pop());
        }

        popFromStack(stack);
    }

    private static void popFromStack(Stack stack) {
        if ( !stack.isEmpty() ) {
            System.out.println(stack.pop());
        }
    }

    private static void pushToStack(Stack stack, String value) {
        if ( !stack.isFull() ) {
            stack.push(value);
        }
    }
}
