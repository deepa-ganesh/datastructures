package com.learning.tree;

public class BinaryTreeOld {

    Node root;

    static class Node {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
        }
    }

    // left, root, right
    public void printInOrder(Node node) {

        if (node == null)
            return;

        printInOrder(node.left);

        System.out.println(node.key);

        printInOrder(node.right);

    }

    // root, left, right
    public void printPreOrder(Node node) {

        if (node == null)
            return;

        System.out.println(node.key);

        printInOrder(node.left);

        printInOrder(node.right);

    }

    // left, right, root
    public void printPostOrder(Node node) {

        if (node == null)
            return;

        printInOrder(node.left);

        printInOrder(node.right);

        System.out.println(node.key);

    }

    static boolean isBST(Node root, Node left, Node right)
    {

        if (root == null)
            return false;

        if (root.left != null) {
            if (root.left.key >= root.key) {
                return false;
            }
        }

        if (root.right != null) {
            if (root.right.key <= root.key) {
                return false;
            }

        }

        return isBST(root.left, left, root) && isBST(root.right, root, right);
    }

    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printCurrentLevel(root, i);
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node root)
    {
        if (root == null)
            return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }

    /* Print nodes at the current level */
    void printCurrentLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.key + " ");
        else if (level > 1)
        {
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(2);
        Node node2 = new Node(7);
        Node node3 = new Node(6);
        Node node4 = new Node(5);
        Node node5 = new Node(9);
        Node node6 = new Node(2);
        Node node7 = new Node(6);

        node1.right = node2;
        node2.right = node3;

        node3.right = node4;
        node4.right = node5;

        node5.right = node6;
        node6.right = node7;

        BinaryTreeOld binaryTree = new BinaryTreeOld();
        binaryTree.root = node1;

        System.out.println(isBST(binaryTree.root, null, null));

        //Node root = binaryTree.root;

//        binaryTree.printInOrder(root);
//        System.out.println("************");
//        binaryTree.printPreOrder(root);
//        System.out.println("************");
//        binaryTree.printPostOrder(root);

        //binaryTree.printLevelOrder();

    }
}
