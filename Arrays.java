// import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        
        int Array[] = {10,20,30,50};
        int length = Array.length;//5
        int sum = 0;
        
       
        for(int index = 0;index<length;index++){
                 int value = Array[index];
                 sum = sum + value;

            }
        System.out.println("The sum of the array is: "+sum);
          

           }
    }
    

