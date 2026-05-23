import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/db_mahasiswa";
            String user = "root";
            String pass = "";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);

            String sql = "INSERT INTO mahasiswa (nim, nama, semester) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, "231011401634");
            ps.setString(2, "Ahmad Daffa Herdian");
            ps.setInt(3, 6);

            ps.executeUpdate();

            System.out.println("Data berhasil disimpan!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}