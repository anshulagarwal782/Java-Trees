package local;

public class BinaryTree {
	private int data;
	private BinaryTree left;
	private BinaryTree right;
	public BinaryTree(int data) {
		super();
		this.data = data;
		this.left =null;
		this.right = null;
	}
	public void addnode(int num) {
		if(this.left != null) {
			this.left.addnode(num);
		}
		else if(this.right != null) {
			this.right.addnode(num);
		}
		else if(this.left==null){
			this.left = new BinaryTree(num);
		}
		else {
			this.right = new BinaryTree(num);
		}
	}
	public void preorder() {
		System.out.print(" "+this.data);
		if(this.left!=null) {
			this.left.preorder();
		}
		if(this.right!=null) {
			this.right.preorder();
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
	public void postorder() {
		
		if(this.left!=null) {
			this.left.postorder();
		}
		
		if(this.right!=null) {
			this.right.postorder();
		}
		System.out.print(" "+this.data);
	}
}
