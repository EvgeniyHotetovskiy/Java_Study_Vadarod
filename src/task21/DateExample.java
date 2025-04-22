package task21;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        // 1. Текущая дата в формате "1 апреля 2023"
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d MMMM yyyy");
        String formattedDate1 = LocalDate.now().format(formatter1);
        System.out.println(formattedDate1);

        // 2. Текущая дата и время в формате "1 апреля 2023, 10:59:20 PM"
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a");
        String formattedDate2 = LocalDateTime.now().format(formatter2);
        System.out.println(formattedDate2);

        // 3. Преобразование строки в LocalDateTime (2023-03-19 : 10:12:24 AM)
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a");
        LocalDateTime dateTime3 = LocalDateTime.parse("2023-03-19 : 10:12:24 AM", formatter3);
        System.out.println(dateTime3);

        // 4. Преобразование строки в LocalDateTime (пн 20.03.23 г. время: 15:07:28)
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("E dd.MM.yy 'г. время:' HH:mm:ss");
        LocalDateTime dateTime4 = LocalDateTime.parse("пн 20.03.23 г. время: 15:07:28", formatter4);
        System.out.println(dateTime4);

        // 5. Текущая дата и время в формате "понедельник 20 марта 2023 время: 11.54.06 PM"
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy 'время:' hh.mm.ss a");
        String formattedDate5 = LocalDateTime.now().format(formatter5);
        System.out.println(formattedDate5);
    }
}
