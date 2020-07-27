public class InsertionSort {

    
    public static void main(String[] args) {
        int[] array={4,2,5,3,1};
        
        sort(array);
        print(array);
    }
    
    static void sort(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            int key=array[i];
            int j=i-1;
            while(j>=0 && array[j]>key)
            {
               array[j+1]=array[j]; 
               j=j-1;
            }
            array[j+1]=key;
            
        }
    }
    static void print(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
