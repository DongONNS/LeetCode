package letecodePractice.tree;

public class Node<T extends Comparable> {
    int key;
    T val;
    Node<T> left;
    Node<T> right;

    public Node() {

    }

    public Node(int key, T val) {
        this.key = key;
        this.val = val;
    }
}

class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;

    public TreeNode() {

    }

    public TreeNode(int key) {
        this.key = key;
    }
}
