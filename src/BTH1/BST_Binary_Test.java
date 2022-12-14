package BTH1;

public class BST_Binary_Test {
    public static void main(String[] args) {
        BST_Binary bst = new BST_Binary();
        bst.insert(45);
        bst.insert(10);
        bst.insert(7);
        bst.insert(50);
        bst.insert(90);
        bst.insert(20);
        bst.insert(55);
        System.out.println("The BST Created with input data(Left-root-right):");
        bst.inorder();

        System.out.println("\nThe BST after Delete 12(leaf node):");
        bst.deleteKey(12);
        bst.inorder();
        System.out.println("\nThe BST after Delete 90 (node with 1 child):");
        bst.deleteKey(90);
        bst.inorder();

        System.out.println("\nThe BST after Delete 45 (Node with two children):");
        bst.deleteKey(45);
        bst.inorder();
        boolean ret_val = bst.search (50);
        System.out.println("\nKey 50 found in BST:" + ret_val );
        ret_val = bst.search (12);
        System.out.println("\nKey 12 found in BST:" + ret_val );
    }
    }

