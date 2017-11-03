package local;

public class BST_example {
	public static void main(String[]args) {
		BST tree = new BST(20);
		int[] nums = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
		for(int i : nums ) {
		tree.additem( i );
		}
		tree.preorder();
		System.out.println();
		tree.inorder();
		System.out.println();
		tree.postorder();
	}
}
