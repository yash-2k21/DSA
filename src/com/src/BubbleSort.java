import java.util.Arrays;

public class BubbleSort
{
    static void sort(int[] arr)
    {
        int n = arr.length;
        int temp;
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=1 ; j<arr.length ; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        int[] arr = {2,3,5,1,4};
        BubbleSort obj = new BubbleSort();
        obj.sort(arr);

    }
}
