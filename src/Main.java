import LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LinkedList linkedList = new LinkedList();
        System.out.println("Initial List");
        linkedList.displayLL();

        System.out.println("Insert 12 at head");
        linkedList.insertAtStartOfLL(12);
        linkedList.displayLL();

        System.out.println("Insert 92 at end");
        linkedList.insertAtEndOfLL(92);
        linkedList.displayLL();

        System.out.println("Insert 42 in place of 12");
        linkedList.insertInPlaceOfGivenNodeInLL(12, 42);
        linkedList.displayLL();

        System.out.println("Insert 11 in place of 64");
        linkedList.insertInPlaceOfGivenNodeInLL(64, 11);
        linkedList.displayLL();

        System.out.println("Insert 78 at end");
        linkedList.insertAtEndOfLL(78);
        linkedList.displayLL();

        System.out.println("delete head");
        linkedList.deleteHead();
        linkedList.displayLL();

        System.out.println("Insert 37 in place of 78");
        linkedList.insertInPlaceOfGivenNodeInLL(78, 37);
        linkedList.displayLL();

        System.out.println("delete 42");
        linkedList.deleteNode(42);
        linkedList.displayLL();

        System.out.println("delete 37");
        linkedList.deleteNode(37);
        linkedList.displayLL();
    }
}