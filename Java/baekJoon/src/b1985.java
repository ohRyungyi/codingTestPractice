import java.util.Scanner;

public class b1985 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[3];

        for ( int i=0 ; i<3 ; i++ ) {
            arr[i] = scan.nextLine();
        }

        int[][][] maps = new int[arr[0].length()+1][arr[1].length()+1][arr[2].length()+1];
        int max = 0;
        int result = 0;
        for(int i=0 ; i<arr[0].length()+1 ; i++ ) {
            for ( int j=0 ; j<arr[1].length()+1 ; j++ ) {
                for ( int k=0 ; k<arr[2].length()+1 ; k++ ) {
                    if ( i==0 ) {
                        maps[i][j][k] = 0;
                    }
                    else if ( j==0 ) {
                        maps[i][j][k] = 0;
                    }
                    else if (k==0) {
                        maps[i][j][k] = 0;
                    }
                    else if ( arr[0].charAt(i-1) == arr[1].charAt(j-1) && arr[1].charAt(j-1) == arr[2].charAt(k-1)) {
                        maps[i][j][k] = maps[i-1][j-1][k-1] +1;

                        if (result <maps[i][j][k]) {
                            result = maps[i][j][k];
                        }
                    }
                    else {
                        max = Math.max(maps[i-1][j][k], maps[i][j-1][k]);
                        max = Math.max(max, maps[i][j][k-1]);

                        maps[i][j][k] = max;
                    }
                }
            }
        }

        

        System.out.println(result);

        
    }
    
}
