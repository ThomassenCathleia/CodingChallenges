package codewars.kyu8;

public class StringTemplatesBugFixing5 {
    public static String buildString(String... args) {
        return String.format("I like %s!",String.join(", ",args));
    }
}
