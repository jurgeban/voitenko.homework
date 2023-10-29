package de.telran.homework_23_10;

public class Task2 {
    public static void main(String[] args) {
        String str = "{\"model\", \"V-60\", \"country\", \"Germany\", \"city\", \"Berlin\", \"year\", null, \"active\", true}";
//  String str = "{\"id\", 1, \"country\", null, \"city\", \"Helsinki\", \"year\", null}";
        System.out.println("Ввод: " + str);
        str = str.substring(1, str.length()-1);
        str = str.replace("\"","").replace(" true", "true");
        String[] arr = str.split(",");
        StringBuilder builder = new StringBuilder("SELECT * FROM users WHERE ");
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length-1 && !arr[i].contains("null") && !arr[i + 1].contains("null")) {
                if(i % 2 == 0) {
                    builder.append(arr[i]).append(" = ");
                } else {builder.append("'" + arr[i].substring(1) + "'").append(" AND");}
            }
        }
        if (builder.substring(builder.length()-4).equals(" AND")) {
            builder.delete(builder.length() - 4,  builder.length());
        }
        if (!arr[arr.length-1].contains("null")) {builder.append(arr[arr.length-1]);}
        System.out.println("Вывод: " + builder.toString() + ';');
    }
}
