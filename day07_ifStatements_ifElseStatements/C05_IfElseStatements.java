package day07_ifStatements_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunuzu girin: ");
        double not = scanner.nextDouble();

        if (not >= 50){

            System.out.println("Sinifi gecdiniz!");

        }else {

            System.out.println("Sinifi gecemediniz!");
        }
    }
}
