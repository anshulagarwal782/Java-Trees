package local;
import java.lang.*;
import java.util.Scanner;
import java.util.StringTokenizer;
class BinaryTree{
	private String data;
	private BinaryTree left;
	private BinaryTree right;
	
	public BinaryTree(String data) {
		this.data =data;
		this.left = null;
		this.right =null;
		
	}
	public void BinaryTree(String data, String first,BinaryTree tree) {
	
	
		BinaryTree node = search(data,tree);
		if(node == null) {
			this.data = data;
			this.left = new BinaryTree(first);
			/*this.left.data = first;*/
			/*BinaryTree node1 = search(this.data,this.right);
			if(node1 == null) {
				this.left.data = this.data;
			}
			else {
				this.left.data = this.data;
			}*/
		}
		else {
			node.left = new BinaryTree(first);
		}
		
	}
	public void BinaryTree(String data, String first, String second,BinaryTree tree) {
		BinaryTree node = search(data,tree);
		if(node == null) {
			this.data = data;
			this.left = new BinaryTree(first);
			this.right = new BinaryTree(second);
			/*BinaryTree node1 = search(this.data,this.right);
			if(node1 == null) {
				this.left.data = this.data;
			}
			else {
				this.left.data = this.data;
			}*/
		}
		else {
			node.left = new BinaryTree(first);
			node.right = new BinaryTree(second);
		}
		
	}
	public BinaryTree search(String name, BinaryTree node){
	    if(node != null){
	        if(node.data.equals(name)){
	           return node;
	        } else {
	            BinaryTree foundNode = search(name, node.left);
	            if(foundNode == null) {
	                foundNode = search(name, node.right);
	            }
	            return foundNode;
	         }
	    } else {
	        return null;
	    }
	}
	public void inorder() {
		
		if(this.left!=null) {
			this.left.inorder();
		}
		System.out.print(" "+this.data);
		if(this.right!=null) {
			this.right.inorder();
		}
		
	}
	
}
class tokenize{
	private String str;
	private String first;
	private int num;
	public tokenize(String str) {
		super();
		this.str = str;
	}
	public void tokeniz(BinaryTree tree) {
		StringTokenizer stringTokenizer = new StringTokenizer(str);
		while(stringTokenizer.hasMoreTokens()) {
			first = stringTokenizer.nextToken();
			num = Integer.parseInt(stringTokenizer.nextToken());
			if(num == 1) {
				tree.BinaryTree(first,stringTokenizer.nextToken(),tree);
			}
			else {
				tree.BinaryTree(first,stringTokenizer.nextToken(),stringTokenizer.nextToken(),tree);
			}
		}
	}
	
}
public class AppPerfect_example {
	public static void main(String[]agrs) {
		int test=3;
		String s;
		BinaryTree tree = new BinaryTree("data");
		Scanner scanner = new Scanner(System.in);
		while(test!=0) {
			s = scanner.nextLine();
			tokenize token1 = new tokenize(s);
			token1.tokeniz(tree);
			test--;
		} 
		tree.inorder();
		
	}
}
