package com.csg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountWords {

    public static void main(String[] args) throws IOException{
        String filename="src/main/resources/input_words.txt";

        int count = countWordsStartingWithM(filename);
        System.out.println("No.of words staring with 'M' or 'm' : " +count);

    }



    private static int countWordsStartingWithM(String filename) throws IOException{
        List<String> words = readWordsFromFile(filename);
        List<String> wordsStartingWithM = words.stream()
                .filter(word -> word.startsWith("M") || word.startsWith("m"))
                .collect(Collectors.toList());
        System.out.println("Words staring with 'M' or 'm': ");
        wordsStartingWithM.forEach(word -> System.out.println(word));
        long count = wordsStartingWithM.size();

        return (int) count;
    }

    private static List<String> readWordsFromFile(String filename) throws IOException{
        List<String> words = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get(filename));
        for(String line: lines){
            String[] splitWords = line.split("\\s+");
            for(String word: splitWords){
                words.add(word);
            }
        }
        return words;
    }
}
