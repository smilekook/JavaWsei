package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {
    public static String leftPad(String aText, char aChar, int aWidth){
        String res = aText;
        for (int i=0; i < aWidth - aText.length(); i++)
            res = aChar + res;
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int num1;
            System.out.print("Podaj liczbę, którą mam przekonwertować: ");
            num1 = input.nextInt();
            System.out.printf("Rezultat : DEC = %d, BIN = %s, HEX =%%%s ", num1, leftPad(Integer.toBinaryString(num1), '0', 8), leftPad(Integer.toHexString(num1).toUpperCase(),'0', 4));
        }

    }
