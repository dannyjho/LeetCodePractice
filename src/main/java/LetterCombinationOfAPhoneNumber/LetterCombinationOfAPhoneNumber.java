package LetterCombinationOfAPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {

        List<String> answer = new ArrayList<String>();
        Map<Character, String> mapNumbers = new HashMap<Character, String>();
        mapNumbers.put('1', "");
        mapNumbers.put('2', "abc");
        mapNumbers.put('3', "def");
        mapNumbers.put('4', "ghi");
        mapNumbers.put('5', "jkl");
        mapNumbers.put('6', "mno");
        mapNumbers.put('7', "pqrs");
        mapNumbers.put('8', "tuv");
        mapNumbers.put('9', "wxyz");
        mapNumbers.put('0', " ");

        for (char c : digits.toCharArray()) {
            String s = mapNumbers.get(c);
            if (answer.isEmpty()) {
                for (char c1 : s.toCharArray()) {
                    answer.add("" + c1);
                }
            } else {
                int count = answer.size();
                while (count > 0) {
                    String temp = answer.remove(0);
                    for (char c1 : s.toCharArray()) {
                        answer.add(temp + c1);
                    }
                    count--;
                }
            }
        }
        return answer;
    }
}
