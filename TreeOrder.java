import java.util.*;
class TreeOrder 
{
    static class Node 
    {
        int key;
        Node left, right;
        Node(int key) 
        {
            this.key = key;
            left = right = null;
        }
    }
    public static Node createTree(Scanner sc) 
    {
        System.out.print("Enter node value (-1 for null): ");
        int key = sc.nextInt();
        if (key == -1) 
        {
            return null;
        }
        Node node = new Node(key);
        System.out.println("Enter left child of " + key);
        node.left = createTree(sc);
        System.out.println("Enter right child of " + key);
        node.right = createTree(sc);
        return node;
    }
    public static void preOrder(Node root, List<Integer> result) 
    {
        if (root != null) 
        {
            result.add(root.key);
            preOrder(root.left, result);
            preOrder(root.right, result);
        }
    }
    public static void inOrder(Node root, List<Integer> result) 
    {
        if (root != null) 
        {
            inOrder(root.left, result);
            result.add(root.key);
            inOrder(root.right, result);
        }
    }
    public static void postOrder(Node root, List<Integer> result) 
    {
        if (root != null) 
        {
            postOrder(root.left, result);
            postOrder(root.right, result);
            result.add(root.key);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create Binary Tree:");
        Node root = createTree(sc);
        List<Integer> preorderList = new ArrayList<>();
        List<Integer> inorderList = new ArrayList<>();
        List<Integer> postorderList = new ArrayList<>();
        preOrder(root, preorderList);
        inOrder(root, inorderList);
        postOrder(root, postorderList);
        System.out.println("Preorder Traversal: " + preorderList);
        System.out.println("Inorder Traversal: " + inorderList);
        System.out.println("Postorder Traversal: " + postorderList);
        sc.close();
    }
}

