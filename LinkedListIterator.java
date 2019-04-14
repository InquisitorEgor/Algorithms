package Lesson3;

public class LinkedListIterator implements ListIterator {
    private SimpleLinkedListImpl list;
    private boolean firstIterate = true;
    private Node current;
    private Node previous;

    public LinkedListIterator(SimpleLinkedListImpl list) {
        this.list = list;
    }

    @Override
    public void reset() {
        firstIterate = false;
        current = list.getFirstElement();
        previous = null;
    }

    @Override
    public void insertBefore(int value) {
        Node newItem = new Node(value);
        if(previous == null) {
            newItem.setNextElement(list.getFirstElement());
            list.setFirstElement(newItem);
            reset();
        }
        else {
            newItem.setNextElement(previous.getNextElement());
            previous.setNextElement(newItem);
            current = newItem;
        }
    }

    @Override
    public void insertAfter(int value) {
        Node newItem = new Node(value);
        if (list.isEmpty()){
            list.setFirstElement(newItem);
            current = newItem;
        } else {
            newItem.setNextElement(current.getNextElement());
            current.setNextElement(newItem);
            next();
        }
    }

    @Override
    public int getCurrent() {
        return current.getData();
    }

    @Override
    public boolean hasNext() {
        if (firstIterate) {
            firstIterate = false;
            return list.getFirstElement() != null;
        }
        else {
            return current != null && current.getNextElement() != null;
        }
    }

    @Override
    public int next() {
        if (current == null) {
            current = list.getFirstElement();
        }
        else {
            previous = current;
            current = current.getNextElement();
        }
        return current.getData();
    }

    @Override
    public void remove() {
        if (previous == null){
            list.setFirstElement(current.getNextElement());
            reset();
        } else {
            previous.setNextElement(current.getNextElement());
            if ( !hasNext() ) {
                reset();
            } else {
                current = current.getNextElement();
            }
        }
    }

    @Override
    public boolean atEnd() {
         if(current.getNextElement()==null)return true;
         return false;
    }
}
