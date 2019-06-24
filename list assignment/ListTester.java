public class ListTester{
	public static void main(String[] args){
		SinglyLinkedList sl1 = new SinglyLinkedList();
		Node n1 = new Node(5);
		Node n2 = new Node(6);
		SinglyLinkedList sl2 = new SinglyLinkedList(3);
		sl2.add(2);
		sl2.add(22);
		sl2.printValues();
	}
}