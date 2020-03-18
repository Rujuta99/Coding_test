import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Integer; 

public class mean {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Sum=0;
        int numCase = scan.nextInt();
        for(int ab=0;ab<numCase;ab++){
            int numSeq = scan.nextInt();
            int arr[]=new int[numSeq];
            for(int i=0;i<numSeq;i++){
               arr[i]=scan.nextInt();
            }
            for(int j=0;j<numSeq;j++){
               Sum=Sum+arr[j];
            }
            float mean=(float)Sum/numSeq;
            System.out.println(mean);
            Arrays.sort(arr);
            int middle=arr.length/2;
            if(arr.length%2==1){
               System.out.println(arr[middle]);
            }
            else{
               double temp=(arr[middle-1]+arr[middle])/2.0;
               System.out.println(temp);
            }
            int x=0,y=0;
            for(int k=0;k<arr.length;k++){
                int count=0;
                for(int l=0;l<arr.length;l++){
                    if(arr[l]==arr[k])
                       count++;
                }
                if(count>y){
                    y=count;
                    x=arr[k];
                }
            }
            System.out.println(x);
        }    
        
        
        
    }
}
