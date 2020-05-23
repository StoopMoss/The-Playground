import org.omg.PortableInterceptor.NON_EXISTENT;

public class LinkedList{

    public static void main(String[] args){
        System.out.println("Running");

        Node node4 = new Node(4);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        
        printList(node1);
        Node reversedList = reverseList(node1);
        printList(reversedList);

        //testTwoNodes();
        
    }

    public static void testTwoNodes(){
        Node node2 = new Node(2);
        Node node1 = new Node(1, node2);
        
        System.out.println("2 Nodes");
        printList(node1);
        Node result = reverseList(node1);
        printList(result);
    }

    public static void testOneNode(){
        Node node1 = new Node(1);
        Node result = reverseList(node1);
    }

    public static Node reverseList(Node list){
        Node prev = null;
        while (list.getNext() != null) {
            Node next = list.getNext();
            list.setNext(prev);
            prev = list;
            list = next;
        }
        list.setNext(prev);
        return list;
    }

    /*public static Node reverseList(Node list){
        Node prev = null;
        while (list != null) {
            Node next = list.getNext();
            list.setNext(prev);
            prev = list;
            list = next;
        }

        return prev;
    }*/

    public static void printList(Node list){
        while (list != null){
            System.out.print(list.getValue() + " ");
            list = list.getNext();
        }
        System.out.println();
    }

}
 
