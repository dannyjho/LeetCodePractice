package LongestCommonPrefix;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String curPrefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(curPrefix) != 0) {
                curPrefix = curPrefix.substring(0, curPrefix.length() - 1);
                if (curPrefix.length() == 0) {
                    return "";
                }
            }
        }
        return curPrefix;
    }
}
