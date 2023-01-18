//Написать программу,которая вам уменьшает зп с $10000 до $0 каждый месяц используя цикл do while
package task1.four;

public class one {
    public static void main(String[] args) {
        int salary = 12000;
        do {
            System.out.println("Зарпалата=" + salary + "$");
            salary = salary - 1000;
            }
        while (salary > 0);
        System.out.println("Зарплата=0");
    }
}