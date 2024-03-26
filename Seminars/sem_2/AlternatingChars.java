// Задание №1
// 📌 Дано четное число N (>0) и символы c1 и c2.
// 📌 Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.

// c1c2c1…c2 (всего N символов)

// String / Stringbuilding

package sem_2;

public class AlternatingChars {
    public static void main(String[] args) { // вводим исходные данные
        int n = 100_000;
        char c1 = 'a';
        char c2 = 'b';

        // System.out.println(alternatingCharsString(n, c1, c2));
        // System.out.println(alternatingCharsSb(n, c1, c2));

        // вывод результата по времени для сравнения 2х методов String and Stringbuilder
        long start = System.currentTimeMillis();
        alternatingCharsString(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start); // 541 милисекунды

        start = System.currentTimeMillis();
        alternatingCharsSb(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start); // 3
    }

    public static String alternatingCharsString(int n, char c1, char c2) {
        String str = ""; // переменная для результата
        for (int i = 0; i < n / 2; i++) { // делим пополам, т.к. в каждую итерацию добавляем по паре символов с1, с2
            str = str + c1 + c2;
            // str += Character.toString(c1) + Character.toString(c2); //либо преобразуем в
            // строку
        }
        return str;
    }

    public static String alternatingCharsSb(int n, char c1, char c2) { // пример метода StringBuilder
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n / 2; i++) { // делим пополам, т.к. в каждую итерацию добавляем по паре символов с1, с2
            sb.append(c1).append(c2);
            // str += Character.toString(c1) + Character.toString(c2); //либо преобразуем в
            // строку
        }
        return sb.toString();
    }

}
