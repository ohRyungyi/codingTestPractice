import java.util.Scanner;

public class b11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        String str = scan.next();

        long sum = 0;

        for (int i=0 ; i<N ; i++ ) {
            sum += Integer.parseInt((String) str.subSequence(i, i+1));
        }

        System.out.println(sum);
    }
}

/*
입력
1
1

출력
1

입력
5
54321

출력
15

입력
25
7000000000000000000000000

출력
7

입력
11
10987654321

출력
46
*/