package com.sparta.grr;

import java.util.List;

public class twoVowelList {
    static List<String> getTwoVowellist(List<String> names){
        return names.stream()
                .map(String::toUpperCase)
                .filter(name -> name.chars()
                        .filter(c -> c == 65 || c == 69 || c == 73 || c == 79 || c == 85)
                        .count() == 2)
                .toList();
    }


    public static void main(String[] args) {
        List<String> words = List.of(
                "barry", "Ian", "hello", "world", "education", "java", "programming",
                "umbrella", "ant", "environment", "stream", "functional", "predicate",
                "Lambda", "expressions", "filter", "collect", "string", "characters",
                "vowels", "count", "method", "example", "code"
        );
        System.out.println(getTwoVowellist(words));

    }
}
