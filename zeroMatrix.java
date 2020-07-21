import java.util.Scanner;

import java.util.*;
public class zeroMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int a[][] = new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        int r=0,c=0,b=0,d=0;
        //int M=5,N=4;
        int row[] = new int[M];
        int col[] = new int[N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(a[i][j]==0){
                    row[r]=i;
                    col[c]=j;
                    r++;
                    c++;
                }
            }
        }
        for(int i=0,j=0;i<row.length && j<col.length;i++,j++){
            b=row[i];
            d=col[j];
            for(int p=0;p<M;p++){
                a[p][d]=0;
            }
            for(int k=0;k<N;k++){
                a[b][k]=0;
            }

        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(a[i][j]);
            }
        }
    }
    
}