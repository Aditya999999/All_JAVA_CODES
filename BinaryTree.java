package com.test;


class Node{
    int key;
    Node left;
    Node right;

    public Node(int item){
        key = item;
        left = right = null;
    }

}
public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }
    void printPreorder(Node node){
        if(node == null)
            return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    void printPostorder(Node node){
        if(node == null)
            return;
        printPreorder(node.left);
        printPreorder(node.right);
        System.out.print(node.key + " ");
    }

    // Wrappers over above recursive functions
    void printPreorder(){
        printPreorder(root);
    }
    void printInorder() {
        printInorder(root);
    }
    void printPostorder(){
        printPostorder(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("\nPreorder traversal of binary tree is ");
        tree.printPreorder();
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();

    }
}
