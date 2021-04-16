package pl.lublin.wsei.java.cwiczenia;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
       /* System.out.print("Ala");
        System.out.print("ma");
        System.out.print("kota");*/

       /*System.out.println("Ala");
        System.out.println("ma");
        System.out.println("kota");*/

        /*System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");*/

        /*int a = 3;
        //float b = 4.21;
        double b = 4.21;
        String s = "jakiś tekst";
        System.out.printf("a = %d, b = %.2f, s = %20s %n", a, b, s);*/

        //System.out.print("Nazywaliśmy to \"witaminą B3\"");
        /*System.out.print("alfa, tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));*/

        System.out.print("arg\tlog2(arg)\tsum(arg)\n");
        int a, b, c=0;
        for (int i = 0; i < 10; i++){
            a =(int) Math.pow(2,i);
           //log2(arg) = Math.log10(arg)/ Math.log10(2)
            b = (int) (Math.log10(a)/ Math.log10(2));
            c += a;
        System.out.printf("%d\t\t%d\t\t\t%d\n", a, b, c);}

    }
}
