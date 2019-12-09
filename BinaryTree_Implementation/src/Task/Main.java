package Task;

public class Main {

    public static void main(String[] args) {

traversal t =  new traversal();

        t.root_node = new Node(5);
        t.insert(2);
        t.insert(4);
        t.insert(8);
//        t.insert(6);

        System.out.println("Press 1. (Inorder)  Press 2. (Preoder)  Press 3. (Postorder) ");
        t.transverse(1);
        System.out.println();
        t.transverse(2);
        System.out.println();
        t.transverse(3);
    }
}
