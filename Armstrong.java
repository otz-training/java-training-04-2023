import java.util.*;
class ArmStrong
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
      int num = sc.nextInt();
      int sum = 0;
      int temp = num;

      while(num!=0)
      {
           int d = (num % 10);
           sum = sum + (d*d*d);
           num = num/10;
      }
     
      if(temp == sum)
      {
        System.out.println("Number is Armstrong");
      }else{
        System.out.println("Number is not Armstrong");
      }
     
   }
}