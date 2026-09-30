public class Break{
      public static void main(String[] args){
      
      for(int index = 1; index <= 10; index++){
            if(index == 5){
                  break;
            }
            System.out.println(index);
            }
      for(int count = 1; count <= 10 && count != 5; count++){
                  System.out.println(count);
      }
            
      }
}

