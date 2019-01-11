package Homework3.Stack.Stack.Queue;

public interface Stack {
    void push(String value);

    void charPush(char value);

    String pop();

    char charPop();

    String peek();

    boolean isEmpty();

    boolean isFull();

    int getSize();
}
