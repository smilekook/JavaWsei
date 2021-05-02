package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StrongPasswordGenerator;

public class StrongPasswordGeneratorTest {
    public static void main(String[] args) {
        String stpg = new StrongPasswordGenerator(5, true, true, true,
                true, "!@$#^&").generate();
        System.out.println(stpg);
        String stp = new StrongPasswordGenerator(8, false, true, false,
                true, "!@$#^&").generate();
        System.out.println(stp);
        String st = new StrongPasswordGenerator(15, true, true, false,
                false, "!@$#^&").generate();
        System.out.println(st);
        String s = new StrongPasswordGenerator(18, true, false, true,
                true, "!@$#^&").generate();
        System.out.println(s);
        String stpgt = new StrongPasswordGenerator(32, false, false, false,
                true, "!@$#^&").generate();
        System.out.println(stpgt);
    }
}
