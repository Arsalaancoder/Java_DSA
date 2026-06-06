import java.util.Scanner;
public class Methods {
    //Functions and methods are same
    //note:if the main method is static we need to use static keyword to call the function
    static void printName(){
        System.out.println("Arsalaan");
    }
    static void printTable(int UserInput){
        for(int i=1;i<=10;i++){
            System.out.println(UserInput+"x"+i+"="+UserInput*i);
        }
    }
    static void FindOvel(char in) {
        if (in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u') {
            System.out.println(in + "Ovel");
        } else {
            System.out.println(in + "Consonent");
        }



    }
    static void main() {

        //function call
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        int userInput = sc.nextInt();

        // for char function
        System.out.println("Enter the character:");
        char in = sc.next().charAt(0);
        FindOvel(in);


        printTable(userInput);
        printName();
        sc.close();

    }
}
