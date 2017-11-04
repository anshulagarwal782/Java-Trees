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
	private String second;
	private int num;
	public tokenize(String str) {
		super();
		this.str = str;
	}
	public void tokeniz(BinaryTree tree) {
		StringTokenizer stringTokenizer = new StringTokenizer(str);
			first = stringTokenizer.nextToken();
			num = Integer.parseInt(stringTokenizer.nextToken());
			if(num == 1) {
				tree.BinaryTree(first,stringTokenizer.nextToken(),tree);
			}
			else {
				tree.BinaryTree(first,stringTokenizer.nextToken(),stringTokenizer.nextToken(),tree);
			}
		
	}
	public void check_siblings(BinaryTree tree) {
		StringTokenizer stringTokenizer = new StringTokenizer(str);
		first = stringTokenizer.nextToken();
		second = stringTokenizer.nextToken();
		BinaryTree t = tree.search(second, tree);
		if(t!=null) {
			BinaryTree t1 = tree.search(first, t);
			if(t1!=null) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
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
		int check = 2;
		while(check!=0) {
			s = scanner.nextLine();
			tokenize t = new tokenize(s);
			t.check_siblings(tree);
			check--;
			
		}
		
	}
}
