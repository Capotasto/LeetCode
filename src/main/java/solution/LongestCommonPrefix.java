package solution;


import java.util.ArrayList;
import java.util.List;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return String.valueOf(strs[0]);
        }

        boolean isNotDifferent = true;
        int index = 0;
        List<String> list = new ArrayList<>();
        while (isNotDifferent) {
            int skipCount = 0;
            for (int i = 0; i < strs.length; i++) {
                if (i == 0) {
                    if (index + 1 > strs[i].length()) {
                        list.add("");
                    } else {
                        list.add(String.valueOf(strs[0].charAt(index)));
                    }
                } else {
                    String string;
                    if (index + 1 > strs[i].length()) {
                        string = "";
                        if(!string.equals(list.get(index))) {
                            isNotDifferent = false;
                            list.remove(index);
                            break;
                        }
                        skipCount++;
                        if (skipCount == strs.length - 1) {
                            isNotDifferent = false;
                            list.remove(index);
                            break;
                        }
                    } else {
                        string = String.valueOf(strs[i].charAt(index));
                        if(!string.equals(list.get(index))) {
                            isNotDifferent = false;
                            list.remove(index);
                            break;
                        }
                    }
                }
            }
            index++;
        }

        StringBuilder builder = new StringBuilder();
        for (String s : list) {
            builder.append(s);
        }

        return builder.toString();
    }
}
