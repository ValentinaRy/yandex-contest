import java.util.LinkedList;

public class QueueLinkedListExample {
    private static class Node {
        static int counter = 1;
        final int val;
        Node leftChild;
        Node rightChild;

        private Node(int val) {
            this.val = val;
        }

        private Node() {
            this.val = counter;
            counter++;
        }
    }

    private static Node initTree() {
        //            1
        //     2            3
        //  4     5      6      7
        // 8 9  10 11  12 13  14 15
        Node root = new Node();

        root.leftChild = new Node();
        root.rightChild = new Node();

        root.leftChild.leftChild = new Node();
        root.leftChild.rightChild = new Node();
        root.rightChild.leftChild = new Node();
        root.rightChild.rightChild = new Node();

        root.leftChild.leftChild.leftChild = new Node();
        root.leftChild.leftChild.rightChild = new Node();
        root.leftChild.rightChild.leftChild = new Node();
        root.leftChild.rightChild.rightChild = new Node();
        root.rightChild.leftChild.leftChild = new Node();
        root.rightChild.leftChild.rightChild = new Node();
        root.rightChild.rightChild.leftChild = new Node();
        root.rightChild.rightChild.rightChild = new Node();

        return root;
    }

    public static void main(String[] args) {
        // breadth-first search
        Node root = initTree();
        breadthFirstSearch(root);
    }

    private static void breadthFirstSearch(Node root) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.pollFirst();
            System.out.println(current.val);
            if (current.leftChild != null) queue.addLast(current.leftChild);
            if (current.rightChild != null) queue.addLast(current.rightChild);
        }
    }
}
