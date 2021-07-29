import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class b1076 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Tripple<String, String, String>> list = new ArrayList<>();
        list.add(new Tripple<String, String, String>("black", "0", "1"));
        list.add(new Tripple<String, String, String>("brown", "1", "10"));
        list.add(new Tripple<String, String, String>("red", "2", "100"));
        list.add(new Tripple<String, String, String>("orange", "3", "1000"));
        list.add(new Tripple<String, String, String>("yellow", "4", "10000"));
        list.add(new Tripple<String, String, String>("green", "5", "100000"));
        list.add(new Tripple<String, String, String>("blue", "6", "1000000"));
        list.add(new Tripple<String, String, String>("violet", "7", "10000000"));
        list.add(new Tripple<String, String, String>("grey", "8", "100000000"));
        list.add(new Tripple<String, String, String>("white", "9", "1000000000"));

        String[] commands = new String[3];
        Long result = (long) 0;
        for ( int i=0 ; i<3 ; i++ ) {
            commands[i] = scan.nextLine();
        }

        for ( int i=0 ; i<3 ; i++) {
            for ( int j=0 ; j<10 ; j++) {
                if ( commands[i].equals(list.get(j).name)) {
                    if ( i==2 ) {
                        result*=Long.parseLong(list.get(j).multi);
                        break;
                    }
                    else {
                        result+=Long.parseLong(list.get(j).val)*((long)Math.pow(10.0, 1-i));
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }    

    public static class Tripple<L, M, R> {
        final L name;
        final M val;
        final R multi;

        public Tripple(L l, M m, R r) {
            this.name  = l;
            this.val = m;
            this.multi = r;
        }

        public M getMid(L name) {
            return val;
        }

        public R getLast(L name){
            return multi;
        }
    }
}
