package HW17;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserAction[] userActions = new UserAction[]{
                new CircleSquare(scanner),
                new RectangleSquare(scanner),
                new TriangleSquare(scanner)
        };
        while (true) {
            int i;
            for (i = 0; i < userActions.length; i++) {
                System.out.println(i + 1 + " " + userActions[i].getName());
            }

            System.out.println(i + 1 + " Завершити програму");
            System.out.println("Виберіть пункт меню");
            int choice = scanner.nextInt() - 1;
            if (choice + 1 == userActions.length + 1) {
                break;
            }

            if (choice >= 0 && choice < userActions.length) {
                userActions[choice].doAction();
            } else{
            System.out.println("Ви вибрали невірний пункт меню");
            }
        }
    }
}
