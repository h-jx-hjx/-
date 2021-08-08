package MyStudentServer01;

public class Student {
    private String  stuid;
    private String stuname;
    private int Math = 0;
    private int Java = 0;
    private int English = 0;
    private int Sum;


    public void  StudentDemo01(String id, String name,  int math, int java, int english, int sum) {
        this.stuid = id;
        this.stuname = name;

        Math = math;
        Java = java;
        English = english;
        Sum = sum;

    }


    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getJava() {
        return Java;
    }

    public void setJava(int java) {
        Java = java;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getSum() {
        return English+Math+Java;
    }

    public void setSum(int sum) {
        Sum = sum;
    }



}
