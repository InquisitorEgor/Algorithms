package Homework3.Stack.Stack.Queue;

public interface Deque extends Queue {

    void insertLeft(int value);
    void insertRight(int value);

    int removeLeft();
    int removeRight();

}
