import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("NAME :");
        String name = scanner.nextLine();
        System.out.println("WELCOME TO CHAPTER 12 " + name + " ! ");
    }
}


