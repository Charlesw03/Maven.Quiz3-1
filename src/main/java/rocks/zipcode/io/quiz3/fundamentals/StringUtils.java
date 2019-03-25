package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String blake = str.substring(0, indexToCapitalize);
        Character toAdamers = Character.toUpperCase(str.charAt(indexToCapitalize));
        String enders = str.substring(indexToCapitalize + 1);
        return blake + toAdamers + enders;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        Boolean answer = false;
        for (int i = 0; i <= indexOfString; i++) {
            if(baseString.charAt(i) ==characterToCheckFor) {
                answer = true;
            } else{
                answer =false;
            }
        }


        return answer;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> sizzet = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {


            for (int j = i + 1; j <= string.length(); j++) {

                String sub = string.substring(i, j);

                sizzet.add(sub);

            }
        }
        String[] allSubs = new String[sizzet.size()];


        return sizzet.toArray(allSubs);
    }

    public static Integer getNumberOfSubStrings(String input) {


        return getAllSubStrings(input).length;
    }
}
