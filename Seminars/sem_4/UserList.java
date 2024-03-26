/*
Задание №1
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на
позицию num.
3. Если введено print~num, выводит строку из позиции num в связном
списке и удаляет её из списка.
*/
package sem_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UserList {
    public static void main(String[] args) {
        List<String> listUser = new LinkedList<>();
        Scanner scanner = new Scanner(System.in, "ibm866");
        while (true) {
            System.out.println("Введите строку вида text~num для добавления в список");
            System.out.println("print~num для вывода и удаления строки");
            System.out.println("Для выхода введите q");
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            String[] inputSplit = input.split("~");
            String text = inputSplit[0];
            int num = Integer.parseInt(inputSplit[1]);
            if (text.equals("print")) {
                if (num >= 0 && num < listUser.size()) {
                    System.out.println(listUser.get(num));
                    listUser.remove(num);
                } else {
                    System.out.println("Некорректный индекс");
                }
                System.out.println(listUser);
            } else {
                if (num >= 0 && num <= listUser.size()) {
                    listUser.add(num, text);
                } else {
                    System.out.println("Некорректный индекс");
                }
                System.out.println(listUser);
            }
        }
        scanner.close();

    }
}