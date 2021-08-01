import java.util.Scanner;

public class NumberException extends Exception
{

    public NumberException (String message)
    {
        super(message);
    }

    //调用
    public static void main(String args[]) throws NumberException {
        System.out.println ("请输入一个10~100的数字");
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt ();
        if(a<10 || a>100)
        {
            try {
                throw new NumberException("数字小于10或者大于100");
            }catch (Exception e){
                System.out.println (e);
            }
        }else{
            System.out.println ("输入范围正确");
        }
    }}