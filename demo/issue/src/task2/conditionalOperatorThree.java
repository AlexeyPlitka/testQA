/*Необходимо написать программу,где бы пользователю предлагалось ввести число 202. Если пользователь ввёл число 202,
программа должна вывести сообщение:"Вы ввели число 202". Если пользователь ввёл другое число,программа вообще ничего
не должна делать*/
package task2;

import java.util.Scanner;
public class conditionalOperatorThree {
    public static void main(String[] args) {
        System.out.println("Введите число 202");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 202) {
            System.out.println("Вы ввели число " + a);
        } else if (a!= 202) {
            System.out.println();
        }else{
            scanner.close();
        }
    }
}
