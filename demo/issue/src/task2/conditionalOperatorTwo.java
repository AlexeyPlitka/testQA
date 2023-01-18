/*Необходимо написать программу,где бы пользователю предлагалось ввести число 101. Если пользователь ввёл число 101,
программа должна вывести сообщение:"Вы ввели число 101". Если пользователь ввёл другое число,
программа должна вывести такое сообщение:"Вы ввели число не равное 101"*/
package task2;

import java.util.Scanner;
public class conditionalOperatorTwo {
    public static void main(String[] args) {
        System.out.println("Введите число 101");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 101) {
                System.out.println("Вы ввели число " + a);
            } else if (a!= 101) {
                    System.out.println("Вы ввели число не равное "+a);
                }else{
            scanner.close();
        }
    }
}