package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 int number= input.nextInt();
 boolean prime = true;
 while(number>2)
 {
  for(int d=2; d<number;d++)
  {
    if(number%d==0)
    {
prime= false;
break;
    }
    else{
      prime = true;
      
    }

  } 

  System.out.println("Prime number: "+prime);
number= input.nextInt();
}
}
}
