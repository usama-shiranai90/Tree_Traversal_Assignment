package Task;
import java.util.Scanner;
public class traversal {

     Node root_node ;

    traversal() {
        root_node = null;
    }

    public void insert(int data){
        Node node = new Node(data);
        Node current = root_node ;
        Node parent =current;
        int set = 0;
        if (current == null){
                current =node;
            root_node  = current ;
        }
        else{
            System.out.print("Press 'l' to move left or  'r' right to move towards " +
                    "right for "+data+" : ");
          Scanner s1 = new Scanner(System.in);
            String move ;
            while (current !=null){
                move = s1.nextLine();
                parent = current;
                if (move.equals("l")|| move.equals("L")){
                    current =current.left;
                    set =1 ;
                    while (current !=null)
                    {
                        parent =current;
                        move = s1.nextLine();
//                       System.out.print("\nSubtree is "+current.data+" adding for L or R");
                        if (move.equals("l")){
                            current = current.left;
                            set =1 ;
                        }
                        if (move.equals("r")){
                            current = current.right;
                            set =2 ;
                        }
                    }
                }

                else if(move.equals("r")|| move.equals("R")){
                    current =current.right;
                    set =2;
                }
            }
            if (set ==1){
                parent.left = node;
            }
            if (set ==2){
                parent.right= node;
            }
        }
    }

    public void transverse(int n){

        switch (n){

            case 1 :
            {
                in_order(root_node);
                break;}

            case 2 :
            {
        preorder(root_node);
            break;
            }

        case 3 :
        postorder(root_node);
         break;
        }
    }
    public void in_order(Node temp){

        if (temp !=null){

            in_order(temp.left);
            System.out.print( temp.data +" ");
            in_order(temp.right);
        }
        else{
            return;
        }
    }

    public void preorder(Node temp){

        if (temp !=null){
            System.out.print( temp.data +" ");
           preorder(temp.left);
           preorder(temp.right);
        }
        else{
            return;
        }
    }
    public void postorder(Node temp){

        if (temp!=null){
            postorder(temp.left);
            postorder(temp.right);
            System.out.print(temp.data+" ");
        }
    }

}
