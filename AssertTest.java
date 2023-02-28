package chapter11;

import java.util.Scanner;

//per ti aktivizuar assertions duhet te perdorim komanden "-ea" pas komandes java
//Psh: java -ea chapter11.AssertTest
//nuk jane default sepse demtojne performancen

public class AssertTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Vendos nje numer mes 0 dhe 10:");
        int number = input.nextInt();

        //assert qe vlera eshte mes 0 dhe 10
        assert (number >= 0 && number <=10) : "bad number:" + number;

        System.out.printf("You entered %d%n", number);
    }
}
