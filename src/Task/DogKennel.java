package Task;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
    protected ArrayList<Dog> kennel;

    public void Adds() {
        ArrayList<Dog> kennel = new ArrayList<Dog>();
        Scanner in = new Scanner(System.in);
        String name;
        int age;

        do {
            System.out.println("Input dog's name and age. For cancelling input '0 0'");
            name = in.next();
            age = in.nextInt();
            if (age < 0){
                System.out.println("Incorrect input : dog's age can't be negative");
                name = in.next();
                age = in.nextInt();
            }
            if(age > 0) {
                kennel.add(new Dog(name, age));
            }
        } while(age > 0);

        for (Dog s : kennel){
            System.out.println(s.toString());
        }
    }

   /* public static void test () {
        Dog bob = new Dog("Bob", 9);
        bob.setAge(5);
        String a = bob.ToString();
        System.out.print(a);
    }*/
}
