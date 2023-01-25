package figureInteface;

import figureInteface.Rectangle;
import figureInteface.RegularHexagon;
import figureInteface.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите название фигуры:Квадрат,Прямоугольник или Шестиугольник");
        Scanner scanner4 = new Scanner(System.in);
        String i = scanner4.nextLine();

        switch(i) {
            case "Квадрат":
                Square square = new Square();
                square.name();
                square.area();
                square.perimeter();
                break;
            case "Прямоугольник":
                Rectangle rectangle = new Rectangle();
                rectangle.name();
                rectangle.area();
                rectangle.perimeter();
                break;
            case "Шестиугольник":
                RegularHexagon regularHexagon = new RegularHexagon();
                regularHexagon.name();
                regularHexagon.area();
                regularHexagon.perimeter();
                break;
            default:
                System.out.println("Вы ввели неправильное название фигуры");

            scanner4.close();
        }
    }
}
