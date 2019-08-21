package algorithm.task2;

import java.util.ArrayList;

public class MergeString {

    public static String merge(String str1, String str2) {

        int count1 = 0;
        int count2 = 0;
        ArrayList<Character> array  = new ArrayList<>();
        while (count1 != str1.length() || count2 != str2.length()) {
            if (count1 < str1.length()) {
                char a = str1.charAt(count1++);
                array.add(a);
            }
            if (count2 < str2.length()) {
                char b = str2.charAt(count2++);
                array.add(b);
            }
        }

        StringBuilder builder = new StringBuilder(array.size());
        for(Character ch: array)
        {
            builder.append(ch);
        }
        return builder.toString();

    }
}
