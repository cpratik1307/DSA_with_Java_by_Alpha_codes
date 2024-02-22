public class Topic_7_7_Print_Subarrays {
    public static void subarrays(int arr[])
    {
        int total=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++) //For printing only
                {
                    System.out.print(arr[k]+" ");   //Subarrays
                    sum=arr[k]+arr[end];

                }
                System.out.println("_"+sum);
               
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        subarrays(arr);

    }
}
