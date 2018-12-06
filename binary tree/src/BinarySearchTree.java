class BinarySearchTree extends Node {
    private Node root=null;

    Node getRoot(){
        return this.root;
    }


    Node insert(Node current, int data) {
        if (current==null){
            current=createNode(data);
        }
        else {
            if (data < current.data) {
                current.left = insert(current.left, data);
            } else if (data > current.data) {
                current.right = insert(current.right, data);
            }
        }
        return current;
    }
    void printTree(){
        traverseTree(this.root);
    }

    //prints inorder tree traversal ......
    private static void traverseTree(Node currentNode){
        if (currentNode != null){
            traverseTree(currentNode.left);
            System.out.print(currentNode.data+"\t");
            traverseTree(currentNode.right);
        }
    }

    private static Node createNode(int data){
        Node newNode = new Node();
        newNode.data = data;
        return newNode;
    }
}
