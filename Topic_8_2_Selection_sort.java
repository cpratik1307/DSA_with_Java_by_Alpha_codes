public class Topic_8_2_Selection_sort {
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
    public static void selectionSort(int numbers[])
    {
        for(int i=0;i<numbers.length-1;i++)
        {
            int minPos=i;
            for (int j=i+1;j<numbers.length;j++)
            {
                if(numbers[minPos]>numbers[j])
                {
                    minPos = j;

                }
            }
            //swap
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i]=temp;

        }
    }
    public static void main(String[] args) {
        int numbers[]={5, 4, 1, 3, 2};
        selectionSort(numbers);
        printArray(numbers);
    }
}
