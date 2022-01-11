package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EndsWithTest {

    @Test
    public void whenEndsWithPrefixThenTrue() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[]{'l', 'o'};
        boolean rsl = EndsWith.endsWith(word, post);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenNotEndsWithPrefixThenTrue() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o', '!'};
        char[] post = new char[]{'l', 'o'};
        boolean rsl = EndsWith.endsWith(word, post);
        Assert.assertFalse(rsl);
    }
}