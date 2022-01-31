import java.util.*;
public class Two  {
    public static  void main(String[]args) {
        Scanner input = new Scanner(System.in);
 int n =input.nextInt();
 int k= input.nextInt();
 int[][]array = new  int[n][k];
  for(int i=0; i<n; i++){
      for(int j=0; j<k; j++){
          array[i][j]=input.nextInt();

      }
  }
        for(int i=0; i<n; i++){
      for(int j=0; j<k; j++){
        System.out.println(array[i][j]);
          
      }
  }
    }
}
