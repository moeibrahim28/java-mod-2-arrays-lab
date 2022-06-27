import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter student's name:");
            names[i] = scanner.nextLine();
        }

        System.out.println("You hasve entered the following names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
