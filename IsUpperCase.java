public class IsUpperCase {
    public static boolean isUpperCase(String str) {
        char s[] = str.toCharArray ();
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                count++;
            }
        }
        if (count == s.length) {
            return true;
        } else {
            return false;
        }
    }
}
