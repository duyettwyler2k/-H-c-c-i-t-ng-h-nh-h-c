import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter radius");
        double radius= scanner.nextDouble();
        System.out.println("enter color");
        String color=scanner.next();
        System.out.println("enter height");
        double height=scanner.nextDouble();
        Cylinder cylinder=new Cylinder(radius,color,height);
        System.out.println(cylinder.Volume());


    }
}
