import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class b9251 {
    public static void main(String[] args) throws Exception  {
        Scanner scan = new Scanner(System.in);
        String arr[] = new String[2];

        for ( int i=0 ; i<2 ; i++ )  {
            arr[i] = scan.nextLine();
        }

        int maps[][] = new int[arr[0].length()+1][arr[1].length()+1];

        int max = 0;

        for ( int i=0 ; i< arr[0].length()+1 ; i++ ) {
            for ( int j=0 ; j<arr[1].length()+1 ; j++ ) {
                if ( i==0 ) {
                    maps[i][j] = 0;
                }
                else if ( j==0 ) {
                    maps[i][j] = 0;
                }
                else {
                    int up = maps[i][j-1];
                    int left = maps[i-1][j];
    
                    if ( arr[0].charAt(i-1 ) == arr[1].charAt(j-1)) {
                        maps[i][j] = maps[i-1][j-1]+1;

                        if (max < maps[i][j]) {
                            max = maps[i][j];
                        }
                    }
                    else {
                        if ( up > left ) {
                            maps[i][j] = up;
                        }
                        else {
                            maps[i][j] = left;
                        }
                    }
                }
            }
        }

        System.out.println(max);
    }
}
