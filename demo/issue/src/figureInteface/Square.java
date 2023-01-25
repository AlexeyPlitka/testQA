package figureInteface;

import figureInteface.Figure;

import java.util.Scanner;

public class Square implements Figure {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int c;
    String name;
    public Square() {
        this.a = a;
        this.c = c;
        this.name = name;
    }

    public void name() {
        System.out.println(name);
    }

    public void area() {
            System.out.println("Введите длину стороны квадрата");
        if (a > 1) {
            int c = a * a;
            System.out.println("Площадь квадрата=" + c);
        } else if (a < 1) {
            System.out.println("Длинна сторон квадрата не может быть меньше 1");
        } else {
        }
    }

    public void perimeter() {
        if (a > 1) {
            int c = a * 4;
            System.out.println("Периметр квадрата=" + c);
        } else if (a < 1) {
            System.out.println("Длинна сторон квадрата не может быть меньше 1");
        } else {
        }
            scanner.close();
    }
}