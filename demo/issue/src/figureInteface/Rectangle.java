package figureInteface;

import figureInteface.Figure;

import java.util.Scanner;

public class Rectangle implements Figure {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c;
    String name;

    public Rectangle() {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }
//int a, int b, String name
    public void name() {
        System.out.println(name);
    }

    public void area() {
        System.out.println("Введите ширину и длину прямоугольника");
        if (a > 1 && b > 1 && a != b) {
            int c = a * b;
            System.out.println("Площадь прямоугольника=" + c);
        } else if (a <= 1 && b <= 0) {
            System.out.println("Длина a и b и ширина b и c не могут быть меньше 1");
        } else if (a == b) {
            System.out.println("Длина и ширина прямоугольника не могут быть равны");
        } else {
        }
    }
        public void perimeter() {
            if (a > 1 && b > 1 && a != b) {
                int c = (a * 2) + (b * 2);
                System.out.println("Периметр прямоугольника=" + c);
            } else if (a <= 1 && b <= 1) {
                System.out.println("Длина a и b и ширина b и c должны быть больше 1");
            } else if (a == b) {
                System.out.println("Длина и ширина прямоугольника не могут быть равны");
            } else {
            }
            scanner.close();
        }
    }

/*switch (c) {
        case a = b:
        System.out.println("Стороны a,с и b,d не могут быть равными");
        case a < 1:
        System.out.println("Стороны a,c и b,d должны быть больше 1");
        break;
default:
        c = (2 * a) + (2 * b);
        System.out.println("Площадь прямоугольника = " + c);
        break;
        }*/