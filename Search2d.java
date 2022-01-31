import java.util.*;
public class Search2d {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the element X: ");
        int x=input.nextInt();
        int n = input.nextInt();
        int k=input.nextInt();
        int[][]arr= new int[n][k];
        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
                arr[i][j]=input.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
              if(arr[i][j]==x){
                  System.out.println("element found");
              }
           
            }
        }
    }
}
