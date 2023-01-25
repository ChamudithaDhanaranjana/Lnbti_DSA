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
  	static int largestnum(int a[])  
    {     
        int larger=a[0], i;   
        for(i=1;i<12;i++)  
        {  
            if(a[i]>larger)  
            larger = a[i];  
        }   
    }  
    static void radix_sort(int a[])  
    {  
        int b[][]=new int[12][12];  
        int b_count[]=new int[12];  
        int i, j, k, remainder, NOP=0, divisor=1, larger, pass;  
        larger = largestnum(a);  
        while(larger>0)  
        {  
            NOP++;  
            larger/=12;  
        }  
        for(pass=0;pass<NOP;pass++) 
        {  
            for(i=0;i<12;i++)  
            b_count[i]=0;  
            for(i=0;i<12;i++)  
            {             
                remainder = (a[i]/divisor)%12;  
                b[remainder][b_count[remainder]] = a[i];  
                b_count[remainder] += 1;  
            }   
            i=0;  
            for(k=0;k<12;k++)  
            {  
                for(j=0;j<b_count[k];j++)  
                {  
                    a[i] = b[k][j];  
                    i++  
                }  
            }  
            divisor *= 12;  
        }  
    }  
}
