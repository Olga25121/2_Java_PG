/*
Задание №2
Написать программу,
определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
*/
package sem_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CorrectPlacementOfBrackets {
    public static void main(String[] args) {

        String[] strs = {"a+(d*3)","[a+(1*3)","[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}"};

        for (String str : strs) {
            System.out.println(str + " -> " + isBracketsRightPosition(str));
        }
    }

    public static Map<Character, Character> createDictionaryOfBrackets(){
        Map<Character, Character> dictMap = new HashMap<>();

        dictMap.put(')', '(');
        dictMap.put('}', '{');
        dictMap.put(']', '[');
        dictMap.put('>', '<');

        return dictMap;
    }

    public static boolean isBracketsRightPosition(String str){

        Map<Character, Character> dictMap = createDictionaryOfBrackets();

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if(dictMap.containsValue(c)){
                stack.push(c);
            }
            else if(dictMap.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != dictMap.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}