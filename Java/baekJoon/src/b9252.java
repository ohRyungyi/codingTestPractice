import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class b9252 {
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

        int x = arr[0].length();
        int y = arr[1].length();
        String[] str = new String[max];
        int index = max-1;

        while (true) {
            int now = maps[x][y];
            int up = maps[x][y-1];
            int left = maps[x-1][y];

            if ( now == up ){
                y = y-1;
                // System.out.println(x+" , "+ y+" = "+arr[0].substring(x-1, x));
                // str[index]=arr[0].substring(x-1, x-1);
                // System.out.println(arr[0].substring(x-1, x-1));
                // index-=1;
            }
            else if ( now == left) {
                x = x-1;
                // System.out.println(x+" , "+ y+" = "+arr[0].substring(x-1, x));
                // str[index]= arr[1].substring(y-1, y-1);
                // System.out.println(arr[1].substring(y-1, y-1));
                // index-=1;
            }
            else {
                // System.out.println("x = "+x+" , y = "+y);
                // System.out.print(arr[0].substring(x-1, x));
                str[index--]  = arr[0].substring(x-1, x);
                
                // index-=1;
                x = x-1;
                y = y-1;
            }

            if ( maps[x][y] == 0){
                break;
            }
        }

        for ( int i=0 ; i<max ; i++ ) {
            System.out.print(str[i]);
        }

    }
}
