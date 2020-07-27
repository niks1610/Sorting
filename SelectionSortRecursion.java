public class SelectionSortRecursion {

    static int[] sorted;
    public static void main(String[] args) {
        int[] array={11,5,24,74,47,12,2,1,44};
        sorted=new int[array.length];
        sort(array,0,1);
        
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
    static void sort(int[] a,int i,int j)
    {
        if(i<a.length-1)
        {
            if(j<a.length)
            {
                if(a[j]<a[i])
                {
                    swap(a,i,j);
                }
                sort(a,i,j+1);
            }
            sort(a,i+1,i+2);
            
        }
        
    }
    
    static void swap(int[] array,int i,int j)
    {
         int temp=array[i];
          array[i]=array[j];
          array[j]=temp;
    }
    
}
