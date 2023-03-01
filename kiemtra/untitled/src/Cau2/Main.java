package Cau2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kythuat kt1 = new Kythuat("TP1234", "Anh", "11/08/1997", "Vinh Phuc", "Dien tu");
        Kythuat kt2 = new Kythuat("TP1235");

        System.out.print("Nhap ten:");
        kt2.setHoten(scanner.nextLine());
        System.out.print("Nhap ngay sinh dd/mm/yyyy:");
        kt2.setNamsinh(scanner.nextLine());
        System.out.print("Nhap dia chi:");
        kt2.setDiachi(scanner.nextLine());
        System.out.print("Nhap chuyen nganh:");
        kt2.setChuyennganh(scanner.nextLine());

        System.out.println(kt1.toString());
        System.out.println(kt2.toString());
    }
}

