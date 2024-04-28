package HW17;
import java.util.Scanner;
public abstract class UserAction {
    protected abstract void doAction();

    protected abstract String getName();

}

class CircleSquare extends UserAction {

    private final Scanner scanner;

    public CircleSquare(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    protected void doAction() {
        System.out.println("Введіть радіус круга");
        double radius = scanner.nextDouble();
        double square = Math.PI * Math.pow(radius,2);
        System.out.println("Площа круга дорівнює  = " + square);
    }

    @Override
    protected String getName() {
        return "Порахувати площу круга";
    }
}

class RectangleSquare extends UserAction {

    private final Scanner scanner;

    public RectangleSquare(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    protected void doAction() {
        System.out.println("Введіть довжину");
        int length = scanner.nextInt();
        System.out.println("Введіть ширину");
        int width = scanner.nextInt();
        int square = length * width;
        System.out.println("Площа прямокутника дорівнює = " + square);
    }

    @Override
    protected String getName() {
        return "Порахувати площу прямокутника";
    }
   
}
class TriangleSquare extends UserAction{

    private final Scanner scanner;

    public TriangleSquare(Scanner scanner){
        this.scanner=scanner;
    }
    @Override
    protected void doAction() {

        System.out.println("Введіть довжину висоти");
        double height = scanner.nextDouble();
        System.out.println("Введіть довжину сторони, до якої проведена висота");
        double side = scanner.nextInt();
        double square = (height * side)/2;
        System.out.println("Площа трикутника дорівнює  = " + square);
    }
    @Override
    protected String getName() {
        return "Порахувати площу трикутника";
    }
}
class UsersChoice extends UserAction {

    private final Scanner scanner;

    public UsersChoice(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    protected void doAction() {

        }


    @Override
    protected String getName() {
        return "Завершити програму";
    }
}