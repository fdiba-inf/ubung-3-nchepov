package exercise3;

public class NumberSearch {

    public static void main(String[] args) {
        
 int count=0;
  for(int number=100; number<=1000;number++){
   if(number%6==0 && number%5==0){ 
    System.out.print(" "+number);
     count++;
      if(count%10==0){
       System.out.println();
    }
   }
  }
 }
}
