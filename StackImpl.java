package Homework3.Stack.Stack.Queue;

public class StackImpl implements Stack {
    private String[] data;
    private int size;
    private char[] charData;

    public StackImpl(int maxSize) {
        this.data = new String[maxSize];
        this.charData=new char[maxSize];
        this.size = 0;
    }

    @Override
    public void push(String value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full!");
        }
        data[size++] = value;
    }

    @Override
    public void charPush(char value) {
        charData[size++] = value;
    }


    @Override
    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return data[--size];
    }

    @Override
    public char charPop() {
        return charData[--size];
    }

    @Override
    public String peek() {
        return !isEmpty() ? data[size - 1] : "gg";
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public int getSize() {
        return size;
    }
}
