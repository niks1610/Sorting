public class BubbleSort {

    public static void main(String[] args) {
        int[] array={2,3,6,45,34,23,78,65,67,98,11};
        array=sort(array);
        print(array);
    }
    
    static int[] sort(int[] array)
    {
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j] > array[j+1])
                {
                 swap(array,j,j+1);
                }
            }
        }
        
        return array;
    }
    
    static void swap(int[] array,int i,int j)
    {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        
    }
    static void print(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}