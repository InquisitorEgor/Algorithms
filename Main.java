package six;

public class Main {
    public static void main(String[] args) {

    Tree tree = new TreeImpl();
        tree.add(5);
        tree.add(2);
        tree.add(7);

        System.out.println("Size = " + tree.getSize());
        System.out.println("Find 5: " + tree.find(5));
        System.out.println("Find 2: " + tree.find(2));
        System.out.println("Find 7: " + tree.find(7));
        System.out.println("Find 777: " + tree.find(777));
        tree.add(6);
        tree.add(8);
        tree.add(1);
        tree.add(5);
        tree.add(9);
        tree.add(12);
        tree.displayTree();
        tree.remove(7);
        //tree.displayTree();

}
}
