// // 3.** Дана json строка (можно сохранить в файл и читать из файла)
// // [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"
// // Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// // Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент
// // [фамилия] получил [оценка] по предмету [предмет].
// // Пример вывода:
// // Студент Иванов получил 5 по предмету Математика.
// // Студент Петрова получил 4 по предмету Информатика.
// // Студент Краснов получил 5 по предмету Физика.


// package HW.hw_2;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;

// public class JsonToStringbuilder {
//     public static String getLineOffile(String fileName) {
//         String strOffile = null;
//         try {
//             File file = new File(fileName);
//             FileReader fr = new FileReader(file);
//             BufferedReader reader = new BufferedReader(fr);
//             strOffile = reader.readLine();

//             reader.close();
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         return strOffile;
//     }

//     private static String[][] jsnparsetoarray(String jsnstr) {
//         String line = jsnstr.substring(1, jsnstr.length() - 1);

//         String[] jsnarray = line.split(", ");

//         String[][] jsnarrayofBase = new String[jsnarray.length][3];
//         for (int i = 0; i < jsnarray.length; i++) {
//             line = jsnarray[i].substring(1, jsnarray[i].length() - 1);
//             for (int j = 0; j < 3; j++) {
//                 String[] minJsnarray = line.split(",");
//                 String[] microJsnarray = minJsnarray[j].split(":");
//                 jsnarrayofBase[i][j] = microJsnarray[1].substring(1, microJsnarray[1].length() - 1);

//             }
//         }
//         return jsnarrayofBase;
//     }

//     private static String[] gluing_strings(String[][] arraystr) {
//         String[] gluing_str = new String[arraystr.length];
//         StringBuilder Newstr = new StringBuilder();
//         for (int i = 0; i < arraystr.length; i++) {
//             Newstr.append("Студент ");
//             Newstr.append(arraystr[i][0]);
//             Newstr.append(" получил  ");
//             Newstr.append(arraystr[i][1]);
//             Newstr.append(" по предмету ");
//             Newstr.append(arraystr[i][2]);
//             gluing_str[i] = Newstr.toString();
//             Newstr.delete(0, Newstr.length());
//         }
//         return gluing_str;
//     }

//     public static void main(String[] args) {
//         String strjsn_offile = getLineOffile("text2.jsn");
//         System.out.println(strjsn_offile);
//         String[] array = gluing_strings(jsnparsetoarray(strjsn_offile));
//         for (int i = 0; i < array.length; i++)
//             System.out.println(array[i]);
//     }
// }

// // public class JsonToStringbuilder{
// //     public static void main(String[] args) throws IOException {

// //         // to read from the file
// //         FileInputStream inFile = new FileInputStream("Task2_3.txt");
// //         byte[] string = new byte[inFile.available()];
// //         inFile.read(string);
// //         String newText = new String(string);
// //         inFile.close();
// //         String str = newText.replace("{", "").replace("}", "").replace("\"", "");
// //         String[] str2 = str.split(", ");
// //         System.out.println(Arrays.toString(str2));

// //         Map<String, String> dictionary = new HashMap<String, String>();

// //         for (String item : str2) {
// //             String[] strNew = item.split(", ");
// //             for (String item2 : strNew) {
// //                 String[] strNew2 = item2.split(",");
// //                 for (String item3 : strNew2) {
// //                     String[] strNew3 = item3.split(":");
// //                     dictionary.put(strNew3[0], strNew3[1]);
// //                 }
// //                 StringBuilder sb = new StringBuilder();
// //                 sb.append("Студент " + dictionary.get("фамилия") + " получил " + dictionary.get("оценка")
// //                         + " по предмету " + dictionary.get("предмет"));
// //                 System.out.println(sb);
// //             }
// //         }
// //     }
// // }





///// 2

// import java.awt.*;
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;

// public class JsonToStringbuilder {
//    public class Task3 {
//        private static final List<String> strings = List.of
//                ("Анна=4", "Елена=5", "Марина=6", "Полина=?", "Владимир=?", "Константин=?", "Иван=4");
// //для проверки, заменить какое-то из значений на null

//        public static void main(String[] args) {
//            String path = "task3.txt";
//            Object strings;
//         writeToFile(path, strings);
//            System.out.println(readFromFile(path));
//            rewrite(path);
//        }

//        private static void writeToFile(String path, Object strings) {
//     }

//     public static void writeToFile(String path, List<String> args) {
//            FileWriter fw = null;
//            try {
//                fw = new FileWriter(path);
//                for (String arg : args) {
//                    fw.write(arg + '\n');
//                }
//                fw.flush();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            } finally {
//                try {
//                    fw.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

//        public static Map<String, Integer> readFromFile(String path) {
//            Map<String, Integer> map = new HashMap<>();
//            BufferedReader br = null;
//            String line;
//            try {
//                br =  new BufferedReader(new FileReader(path));
//                while ((line = br.readLine()) != null) {
// // Map.Entry<String, Integer> entry = getEntry(line);
// // map.put(entry.getKey(), entry.getValue());

//                    String[] strings = line.split("=");
//                    String key = strings[0];
//                    int value;
//                    if (strings[1].equals("?")) {
//                        value = key.length();
//                    } else {
//                        try {
//                            value = Integer.parseInt(strings[1]);
//                        } catch (NumberFormatException e) {
//                            throw new NumberFormatException("Non-valid data");
//                        }
//                    }

//                    map.put(key, value);
//                }
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            } finally {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            return map;
//        }

//        public static void rewrite(String path) {
//            Map<String, Integer> map = readFromFile(path);
//            List<String> data = new ArrayList<>();

//            for (Map.Entry<String, Integer> entry : map.entrySet()) {
//                data.add(entry.toString());
//            }

//            writeToFile(path, data);
//        }

//        public static Map.Entry<String, Integer> getEntry(String string) {
//            String[] data = string.split("=");
//            String key = data[0];
//            Integer value;

//            if (isNumber(data[1])) {
//                value = Integer.parseInt(data[1]);
//            } else if (data[1].equals("?")) {
//                value = key.length();
//            } else {
//                throw new NumberFormatException("Non-valid data");
//            }

//            return new Map.Entry<>() {
//                @Override
//                public String getKey() {
//                    return key;
//                }

//                @Override
//                public Integer getValue() {
//                    return value;
//                }

//                @Override
//                public Integer setValue(Integer value) {
//                    return null;
//                }
//            };
//        }

//        private static boolean isNumber(String str) {
//            try {
//                Double.parseDouble(str);
//                return true;
//            } catch (NumberFormatException e) {
//                return false;
//            }
//        }
//    }
// }