/*
Задание №3
Написать метод, который переведет число
из римского формата записи в арабский.
Например, MMXXII = 2022
'I', 1
'V', 5
'X', 10
'L', 50
'C', 100
'D', 500
'M', 1000
*/
package sem_5;

import java.util.HashMap;
import java.util.Map;

public class NumberFromRomanNotationToArabic {
    public static void main(String[] args) {
        System.out.println(romanToArabic ("MMXXIV"));
    }

    public static Map<Character, Integer> getRomanArabicMap() {

        Map<Character, Integer> romanArabicMap = new HashMap<>();
        romanArabicMap.put('I', 1);
        romanArabicMap.put('V', 5);
        romanArabicMap.put('X', 10);
        romanArabicMap.put('L', 50);
        romanArabicMap.put('C', 100);
        romanArabicMap.put('D', 500);
        romanArabicMap.put('M', 1000);

        return romanArabicMap;
    }

    public static int romanToArabic(String romanNum) {
        Map<Character, Integer> romanArabicMap = getRomanArabicMap();
        int result = 0;
        int prevValue = 0;
        for (int i = romanNum.length() - 1; i >= 0; i--) {
            int currentValue = romanArabicMap.get(romanNum.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;

            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}