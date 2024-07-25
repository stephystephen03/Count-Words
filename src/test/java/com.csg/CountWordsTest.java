package com.csg;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CountWordsTest {

    @Test
    public void testCountWordsStartingWithM() throws IOException {
        String filename = "src/main/resources/input_words.txt";
        int count = CountWords.countWordsStartingWithM(filename);
        assertEquals(3, count);
    }

    @Test
    public void testGetWordsLongerThanFiveChars() throws IOException {
        String filename = "src/main/resources/input_words.txt";
        List<String> longWords = CountWords.getWordsLongerThanFiveChars(filename);
        assertTrue(longWords.size() > 0);
        assertTrue(longWords.contains("Mountains"));

    }
}
