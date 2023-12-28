
public class Main {
    public static final int YEAR_JAVA_BIRTH = 1996;

    public static void main(String[] args) {

//        System.out.println("Year\tPrice\tDescription");
//        System.out.println("Hello\b\b\b");
//        System.out.println("Hi Team!\nI am going to vacation\nCheers");
//        System.out.println("Hello\f");
//        System.out.println("Hello it\'s"); // => it's
//        System.out.println("She: said : \"... \" ");
//        System.out.println("Path to c:\\user\\disc"); // => c: \ user\disc
//
//
//        String s = "Some value";
//        s = "Another value";
//        s += "!";
//        System.out.println(s);
//        String value = "Some value";

//        for (int i = 0; i < 1000; i++) {
//            String someValue = "Value";
//        }
//        System.out.println("================");
//        String hello = "Hello";
//        String newHello = new String("Hello");
//        System.out.println(hello == "Hello"); // == - порівнюю за посиланням
//        System.out.println(newHello == "Hello");
//        newHello.intern();
//        System.out.println(newHello == "Hello");


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