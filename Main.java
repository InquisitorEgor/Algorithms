package Lesson3;

public class Main {
    public static void main(String[] args) {
        //TestLinkedList();
        //TestTwoSideLinkedList();
        TestLinkedListIterator();
    }

    private static void TestLinkedList() {
        LinkedList linkedList = new SimpleLinkedListImpl();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Size: " + linkedList.getSize());
        linkedList.display();
        linkedList.remove(4);
        linkedList.remove();
        linkedList.display();
        System.out.println(linkedList.find(7));
    }

    private static void TestTwoSideLinkedList() {
        TwoSideLinkedList twoSideLinkedList = new TwoSideLinkedListImpl();
        twoSideLinkedList.addFirst(3);
        twoSideLinkedList.addFirst(2);
        twoSideLinkedList.addFirst(1);
        twoSideLinkedList.addLast(4);
        twoSideLinkedList.addLast(5);

        System.out.println("Size = " + twoSideLinkedList.getSize());

        twoSideLinkedList.display();

        twoSideLinkedList.remove();
        twoSideLinkedList.remove(1);

        twoSideLinkedList.display();
    }

    private static void TestLinkedListIterator() {
        SimpleLinkedListImpl simpleLinkedList = new SimpleLinkedListImpl();
        ListIterator listIterator = new LinkedListIterator(simpleLinkedList);
        listIterator.reset();
        simpleLinkedList.add(6);
        simpleLinkedList.add(5);
        simpleLinkedList.add(4);
        simpleLinkedList.add(3);
        simpleLinkedList.add(2);
        simpleLinkedList.add(1);
        simpleLinkedList.display();//1,2,3,4,5,6


        display(listIterator);

        listIterator.reset();
        listIterator.insertAfter(11);
        simpleLinkedList.display();//1,11,2,3,4,5,6
        listIterator.next();
        listIterator.insertBefore(13);
        simpleLinkedList.display();//1,11,13,2,3,4,5,6
        System.out.println("The iterator is at "+listIterator.getCurrent());
        listIterator.next();
        listIterator.next();
        listIterator.next();
        listIterator.next();
        System.out.println("Is iterator at End?? "+listIterator.atEnd());
        listIterator.next();
        System.out.println("Is iterator at End? "+listIterator.atEnd());



    }
    public static void display(ListIterator listIterator){
        System.out.println("--------Iterator Display--------");
        listIterator.reset();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
