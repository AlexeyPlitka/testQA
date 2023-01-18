//Написать программу,которая вам уменьшает зп с $10000 до $0 каждый месяц используя цикл while
package task1.four;

public class three {
    public static void main(String[] args) {
    int salary = 12000;
        while(salary > 0){
        System.out.println("Зарпалата="+salary+"$");
            salary = salary - 1000;
    }
        System.out.println("0");
    }
}

