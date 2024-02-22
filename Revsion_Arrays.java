//import java.util.Scanner;
//
//public class Revsion_Arrays {
//    public static void reverse(int numbers[])
//    {
//        int first=0;
//        int last= numbers.length-1;
//       while(first < last)
//       {
//           //swap
//           int temp=numbers[last];
//           numbers[last]=numbers[first];
//           numbers[first]=temp;
//           first++;
//           last--;
//       }
//    }
//    ///*********** Binary Search ***************//
////    public static int binarysearch(int numbers[],int key)
////    {
////        int start=0;
////        int end=numbers.length-1;
////         while(start <= end)
////         {
////             int mid=(start+end)/2;
////
////             //comparisons
////             if(numbers[mid]==key)
////             {
////                 return mid;
////             }
////             if(numbers[mid]<key)   //right
////             {
////                 start=mid+1;
////             }
////             else //left
////             {
////                 end=mid-1;
////             }
////
////         }
////         return -1;
////    }
//    public static void main(String[] args) {
//        int numbers[]={2,4,6,8,10,12,14};
//        reverse(numbers);
//        for(int i=0;i<numbers.length;i++)
//        {
//            System.out.println(" "+numbers[i]);
//        }
//
////        System.out.println("Enter the key:- ");
////        int key= sc.nextInt();
////        System.out.println("Index for key is :- "+binarysearch(numbers,key));
//
//    }
//}


//Pairs in an Array
public class Revsion_Arrays {

    //Print Pairs in array
//    public static void printPairs(int numbers[])
//    {
//        int totalPairs =0;
//        for(int i=0;i<numbers.length;i++)
//        {
//            int current=numbers[i]; //2,4,6,8,10\
//            for(int j=i+1;j<numbers.length;j++)
//            {
//                System.out.print("("+current+","+numbers[j]+")");
//                totalPairs++;
//            }
//            System.out.println();
//        }
//        System.out.println("Total number of pairs:- "+totalPairs);
//    }
    //Print Sub-arrays
    public static void printSubArrays(int numbers[])
    {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;


        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=i;j<numbers.length;j++)
            {
                int end=j;
                currentSum =0;
                for(int k=start;k<=end;k++)
                {
                    currentSum+=numbers[k];
//                    System.out.println(numbers[k]+" ");
                }
                System.out.println(currentSum );
                if(maxSum<currentSum)
                {
                       maxSum=currentSum;
                }

            }

        }
        System.out.println("Max Sum is = "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubArrays(numbers);
//        printPairs(numbers);
    }
}