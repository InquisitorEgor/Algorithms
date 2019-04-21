package Homework3.Stack.Stack.Queue;

public interface Queue {
    void insert(int value);

    int remove();

    int peek();

    boolean isEmpty();

    boolean isFull();

    int getSize();
}
