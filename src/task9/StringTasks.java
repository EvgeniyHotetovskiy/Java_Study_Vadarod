package task9;

public class StringTasks {
    public static String processStrings(String str1, String str2) {
        if (str1.endsWith(str2)) {
            return str1.substring(0, str1.length() - str2.length());
        } else {
            return str1.toUpperCase();
        }
    }

    public static void main(String[] args) {
        String result1 = processStrings("Я люблю java", "java");
        System.out.println(result1);

        String result2 = processStrings("Привет, мир!", "java");
        System.out.println(result2);
    }
}
