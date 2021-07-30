import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class b1260 {
    public static int N;
    public static int M;
    public static int V;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();
        V = scan.nextInt();

        boolean[] checked = new boolean[1001];

        int[][] lines = new int[1001][1001];

        for ( int i=0 ; i<M ; i++ ) {
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            lines[n1][n2] = 1;
            lines[n2][n1] = 1;
        }

        dfs(V, lines, checked);
        System.out.println();

        checked = new boolean[1001];
        bfs(V, lines, checked);
    }

    public static void dfs(int start, int[][] lines, boolean[] checked) {
        System.out.print(start+" ");
        checked[start] = true;

        for(int j=1 ; j<N+1 ; j++) {
            if (lines[start][j] == 1 && checked[j] == false) {
                
                dfs(j, lines, checked);
            }
        }

        // System.out.println(start);
    }

    public static void bfs(int start, int[][] lines, boolean[] checked) {
        Queue<Integer> que = new LinkedList<Integer>();
        que.offer(start);
        checked[start] = true;

        while(!que.isEmpty()){
            int temp = que.poll();

            System.out.print(temp+" ");
            // checked[temp] = true;

            for(int i=1 ; i<=N ; i++) {
                if (lines[temp][i] == 1 && checked[i] == false) {
                    que.offer(i);

                    checked[i] = true;
                }
            }
        }
    }
    
}


/*
입력
4 5 1
1 2
1 3
1 4
2 4
3 4

출력
1 2 4 3
1 2 3 4

입력
5 5 3
5 4
5 2
1 2
3 4
3 1

출력
3 1 2 5 4
3 1 4 2 5

입력
1000 1 1000
999 1000

출력
1000 999
1000 999

*/
