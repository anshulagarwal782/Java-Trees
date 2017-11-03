package local;

public class BST {
		private int data;
		private BST left;
		private BST right;
		public BST(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}
		public void additem(int num) {
			if(num < this.data) {
				if(this.left !=null) {
					this.left.additem(num);
				}
				else {
					this.left = new BST(num);
				}
			}
			else {
				if(this.right !=null) {
					this.right.additem(num);
				}
				else {
					this.right = new BST(num);
				}
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

