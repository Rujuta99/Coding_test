import java.util.*;
import java.io.*;
import java.lang.Integer; 
import java.math.*;
import java.text.*;


class mean{

    static float toCalculateMean(int arr[],int size){
        int Sum=0;
        for(int j=0;j<size;j++){
            Sum+=arr[j];
        }
        return ((float)Sum/size);
    }

    static double toCalculateMedian(int arr[],int size){
        Arrays.sort(arr);
        int mid=arr.length/2;
        if(arr.length%2==0){
            double temp=(arr[mid]+arr[mid-1])/2.0;
            return temp;
        }
        else{
            double temp=arr[mid];
            return temp;
        }    
    }

    static void toCalculateMode(int arr[],int size){
        int comp=0,ab=0;
        for(int x=0;x<arr.length;x++){
            int count=0;
            for(int y=0;y<arr.length;y++){
                if(arr[x]==arr[y]){
                    count++;
                }
            }
            if(count>comp){
                comp=count;
                ab=arr[x];
            }
        }System.out.println(ab);
        
    }
    
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();   //Number of test cases
        int size = scan.nextInt();   //Size of sequence
        int arr[] = new int[size];
        for(int p=0;p<test;p++){
            for(int i=0;i<size;i++){
                arr[i] = scan.nextInt();  //Input sequence
            }
            float result=toCalculateMean(arr,size);
            System.out.println(result);
            double mres=toCalculateMedian(arr,size);
            System.out.println(mres);
            toCalculateMode(arr,size);
        }
    }  
}
