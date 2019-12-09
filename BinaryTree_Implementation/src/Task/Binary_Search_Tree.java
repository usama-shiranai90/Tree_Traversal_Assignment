package Task;

public class Binary_Search_Tree {

    Node root_node ;

    Binary_Search_Tree() {
        root_node = null;
    }

    public void insert(int data){
        Node n1 = new Node(data);
        if (root_node == null){
            root_node = n1 ;
        }
        else {

            Node current = root_node;
            Node parent ;
            while (true){
                parent=current;
                if (current.data > data){
                    current = current.left;

                    if (current == null){
                        parent.left = n1 ;
                        return;
                    }
                }
                else{
                    current = current.right;
                    if (current == null){
                        parent.right =n1 ;
                        return;
                    }
                }
            }
        }
    }
}
