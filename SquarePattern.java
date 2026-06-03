public class SquarePattern {
    static void main() {

        int n = 4;

        for(int row = 1;row<=n;row++)
        {
//           printing rows
            for(int col = 1;col<=n;col++){
//                printing colums
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
