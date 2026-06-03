public class InvertedTriangle {
    static void main() {

        int n = 5;
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
