import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mot so n :");
        double n = scanner.nextDouble();
        double sinValue = Math.sin(n);
        double cosValue = Math.cos(n);

        System.out.println("gia tri sin cua " + n + " la: "+ sinValue);
        System.out.println("gia tri sin cua " + n + " la: "+ cosValue);

        scanner.close();

    }
}