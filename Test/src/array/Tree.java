package array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {

	public static void main(String[] args) {
		Node n = new Node(10);
		n.insert(5);
		n.insert(19);
		n.insert(3);
		n.insert(7);
		n.insert(2);
		n.insert(4);
		n.insert(6);
		n.insert(8);
		n.insert(15);
		n.insert(25);
		n.insert(14);
		n.insert(16);
		n.insert(24);
		n.insert(26);
	//	n.inorder(n);
		Queue<Node> q= new LinkedList<>();
		ArrayList<Node> narr = new ArrayList<>();
		levelOrder(n,q,narr);
		for(Node a : narr){
			System.out.println(a.data);
		}
		
	}

	private static void levelOrder(Node n, Queue<Node> q, ArrayList<Node> narr) {
		
		if(n== null){
			return;
		}
		q.add(n.left);
		q.add(n.right);
		narr.add(q.peek());
		levelOrder(q.poll(),q,narr);
		
		
		
	}

}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int value) {
		this.data = value;
	}

	void insert(int value) {
		if (value <= data) {
			if (left == null) {
				left = new Node(value);
			} else {
				left.insert(value);
			}

		} else {
			if (right == null) {
				right = new Node(value);
			}
			else{
				right.insert(value);
			}
		}
	}
	
	
	void  inorder(Node root){
		
		if(root.left!= null){
			 inorder(root.left);
		}
		System.out.println(root.data);
		if(root.right!= null){
			inorder(root.right);
		}
		
	}
}