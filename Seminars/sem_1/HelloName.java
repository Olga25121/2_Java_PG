// Задание №1
// Написать программу, которая запросит пользователя ввести  <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

package sem_1;
import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        System.out.println("Представьтесь, пожалуйста: ");
        Scanner scanner = new Scanner(System.in, "ibm866"); // кодировка для кириллицы
        String name = scanner.nextLine();
        System.out.println(name);     // Olga
        System.out.printf("Привет, %s!", name);
        // System.out.printf("Привет, " + name + "!"); // Привет, Olga!       
        scanner.close();
    }
    
}
