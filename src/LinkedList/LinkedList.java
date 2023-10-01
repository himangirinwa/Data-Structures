package LinkedList;

public class LinkedList {

    private LinkedListNode head = null;

    private class LinkedListNode {
        private LinkedListNode next;
        private int data;

        LinkedListNode(){
            next = null;
            data = 0;
        }

        LinkedListNode(int data){
            next = null;
            this.data = data;
        }
    }

    public LinkedList(){
        createDummyLinkedList();
    }


    private void createDummyLinkedList(){
        LinkedListNode node = new LinkedListNode(12);

        head = node;

        node = new LinkedListNode(81);
        head.next = node;

        node = new LinkedListNode(64);
        head.next.next = node;

    }

    public void insertAtStartOfLL(int data){
        // Time Complexity = O(1)
        LinkedListNode node = new LinkedListNode(data);
        node.next = head;
        head = node;
    }

    public void insertAtEndOfLL(int data){
        // Time Complexity = O(N)
        LinkedListNode node = new LinkedListNode(data);
        LinkedListNode lastNode = head;
        while(lastNode.next != null)
            lastNode = lastNode.next;

        //update last Node
        lastNode.next = node;
    }

    public void insertInPlaceOfGivenNodeInLL(int prev_data, int data){
        // Time Complexity = O(N)
        LinkedListNode node = head;
        // find the data node
        if(node.data == prev_data){
            insertAtStartOfLL(data);
            return;
        }
        else{
            while(node.next != null){
                if(node.next.data == prev_data){
                    LinkedListNode newNode = new LinkedListNode(data);
                    newNode.next = node.next;
                    node.next = newNode;
                    return;
                }
                node = node.next;
            }
        }
    }

    public void deleteHead(){
        // time complexity = O(N)
        head = head.next;
    }

    public void deleteNode(int data){
        if(head == null)
            return;
        if(head.data == data){
            deleteHead();
            return;
        }

        LinkedListNode node = head;

        while(node.next != null){
            if(node.next.data == data){
                node.next = node.next.next;
                return;
            }
            node = node.next;
        }

    }

    public void displayLL(){
        System.out.print("LL : ");
        LinkedListNode node = head;
        while(node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println();
    }
}
