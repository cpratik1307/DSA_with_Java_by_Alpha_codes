import java.util.Scanner;

public class Topic_7_2_Arrays_Linear_Search {
    public static int linear_search(int arr[],int key)
    {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
//                System.out.println("Key is identified in the array:- "+key);
//                break;
            }
        }
       return -1;
    }
    public static void print(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("Array is :- "+arr[i]);
        }
    }
    public static void main(String args[])
{
    int arr[]={10,22,33,55,66};
    print(arr);
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the key");
    int key=sc.nextInt();

    int index=linear_search(arr,key);
    if(index==-1)
    {
        System.out.println("NOT found");
    }
    else
    {
        System.out.println("Key is at index:- "+index);
    }

}
}
