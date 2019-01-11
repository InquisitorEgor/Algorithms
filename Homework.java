package Homework3.Stack.Stack.Queue;

public class Homework {
    public static void main(String[] args) {
        //TASK 1
        String str = "SEDDOG";
        Stack stack = new StackImpl(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.charPush(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.charPop());
        }
        System.out.println();
        //TASK 2
        Deque deq = new DequeImpl(6);

        insertRight(deq, 3);
        insertRight(deq, 2);
        insertLeft(deq, 1);
        insertLeft(deq, 5);

        removeLeft(deq);
        removeRight(deq);

        display(deq);

    }

    private static void insertRight(Deque deq, int value) {
        if (!deq.isFull()) {
            deq.insertRight(value);
        }
    }

    private static void insertLeft(Deque deq, int value) {
        if (!deq.isFull()) {
            deq.insertLeft(value);
        }
    }

    private static void removeRight(Deque deq) {
        if (!deq.isEmpty()) {
            deq.removeRight();
        }
    }

    private static void removeLeft(Deque deq) {
        if (!deq.isEmpty()) {
            deq.removeLeft();
        }
    }
    private static  void display(Deque deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeLeft());
        }
    }

}


