package autoSchool.stringExample;

public class Main {
    public static void main(String[] args) {
        printWords(splitString("test testq testwo"));
        System.out.println(maxLenght(splitString("testooooooo test testt")));
    }

    public static String[] splitString(String str) {
        return str.split(" ");
    }

    public static void printWords(String[] words) {

        for (int i = 0; i < 2; i++) {
            String word = words[i];
            int length = word.length();
            System.out.println(word);
            System.out.println(length);
        }
    }

    public static int maxLenght(String[] words) {
        int max = 0;
        for (String word : words) {
            int length = word.length();
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}
