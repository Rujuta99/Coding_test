import java.util.*;
import java.io.*;

class pageNavigation{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();  
        int p = scan.nextInt();  
        int k = scan.nextInt();  
        
        if(p-k==1){
            for(int j=p-k;j<p;j++){
                System.out.print(j +" ");
            }
            System.out.print("(" +p +")");
            for(int i=p+1;i<=p+k;i++){
                System.out.print(" " +i);
            }
            System.out.print(" >>");
        }  
        else if(p-k==1){  
            System.out.print("<<");
            for(int j=p-k;j<p;j++){
                System.out.print(j +" ");
            }
            System.out.print("(" +p +")");
            for(int i=p+1;i<=p+k;i++){
                System.out.print(" " +i);
            }
            System.out.print(" >>");
        }
        else if(p+k==n){
            System.out.print("<<");
            for(int j=p-k;j<p;j++){
                System.out.print(j +" ");
            }
            System.out.print("(" +p +")");
            for(int i=p+1;i<=p+k;i++){
                System.out.print(" " +i);
            }
        }    
       
    }
}
