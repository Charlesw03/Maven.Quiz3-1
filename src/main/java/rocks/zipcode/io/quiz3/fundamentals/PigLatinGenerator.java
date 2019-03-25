package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] wordsThenSplit = str.split(" ");

        for(int i = 0; i < wordsThenSplit.length; i++) {
            String word = wordsThenSplit[i];
            String piggyWord = null;
            if (VowelUtils.startsWithVowel(word)) {
                piggyWord = word + "way";
            } else {
                Integer vowelIndex = VowelUtils.getIndexOfFirstVowel(word);
                if (vowelIndex == null) {
                    piggyWord = word + "ay";
                } else {
                    String beginning = word.substring(0, vowelIndex);
                    String ending = word.substring(vowelIndex);
                    piggyWord = ending + beginning + "ay";
                }
            }
            wordsThenSplit[i] = piggyWord;
        }


        return String.join(" ", wordsThenSplit);



    }

}
