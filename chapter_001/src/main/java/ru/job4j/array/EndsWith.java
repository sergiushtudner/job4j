package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
            for (int index = 0; index < post.length; index++) {
                if (word[index + word.length - post.length] == post[index]){
                }
            else
                {result = false;}
        }
        return result;
    }
}
