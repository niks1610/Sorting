public class SelectionSort {

    
    public static void main(String[] args) {
        int[] array={2,3,6,45,34,23,78,65,67,98,11};
        array=sort(array);
        print(array);
    }
    
    static int[] sort(int[] array)
    {
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[j]<array[i])
                {
                    swap(array,i,j);
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
