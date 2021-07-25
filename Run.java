import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Operation ope;
        System.out.println ("请输入运算符");
        Scanner sc=new Scanner (System.in);
        String p= sc.nextLine ();
        ope = new operationFactory ().createopreration (p);
        System.out.println ("请输入运算符左右两边的数字");
        Scanner sc1=new Scanner (System.in);
        int i= sc1.nextInt ();
        Scanner sc2=new Scanner (System.in);
        int j= sc2.nextInt ();
        ope.setA (i);
        ope.setB (j);
        double result = ope.getResult ();
        System.out.println (result);
    }
}