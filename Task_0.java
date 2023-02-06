
/**
 * Принимает от пользователя и “запоминает” строки.
 * Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
 * Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
package HomeWork_4;

import java.util.ArrayDeque;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        while (true) {
            String text = inputText();
            if (text.equalsIgnoreCase("print")) {
//                for (int i = list.size() - 1; i >= 0; i--) {
//                    System.out.println(list.get(i));
//                }
                for (String s : arrayDeque) {
                    System.out.println(s);
                }
            } else if (text.equalsIgnoreCase("revert")) {
//                list.remove(list.size() - 1);
                arrayDeque.removeFirst();
            } else if (text.equalsIgnoreCase("exit")) {
                break;
            } else {
//                list.add(text);
                arrayDeque.addFirst(text);
            }
        }
    }

    private static String inputText() {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите запрос: ");
        try {
            text = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }
}
