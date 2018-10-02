//The classic competence test: The Fizzbuzz Test.
//The goal is to create a program that prints numbers 1-100, but prints "Fizz" for multiples of 3 and "Buzz" for multiples of "5".
//For multiples of both 3 and 5, it must print "Fizzbuzz".

public class FizzBuzz {

   public static void main(String []args) {
      for (int i = 1; i <= 100; i++)
      {
        if ((i%3 == 0) && (i%5 == 0))
        {
         System.out.println("FizzBuzz");
        }
        else if (i%3 == 0)
        {
         System.out.println("Fizz");
        }
        else if (i%5 == 0)
        {
         System.out.println("Buzz");
        }
        else
        {
         System.out.println(i);
        }
      }
   }
}