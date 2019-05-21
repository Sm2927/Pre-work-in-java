//https://www.hackerrank.com/challenges/java-end-of-file/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i=1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        while(s != null){
            
            System.out.println(i+" "+s);
            s = br.readLine();
            i++;
           
        }
    }
}

