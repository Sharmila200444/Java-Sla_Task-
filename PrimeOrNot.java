package com.index;
import java.util.*;

public class PrimeOrNot {

    static int isPrime(int num, int i) {
        if (num <= 2) {
            return (num == 2) ? 1 : 0;
        }

        if (num % i == 0) {
            return 0;
        }

        if (i * i > num) {
            return 1;
        }

        return isPrime(num, i + 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        if (isPrime(num, 2) == 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
