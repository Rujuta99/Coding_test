import java.util.*;
class stringComp{
    public static void main(String args[]){
        String str = "aabcccccccad";
        String result = stringCompression(str);
        System.out.println(result);
    }

    static String stringCompression(String str){
        String st="";
        int count=1;
        for(int i=0;i<str.length()-1;i++){     
            if(str.charAt(i)==str.charAt(i+1)){   
                count++;
            }
            else{
                st = st + str.charAt(i)  + count;
                count = 1;
            }
        }
        st = st + str.charAt(str.length()-1) + count;
        if(st.length()>str.length()){
            return str;
        }
        else{
            return st;
        }
    }
}