package pl.lublin.wsei.java.cwiczenia.mylib;

import java.util.Random;

public class StrongPasswordGenerator {
    private int dlugosc = 1;
    private boolean maleLitery = true, wielkieLitery = false, cyfry = true, znakiSpecjalne = false;
    private String dozwoloneZnakiSpecjalne = "@!$%^&#";
    private boolean a = true,s = true,d = true;
    public StrongPasswordGenerator() {
    }

    public StrongPasswordGenerator(boolean znakiSpecjalne, String dozwoloneZnakiSpecjalne) {
        this.znakiSpecjalne = znakiSpecjalne;
        this.dozwoloneZnakiSpecjalne = dozwoloneZnakiSpecjalne;
    }

    public StrongPasswordGenerator(int dlugosc, boolean maleLitery, boolean wielkieLitery, boolean cyfry,
                                   boolean znakiSpecjalne, String dozwoloneZnakiSpecjalne) {
        this.dlugosc = dlugosc;
        this.maleLitery = maleLitery;
        this.wielkieLitery = wielkieLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = znakiSpecjalne;
        this.dozwoloneZnakiSpecjalne = dozwoloneZnakiSpecjalne;
    }
    public String shuffle(String senten) {
        String result = "";
        Random ran = new Random();
        int a;
        int loop = senten.length();
        for (int i = 0; i < loop; i++) {
            a = ran.nextInt(senten.length());
            result += senten.charAt(a);
            senten = senten.substring(0, a) + senten.substring(a + 1);
        }
        return result;
    }

    public String generate() {
        String result = "";
        String alf = "qwertyuiopasdfghjklzxcvbnm";
        Random ran = new Random();
        for (int i = 0; i < this.dlugosc; i++) {

            if (this.maleLitery && s) {
                result += alf.charAt(ran.nextInt(alf.length()));
                this.s = false;
                continue;
            }

            if (this.wielkieLitery && a) {
                result += Character.toUpperCase(alf.charAt(ran.nextInt(alf.length())));
                this.a = false;
                continue;
            }

            if (this.cyfry && d) {
                result += ran.nextInt(10);
                this.d = false;
                continue;
            }
            if (this.znakiSpecjalne) {
                result += this.dozwoloneZnakiSpecjalne.charAt(ran.nextInt(this.dozwoloneZnakiSpecjalne.length()));
                continue;
            }
            this.a = this.s = this.d = true;
            --i;
        }
        return shuffle(result);
    }
    public void setDozwoloneZnakiSpecjalne(String dozwoloneZnakiSpecjalne){
        this.dozwoloneZnakiSpecjalne = dozwoloneZnakiSpecjalne;
    }
    public void setDlugosc(int dlugosc){
        this.dlugosc = dlugosc;
    }
    public void setMaleLitery(boolean maleLitery){
        this.maleLitery = maleLitery;
    }
    public void setWielkieLitery(boolean wielkieLitery){
        this.wielkieLitery = wielkieLitery;
    }
    public void setCyfry(boolean cyfry){
        this.cyfry = cyfry;
    }
    public void setZnakiSpecjalne(boolean znakiSpecjalne){
        this.znakiSpecjalne = znakiSpecjalne;
    }
    public String getDozwoloneZnakiSpecjalne(){
        return dozwoloneZnakiSpecjalne;
    }
    public Boolean getMaleLitery(){
        return maleLitery;
    }
    public Integer getDlugosc(){
        return dlugosc;
    }
    public Boolean getwielkieLitery(){
        return wielkieLitery;
    }
    public Boolean getCyfry(){
        return cyfry;
    }
    public Boolean getZnakiSpecjalne(){
        return znakiSpecjalne;
    }
}
