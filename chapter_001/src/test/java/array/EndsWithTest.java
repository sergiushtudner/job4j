package array;

import org.junit.Test;
import ru.job4j.array.EndsWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse1() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
    @Test
    public void whenEndWithPrefixThenTrue2() {
        char[] word = {'M', 'o', 'n', 'e', 'y', 'y'};
        char[] post = {'e', 'y', 'y'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }
    @Test
    public void whenNotEndWithPrefixThenFalse2() {
        char[] word = {'M', 'o', 'n', 'e', 'y', 'y'};
        char[] post = {'e', 'i', 'y'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}