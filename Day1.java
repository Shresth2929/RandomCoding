import java.util.Scanner;

java.util.*;

public class Day1{

    public int rearrangeBits(int n){
        int countBits=Integer.bitCount(n);
        return (1 << countBits)-1;
    }


    public boolean isPalindrome(int n){
        int o=n;
        int r=0;
        while(n >0){
            int d=n%10;
            r= r*10 +d;
            n = n/10;

        }
       return o==r;

    }


    public int summitOfMountain(int[] arr){
        int start=0;
        int n=arr.length;
        int end=n-1;

        while(start < end){
            int mid=start + (end- start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return arr[start];
    }


    public static getKWords(String str, int k){
        if (str==null || str.trim().isEmpty()  || k <=0){
            return "";
        }
        String[] words=str.trim().split("\\s+");
        int limit=Math.min(words.length, k);

        StringBuilder st=new StringBuilder();
        for(int i=0;i<limit;i++){
            st.append(words[i]);

            if(i<limit-1){
                st.append(" ");
            }

        }
        return st.toString();
    }


    // find minimum swicthes req
    // N light bulbs are connected by a wire. Each bulb has a switch associated with it,
// however due to faulty wiring, a switch also changes the state of all the bulbs to the
// right of current bulb. Given an initial state of all bulbs, Find the minimum number
// of switches you have to press to turn on all the bulbs. You can press the same switch multiple times.
// Note: O represents the bulb is off and 1 represents the bulb is on

    public static int minSwitches(int[] arr){
        int countSwitches=0;

        for(int i=0;i<arr.length;i++){
            int currentState=0;
            if((countSwitches%2)==0){
                 currentState=arr[i];

            }else{
                 currentState=1-arr[i];
            }

            if(currentState ==0){
                countSwitches++;
            }
        }
        return  countSwitches;
    }



    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


    }
}