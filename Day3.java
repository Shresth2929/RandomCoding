import java.util.*;

public class Day3{

// 1. Toss and Score — Calculate the final score
// Problem: You are given a string S containing H (heads) and T (tails).
// Rules:
// - Each H gives you 2 points.
// - Each T deducts 1 point.
// - The game stops when you get 3 consecutive heads or reach the end of the string.
// I'll use 2 points per head, which is the likely intended value in your question.
// Example:S = "HTHHHT"

// Scoring:
// - H → +2, score = 2
// - T → -1, score = 1
// - H → +2, score = 3
// - H → +2, score = 5
// - H → +2, score = 7, stop the game
// Answer: 7


    public static int calScore(String s){
        int score=0;
        int count=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch =='H'){
                score +=2;
                count++;

                if(count==3){
                    break;
                }

            }
            else if(ch =='T'){
                score --;
                count=0;
            }
            
        }
        return  score;

    }


// 2. Special Fibonacci sequence
// You provided this recurrence:
// \[
// f(N)=f(N-1)\times f(N-1)+f(N-2)\times f(N-2)
// \]

// with:
// \[
// f(0)=1,\quad f(1)=1
// \]

// I'm interpreting X as multiplication, so the rule is:
// \[
// f(n)=[f(n-1)]^2+[f(n-2)]^2
// \]

// Step 1: Calculate the first few values
// \(n\)	Calculation	\(f(n)\)
// 0	Given	1
// 1	Given	1
// 2	\(1^2+1^2\)	2
// 3	\(2^2+1^2\)	5
// 4	\(5^2+2^2\)	29
// 5	\(29^2+5^2\)	866
// Notice that this is not the normal Fibonacci sequence. The previous two values are squared before being added.


        public static int specialFibonacci(int n){

            if(n ==0 || n==1){
                return  1;
            }
            int a=1;
            int b=1;
            int c=0;

            for(int i=2;i<=n;i++){
                c=a*a+b*b;
                a=b;
                b=c;
            }
            return  b;
        }


// 3. normal fibonacii series

public static void fibonacciSeries(int n){
    int a=0;
    int b=1; 

    for(int i=0;i<n;i++){
        System.out.println(a+" ");
        int c=a+b;
        a=b;
        b=c;
    }

}


// 4. Sum the even positions after reversing an array
// Problem: Given an array A of length N, reverse the array and return the sum of elements at its even positions.
// We'll use the usual convention that positions start from 1, so even positions are 2, 4, 6, ....


    public static int sumReversed(int[] arr){
        int n=arr.length;
        int sum=0;

        for(int i=0;i<n;i++){
            int r=n-1-i;

            if((i+1 )%2 ==0){
                sum +=arr[r];
            }
        }
        return sum;
    }

//     5. Print the second-smallest number in an array
// Problem: Find the second-smallest distinct number in an array.
// Example:
// arr = {5, 2, 8, 1, 3};

// Sorted order: 1, 2, 3, 5, 8
// Answer: 2

public static int secondSmallest(int[] arr){
    int smallest=Integer.MAX_VALUE;
    int secondSmallest=Integer.MAX_VALUE;

    for(int i=0;i<arr.length;i++){
        if(arr[i]<smallest){
            secondSmallest=smallest;
            smallest=arr[i];
            
        }else if(arr[i]>smallest && arr[i]<secondSmallest){
            secondSmallest=arr[i];
        }
    }
    if (secondSmallest==Integer.MAX_VALUE) {
        return -1;
        
    }
    return  secondSmallest;
}





public  static void main(String[] args){

    
}

}