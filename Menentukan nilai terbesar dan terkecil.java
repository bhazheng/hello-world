import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[a];
        int max;
        int min;
        for(int i = 0; i<a;i++){
            b[i] = in.nextInt();
        }max=b[0];min=b[0];
        for(int i =0; i<a;i++){
            if(b[i]>max){
                max=b[i]; 
            }if(b[i]<min){
                min=b[i];
            }
        }System.out.println("Min : "+min);
        System.out.println("Max : "+max);
    }
    
}
