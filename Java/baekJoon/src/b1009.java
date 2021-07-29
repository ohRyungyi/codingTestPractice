import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class b1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for ( int i=0 ; i<T ; i++ ) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(result(a%10, b));
        }
    }

    public static int result(int a, int b) {
        List<Integer> mods = new ArrayList<>();

        int stand = 0;
        int data= a;

        if ( a==0 ){
            return 10;
        }

        while (stand != a) {
            mods.add(data);
            data = data*a;
            data = data%10;
            stand = data;
        }

        if (mods.size()==1) {
            return mods.get(0);
        }
        else {
            int ind = b%mods.size();
            if (ind == 0) {
                ind = mods.size();
            }
            return mods.get(ind-1);
        }
        
    }
}
