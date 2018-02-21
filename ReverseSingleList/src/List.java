


public class List<T> {
    private Node<T> head;


    public void add(T newData){
        if (head==null){
            Node<T> node = new Node<>(newData);
            head=node;
        }

        else {
            Node<T> currentNode;
            currentNode=head;

            while (currentNode.getNext() != null){
                currentNode=currentNode.getNext();
            }

            currentNode.setNext(new Node<>(newData));
        }
    }



    /*
    * Reversing the list:
    * the loop runs until the current node is null.
    * 1. currentNode is the head of the list
    * 2. Previous node is null. because it's the head of the list
    * 3. While current node is not null (list has not ended):
    *   -new head of the list, is the node we are working on (this will be updated until we reach the last node on the list)
    *   -save the next pointer of the current node (this will be the next node to work on)
    *   -reversing current node: current node points to the previous node (prev) and becomes the new prev
    *   -prev is updated to point to the current node. it's preperation for the next loop.
    *   -current node becomes the the value in the pointer of the original node.
    **/

    public void reverse_list(){
        Node prev;
        Node workingOnNode;
        Node nextNodeToWorkOn;


        workingOnNode=head;
        prev=null;

        while (workingOnNode!=null){

            head=workingOnNode;

            nextNodeToWorkOn=workingOnNode.getNext();

            workingOnNode.setNext(prev);
            prev=workingOnNode;

            workingOnNode=nextNodeToWorkOn;

        }

    }





    public void print_list(){
        Node<T> current = head;

        if(current==null){
            System.out.println("List is empty");
            return;
        }


        while(current!=null){
            if(current==null){
                System.out.println("");
            }
            else {
                System.out.print(current.getData()+" ");
                current = current.getNext();
            }
        }

        System.out.println("");
    }



}
