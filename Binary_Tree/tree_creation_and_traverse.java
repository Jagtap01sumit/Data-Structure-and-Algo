package Binary_Tree;

import java.util.Scanner;

class Node {
    Node right, left;
    int data;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class tree_creation_and_traverse {
    static Node create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node root = new Node(data);
        System.out.println("Enter the left child of " + root.data);
        root.left = create();
        System.out.println("Enter the right child of " + root.data);
        root.right = create();
        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);


    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        preorder(root.left);


        preorder(root.right);


    }

    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);


        postorder(root.right);

        System.out.print(root.data + " ");


    }

    public static void main(String[] args) {
        Node root = create();

        create();
        System.out.println("inorder:");
        inorder(root);

        System.out.println("preorder");

        preorder(root);

        System.out.println("postorder");

        postorder(root);

    }
}
