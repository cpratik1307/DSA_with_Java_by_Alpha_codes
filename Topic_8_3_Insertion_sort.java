public class Topic_8_3_Insertion_sort {
    public static void bubbleSort(int numbers[])
    {
        for(int turn=0;turn< numbers.length-1;turn++)
        {
            for(int j=0;j< numbers.length-1-turn;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    //swap
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int numbers[])
    {
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    public static void insertionSort(int numbers[])
    {
        for(int i=1;i<numbers.length;i++)
        {
            int curr =numbers[i];
            int prev=i-1;
            //finding out correct position to insert
            while(prev >= 0 && numbers[prev] > curr)
            {
                numbers[prev+1] =numbers[prev];
                prev--;
            }
            //inseertion
            numbers[prev+1] =curr;
        }
    }
    public static void main(String[] args) {
        int numbers[]={5, 4, 1, 3, 2};
        bubbleSort(numbers);
        printArray(numbers);
    }
}
