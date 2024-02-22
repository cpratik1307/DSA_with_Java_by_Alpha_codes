import java.util.Scanner;
public class Topic_6_Functions_Methods {
//    public static void f1()
//    {
//       System.out.println("Hello world");
//        System.out.println("Hello world");
//        System.out.println("Hello world");
//    }
//    public static void f2(int a,int b) // Parameters or Formal Parameters
//    {
//        System.out.println("Sum is:- "+(a+b));
//    }
//    public static int f3(int a, int b)
//    {
//        int sum=a+b;
//        return sum;
//    }
//    public static void swap(int a,int b){
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println("a = "+a);
//        System.out.println("b = "+b);
//    }
//
    //Factorial of a number
    public static int factorial(int a)
    {
        int f=1;
       for(int i=1;i<=a;i++)
       {
           f=f*i;  //f*=i;

       }
        return f;
    }

    //Binomial Coefficient
    public static int bin_coeff(int n,int r){
        int n_fact=factorial(n);
        int r_factorial=factorial(r);
        int nmr_fact=factorial(n-r);
        int binomial_f=n_fact/(r_factorial*nmr_fact);
        return binomial_f;

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
////        f1();
////        f2(a,b);    //Arguments or Actual parameters
//            int sum=f3(a,b);
//            System.out.println(sum);

        //swap code for call by value
//        int a=5;
//        int b=10;
//       swap(a,b);
//        System.out.println("a = "+a);
//        System.out.println("b = "+b);
//            int a=5;
//            f4(a);
//            System.out.println(a);
        //Product of a and b
//        int a=4;
//        int b=2;
//        int mul=pro(a,b);
//        System.out.println("Product of s and b:- "+mul);

        //Factorial of a number
//        System.out.println("Enter the number to calculate the factorial:- ");
//        int a=sc.nextInt();
//        int f=factorial(a);
//        System.out.println("The factorial of the number is:- "+f);

//            System.out.println(bin_coeff(5,2)); //Binomial coefficient

    }
}
