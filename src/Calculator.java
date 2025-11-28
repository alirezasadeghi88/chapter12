import java.awt.dnd.InvalidDnDOperationException;
import java.io.InvalidObjectException;
import java.util.Scanner;

public class Calculator {

    public static double calculate(double a, double b, String op)
        throws InvalidDnDOperationException {
        switch (op) {
            case "+":return a + b;
            case "-":return a - b;
            case "*":return a * b;
            case "/":
                if (b == 0)throw new ArithmeticException("تقسیم بر صفر مجاز نیست!");
                return a / b;
            default:throw new InvalidDnDOperationException("عملیات نامعتبر" + op);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("عدد اول را وارد کنید:");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.println("عدد دوم را وارد کنید:");
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.println("عملیات (+ و - و * و /)را وارد کنید");
            String op = scanner.nextLine();

            double result = calculate(num1, num2, op);
            System.out.println("نتیجه" + result);
        }catch (NumberFormatException e) {
            System.out.println("خطا! : لطفا فقط عدد وارد کنید");
        }catch (ArithmeticException e) {
            System.out.println("خطا!" + e.getMessage());
        }catch (InvalidDnDOperationException e) {
            System.out.println("خطا!:"  + e.getMessage());
        }finally {
            System.out.println("برنامه ماشین حساب پایان یافت.");
        }
    }
}
