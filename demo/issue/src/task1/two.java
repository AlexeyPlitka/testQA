/*Объявить строку с вашим полным именем и вывести на экран
результат работы всех стандартных методов работы со строками.*/
package task1;

public class two {
    public static void main(String[] args) {
        String name = "Алексей";
        String nameEng = "Alexey";

    System.out.println(name.replace('А', 'М'));
    System.out.println("Алексей - " + name.length() + " букв");
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name.equals(nameEng));
    System.out.println(name.compareTo(nameEng));
    }
}
/*class Min {
public static void main(String[] args) {
        String name2 = "Алексей (%D)";
        System.out.println(String.format(name2, "Зайцев"));
    }
}*/