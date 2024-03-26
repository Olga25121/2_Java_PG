// Задание №0. 
// 📌 Настроить проект, вывести в консоль “Hello world!”.
// 📌 Вывести в консоль системные дату и время


// Переменные и методы с маленькой буквы без нижнего подчеркивания! Классы(ссылочные типы данных), String  - с большой, CamelCase\Pascal
package sem_1;
import java.time.LocalDateTime;

public class HelloWorldDate {
    public static void main(String[] args) { // main - точка входа - удалять нельзя, main1,main2..вызываются из main
        System.out.println("Hello, World!");
        System.out.println(LocalDateTime.now());
        // System.out.printf(format: "%d", 45 );

        int[] array = new int[6];
        int[] array1 = { 1, 3, 5 };

        for (int index = 0; index < array.length; index++) {

        }
        // while (b) {

        // }
        for (int elem : array1) {
            // System.out.println(elem); //вывод в ряд
            System.out.print(elem + " "); //вывод в строчку

        }
    }
}






