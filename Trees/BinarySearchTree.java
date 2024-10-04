import java.util.*;
public class BinarySearchTree {
    
    private class Node {
        int value;
        Node left;
        Node right;
        
        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    
    private Node root;
    
    BinarySearchTree() {
        root = null;
    }
    
    public void insert(int value) {
        root = insertHelper(root, value);
    }
    
    private Node insertHelper(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        
        if (value < node.value) {
            node.left = insertHelper(node.left, value);
        } else if (value > node.value) {
            node.right = insertHelper(node.right, value);
        }
        
        return node;
    }
    
    public boolean search(int value) {
        return searchHelper(root, value);
    }
    
    private boolean searchHelper(Node node, int value) {
        if (node == null) {
            return false;
        }
        
        if (node.value == value) {
            return true;
        } else if (value < node.value) {
            return searchHelper(node.left, value);
        } else {
            return searchHelper(node.right, value);
        }
    }
    
    public void delete(int value) {
        root = deleteHelper(root, value);
    }
    
    private Node deleteHelper(Node node, int value) {
        if (node == null) {
            return null;
        }
        
        if (value < node.value) {
            node.left = deleteHelper(node.left, value);
        } else if (value > node.value) {
            node.right = deleteHelper(node.right, value);
        } else {
            // case 1: node has no children
            if (node.left == null && node.right == null) {
                return null;
            }
            // case 2: node has one child
            else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            // case 3: node has two children
            else {
                int minValue = findMinValue(node.right);
                node.value = minValue;
                node.right = deleteHelper(node.right, minValue);
            }
        }
        
        return node;
    }
    
    private int findMinValue(Node node) {
        int minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }
    
    public void printTree() {
        printTreeHelper(root);
    }
    
    private void printTreeHelper(Node node) {
        if (node != null) {
            printTreeHelper(node.left);
            System.out.print(node.value + " ");
            printTreeHelper(node.right);
        }
    }
}


