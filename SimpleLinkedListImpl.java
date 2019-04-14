package Lesson3;

public class SimpleLinkedListImpl implements LinkedList {


    protected Node firstElement;
    protected int size;

    @Override
    public void add(int value) {
        Node node = new Node(value);
        node.setNextElement(firstElement);
        firstElement = node;
        size++;
    }

    @Override
    public int remove() {
        if (isEmpty()) return -1;
        int data = firstElement.getData();
        firstElement = firstElement.getNextElement();
        size--;
        return data;
    }

    @Override
    public int remove(int value) {
        Node currentNode = firstElement;
        Node previousNode = null;

        while (currentNode != null) {
            if (currentNode.getData() == value) break;
            previousNode = currentNode;
            currentNode = currentNode.getNextElement();
        }

        if (currentNode == null) return -1;
        if (previousNode == null) firstElement = currentNode.getNextElement();//If deleted element is first
        else previousNode.setNextElement(currentNode.getNextElement());
        size--;
        return currentNode.getData();
    }

    @Override
    public boolean find(int value) {
        Node currentNode = firstElement;
        while (currentNode != null) {
            if (currentNode.getData() == value) return true;
            currentNode = currentNode.getNextElement();
        } return false;
    }

    @Override
    public void display() {
        Node currentNode = firstElement;
        System.out.println("------The Start-------");
        while (currentNode!=null){
            System.out.println(currentNode);
            currentNode = currentNode.getNextElement();
        }
        System.out.println("------The End-------");
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }
    public Node getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(Node firstElement) {
        this.firstElement = firstElement;
    }
}
