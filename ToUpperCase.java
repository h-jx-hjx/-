public class ToUpperCase {
    public static void toUpperCase(String str) {
        char s[] = str.toCharArray ();
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z' && s[i] >= 'A' && s[i] <= 'Z') {
                count++;
            }
        }
        if (count == s.length) {
            flag = true;
        } else {
            flag = false;
        }
        if (flag = true) {
            for (int i = 0; i < s.length; i++) {
                if (s[i] >= 'a' && s[i] <= 'z') {
                    System.out.print ((char) (s[i] - 32));

                } else {
                    System.out.print (s[i]);
                }
            }
        }
        System.out.println ("");
    }


}

