package com.unpam.model;
import java.sql.*;
public class Koneksi{
public static Connection getKoneksi() throws Exception{
Class.forName("com.mysql.cj.jdbc.Driver");
return DriverManager.getConnection(
"jdbc:mysql://localhost:3306/db_nilai","root","");
}
}