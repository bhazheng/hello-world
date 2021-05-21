import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,z;
        double y = 0; double a;
        x = in.nextInt();
        y += x;z=0;
        while (x != 0) {
            x = in.nextInt();
            y += x;
            z++;
        }a = y/z;
        System.out.printf("%.2f",a);
    }
}
