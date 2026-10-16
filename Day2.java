import java.util.*;

public class Day2{



//  1Convert a number N into binary
// Problem: Given a decimal integer N, convert it into its binary representation.
// Binary uses only two digits: 0 and 1.
// Examples:
// - 5 → 101
// - 10 → 1010
// - 13 → 1101


    public static  String toBinary(int n){
        // return Integer.toBinaryString(n);

        String ans="";
        while (n>0){
            int r=n%2;
            ans=r+ans;
            n = n/2;
        }

        if(ans.equals("")){
            ans="0";
        }
        return  ans;
    }






// 2. Find the Equilibrium Index
// Problem: Find an index where the sum of all elements to its left equals the sum of all elements to its right. If no
// such index exists, return -1. An important detail: the element at the equilibrium index is excluded from both sums.
// Example:
// arr = [1, 3, 5, 2, 2]
// At index 2, the element is 5.
    
    public static int equilibriumIndex(int[] arr){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total +=arr[i];
        }

        int left=0;
        for(int i=0;i<arr.length;i++){
            int right=total-left-arr[i];

            if(left==right){
                return  i;
            }
            left +=arr[i];
        }
        return -1;

    }


// 3. Count permutations while keeping vowel positions fixed
// Problem: Given a string S, count the possible arrangements when vowels must remain in their original positions.
// The consonants can be rearranged among the remaining positions.
// According to the question's note, if there are no consonants, return 0.
// Example 1
// S = "ABC"
// - Vowels: A at index 0 — its position is fixed.
// - Consonants: B, C — they can be rearranged.
// - Possible strings: ABC, ACB.
// Answer: 2

    public  static int countPermutations(String s){
        int count=0;
        for(int i=0; i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch!='a'&& ch!='e' && ch !='i' && ch !='o' && ch !='u'){
                count++;
            }
        }
         
        if(count ==0){
            return 0;
        }
            int fact=1;
            for(int i=1;i<=count;i++){
                fact=fact *i;
            }
        
            return fact;
        
    }



// 4    Check whether a number is a Googly Prime
// Problem: A number is a Googly Prime if the sum of its digits is a prime number.
// Example: N = 43
// - Sum of digits = 4 + 3 = 7
// - 7 is prime.
// - Therefore, the answer is Googly Prime.


     public static boolean isGoogly(int n) {
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += d;
            n /= 10;
        }

        if (sum < 2) {
            return false;
        }

        for (int i = 2; i * i <= sum; i++) {
            if (sum % i == 0) {
                return false;
            }
        }

        return true;
    }

// 5. Swap two characters in a string
// Problem: Given a string and two characters ch1 and ch2, replace every occurrence of ch1 with ch2 and every 
// occurrence of ch2 with ch1.
// Example:
// String = "apples"
// ch1 = 'a'
// ch2 = 'p'

// Output:
// paales

    public static String swapCharacters(String s, char ch1, char ch2){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==ch1){
                sb.append(ch2);
            }else if(c==ch2){
                sb.append(ch1);
            }else{
                sb.append(c);
            }
        }
        return  sb.toString();
    }



    // 6. Count occurrences of the second-largest element
    // Problem: Given a sorted array, find the second-largest element and return how many times it occurs. If all elements 
    // are identical, return 0.
    // Example:
    // A = [1, 2, 3, 3, 3, 4, 4]


    // - Largest element = 4
    // - Second-largest distinct element = 3
    // - Occurrences of 3 = 3
    // Answer: 3

    public static int countSecondLargest(int[] arr){
        int n=arr.length;

        if(n < 2){
            return 0;
        }

        int largest=arr[n-1];
        int i=2;
        while(i >=0 && arr[i]==largest){
            i--;
        }
        if(i<0){
            return 0;
        }
        int c=0;
        int secondLargest=arr[i];
        for(int j=0;j<n;j++){
            if(arr[j]==secondLargest){
                c++;
            }

        }
        return  c;
    }


    public static void main(String[] args){
        
    }
}