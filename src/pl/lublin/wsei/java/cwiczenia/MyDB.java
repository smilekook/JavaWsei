package pl.lublin.wsei.java.cwiczenia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.ResultSet;

public class MyDB {
    private Connection conn = null;
    private String serverName;
    private String database;
    private Number portNumber;
    private String user;
    private String password;
    private String jdbc = "";
    private Statement statement = null;


    public MyDB(String serverName, String database, Number portNumber) {
        this.serverName = serverName;
        this.database = database;
        this.portNumber = portNumber;
    }


    public void setUser(String username){
        this.user = username;
    }
    public void setPassword(String password){
        this.password = password;
    }

    private void connect() {
        Properties connectionProps = new Properties();
        connectionProps.put("user", user);
        connectionProps.put("password", password);
        connectionProps.put("serverTimezone", "Europe/Warsaw");
        jdbc = "jdbc:mysql://" + serverName + ":" + portNumber + "/" + database;
        try {
            conn = DriverManager.getConnection(
                    jdbc, connectionProps
            );
            statement = conn.createStatement();
        } catch (SQLException e) {
            System.out.println("Błąd połączenia z bazą: " + jdbc);
            System.out.println("Komunikat błędu: " + e.getMessage());
            conn = null;
        }

    }

    public Connection getConection() {
        if (conn == null)
            connect();
        return conn;
    }
    public void closeConnection(){
        if(conn != null){
            try{
                conn.close();
            } catch (SQLException e){
                System.out.println("Błąd przy zamykaniu połączneia bazodanowego: " + e.getMessage());
            }
            conn = null;
        }
    }

    public ResultSet selectData(String selectStatement){
        if((conn != null) && (statement !=null)){
            try{
                return statement.executeQuery(selectStatement);
            }catch(SQLException e){
                System.out.println("Błąd realizacji zapytania: " + selectStatement + ", " + e.getMessage());
            }
        }
        return null;
    }
}
