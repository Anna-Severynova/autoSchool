package strings;

public class Strings {
    String middle = "Hello, World. Hello, Java!";
    public static void main(String[] args) {
        String str = "Hello, World. Hello, Java!";
        String str1 = new String (new char[]{"Hello", })

        str = str.toLowerCase();

        int length = str.length();

        String substring = str.substring(4, str.length()-12);

        System.out.println(length);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
        System.out.println(substring);

    }
}
