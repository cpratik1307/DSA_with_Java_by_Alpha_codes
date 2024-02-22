public class Topic_7_8_Max_subarray_sum {
    public static void maxsumofSubarray(int arr[])
    {
       int currSum=0;
       int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++) //For printing only
                {
                    //System.out.print(arr[k]+" ");   //Subarrays
                    currSum+=arr[k];
                }
                System.out.println(currSum);

                if(maxSum<currSum)
                {
                    maxSum=currSum;
                }
                //System.out.println();
            }
            //System.out.println();
        }
        System.out.println("max sum = "+maxSum);
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxsumofSubarray(arr);
    }
}
