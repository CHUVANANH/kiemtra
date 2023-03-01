package Cau3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vanban vb = new Vanban();
        do {
            System.out.println("-MENU-");
            System.out.println("1. Nhap van ban");
            System.out.println("2. Dem so chu trong van ban");
            System.out.println("3. Chuan hoa van ban");
            System.out.println("4. Viet hoa toan bo");
            System.out.println("5. Viet thuong toan bo");
            System.out.println("6. Viet hoa chu cai dau tien");
            System.out.println("0. Thoat");
            System.out.print("Hay chon: ");
            int inputOption = Integer.parseInt(scanner.nextLine());
            switch (inputOption){
                case 1:
                    vb.nhapVanban(scanner);
                    break;
                case 2:
                    System.out.print("So chu cua van ban: ");
                    System.out.println(vb.countWords(vb.getInput()));
                    break;
                case 3:
                    vb.standard(vb.getInput());
                    System.out.println("Chuan hoa");
                    System.out.println(vb.standard(vb.getInput()));
                    break;
                case 4:
                    System.out.println("Viet hoa toan bo");
                    System.out.println(vb.upperCase(vb.getInput()));
                    break;
                case 5:
                    System.out.println("Viet thuong toan bo");
                    System.out.println(vb.lowerCase(vb.getInput()));
                    break;
                case 6:
                    System.out.println("Viet hoa chu cai dau");
                    System.out.println(vb.upperFirstChar(vb.getInput()));
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
