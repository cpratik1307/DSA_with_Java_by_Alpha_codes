public class Topic_7_6_Pairs_in_array {
    public static void printPairs(int arr[])
    {
        int totalPairs=0;
        for(int i=0;i<arr.length;i++)
        {
            int current=arr[i];     // 2 4 6 8 10
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+current+","+arr[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+totalPairs);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printPairs(arr);
    }
}
