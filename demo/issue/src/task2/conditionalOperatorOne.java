/*Необходимо написать программу,где бы пользователю предлагалось ввести число на выбор: 5, 4 или 1,
 а программа должна сказать,какое число ввёл пользователь: 5, 4, или 1.*/
package task2;

import java.util.Scanner;
public class conditionalOperatorOne {
    public static void main(String[] args) {
        System.out.println("Введите число 5,4 или 1");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 5 || a==4 || a==1) {
            System.out.println("Вы ввели число " + a);
        } else {
            scanner.close();
        }
    }
}
