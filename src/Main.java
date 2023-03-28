import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TriangleChecker check = new TriangleChecker();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao canh a: ");
            int a = scanner.nextInt();
            System.out.println("Nhap vao canh b: ");
            int b = scanner.nextInt();
            System.out.println("Nhap vao canh c: ");
            int c = scanner.nextInt();
        check.checkTriangle(a,b,c);
        }catch (IllegalTriangleException e){
            e.printStackTrace();
        }


    }

}