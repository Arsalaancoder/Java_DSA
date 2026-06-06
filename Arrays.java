public class Arrays {
    public static void main(String[] args) {
        
        int Array[] = {10,20,30,50};
        int length = Array.length;//3
        int sum = 0;
        int mul =1;//10*20
        
       
        for(int index = 0;index<length;index++){
                 int value = Array[index];
                 sum = sum + value; //0+10=10,10+20=30,30+30=60,60+50=110
                 mul = mul * value; //1*10=10,10*20=200,200*30=6000,6000*50=300000

            }
        System.out.println("The sum of the array is: "+sum);
        System.out.println("The product of the array is: "+mul);




           }
    }
    

