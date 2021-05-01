package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StrongPasswordGenerator;

public class StrongPasswordGeneratorTest {
    public static void main(String[] args) {
        String stpg = new StrongPasswordGenerator(5, true, true, true,
                true, "!@$#^&").generate();
        System.out.println(stpg);
    }
}
