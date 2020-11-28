package Lab_1_2_3;

public class Factorial {

   public int factorial(int a) {
       int res = 1;
       for (int i = 1; i < a+1; i++) {
           res *= i;
       }
       return res;
   }
}
