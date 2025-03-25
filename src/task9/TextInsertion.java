package task9;

public class TextInsertion {
    public static String insertSubstring(String text, int k, String substring) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (k < word.length()) {
                result.append(word.substring(0, k))
                        .append(substring)
                        .append(word.substring(k));
            } else {
                result.append(word);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String text = "Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) и ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является то, что его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";
        String modifiedText = insertSubstring(text, 3, "_");
        System.out.println(modifiedText);
    }
}
