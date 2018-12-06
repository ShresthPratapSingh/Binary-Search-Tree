import java.util.Scanner;

public class Test {
    private static Scanner scan;
    public static void main(String[] args) {
        char choice;
        scan = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("enter the tree : ");
        do{
            System.out.println("enter data :");

            tree.insert(tree.getRoot(),scan.nextInt());

            System.out.println("continue(y/n)?");
            choice = scan.next().charAt(0);
        }while(choice!='n');

        tree.printTree();
    }
}
