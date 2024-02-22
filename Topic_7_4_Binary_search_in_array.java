import java.util.Scanner;

public class Topic_7_4_Binary_search_in_array {
  public static int binarysearch(int arr[],int key)
  {
    int start=0,end=arr.length-1;
    while(start<=end)
    {
      int mid=(start+end)/2;
      //comparisons
      if(arr[mid]==key)
      {
        return mid;
      }
      if(arr[mid]<key) //Right
      {
        start=mid+1;
      }
      else  //Left
      {
          end=mid-1;
      }
    }
    return -1;
  }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]={1,3,5,8,4,6};
        System.out.println("Enter the key to search in array:- ");
        int key=sc.nextInt();
        System.out.println("Index for key is:- "+binarysearch(arr,key));
    }

}
