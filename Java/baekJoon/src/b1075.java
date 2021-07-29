import java.util.Scanner;

public class b1075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long N = Long.parseLong(scan.nextLine());
        int F = Integer.parseInt(scan.nextLine());

        long n = N/100;
        n = n*100;
        
        int mod = (int) n/F;
        int mods = (int) n%F;
        if (mods >0) {
            mod +=1;
        }
        long result = mod*F;
        result = result%100;
        if (result/10 == 0) {
            System.out.print(0);
            System.out.println(result);
        }
        else {
            System.out.println(result);
        }

    }
}
