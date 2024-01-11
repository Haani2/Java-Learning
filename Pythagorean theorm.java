import java.util.Scanner;
// Program of taking user input of two sides and resulting hypotenuse 
public class Main {
    public static void main (String[]args){

        double x ;
        double y ;
        double z;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x ");
        x = scanner.nextDouble();
        System.out.print("Enter the value of y");
        y= scanner.nextDouble();
       z = Math.sqrt((x*x)+(y*y)); // Pythagorean formula
     System.out.print(z);
 scanner.close();
}
}
