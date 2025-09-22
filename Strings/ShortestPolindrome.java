public class ShortestPolindrome {
    public String shortestPalindrome(String s) {
        if(s.length() < 2) return s;

        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;

        int[] lps = computeLPS(combined);

        int palLen = lps[combined.length() - 1];
        String suffix = s.substring(palLen);
        String reversedSuffix = new StringBuilder(suffix).reverse().toString();

        return reversedSuffix + s;
    }

    private int[] computeLPS(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int len = 0;

        for (int i = 1; i < n; i++) {
            while (len > 0 && str.charAt(i) != str.charAt(len)) {
                len = lps[len - 1];
            }
            if (str.charAt(i) == str.charAt(len)) {
                len++;
            }
            lps[i] = len;
        }

        return lps;
    }
}


