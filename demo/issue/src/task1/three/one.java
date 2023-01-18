//Написать программу, которая увеличивает вам зарплату каждый месяц на $1000,используя циклы while/ do
package task1.three;

public class one {
    public static void main(String[] args) {
        int salary = 0;
        do {
            System.out.println("Зарпалата за" + "=" + salary + "$");
            salary += 1000;
        }
        while(salary <= 12000);
    }
}
