public class BubbleSortRecursion {

    public static void main(String[] args) {
        int[] array={2,3,6,45,34,23,78,65,67,98,11};
        sort(array,0,0);
        print(array);
    }
    
    static void sort(int[] array,int i,int j)
    {
        if(i<array.length)
        {
            if(j<array.length-i-1)
            {
                if(array[j]>array[j+1])
                {
                    swap(array,j,j+1);
                }
                sort(array,i,j+1);
            }
            sort(array,i+1,0);
                        
        }
        
       
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
