public class TwoDArray {
    public static void main(String[] args) {
       
        
        int [][]brr = {

                 {1,2},
                 {2,3},
                 {4,5},
                 {6,7}
        };
        int rowLength = brr.length;
        int colLength= brr[0].length;
        // System.out.println("The number of rows in the 2D array is: "+rowLength);
        // System.out.println("The number of columns in the 2D array is: "+colLength);

        for(int rowIndex = 0;rowIndex<rowLength;rowIndex++){
            for(int colIndex = 0;colIndex<colLength;colIndex++){
                int value = brr[rowIndex][colIndex];
                System.out.print(value+" ");
                
            }
            System.out.println();
        }
    }
}