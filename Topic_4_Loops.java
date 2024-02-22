import java.util.Scanner;

public class Topic_4_Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //While loop
//        System.out.println("Enter the n:- ");
//        int n=sc.nextInt();
//        int sum=0;
//    int counter=1;
//        while (counter<=n)
//        {
//            System.out.println(counter  );
//            counter++;
//        }
//        System.out.println("Bye..");
//        while (counter<=n)
//        {
//            sum+=counter;        //sum=sum+counter;
//            counter++;
//        }
//        System.out.println(sum);

        //For loop
        //Square pattern
//        for(int i=1;i<=n;i++)
//        {
//            System.out.println("****");
//        }

        //Print reverse of number
//        int num=1099;
//        int reverse=0;
//        while (num>0)
//        {
//            int lastdigit=num%10;
//            System.out.print(lastdigit+" ");
//            num=num/10;
//
//        }

        // DO while loop
//        int i=1;
//        do
//        {
//            System.out.println("Hello");
//            i++;
//        }while(i<=5);

        //Break key word
//        for (int i=1;i<=5;i++){
//            if (i==3){
//                break;}
//            System.out.println(i);
//        }
//        System.out.println("i am out of loop");

//        do
//        {
//            System.out.println("Enter your number:-");
//            int n=sc.nextInt();
//            if(n%10==0)
//            {
//                break;
//            }
//            System.out.println(n);
//        }while (true);

        //Continue keyword
//        for (int i=1;i<=5;i++){
//            if (i==3){
//                continue;}
//            System.out.println(i);
//        }
//        System.out.println("i am out of loop");

//        do
//        {
//            System.out.println("Enter your number:-");
//            int n=sc.nextInt();
//            if(n%10==0)
//            {
//                continue;
//            }
//            System.out.println(n);
//        }while (true);
//        for(int i=0; i<5; i++) {
//            System.out.println("Hello");
//            i+=2;
//        int num;
//        int choose;
//        int evensum=0;
//        int oddsum=0;
//        do
//        {
//            System.out.println("Enter the number:- ");
//            num=sc.nextInt();
//            if(num%2==0)
//            {
//                evensum+=num;
//                System.out.println("Sum of the even number is "+evensum);
//            }
//            else
//            {
//                oddsum+=num;
//                System.out.println("Sum of the odd number is "+oddsum);
//            }
//            System.out.println("Enter 1 for continue and 0 for exit");
//            choose=sc.nextInt();
//        }while (choose==1);

//        System.out.println("Enter the number:- ");
//        int a=sc.nextInt();
//        int i=1;
//        while (i<=10)
//        {
//            System.out.println(a*i);
//            i++;
//        }
//        for (int i=1;i<=10;i++)
//        {
//            System.out.println(a*i);
//
//        }
        //factoril
        System.out.println("Enter the number for factorial:- ");
        int num=sc.nextInt();
        int fact = 1;
        for (int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.println("factorial is:- "+fact);
        }
    }

