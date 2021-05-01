package pl.lublin.wsei.java.cwiczenia;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;
import java.util.Scanner;

public class IsPalindromeTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do{
            System.out.print("Podaj tekst do sprawdzenia (0, jak Ci się znudzi):");
            String tekst = scn.next();
            tekst += scn.nextLine();
            if(tekst.equals("0"))break;
            System.out.println("Tekst: " + '"' + tekst+ '"' + (StringFun.isPalindrome(tekst) ? " " : " nie ")
                    + "jest palindromem");
        }while(true);
    }
}
