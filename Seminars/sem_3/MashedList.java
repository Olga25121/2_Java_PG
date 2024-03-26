// Задание №3
// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package sem_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MashedList {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>(Arrays.asList("привет","!", "78", "мой", "телефон", "666", "6", "п", "звони"));
        getIterator(strs);
        System.out.println(strs);
    }

    private static void getIterator(ArrayList<String> strs) {
        Iterator<String> iterator = strs.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if(isNumber(element)){
                iterator.remove();
            }
        }
    }

    private static boolean isNumber(String element) {
        try {
            Integer.parseInt(element);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }
}
/*
From Marsel:
public class Sem3_3 {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>(Arrays.asList("hello", "world", "143", "!!!", "234", "P.S."));
        // deleteIntegerNums(aList);
        deleteIntegerNumsWithIterator(aList);
        System.out.println(aList);

    }

    public static void deleteIntegerNums(ArrayList<String> aList) {
        for (int i = 0; i < aList.size(); i++) {
            if (isInteger(aList.get(i))) {
                aList.remove(i);
                i--;
            }
        }
    }

    public static void deleteIntegerNumsWithIterator(ArrayList<String> aList) {
        Iterator<String> iterator = aList.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (isInteger(str)) {
                iterator.remove();
            }
        }
    }

    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
*/