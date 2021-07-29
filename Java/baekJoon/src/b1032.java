import java.util.Scanner;
import java.util.StringTokenizer;

public class b1032 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());

        String[] arr = new String[N];

        for (int i=0 ; i<N ;i++) {
            String str = scan.nextLine();
            StringTokenizer st = new StringTokenizer(str, "\n");
            arr[i] = st.nextToken();
        }

        String[] result = new String[arr[0].length()];

        for ( int i=0 ; i<arr[0].length() ; i++ ){
            String c = arr[0].substring(i, i+1);

            for ( int j=1 ; j<N ; j++ ) {
                String cp = arr[j].substring(i, i+1);
                if ( !c.equals(cp)) {
                    result[i] = "?";
                    break;
                }
            }

            if (result[i] == null) {
                result[i] = c;
            }
        }

        for (int i=0 ; i< result.length ; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
    }
}
