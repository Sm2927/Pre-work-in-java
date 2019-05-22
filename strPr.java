//https://www.hackerrank.com/challenges/java-strings-introduction/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        
        }
        else{
            System.out.println("No")
        }
        
        char Aw = Character.toUpperCase(A.charAt(0));
        char Bw = Character.toUpperCase(B.charAt(0));
        StringBuilder As = new StringBuilder("");
        StringBuilder Bs = new StringBuilder("");
        As.append(Aw);
        Bs.append(Bw);
        for(int i=1;i<A.length();i++){
            As.append(A.charAt(i));
        }
        for(int i=1;i<B.length();i++){
            Bs.append(B.charAt(i));
        }
        System.out.println(As + " " + Bs);
        
    }
}



