public class InsertionSortRecursion {

    
    public static void main(String[] args) {
        int[] array={4,2,5,3,1,14,12,65,78,41,22};
        
        sort(array,0,-1,array[0]);
        print(array);
    }
    
    static void sort(int[] array,int i,int j,int key)
    {
        
        if(i<array.length)
        {
            
           
            
            
            if(j>=0 && array[j]>key)
            {
               array[j+1]=array[j];
               System.out.println("array"+(j+1)+"="+array[j+1]);
               
               
               sort(array,i,j-1,key);
               
               
            }
           
            
           
           array[j+1]=key;
           System.out.println("array"+(j+1)+"="+array[j+1]);
           
            
            print(array);
            System.out.println("loop over");
            System.out.println();
            
            try
            {
            sort(array,i+1,i,array[i+1]);
            }
            
            catch(Exception e)
            {
                System.out.println("Array is sorted");
                System.exit(0);
            }
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
