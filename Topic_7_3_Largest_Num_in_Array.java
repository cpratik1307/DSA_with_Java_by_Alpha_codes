public class Topic_7_3_Largest_Num_in_Array {
    public static int getLarg(int arr[])
    {
        int largest=Integer.MIN_VALUE; //-Infinity
        int smallest=Integer.MAX_VALUE; //+Infinity
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])  //For Largest
            {
                largest=arr[i];
            }
            if(smallest>arr[i]) //for Smallest
            {
                smallest=arr[i];
            }

        }
        System.out.println("Smallest value is:- "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,3,4};
        System.out.println("Largest value is:- "+getLarg(arr));
    }
}
