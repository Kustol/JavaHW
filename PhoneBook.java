/**
 *Реализуйте структуру телефонной книги с помощью HashMap
 *учитывая, что 1 человек может иметь несколько телефонов.
 */

package HomeWork_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneBook {

    public static void main(String[] args) {
        phoneBook();
    }

    private static void phoneBook() {
        Directory book = new Directory();

        book.add("Смолин", "8-902-111-32-19");
        book.add("Вяткин", "8-960-124-56-00");
        book.add("Иванов", "8-952-125-08-40");
        book.add("Смолин", "8-911-516-69-87");
        book.add("Мичурин", "8-914-600-23-91");
        book.add("Иванов", "8-963-265-65-76");
        book.add("Мичурин", "8-964-529-86-32");
        book.add("Смолин", "8-326-382-69-94");
        book.add("Вяткин", "8-968-362-13-27");

        System.out.println("Смолин: " + book.get("Смолин"));
        System.out.println("Вяткин: " + book.get("Вяткин"));
        System.out.println("Иванов: " + book.get("Иванов"));
        System.out.println("Мичурин: " + book.get("Мичурин"));
    }
}

class Directory {
    private Map<String, List<String>> directoryHm = new HashMap<>();
    private List<String> phoneNumberList;

    public void add(String surname, String phoneNumber) {
        if (directoryHm.containsKey(surname)) {
            phoneNumberList = directoryHm.get(surname);
            phoneNumberList.add(phoneNumber);
            directoryHm.put(surname, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            directoryHm.put(surname, phoneNumberList);
        }
    }

    public List<String> get(String surname) {
        return directoryHm.get(surname);
    }

}