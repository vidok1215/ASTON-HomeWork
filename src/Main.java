import Lesson7.Bowl;
import Lesson7.Cat;
import Lesson7.geometricShapes.Circle;
import Lesson7.geometricShapes.Rectangle;
import Lesson7.geometricShapes.Triangle;


public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        for (int i = 0; i < 3; i++) {
            cats[i] = new Cat();
        }

        Bowl bowl = new Bowl(20);

        for (Cat cat : cats) {
            if (cat.eat(bowl.getFoodAmount())) {
                System.out.println("Кот наелся.");
            } else {
                System.out.println("Недостаточно еды в миске для кота.");
            }
        }

        for (Cat cat : cats) {
            System.out.println("Сытость кота: " + cat.fullness);
        }

        bowl.addFood(10);
        System.out.println("В миску добавлена еда. Теперь там " + bowl.getFoodAmount() + " еды.");



        //Тригонометрия

        Circle circle = new Circle(5, "Red", "Black");
        Rectangle rectangle = new Rectangle(4, 6, "Blue", "Green");
        Triangle triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

        circle.displayInfo();
        rectangle.displayInfo();
        triangle.displayInfo();
    }
}