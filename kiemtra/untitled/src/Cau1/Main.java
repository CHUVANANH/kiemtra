package Cau1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double radius;
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Nhập bán kính r= ");
            radius = in.nextDouble();
            if(radius <= 0){
                throw new RuntimeException("Error");
            }
            System.out.println(new Circle(radius));
        }
        catch (NumberFormatException e){
            System.out.println("sai dinh dang ban kinh");
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
