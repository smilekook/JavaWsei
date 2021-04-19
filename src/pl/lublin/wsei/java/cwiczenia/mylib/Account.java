package pl.lublin.wsei.java.cwiczenia.mylib;
import org.apache.commons.lang3.StringUtils;


public class Account {
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};

    public static String translit (String arg){
        StringBuilder trans = new StringBuilder();
        arg = arg.toLowerCase();
        for(int i = 0; i < arg.length(); i++){
            trans.append(ukrAlphabet.indexOf(arg.charAt(i)) >= 0 ? translitRepl[ukrAlphabet.indexOf(arg.charAt(i))] : arg.charAt(i));
        }
        return trans.toString();



    }

}
