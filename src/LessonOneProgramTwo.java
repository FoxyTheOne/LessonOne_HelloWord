import java.util.Scanner;

public class LessonOneProgramTwo {
    /**
    * 4. Написать программу для вывода сообщения "Hello <любое введенное вами имя>"
    * Имя для привествия необходимо вводить с консоли.
    * Для получения информации с консоли следует использовать класс Scanner
    * Scanner sc = new Scanner(System.in);
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // импортируем java.util.Scanner
        System.out.print("Tell me your name: "); // print - без перевода на новую строку

        String name = sc.nextLine(); // name - переменная, в которую мы записали строку, введенную с консоли
        // для ввода чисел использовать int number = sc.nextInt();

        System.out.println("Hello " + name);
    }
}
