package HomeWork_6;

import model.Laptop;

        import java.util.HashSet;
        import java.util.Iterator;
        import java.util.Scanner;
        import java.util.Set;

public class Main {
    public static int ram = 0;
    public static int hddSize = 0;
    public static String systemName = "none";
    public static String color = "none";
    public static Set<Laptop> notebooks;


    public static void main(String[] args) {

        notebooks = createRandomNotebooks();
        getFiltersParams();
        showFilteredResultBy(ram, hddSize, systemName, color);
        System.out.println("Selected filters: [RAM >= " + ram + "], [HDD >= " + hddSize + "], [OS: " + systemName + "], [COLOR: " + color + "]");
    }

    private static void showFilteredResultBy(int ram, int hddSize, String systemName, String color) {
        Iterator<Laptop> s = notebooks.iterator();
        System.out.println("Filtered laptops:");
        while (s.hasNext()) {
            Laptop tempNoteBook = s.next();

            if (tempNoteBook.getModelRAM() >= ram) {
                if (tempNoteBook.getModelHDDSize() >= hddSize) {
                    if (tempNoteBook.getModelOSName().equals(systemName) || systemName.equals("none")) {
                        if (tempNoteBook.getModelColor().equals(color) || color.equals("none")) {
                            System.out.println("id: " + tempNoteBook.getId() + ", model: " + tempNoteBook.getModelName() + ", RAM: " + tempNoteBook.getModelRAM() + ", HDD: " + tempNoteBook.getModelHDDSize() + ", OS: " + tempNoteBook.getModelOSName() + ", COLOR: " + tempNoteBook.getModelColor());
                        }
                    }
                }
            }
        }
    }

    private static void getFiltersParams() {
        Scanner scanner = new Scanner(System.in);
        boolean asking = true;
        int numberOfParameter;
        System.out.println("--------------------------------------------------------------------------");
        while (asking) {
            System.out.print("Enter the number of the selection criteria (1-4). To apply the filter, enter 0: ");
            if (scanner.hasNextInt()) {
                numberOfParameter = scanner.nextInt();
                if (numberOfParameter == 0) {
                    asking = false;
                }
                if (numberOfParameter == 1) {
                    System.out.print("RAM >= ");
                    ram = scanner.nextInt();
                } else if (numberOfParameter == 2) {
                    System.out.print("HDD >= ");
                    hddSize = scanner.nextInt();
                } else if (numberOfParameter == 3) {
                    System.out.print("OS(with a capital letter): ");
                    Scanner scannerWord = new Scanner(System.in);
                    systemName = scannerWord.nextLine();
                } else if (numberOfParameter == 4) {
                    Scanner scannerWord = new Scanner(System.in);
                    System.out.print("COLOR: .. ");
                    color = scannerWord.nextLine();
                } else {
                    String wrong = scanner.nextLine();
                    System.out.println(wrong + "Input accepted.");
                    System.out.println("--------------------------------------------------------------------------");
                }
            } else {
                System.out.println("Mistake!You only need to enter the specified numbers, the selection will not be applied!");
                asking = false;
                System.out.println("!!!Search error!!!");
            }
        }
    }

    private static Set<Laptop> createRandomNotebooks() {
        Set<Laptop> temp = new HashSet<>();
        temp.add(new Laptop(1, "Lenovo M123", 6, 512, "Windows 7", "green"));
        temp.add(new Laptop(2, "HP PV245655", 8, 1000, "Windows 10", "red"));
        temp.add(new Laptop(4, "Samsung P89", 16, 512, "Windows 11", "yellow"));
        temp.add(new Laptop(5, "APPLE fgh78", 6, 256, "Windows XP", "silver"));
        temp.add(new Laptop(6, "Xiaomi yu79", 32, 512, "Windows 2000", "green"));
        temp.add(new Laptop(7, "Xiaomi p83", 16, 128, "Linux", "gold"));
        temp.add(new Laptop(8, "Lenovo M597", 32, 1024, "Windows 11", "red"));
        temp.add(new Laptop(9, "HP PV326749", 8, 2048, "Windows 8", "green"));
        temp.add(new Laptop(10, "HUAWEI RX74", 8, 2000, "Windows 10", "white"));
        temp.add(new Laptop(11, "ACER RED847958", 32, 3072, "Windows 11", "black"));
        temp.add(new Laptop(12, "APPLE sup14", 6, 512, "Mac Os", "silver"));
        temp.add(new Laptop(13, "Xiaomi ml10", 8, 256, "Linux", "gold"));
        return temp;
    }
}