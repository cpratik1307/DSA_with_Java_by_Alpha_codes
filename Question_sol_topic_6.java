import java.util.Scanner;

public class Question_sol_topic_6 {
//    public static int Average(int a,int b,int c){
//        int avg;
//        avg=a+b+c/3;
//        return avg;
//    }
//    public static int isEven(int a)
//    {
//        int status=a%2==0?1:0;
////       System.out.println(status);
//       return status;
//    }
    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        {
            for(int i=2;i<Math.sqrt(n);i++)
            {
                if (n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the first num:- ");
//        int a=sc.nextInt();
//        System.out.println("Enter the second num:- ");
//        int b=sc.nextInt();
//        System.out.println("Enter the thired num:- ");
//        int c=sc.nextInt();
//        System.out.println("Avg of three nmubers is " +Average(a,b,c));
        System.out.println("Enter the number to test:- ");
        int a=sc.nextInt();
        System.out.println("Number is:- "+isPrime(a));
//        System.out.println("The number is even:- "+isEven(a));


    }
}
