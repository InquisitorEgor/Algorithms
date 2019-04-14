package Lesson3;

public interface ListIterator {
    void reset();

    void insertBefore(int value);

    void insertAfter(int value);

    boolean hasNext();

    int next();

    void remove();

    int getCurrent();

    boolean atEnd();
}
