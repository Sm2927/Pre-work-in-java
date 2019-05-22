
//https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] aw = a.toLowerCase().toCharArray();
        char[] bw = b.toLowerCase().toCharArray();
        int[] f = new int[26];
        for(char c: aw){
            f[(int)c - 97]++;
        }
        for(char c: bw){
            f[(int)c - 97]--;
        }
        for(int i:f){
            if(i != 0){
                return false;
            }
           
        }
         return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
