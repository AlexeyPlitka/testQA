//Написать программу, которая увеличивает вам зарплату каждый месяц на $1000,используя циклы while
package task1.three;

public class three {
    public static void main(String[] args) {
        int salary = 0;
        while(salary <= 12000){
            System.out.println("Зарпалата за"+"="+salary+"$");
            salary+=1000;
    }
        System.out.println("end");
    }
}
