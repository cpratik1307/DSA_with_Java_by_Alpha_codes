public class Topic_8_4_Counting_Sort {
    public static void printArray(int numbers[])
    {
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    public static void countingSort(int numbers[])
    {
      int lagest=Integer.MIN_VALUE;
      for(int i=0;i<numbers.length;i++)
      {
          lagest=Math.max(lagest, numbers[i]);
      }

      int count[] = new int[lagest+1];
      for(int i=0;i<numbers.length;i++)
      {
          count[numbers[i]]++;

      }

      //sorting
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while (count[i]>0)
            {
                numbers[j]=i;
                j++;
                count[i]--;

            }
        }

    }
    public static void main(String[] args) {
        int numbers[]={1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(numbers);
        printArray(numbers);
    }
}
