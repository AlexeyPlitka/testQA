//Написать программу,которая вам уменьшает зп с $10000 до $0 каждый месяц используя цикл for
package task1.four;

public class two {
    public static void main(String[] args) {
        for (int salary = 12000; salary >= 0; salary = salary - 1000)
            System.out.println("Зарплата= " + salary + "$");
    }
}
