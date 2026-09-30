public class SumOfSeries{
      public static void main(String[] args){
            
            long sum = 0;
            long product = 1;
            for(long index = 1; index <= 100; index++){
            sum += index;
            product *= index;
            System.out.println("SUM: " + sum);
            System.out.println("PRODUCT: " + product);
            }
      }
}
