/*
Задание №1
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
некоторую букву во втором слове, при этом
1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
порядка следования. (Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code)

Пример 1:
Input: s = "foo", t = "bar"
Output: false

Пример 2:
Input: s = "paper", t = "title"
Output: true
*/
package sem_5;

import java.util.HashMap;
import java.util.Map;
// import java.util.Scanner;

public class AreStringsIsomorphic {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in, "ibm866");
        String s = scanner.nextLine();
        String t = scanner.nextLine();*/

        System.out.println(isIsomorphic("add", "egg") ? "Да":"Нет");
        System.out.println(isIsomorphic("foo", "bar") ? "Да":"Нет");
        System.out.println(isIsomorphic("paper", "title") ? "Да":"Нет");
    }

    public static boolean isIsomorphic(String s, String t){

        if (s.length()!=t.length()) return  false;

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i<s.length(); i++){
           char c1 =  s.charAt(i);
           char c2 = t.charAt(i);

           if (map.containsKey(c1)) {
               if (map.get(c1) != c2) {
                   return false;
               }
           }
           else
               map.put(c1, c2);
        }
        return true;
    }
}