package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int result = 0, left = 0, right = 0;
        HashSet<Character> hashSet = new HashSet<Character>();
        while (right < s.length()) {
            if (!hashSet.contains(s.charAt(right))) {
                hashSet.add(s.charAt(right++));
                result = Math.max(result, hashSet.size());
            } else {
                hashSet.remove(s.charAt(left++));
            }
        }
        return result;
    }
}
