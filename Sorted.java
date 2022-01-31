import java.util.*;
public class Sorted {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int  n= input.nextInt();
        int []num = new int[n];
        for(int i=0; i<n; i++){
            num[i]=input.nextInt();
        }
        boolean flag = true;
        for(int i =0; i<num.length-1; i++){
            if(num[i]>num[i+1]){
                flag =false;
            }
        }
        if(flag){
            System.out.println(" Sorted in Ascending Order");

        }
        else{
            System.out.println(" Not Sorted in Ascending order");
        }
    }
}
