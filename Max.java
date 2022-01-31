import java.util.*;
public class Max {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int  n= input.nextInt();
        int []num = new int[n];
        for(int i=0; i<n; i++){
            num[i]=input.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
 for(int i=0; i<num.length; i++){
     if(num[i]<min){
         min = num[i];
     }
     if(num[i]>max){
         max = num[i];
     }
 }
 System.out.println(max);
 System.out.println(min);
    }
}
