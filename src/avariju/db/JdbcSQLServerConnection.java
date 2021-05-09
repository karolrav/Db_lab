/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avariju.db;

import java.sql.Connection;
import java.sql.*;
import java.time.LocalDateTime;

public class JdbcSQLServerConnection {


    
       Connection conn ;
       static int new_id;
       
       public JdbcSQLServerConnection(){
    connect();
  }
       
  public void connect(){
        try {
 
            String DB_URL = "jdbc:sqlserver://DESKTOP-FL6PS0D\\data:1433;databaseName=veikianti;";
 String DB_USER = "root";
 String DB_PASSWORD = "admin";
   
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
   
       public ResultSet getback1(String query,LocalDateTime a, LocalDateTime b) {
        try{
    //Statement statement = conn.createStatement(query);
      PreparedStatement pstmt = conn.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
     pstmt.setTimestamp(1, Timestamp.valueOf(a));
      pstmt.setTimestamp(2, Timestamp.valueOf(b));
        
      return pstmt.executeQuery();
    }catch(SQLException e){
      System.out.println("ERROR while executing check query");
      System.out.println(e.toString());
      return null;
    }
    }

         public int update(String query,String val_nr,String old ){
    try{
      PreparedStatement pstmt = conn.prepareStatement(query);
      pstmt.setString(1, val_nr);
       pstmt.setString(2, old);
    return pstmt.executeUpdate();
    }catch(SQLException e){
      System.out.println("ERROR while updating line!");
      System.out.println(e.toString());
      return -1;
    }
  }
              public int update3(String query,String val_nr,String asmens ){
    try{
      PreparedStatement pstmt = conn.prepareStatement(query);
      pstmt.setString(1, asmens);
       pstmt.setString(2, val_nr);
    return pstmt.executeUpdate();
    }catch(SQLException e){
      System.out.println("ERROR while updating line!");
      System.out.println(e.toString());
      return -1;
    }
  }
              
                 public int update4(String string, String miestas, int miesto_nr) {
       try{
      PreparedStatement pstmt = conn.prepareStatement(string);
      pstmt.setString(1, miestas);
        pstmt.setInt(2, miesto_nr);
    return pstmt.executeUpdate();
    }catch(SQLException e){
      System.out.println("ERROR while updating line!");
      System.out.println(e.toString());
      return -1;
    }
    }
                 
                 
            public int update1(String string,String val_nr, double zala) {
       try{
      PreparedStatement pstmt = conn.prepareStatement(string);
      pstmt.setDouble(1, zala);
        pstmt.setString(2, val_nr);
    return pstmt.executeUpdate();
    }catch(SQLException e){
      System.out.println("ERROR while updating line!");
      System.out.println(e.toString());
      return -1;
    }
    }

   
     public int  delete(String query,String a,String b,String c){
    try{
     PreparedStatement pstmt = conn.prepareStatement(query);
      pstmt.setString(1, a);
       pstmt.setString(2, b);
        pstmt.setString(3, c);
 
    return pstmt.executeUpdate();
    }catch(SQLException e){
      System.out.println("ERROR while deleting line!");
      System.out.println(e.toString());
      return -1;
    }
  }
   
   public int add(String query,String miest, String gatv, String kord){
    try{
     // Statement statement = connection.createStatement();
      PreparedStatement pstmt = conn.prepareStatement(query,new String[]{"APPLICATION_ID"});
      pstmt.setString(1, miest);
      pstmt.setString(2, gatv);
      pstmt.setString(3, kord);
      pstmt.executeUpdate();
       ResultSet rs = null;
        int applicationId = -1;
    rs = pstmt.getGeneratedKeys();
        if (rs.next()) {
            applicationId = rs.getInt(1);
        }
      return applicationId;
    }catch(SQLException e){
      System.out.println("ERROR while executing add query");
      System.out.println(e.toString());
      return -1;
    }
  }
   
   
    public ResultSet filtr(String query){
    try{
     PreparedStatement pstmt = conn.prepareStatement(query);
       ResultSet result = pstmt.executeQuery();
      return result;
    }catch(SQLException e){
      System.out.println("ERROR while executing filter query");
      System.out.println(e.toString());
      return null;
    }
  }

    public int add1(String query, int Izuv, int Isuz, int Iliud, int Inr, Date sqlDate, int Itps) {
        try{
      PreparedStatement pstmt = conn.prepareStatement(query,new String[]{"APPLICATION_ID"});
      pstmt.setInt(1, Izuv);
      pstmt.setInt(2, Isuz);
      pstmt.setInt(3, Iliud);
      pstmt.setInt(4, Inr);
      pstmt.setDate(5, sqlDate);
      pstmt.setInt(6, Itps);
      pstmt.executeUpdate();
       ResultSet rs = null;
        int applicationId = -1;
    rs = pstmt.getGeneratedKeys();
        if (rs.next()) {
            applicationId = rs.getInt(1);
        }
      return applicationId;
    }catch(SQLException e){
      System.out.println("ERROR while executing add query");
      System.out.println(e.toString());
      return -1;
    }
    }

    public static int getNew_id() {
        return new_id;
    }

    public int add2(String query, String val, String mark, String mod, Date sqltech, int draud_nr, String vinas) {
         try{
      PreparedStatement pstmt = conn.prepareStatement(query);
      pstmt.setString(1, val);
      pstmt.setString(2, mark);
      pstmt.setString(3, mod);
      pstmt.setDate(4, sqltech);
      pstmt.setInt(5, draud_nr);
      pstmt.setString(6, vinas);
      return pstmt.executeUpdate();
    }catch(SQLException e){
      System.out.println("ERROR while executing add query");
      System.out.println(e.toString());
      return -1;
    }
    }

    public int add3(String query, String val, int a) {
        try{
      PreparedStatement pstmt = conn.prepareStatement(query);
      pstmt.setString(1, val);
      pstmt.setInt(2, a);
      return pstmt.executeUpdate();
    }catch(SQLException e){
      System.out.println("ERROR while executing add query");
      System.out.println(e.toString());
      return -1;
    }
    }

    public int add4(String query, String lytis, Date sqlgimimo, int a, String asmens, double zala, int kaltas, String val) {
         try{
      PreparedStatement pstmt = conn.prepareStatement(query,new String[]{"APPLICATION_ID"});
      pstmt.setString(1, lytis);
     pstmt.setDate(2, sqlgimimo);
      pstmt.setInt(3, a);
       pstmt.setString(4, asmens);
      pstmt.setDouble(5, zala);
      pstmt.setInt(6, kaltas);
        pstmt.setString(7, val);
      pstmt.executeUpdate();
       ResultSet rs = null;
        int applicationId = -1;
    rs = pstmt.getGeneratedKeys();
        if (rs.next()) {
            applicationId = rs.getInt(1);
        }
      return applicationId;
    }catch(SQLException e){
      System.out.println("ERROR while executing add query");
      System.out.println(e.toString());
      return -1;
    }
    }


    public int add6(String query, int a, int Ivykio_priezastis) {
           try{
      PreparedStatement pstmt = conn.prepareStatement(query);
      pstmt.setInt(1, a);
        pstmt.setInt(2, Ivykio_priezastis);
     return pstmt.executeUpdate();
    }catch(SQLException e){
      System.out.println("ERROR while executing add query");
      System.out.println(e.toString());
      return -1;
    }
   
    }

    public int add5(String query, String kokiossalygos) {
        try{
      PreparedStatement pstmt = conn.prepareStatement(query,new String[]{"APPLICATION_ID"});
      pstmt.setString(1, kokiossalygos);
      pstmt.executeUpdate();
       ResultSet rs = null;
        int applicationId = -1;
    rs = pstmt.getGeneratedKeys();
        if (rs.next()) {
            applicationId = rs.getInt(1);
        }
      return applicationId;
    }catch(SQLException e){
      System.out.println("ERROR while executing add query");
      System.out.println(e.toString());
      return -1;
    }
    }

    public ResultSet check(String str, String val, String vinas) {
      try{
    
      PreparedStatement pstmt = conn.prepareStatement(str);
      pstmt.setString(1, val);
      pstmt.setString(2, vinas);
       ResultSet result = pstmt.executeQuery();
      return result;
    }catch(SQLException e){
      System.out.println("ERROR while executing check query");
      System.out.println(e.toString());
      return null;
    }
    }

    public ResultSet check1(String str1, String kord) {
            try{
      PreparedStatement pstmt = conn.prepareStatement(str1);
      pstmt.setString(1, kord);
       ResultSet result = pstmt.executeQuery();
      return result;
    }catch(SQLException e){
      System.out.println("ERROR while executing check query");
      System.out.println(e.toString());
      return null;
    }
    }
 
}
