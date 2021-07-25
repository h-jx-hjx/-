import java.util.Scanner;

public class Lan {

    public static void main(String[] args) {

        System.out.println("双向链表的测试");

        HeroNode2 hero1 = new HeroNode2(1, "王一");
        HeroNode2 hero2 = new HeroNode2(2, "李二");
        HeroNode2 hero3 = new HeroNode2(3, "谢三");
        HeroNode2 hero4 = new HeroNode2(4, "赵四" );

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(hero1);
        doubleLinkedList.add(hero2);
        doubleLinkedList.add(hero3);
        doubleLinkedList.add(hero4);

        doubleLinkedList.list();


        System.out.println ("请输入要修改的序号和名字");
        Scanner sc1 = new Scanner (System.in);
        int i = sc1.nextInt ();
        Scanner sc2 = new Scanner (System.in);

        String p= sc2.nextLine ();


        HeroNode2 newHeroNode = new HeroNode2(i, p);
        doubleLinkedList.update(newHeroNode);
        System.out.println("修改后的链表情况");
        doubleLinkedList.list();

        // 删除
        System.out.println ("请输入要删除名字的序号");
        Scanner sc3 = new Scanner (System.in);
        int j = sc3.nextInt ();

        doubleLinkedList.del(j);
        System.out.println("删除后的链表情况~~");
        doubleLinkedList.list();



    }

}
class DoubleLinkedList {
    private HeroNode2 head = new HeroNode2(0, "");
    public HeroNode2 getHead() {
        return head;
    }
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode2 temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
    public void add(HeroNode2 heroNode) {
        HeroNode2 temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
        heroNode.pre = temp;
    }
    public void update(HeroNode2 newHeroNode) {
        // 判断是否空
        if (head.next == null) {
            System.out.println("链表为空~");
            return;
        }
        HeroNode2 temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == newHeroNode.no) {
                // 找到
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = newHeroNode.name;

        } else {
            System.out.printf("没有找到 编号 %d 的节点，不能修改\n", newHeroNode.no);
        }
    }
    public void del(int no) {

        // 判断当前链表是否为空
        if (head.next == null) {// 空链表
            System.out.println("链表为空，无法删除");
            return;
        }

        HeroNode2 temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {

            temp.pre.next = temp.next;

            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
        } else {
            System.out.printf("要删除的 %d 节点不存在\n", no);
        }
    }

}


class HeroNode2 {
    public int no;
    public String name;

    public HeroNode2 next;
    public HeroNode2 pre;


    public HeroNode2(int no, String name) {
        this.no = no;
        this.name = name;

    }

    @Override
    public String toString() {
        return "HeroNode [no=" + no + ", name=" + name + ", nickname="+"]";
    }

}

