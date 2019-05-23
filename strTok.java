//https://www.hackerrank.com/challenges/java-string-tokens/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = s.trim();
        if(s.equals("")){
            System.out.println("0");
        }
        else{
        String d = "\\P{Alpha}+";
        String[] tokens = s.split(d);
        long n = tokens.length;
        System.out.println(n);
        for(String word: tokens){
            System.out.println(word);
        }
        }
    }
}

