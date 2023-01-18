/*Необходимо написать программу,где бы пользователю предлагалось ввести число  303. Если пользователь ввёл число 303,
программа должна вывести сообщение:"Вы ввели число 303". Если пользователь ввёл другое число,программа
вообще ничего не должна делать*/
package task3;

import java.util.Scanner;
public class switchStatementThree {
    public static void main(String[] args) {
        System.out.println("Введите число 303");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 303:
                System.out.println("Вы ввели число "+a);
                break;
            default:

                break;}
        scanner.close();
        }
    }