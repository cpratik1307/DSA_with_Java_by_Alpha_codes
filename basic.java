import java.util.Optional;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       //Product of 2 numbers
//       System.out.print("Enter the 1st number:- \n");
//       int a=sc.nextInt();
//       System.out.print("Enter the 2nd number:- \n");
//       int b=sc.nextInt();
//       System.out.print("Product of a and b is:- "+a*b);
        //Area Of Circle
        System.out.print("Entre the radius of the circle:- \n");
        float radius=sc.nextInt();
        float area=3.14f*radius*radius; //in java the default decimal value is assume as double that why we have to mention the 3.14f (f means we are giving as float)
        System.out.println("The Area of circle is:- "+area);
    }
}
