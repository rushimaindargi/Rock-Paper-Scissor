package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Rock Paper Scissor Game, Let,
        // Rock = 0
        // Paper= 1
        // Scissor= 2
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int a = r.nextInt(3);

        System.out.println("enter a Number between 0 to 2\n0 for Rock\n1 for Paper\n2 for Scissor");

        byte b = sc.nextByte(3);
        if (b==0) {
            System.out.println("user Input ("+b+") : Rock");
        }else if (b==1){
            System.out.println("User Input ("+b+") : Paper");
        } else
            System.out.println("User Input ("+b+") : Scissor");


        if (a==0){
            System.out.println("Computer Input ("+a+") : Rock");
        }else if (a==1){
            System.out.println("Computer Input ("+a+") : Paper");
        }else
            System.out.println("Computer Input ("+a+") : Scissor");


        if (a == 0 && b == 1) {
            System.out.println("You Win!");
        } else if (a == 1 && b == 2) {
            System.out.println("You Win!");
        } else if (a == 2 && b == 0) {
            System.out.println("You Win!");
        } else if (a == b) {
            System.out.println("Draw");
        }else
            System.out.println("Computer Win!");
        }
}
