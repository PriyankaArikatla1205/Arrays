import java.util.*;
public class Name{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String [] array = new String[a];
         for(int i=0; i<a; i++){
             array[i]=input.next();

         }
         for(int i=0; i<a; i++){
           System.out.println(array[i]);

        }

    }
}