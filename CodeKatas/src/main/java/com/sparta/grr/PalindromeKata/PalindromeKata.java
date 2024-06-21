package com.sparta.grr.PalindromeKata;

import java.util.*;

public class PalindromeKata {

    private static final int MINIMUM_PALINDROME_LENGTH = 3;

    public static boolean isPalindrome(String possiblePalindrome){
        if(!isNull(possiblePalindrome) && !(possiblePalindrome.length() < MINIMUM_PALINDROME_LENGTH)){
            possiblePalindrome = possiblePalindrome.toLowerCase();
            StringBuilder builder = new StringBuilder(possiblePalindrome);
            return possiblePalindrome.contentEquals(builder.reverse());
        }
        else {
            return false;
        }
    }

    public static String[] getPalindromes(String possiblePalindromeSentence){
        if(isNull(possiblePalindromeSentence) || possiblePalindromeSentence.isEmpty()){
            return new String[]{};
        }
        List<String> palindromes = new ArrayList<>();
        for(String word : getListOfUniqueWordsIn(possiblePalindromeSentence)){
            if(isPalindrome(word)){
                if(palindromes.isEmpty()){
                    palindromes.add(word);
                }else if(palindromes.getFirst().length() < word.length()){
                    palindromes.clear();
                    palindromes.add(word);
                } else if(palindromes.getFirst().length() == word.length()){
                    palindromes.add(word);
                }
            }
        }
        return palindromes.toArray(new String[0]);
    }
    

    private static String[] getListOfUniqueWordsIn(String sentence){
        String[] unFilteredSentence = sentence.replaceAll("[^a-zA-Z ]","").toLowerCase().split(" ");
        Set<String> remover = new LinkedHashSet<>(List.of(unFilteredSentence));
        return remover.toArray(new String[0]);
    }

    private static boolean isNull(String toBeChecked){
        return toBeChecked == null;
    }

}



