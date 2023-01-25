public class Radix_Sort {  
public static void main(String[] args) {  
        int i;  
       
        int[] a = {69,120,202,04,55,69,12,35,78,45,58,65};  
        System.out.println("\n\n Before sort : \n");  
        for(i=0;i<12;i++)  
            System.out.print(a[i]+" ");
        
        radix_sort(a);    
        System.out.println("\n\n The sorted array : \n");  
        for(i=0;i<12;i++)  
            System.out.print(a[i]+" ");  
    }  
}  
