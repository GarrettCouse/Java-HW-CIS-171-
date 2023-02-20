import java.util.Scanner;
public class BookstoreCredit {
    public static void main(String[] args) {
        String name;
        double gpa;
        final double credit = 10;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name >> ");
        name = sc.next();
        System.out.println("Enter gpa >> ");
        gpa = sc.nextDouble();
        computeDiscount(name, gpa, credit);
    }

    private static void computeDiscount(String name, double gpa, double credit) {

        double totalCredit = gpa * credit;
        System.out.println(name + ", your GPA is " + gpa + ", so your credit is $" + totalCredit);
    }
}
