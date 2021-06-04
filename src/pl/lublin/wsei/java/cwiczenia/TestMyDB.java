package pl.lublin.wsei.java.cwiczenia;

import java.sql.Connection;

public class TestMyDB {
    public static void main(String[] args){
        MyDB db = new MyDB("localhost","myDB", 3306);
        db.setUser("root");
        db.setPassword("Arktyka123!");
        Connection conn = db.getConection();
        if(conn != null){
            System.out.println("Połączenie z bazą danych nawiązane");
            db.closeConnection();
            System.out.println("Połączenie z bazą zakończone");
        }
    }
}

