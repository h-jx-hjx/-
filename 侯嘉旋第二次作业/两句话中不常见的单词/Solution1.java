import java.util.*;

class Solution1
{
    public String[] uncommonFromSentences(String A, String B)
    {
        Map<String, Boolean> map = new HashMap<> ();
        String[] arrayA = A.split(" ");
        String[] arrayB = B.split(" ");
        for (String i : arrayA)
        {
            if (!map.containsKey(i))
            {
                map.put(i, true);
            }
            else
            {
                map.put(i, false);
            }
        }
        for (String i : arrayB)
        {
            if (!map.containsKey(i))
            {
                map.put(i, true);
            }
            else
            {
                map.put(i, false);
            }
        }
        Set<String> set = new HashSet<> ();
        for (String i : arrayA)
        {
            if (map.get(i))
            {
                set.add(i);
            }
        }
        for (String i : arrayB)
        {
            if (map.get(i))
            {
                set.add(i);
            }
        }
        return set.toArray(new String[set.size()]);
    }

    public static void main(String[] args) {
        System.out.println ("请输入两句英语");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine ();
        String b= sc.nextLine ();
        Solution1 solution1=new Solution1 ();
        String[] c= solution1.uncommonFromSentences(a,b);
        System.out.println ("不常见单词为：");
        for(int i=0;i< c.length;i++) {
            System.out.print (c[i]);
        }
    }
}

