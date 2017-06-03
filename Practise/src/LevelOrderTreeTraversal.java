
public class LevelOrderTreeTraversal {
	
	Node root;
	
	public LevelOrderTreeTraversal () {
		root = null;
	}
	
	void printLeveOrder() {
		int h = height(root);
		System.out.println("height " + h);
		for (int i = 1; i<=h; i++) {
			printGivenLevel(root, i);
		}
	}
	
	int height(Node root) {
		
		if (root == null) {
			return 0;
		} else {
			System.out.println(root.data);
			int lHeight = height(root.left);
			int rHeight = height(root.right);
			System.out.println("lHeight" +lHeight);
			System.out.println("rHeight" + rHeight);
			if (lHeight > rHeight) {
				return  lHeight + 1;
			} else {
				return rHeight +1;
			}
		}
	}
	
	void printGivenLevel(Node root, int level) {
		if (root == null) {
			return;
		} else if (level ==1) {
			System.out.print(root.data + " ");
		} else if (level > 1) {
			printGivenLevel(root.left, level -1);
			printGivenLevel(root.right, level -1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderTreeTraversal tree = new LevelOrderTreeTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.printLeveOrder();

	}

}
