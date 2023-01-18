/*Необходимо написать программу,где бы пользователю предлагалось ввести число 202. Если пользователь ввёл число 202,
программа должна вывести сообщение:"Вы ввели число 202". Если пользователь ввёл другое число,программа должна вывести
такое сообщение:"Вы ввели число не равное 202"*/
package task3;

import java.util.Scanner;
public class switchStatementTwo {
    public static void main(String[] args) {
        System.out.println("Введите число 202");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a){
                case 202:
                    System.out.println("Вы ввели число "+a);
                break;
        default:
                    System.out.println("Вы ввели число не равное 202");
                break;}
        scanner.close();
        }
    }
