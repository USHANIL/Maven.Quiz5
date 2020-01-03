package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                substrings.add(string.substring(i, j+1));
            }
        }
        return substrings.toArray(new String[substrings.size()]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {

        List<String> strList1 = Arrays.asList(getAllSubstrings(string1));
        List<String> strList2 = Arrays.asList(getAllSubstrings(string2));


        Set<String> commonSet = new HashSet<>(strList1);
        commonSet.retainAll(strList2);

        return commonSet.toArray(new String[commonSet.size()]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        List<String> commonList = Arrays.asList(getCommonSubstrings(string1,string2));
        String currentBiggest = commonList.get(0);

        for (String word: commonList) {
            if(word.length() > currentBiggest.length()){
                currentBiggest = word;
            }
        }
        return currentBiggest;
    }
}
