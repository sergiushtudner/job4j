package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
            for (int index = 0; index < post.length; index++) {
                if (post[index] != word[index + word.length - post.length]){
                    result = false;
                    return result;
                }
        }
        return result;
    }
}
