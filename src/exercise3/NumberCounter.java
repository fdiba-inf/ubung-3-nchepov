package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 int positivenum = 0;
 int negativenum = 0;
 int sum=0;
 double average=0; 

 System.out.print("Add number: " );
       int number= input.nextInt();
        while(number!=0)
        {
          if(number>0)
          {
            positivenum++;
            sum+=number;
          }
          else
          {
            negativenum++;
            sum+=number;
          }
          average=sum/(positivenum+negativenum);
          number = input.nextInt();
          
        }
        
        System.out.println("Positive numbers: " + positivenum);
        System.out.println("Negative numbers: " + negativenum);
        System.out.println("Sum: " +sum);
        System.out.println("Average: " +average);
    }

}
