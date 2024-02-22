//import java.util.Scanner;
//
//public class Topic_7_arrays_revision {
//        public static int linearsearch(int arr[], int key)
//        {
//            for (int i=0;i<arr.length;i++)
//            {
//                if(arr[i]==key)
//                {
//                    return i;
//                }
//            }
//            return -1;
//        }
//
////    public static void update(int marks[],int nonchangeble)
////    {
////        nonchangeble=10;
////        for(int i=0;i<marks.length;i++)
////        {
////            marks[i]=marks[i]+1;
////        }
////    }
//    public static void main(String[] args) {
////        int marks[]={10,20,30};
////        int nochangeble=5;
////        update(marks,nochangeble);
////        System.out.println(nochangeble);
////        for(int i=0;i<marks.length;i++)
////        {
////            System.out.print(" "+marks[i]);
////        }
//
//        int arr[]={10,20,30,50,88,99};
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the key which you want to search:- ");
//        int key=sc.nextInt();
//
//       int index= linearsearch(arr,key);
//        if (index == -1) {
//        System.out.println("NOT found");
//        }
//        else {
//            System.out.println("key is found at index :- "+index);
//        }
//    }
//}

import java.util.Scanner;

public class Topic_7_arrays_revision
{
   public static String lenearsearch(String menu[],String key)
   {
       for (int i=0;i<menu.length;i++)
       {
           if(menu[i]==key)
           {
               return menu[i];
           }
       }
       return key;
   }
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        String menu[]={"Dosa","Pohe","Edli","Cake"};
        System.out.println("This is the menu:- ");
        for (int i=0;i<menu.length;i++)
        {
            System.out.println(" "+menu[i]);
        }
        System.out.println("What do you want to order? :- ");
        String key= sc.nextLine();
        String index=lenearsearch(menu,key);

        System.out.println("Item found :- "+index);


    }
}

