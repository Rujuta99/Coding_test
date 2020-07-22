import java.util.Scanner;

import java.util.*;
public class zeroMatrix {
    public static void main(String[] args) {

        int [] [] a = { {1, 2, 3}, {0, 3, 6}, {7, 8, 0} };
        int M = a.length;
        int N = a[0].length;

        boolean row[] = new boolean[M];
        boolean col[] = new boolean[N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(a[i][j]==0){
                    row[i]= true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            if(row[i]==true){
                for(int k=0;k<col.length;k++){
                    a[i][k]=0;
                }
            }
        }
        for(int j=0;j<col.length;j++){
            if(col[j]==true){
                for(int l=0;l<row.length;l++){
                    a[l][j]=0;
                }
            }
        }

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}