import java.util.Scanner;


public class Sequence {

    int MAX;
    int len;
    int[] data;
    int top;

    public Sequence(int m) {
        this.MAX = m;
        this.data = new int[m];
        this.top = -1;
        this.len = 0;
    }

    //压栈
    public boolean push(int temp) {
        if (this.len == this.MAX) {
            System.out.println ("Push failed.");
            return false;
        }
        top++;
        len++;
        data[top] = temp;
        return true;
    }

    //出栈
    public int pop() {
        int temp = data[top];
        top--;
        len--;
        return temp;
    }

    //获取top数据
    public int getTop() {
        return data[top];
    }


    public Sequence tenTo2() {
        Sequence s = new Sequence (this.MAX * 4);
        int k = pop ();
        while (k != 0) {
            s.push (k % 2);
            k /= 2;
        }
        for (int i = 0; s.len != 0; i++) {
            System.out.print (s.pop ());
        }
        System.out.println ("");
        return s;
    }


    public String tenTo16() {
        int k = pop ();
        String s = Integer.toHexString (k);
        return s;
    }

    public String tenTo8() {
        int k = pop ();
        String s = Integer.toOctalString (k);
        return s;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println ("你想输入几个十进制数");
        Scanner sc1 = new Scanner (System.in);
        int a = sc1.nextInt ();
        Sequence se = new Sequence (a);
        for (int y = 0; y < a; y++) {
            int c = y + 1;
            System.out.println ("请输入第" + c + "个数：");
            Scanner sc2 = new Scanner (System.in);
            int b = sc2.nextInt ();
            se.push (b);
        }
        int i = se.len + 1;

        while (true) {
            System.out.println ("------------请输入你的选择----------");
            System.out.println ("1、将其转化为二进制");
            System.out.println ("1、将其转化为十六进制");
            System.out.println ("3、将其转化为八进制");
            System.out.println ("4、退出");
            Scanner sc3 = new Scanner (System.in);
            int c = sc3.nextInt ();
            switch (c) {
                case 1:
                    while (se.len > 0) {
                        int j = i - se.len;
                        System.out.println ("第" + j + "个十进制数转化为二进制的结果为：");
                        se.tenTo2 ();

                    }
                    break;
                case 2:
                    while (se.len > 0) {
                        int j = i - se.len;
                        System.out.println ("第" + j + "个十进制数转化为十六进制的结果为：" + se.tenTo16 ());

                    }
                    break;
                case 3:
                    while (se.len > 0) {
                        int j = i - se.len;
                        System.out.println ("第" + j + "个十进制数转化为八进制的结果为：" + se.tenTo8 ());

                    }
                    break;
                case 4:
                    System.out.println ("谢谢使用");
                    System.exit (0);//直接退出的指令（JVM）退出

            }

        }
    }
}

