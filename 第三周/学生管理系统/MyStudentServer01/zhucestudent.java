package MyStudentServer01;

import StudentServer.menu.Checkid;
import StudentServer.mysql.JDBCUnity;
import StudentServer.server.StudentDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zhucestudent {
    List<Student> list = new ArrayList<> ();

    public void zhuce() {
        System.out.println ("\t\t\t\t添加学生");
        Scanner scanner = new Scanner (System.in);
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = JDBCUnity01.getconnection ("studentdata01");
            ps = con.prepareStatement ("insert into student01 (stuid,stuname,math,eng,java,sum) values (?,?,?,?,?,?)");
            System.out.print ("\t\t\t\t请输入学号:");
            String stuid;
            while (true) {
                stuid = scanner.nextLine ();
                boolean f = new Checkid (stuid).checkteacher ();
                if (f) {
                    System.out.println ("\t\t\t\t账号重复，请重新输入！");
                    System.out.print ("\t\t\t\t请输入账号:");
                } else break;
            }
            ps.setObject (1, stuid);
            System.out.print ("\t\t\t\t请输入名字:");
            String stuname = scanner.nextLine ();
            ps.setObject (2, stuname);
            System.out.print ("\t\t\t\t\t请输入数学成绩:");
            int math = scanner.nextInt ();
            ps.setObject (3, math);
            System.out.print ("\t\t\t\t\t请输入英语成绩:");
            int eng = scanner.nextInt ();
            ps.setObject (4, eng);
            System.out.print ("\t\t\t\t\t请输入Java成绩:");
            int java = scanner.nextInt ();
            ps.setObject (5, java);
            int sum = math + eng + java;
            System.out.println ("\t\t\t\t\t系统自动计算总分为" + sum);

            ps.setObject (6, sum);


            ps.execute ();


        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    public void delect01() {
        Scanner scanner = new Scanner (System.in);
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = JDBCUnity01.getconnection ("studentdata01");
            System.out.println ("\t\t\t\t按名称删除-->'1'    按学号删除-->'2'");
            int choice = scanner.nextInt ();
            if (choice == 1) {
                ps = con.prepareStatement ("delete from student01 where stuname=?");
                System.out.println ("\t\t\t\t请输入学生name");
                scanner.nextLine ();
                String name = scanner.nextLine ();
                if (name.equals ("")) {
                    System.out.println ("\t\t\t\t姓名不能为空！");
                    return;
                }
                ps.setObject (1, name);

            } else {
                ps = con.prepareStatement ("delete from student01 where stuid=? ");
                System.out.println ("\t\t\t\t请输入学生id");
                scanner.nextLine ();
                String id = scanner.nextLine ();
                if (id.equals ("")) {
                    System.out.println ("\t\t\t\t学号不能为空！");
                    return;
                }
                ps.setObject (1, id);

            }

            ps.execute ();

        } catch (Exception e) {
            e.printStackTrace ();
        }finally {
            System.out.println ("删除成功");
        }

    }

    public void change01() {
        int choice;
        Scanner scanner = new Scanner (System.in);
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean f = false;
        System.out.print ("\t\t\t\t请输入要修改学生的学号:");
        String id = scanner.nextLine ();
        try {
            con = JDBCUnity.getconnection ("studentdata01");

            System.out.println ("\t\t\t\t----------------1.修改姓名----------------");
            System.out.println ("\t\t\t\t----------------2.修改学号----------------");
            System.out.println ("\t\t\t\t----------------3.修改密码----------------");
            System.out.println ("\t\t\t\t----------------4.修改数学----------------");
            System.out.println ("\t\t\t\t----------------5.修改英语----------------");
            System.out.println ("\t\t\t\t----------------6.修改Java----------------");
            System.out.println ("\t\t\t\t----------------7.修改班级----------------");
            System.out.println ("\t\t\t\t----------------0.退出    ----------------");
            System.out.print ("\t\t\t\t\t\t请输入你要进行的操作:");
            choice = scanner.nextInt ();
            scanner.nextLine ();
            switch (choice) {
                case 1:
                    System.out.print ("\t\t\t\t姓名改为：");
                    String name = scanner.nextLine ();
                    ps = con.prepareStatement ("update student01 set stuname=? where stuid=?; ");
                    ps.setString (1, name);
                    ps.setString (2, id);
                    ps.execute ();
                    break;
                case 2:
                    System.out.print ("\t\t\t\t学号改为：");
                    String id1 = scanner.nextLine ();
                    ps = con.prepareStatement ("update student set stuid=? where stuid=? ;");
                    ps.setString (1, id1);
                    ps.setString (2, id);
                    ps.execute ();
                    break;

                case 4:
                    System.out.print ("\t\t\t\t数学改为：");
                    String math1 = scanner.nextLine ();
                    ps = con.prepareStatement ("update student set math=? where stuid=?;");
                    ps.setString (1, math1);
                    ps.setString (2, id);
                    ps.execute ();
                    break;
                case 5:
                    System.out.print ("\t\t\t\t英语改为：");
                    String eng1 = scanner.nextLine ();
                    ps = con.prepareStatement ("update student set eng=? where stuid=?;");
                    ps.setString (1, eng1);
                    ps.setString (2, id);
                    ps.execute ();
                    break;
                case 6:
                    System.out.print ("\t\t\t\tJava改为：");
                    String java1 = scanner.nextLine ();
                    ps = con.prepareStatement ("update student set java=? where stuid=?;");
                    ps.setString (1, java1);
                    ps.setString (2, id);
                    ps.execute ();
                    break;

            }

        } catch (Exception e) {
            e.printStackTrace ();
        }finally {
            System.out.println ("修改成功");
        }
    }

    public void find01() {
        Scanner scanner = new Scanner (System.in);
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        System.out.print ("\t\t\t\t请输入要查询的学生学号:");
        String id = scanner.nextLine ();

        try {
            con = JDBCUnity.getconnection ("studentdata01");
            ps = con.prepareStatement ("select * from student01 where stuid=?");
            ps.setString (1, id);
            rs = ps.executeQuery ();
            System.out.println ("*********************************************************************************************");
            while (rs.next ()) {
                System.out.println ("\t\t\t\t|学号：" + rs.getString (2) + "|" + "姓名：" + rs.getString (3) + "|" + "数学：" +
                        rs.getString (4) + "|" + "英语：" + rs.getInt (5) + "|" + "Java：" + rs.getInt (6) + "|" +
                        "总分：" + rs.getInt (7) + "|");
            }
            System.out.println ("*********************************************************************************************");
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    public void showfail() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = JDBCUnity.getconnection ("studentdata01");
            java.sql.Statement sta = con.createStatement ();
            //保存你要执行的SQL语句
            String sql = "SELECT * FROM student01;";
            rs = sta.executeQuery (sql);
            while (rs.next ()) {
                if (rs.getInt ("sum") <= 180 && rs.getInt ("sum") >= 0) {
                    System.out.println ("\t\t\t\t|学号：" + rs.getString (2) + "|" + "姓名：" + rs.getString (3) + "|" + "数学：" +
                            rs.getString (4) + "|" + "英语：" + rs.getInt (5) + "|" + "Java：" + rs.getInt (6) + "|" +
                            "总分：" + rs.getInt (7) + "|");
                }
            }


        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}

