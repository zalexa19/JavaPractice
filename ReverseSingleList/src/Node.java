/*
This class represents the node of a linked list
 */

public class Node<T> {

      private Node<T> next;
      private Object data;


      public Node(T newData){
          next=null;
          data=newData;
    }



    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext(){
        return next;
    }

    public Object getData(){
          return data;
    }
}
