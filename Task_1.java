/**
 * 1. Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */


package HomeWork_4;

import java.util.LinkedList;

public class Task_1 {

    public static void main(String[] args) {

        int[] listMas = {4,3,2,1,0,-1,-2,-3,-4};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }

        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }
        System.out.println("Перевернутый список: " + linkList);


    }
}
