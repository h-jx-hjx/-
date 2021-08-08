package MyStudentServer01;

import StudentServer.denglu.zhuceteacher;
import StudentServer.mysql.JDBCUnity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class MainServer {
    public static void main(String[] args) {


        ArrayList<Student> array = new ArrayList<Student> ();
        //无限循环，重新回到主界面
        while (true) {
            System.out.println ("------欢迎来到侯嘉旋设计的学生管理系统------");
            System.out.println ("1、添加学生");
            System.out.println ("2、删除学生");
            System.out.println ("3、修改学生");
            System.out.println ("4、查看学生");
            System.out.println ("5、输出总分低于180的学生信息");
            System.out.println ("6、退出");
            System.out.println ("----------输入你的选择---------");
            Scanner sc = new Scanner (System.in);
            String line = sc.nextLine ();
            switch (line) {
                case "1":
                    // System.out.println ("添加学生");
                    new zhucestudent ().zhuce ();
                    break;
                case "2":
                    //System.out.println ("删除学生");
                    new zhucestudent ().delect01 ();
                    break;
                case "3":
                    System.out.println ("修改学生");
                    new zhucestudent ().change01 ();
                    break;
                case "4":
                    new zhucestudent ().find01 ();
                    //   System.out.println ("查看所有学生");
                    break;
                case "5":
                    new zhucestudent ().showfail ();
                    break;
                case "6":
                    System.out.println ("谢谢使用");
                    System.exit (0);//直接退出的指令（JVM）退出
            }

        }

    }

}