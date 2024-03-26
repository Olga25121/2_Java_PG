// 1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Результат:
// select * from students where name='Ivanov' and country='Russia' and city='Moscow'

package HW.hw_2;
class Answer {
    public StringBuilder answer(String QUERY, String PARAMS){
        String newstr = PARAMS.replace('{',' ').replace('}', ' ');
        String[] str  = newstr.split(",");
        StringBuilder sb = new StringBuilder(QUERY);

        for (int i = 0; i < str.length; i++){
            String[] elem = str[i].replace('"', ' ').split(":");
            if(!"null".equals(elem[1].trim())){
                sb.append(elem[0].trim()).append("=").append("'").append(elem[1].trim()).append("'");
                if (i < str.length - 2) sb.append(" and ");
            }
        }
        return sb;
    }
}


public class SqlQuery{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}

    // 2
