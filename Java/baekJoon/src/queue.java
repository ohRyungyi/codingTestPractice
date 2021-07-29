public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.printQueue();

        queue.pop();
        queue.printQueue();

    }

    public static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data)  {
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

    public static class Queue<E> {
        Node<E> head, tail;
        int size;

        public Queue() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public void push(int data) {
            Node<E> node = new Node(data);
            if ( size == 0) {
                head = node;
                head.setNext(tail);
            }
            else {
                tail.setNext(node);
            }
            tail = node;
            size+=1;
        }

        public E pop() {
            if( size == 0 ){
                return null;
            }
            else {
                E data = head.getData();
                Node<E> node = head.getNext();
                head = node;
                size--;
                return data;
            }
        }

        public void printQueue() {
            Node<E> node = head;

            while(node!= null) {
                System.out.print(node.getData()+" ");
                node = node.getNext();
            }
            System.out.println();
        }
    }
}
