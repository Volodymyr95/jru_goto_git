
public class Main {
    public static final int YEAR_JAVA_BIRTH = 1996;

    public static void main(String[] args) {

        System.out.println("Hello world!".length());
        System.out.println("Hello world!".length());
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("abcd".charAt(0));
        System.out.println("adbcd".toCharArray());
        System.out.println("Hello".equals("hello"));
        System.out.println("HelLo".equalsIgnoreCase("hello"));
        System.out.println("Hi my name is....".startsWith("Hi my"));
        System.out.println("Hello world!".endsWith(" ld!"));
        System.out.println("Hello world!".indexOf("llo", 2));
        System.out.println("Hello Hello!".lastIndexOf("llo"));
        System.out.println("myMail@mail.com".matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"));
        System.out.println("Hello world!".substring(5));
        System.out.println("Hello!\n".repeat(3));
        System.out.println("it's".replace("'", "\'"));
        System.out.println("  This is text  ".trim());


    }
}