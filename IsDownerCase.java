public class IsDownerCase {
    public static boolean isDownerCase(String str) {
        char s[] = str.toCharArray ();
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z') {
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
