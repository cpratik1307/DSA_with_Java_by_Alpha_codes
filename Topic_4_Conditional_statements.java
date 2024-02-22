import java.util.Scanner;

public class Topic_4_Conditional_statements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the 1st number:-");
//        int a=sc.nextInt();
//        System.out.println("Enter the 2nd number:-");
//        int b=sc.nextInt();
//        if(a>=b)
//            System.out.println("A is greater the b");
//        else
//            System.out.println("B is greater then A");
        //Odd Or Even
//        if(a%2==0)  //Here a%2==0 remainder is 0 that's why this is even
//        {
//            System.out.println("Even number");
//        }
//        else
//        {
//            System.out.println("Odd number");
//        }
//        if(a>=18)
//        {
//            System.out.println("Adult");
//        }
//        else if (a>=13 && a<18 ) {
//            System.out.println("Teenager");
//        }
//        else
//        {
//            System.out.println("Childe");
//        }
//        System.out.println("Enter the income in Lakes:- ");
//        int income=sc.nextInt();
//        int tax=0;
//        if(income<5)
//        {
//            tax=0;
//            System.out.println("O% on your income "+tax);
//        }
//        else if (income>=5 && income<10)
//        {
//            tax= (int) (income*(0.2));
//            System.out.println(" on your income :-"+tax);
//        }
//        else
//        {
//            tax= (int) (income*(0.3));
//            System.out.println("Tax on upto 10%:- "+tax);
//        }

        //Ternary Operators:-

        //Even Or ODD
//        int num=4;
//        String type=((num%2)==0 ? "even" : "odd");
//        System.out.println(type);

        //Greater number
//        System.out.println("Enter the 1st number :- ");
//        int a=sc.nextInt();
//        System.out.println("Enter the 2nd number :- ");
//        int b=sc.nextInt();
//        String bool=(a>b) ? "a is greater" : "b is greater";
//        System.out.println(bool);

        //Marks Problem
//        System.out.println("Enter the Marks :- ");
//        int marks=sc.nextInt();
//        String result=(marks>=33) ? "Pass" : "Fail";
//        System.out.println("Staus:- "+result);

        //Switch Case
        //Calculator Task
        System.out.println("Enter the 1st number :- ");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number :- ");
        int b=sc.nextInt();
        System.out.println("------------Here is the Manu-----------");
        System.out.println("1.  Addition");
        System.out.println("2.  Substraction");
        System.out.println("3.  Multiplication");
        System.out.println("4.  Division");
        System.out.println("---------------------------------------");
        System.out.println("Enter your Choose Here:- ");
        int operation=sc.nextInt();
        switch(operation)
        {
            case 1:
                System.out.println("Addition is :-"+(a+b));
                break;
            case 2:
                System.out.println("Substraction is :-"+(a-b));
                break;
            case 3:
                System.out.println("Multiplication is :-"+(a*b));
                break;
            case 4:
                System.out.println("Division is :-"+(a/b));
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }
}
