
//https://www.hackerrank.com/challenges/java-string-compare/problem
import java.util.Scanner;

public class Solution {

public static String getSmallestAndLargest(String s, int k) {
        String ch = s.substring(0,k);
        String smallest = ch;
        String largest = ch;
        int n = s.length();
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=1;i<=n-k;i++){
            ch = s.substring(i,i+k);
            if(ch.compareTo(smallest) < 0){
                smallest = ch;
            }
            if(ch.compareTo(largest) > 0){
                largest = ch;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
