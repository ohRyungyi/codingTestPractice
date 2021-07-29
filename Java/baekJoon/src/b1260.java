import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import javax.print.attribute.standard.QueuedJobCount;

public class b1260 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int V = scan.nextInt();

        int[][] dfs_lines = new int[N+1][N+1];
        int[][] bfs_lines = new int[N+1][N+1];
        Stack<Integer> dfs_list = new Stack<>();
        // int[] dfs_data = new int[N];
        int dfs_size = 0;

        Queue<Integer> bfs_list = new Queue<>();
        // int[] bfs_data = new int[N];
        int bfs_size = 0;

        for(int i=0 ; i<M ; i++) {
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            dfs_lines[n1][n2] = 1;
            dfs_lines[n2][n1] = 1;

            bfs_lines[n1][n2] = 1;
            bfs_lines[n1][n2] = 1;
        }

        do {
            if (dfs_list.size == 0) {
                dfs_list.push(V);
            }
            else {
                int data = dfs_list.pop();
                System.out.print(data+" ");
                dfs_size++;
                for(int j=N ; j>=1 ; j--) {
                    if( dfs_lines[data][j] == 1 ) {
                        dfs_list.push(j);

                        dfs_lines[j][data] = 0;
                        dfs_lines[data][j] = 0;
                    }
                } 

                if(dfs_size==N) {
                    break;
                }
            }
        }while(dfs_list.size>0 );
        System.out.println();

        do {
            if(bfs_list.size == 0) {
                bfs_list.push(V);
                System.out.println(V);
                bfs_size=0;
            }
            else {
                int data = bfs_list.pop();
                System.out.println(data+" ");
                bfs_size++;
                for(int j=1 ; j<=N ; j++) {
                    if(bfs_lines[data][j] == 1) {
                        bfs_list.push(j);
                        System.out.println(" : "+j);

                        bfs_lines[j][data]=0;
                        bfs_lines[data][j]=0;
                    }
                }
                if(bfs_size==N+1) {
                    // System.out.println();
                    break;
                }
            }
        }while(bfs_list.size>0);
    
        
                
        
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
        public void setNext(Node<E> node) {
            this.next = node;
        }
    }

    public static class Stack<E> {
        private Node<E> top;
        int size;

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

            size ++;
        }

        public E pop() {
            if (size==0){
                return null;
            }
            else {
                E data = top.getData();
                Node<E> node = top.getNext();
                top = node;
                size--;
                return data;
            }
        }

        public void printStack() {
            Node<E> ind = top;
            System.out.print("stack : ");
            while(ind != null) {
                System.out.print(ind.data+" ");
                ind = ind.getNext();
            }
            System.out.println();
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
