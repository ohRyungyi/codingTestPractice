import java.util.List;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printStack();

        stack.pop();
        System.out.println("size : "+stack.size);
        stack.pop();
        System.out.println("size : "+stack.size);
        stack.pop();
        System.out.println("size : "+stack.size);
        stack.pop();
        System.out.println("size : "+stack.size);
        stack.printStack();
    }

    public static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return this.data;
        }
        public Node<E> getNext() {
            return this.next;
        }

        public void setData(E data) {
            this.data = data;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    public static class Stack<E> {
        Node<E> top;
        int size = 0;

        public Stack() {
            this.top = null;
            this.size = 0;
        }

        public void push(E data) {
            Node<E> node = new Node<E>(data);
            if ( size==0 ) {
                top = node;
            }
            else {
                node.setNext(top);
                top = node;
            }
            size++;
        }

        public E pop() {
            if (size == 0){
                return null;
            }
            else {
                E data = top.getData();
                Node<E> node = top.getNext();
                top = node;
                size-=1;
                return data;
            }
        }

        public void printStack() {
            Node<E> ind = top;

            while(ind != null) {
                System.out.println(ind.getData());
                ind = ind.getNext();
            }
        }
    }
}
