package lesson01_introduction_to_java.practice;

import java.util.Scanner;

public class demo {
    static int c;
    public static void main(String[] args) {
        System.out.println("Hello world");
        int number1 = 1, number2 = 2, number3 = 3;
        int a;
        a = 1;
        final double PI = 3.141569;
        int b;

        System.out.println(c);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao diem trung binh: ");
//        float diem = scanner.nextFloat();
//        if (diem >= 75) {
//            System.out.println("Passed");
//        } else {
//            System.out.println("Fail");
//        }

//        System.out.println("Nhap vao 1 thang bat ky: ");
//        int month = scanner.nextInt();
//        switch (month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println("Thang " + month + " co 31 ngay");
//                break;
//            case 2:
//                System.out.println("Thang 2 co 28 ngay");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("Thang " + month + " co 30 ngay");
//                break;
//            default:
//                System.out.println("Thang " + month + " khong ton tai");
//        }
        System.out.println("Nhap vao 2 so: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int max = max(x, y);
        Scanner z = scanner;
        System.out.println("So lon nhat la: " + max);

    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }
}
