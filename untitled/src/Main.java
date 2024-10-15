import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chieu dai:");
        double length = scanner.nextDouble();

        System.out.print("nhap chieu rong:");
        double width = scanner.nextDouble();

        double area = length * width;

        double perimeter = 2 * (length + width);
        System.out.printf("dien tich la:%.2f\n", area);
                System.out.printf("chu vi la:%.2f\n", perimeter);

                scanner.close();

    }
}
