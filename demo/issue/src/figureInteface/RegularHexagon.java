package figureInteface;

import figureInteface.Figure;

import java.util.Scanner;

public class RegularHexagon implements Figure {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    double c;
    String name;

    public RegularHexagon() {
        this.a = a;
        this.c = c;
        this.name = name;
    }
//int a, double c, String name
    public void name() {
        System.out.println(name);
    }

    public void area() {
            System.out.println("Введите длину стороны шестиугольника");
        if (a > 1) {
            double c = (3*(Math.sqrt(3))*(a*a)/2);
            System.out.println("Площадь шестиугольника=" + c);
        } else if (1 > a) {
            System.out.println("Длинна сторон шестиугольника не может быть меньше 1");
        } else {
        }
    }

    public void perimeter() {
        System.out.println("Введите длину стороны гексагона");
        if (a > 1) {
            double c = a * 6;
            System.out.println("Периметр гексагона=" + c);
        } else if (a < 1) {
            System.out.println("Длинна сторон квадрата не может быть меньше 1");
        } else {
        }
            scanner.close();
    }
}