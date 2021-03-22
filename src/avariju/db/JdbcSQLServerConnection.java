/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avariju.db;

import java.sql.Connection;
import java.sql.*;

public class JdbcSQLServerConnection {


    
       Connection conn ;
       
       public JdbcSQLServerConnection(){
    connect();
  }
       
  public void connect(){
        try {
 
            String DB_URL = "jdbc:sqlserver://DESKTOP-FL6PS0D\\SQLEXPRESS:1433;databaseName=veikianti";
 String DB_USER = "root";
   String DB_PASSWORD = "pass";
   
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connected to data base ");
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    
}
   public ResultSet getback(String query){
    try{
     // Statement statement = connection.createStatement();
      PreparedStatement pstmt = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
       ResultSet result = pstmt.executeQuery();
      return result;
    }catch(SQLException e){
      System.out.println("ERROR while executing check query");
      System.out.println(e.toString());
      return null;
    }
  }
   
   public int add(String query,String miest, String gatv, String kord){
    try{
     // Statement statement = connection.createStatement();
      PreparedStatement pstmt = conn.prepareStatement(query);
      pstmt.setString(1, miest);
      pstmt.setString(2, gatv);
      pstmt.setString(3, kord);
      return pstmt.executeUpdate();
    }catch(SQLException e){
      System.out.println("ERROR while executing add query");
      System.out.println(e.toString());
      return -1;
    }
  }

}
