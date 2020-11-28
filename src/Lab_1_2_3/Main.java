package Lab_1_2_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int a = 0;
        int[] mass = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j : mass) {
            sum += j;
        }
        System.out.println(sum);

        sum = 0;
        while (a < mass.length) {
            sum += mass[a];
            a++;
        }
        System.out.println(sum);

        sum = 0;
        a = 0;
        do {
            sum += mass[a];
            a++;
        } while (a < mass.length);
        System.out.println(sum);

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+" ");
        }
        System.out.println();

        for(int i = 1; i < 11; i++) {
            System.out.println(1./i);
        }

        int[] arr = new int[10];
        int[] arr2 = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11);
            System.out.print(arr[i] + " ");
        }
        System.out.print("- arr" +'\n');
        Random rand = new Random();
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextInt(11);
            System.out.print(arr2[i] + " ");
        }
        System.out.print("- arr2" +'\n');
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
        }
        System.out.print("- sorted arr" + '\n');
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.print("- sorted arr2" + '\n');

        Factorial fact = new Factorial();
        int n = fact.factorial(5);
        System.out.print(n + " - factorial" + '\n');

        //-----------------------------------------------------------------------------------------

        DogKennel lab2 = new DogKennel();
       // lab2.Adds();

        //-----------------------------------------------------------------------------------------

       /* Circle laba_3 = new Circle(5);
        laba_3.outputAllInfo();
        laba_3.setLength(18);
        laba_3.outputAllInfo();*/

        //-----------------------------------------------------------------------------------------

        Human h1 = new Human("brown",30,70);
        Human h2 = new Human("red",50,100);
        h1.getInfo();
        h2.getInfo();
        h1.setHead("white");
        h1.setHand(40);
        h1.setLeg(90);
        h2.setHead("black");
        h2.setHand(45);
        h2.setLeg(95);
        h1.getInfo();
        h2.getInfo();
        System.out.println(h2);
 //------
        //-----------------------------------------------------------------------------------------
    }
}