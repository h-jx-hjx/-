import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringDome {
    public static void main(String[] args) {
        String str = "acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi";
        List<ArrayList> list = new ArrayList ();
        String[] splitStr = str.split(",");
        System.out.println ("拆分后的字符串");
        for(int i = 0; i < splitStr.length; i++)
        {
            System.out.println (splitStr[i]);
        }
        System.out.println ("--------------请输入以下功能-------------");
        System.out.println ("1_判断字符串是否全是数字");
        System.out.println ("2_判断字符串是否是大写字母");
        System.out.println ("3_判断字符串是否全是小写字母");
        System.out.println ("4_如果字符串全是字母，将其中所有小写字母转换为大写字母");
        Scanner sc = new Scanner (System.in);
        String line = sc.nextLine ();
        switch(line){
            case"1":
                for(int i = 0; i < splitStr.length; i++){
                    int j =i+1;
                    System.out.println("第"+j+"个字符串的判断结果为:"+CheckStrIsNum.checkStrIsNum02(splitStr[i]));
                }
            case"2":
                for(int i = 0; i < splitStr.length; i++){
                    int j =i+1;
                    System.out.println("第"+j+"个字符串的判断结果为:"+IsUpperCase.isUpperCase (splitStr[i]));
                }
            case"3":
                for(int i = 0; i < splitStr.length; i++){
                    int j =i+1;
                    System.out.println("第"+j+"个字符串的判断结果为:"+IsDownerCase.isDownerCase (splitStr[i]));
                }
            case "4":
                for(int i = 0; i < splitStr.length; i++){
                ToUpperCase.toUpperCase (splitStr[i]);
        }}
    }

}
