public class Topic_7_5_reverse_array {
    public static int reverse(int arr[])
    {
        int first=0,last=arr.length-1;
        while (first<last)
        {
            //swap
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;

        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={1,5,64,3,8,3};
        reverse(arr);
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }

}
