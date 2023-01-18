/*Необходимо написать программу,где бы пользователю предлагалось ввести число на выбор: 7, 3 или 2, а программа
должна сказать,какое число ввёл пользователь: 7, 3, или 2*/
package task3;

import java.util.Scanner;
public class switchStatementOne {
    public static void main(String[] args) {
        System.out.println("Введите число 7, 3 или 2");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
                case 7:
                    System.out.print("Вы ввели число " + a);
                    break;
                case 3:
                    System.out.print("Вы ввели число " + a);
                    break;
                case 2:
                    System.out.print("Вы ввели число " + a);
                    break;
            default:
                System.out.print("Введите 7,3,2");
                    break;}
                scanner.close();
        }
    }
