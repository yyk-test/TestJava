package StringString;

public class strStr {

    public static void main(String[] args) {
        String s = "source";
        String t = "our";

        System.out.println(strStr(s, t));
    }

    public static int strStr(String s, String t) {
        if(s == null || t == null) {
            return -1;
        }
        if(s == null && t == null) {
            return 0;
        }
        if(t.length() > s.length()) {
            return -1;
        }

        int tHash = hashFun(t);

        for(int i = 0; i < s.length() - t.length() + 1; i++) {
            String subStr = s.substring(i, i+t.length());
            int cHash = hashFun(subStr);
            if(cHash == tHash) {
                for(int j = 0; j < t.length(); j++) {
                    if(subStr.charAt(j) != t.charAt(j)) {
                        break;
                    }
                }
                return i;
            }
        }
        return -1;

    }

    private static int hashFun(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }
        int result = 1;
        for(char c : str.toCharArray()) {
            result = result * 31 + ((c == 0) ? 0 : (c - 'A'));
        }
        return result;
    }
}
