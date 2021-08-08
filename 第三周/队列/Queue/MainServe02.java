package Queue;

import java.util.Scanner;

public class MainServe02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        String p=scanner.nextLine ();

        System.out.println (new Solution ().firstUniqChar (p));
    }
}
