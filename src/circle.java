import java.util.Scanner;

public class circle {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a diameter of a circle : ");
        double circleDiameter = in.nextDouble() ;
        in.nextLine();


        double circleArea = Math.PI * (Math.pow((circleDiameter / 2), 2));
        

        System.out.printf("The area of a circle with the diameter of %,.1f is %,.1f.", circleDiameter, circleArea);



        in.close();
    }
}