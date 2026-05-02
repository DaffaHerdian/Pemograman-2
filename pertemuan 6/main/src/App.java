import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/db_mahasiswa";
            String user = "root";
            String pass = "";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);

            Scanner input = new Scanner(System.in);

            System.out.println("=== MENU ===");
            System.out.println("1. Search");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
                // 🔍 SEARCH
                System.out.print("Masukkan nama: ");
                String nama = input.nextLine();

                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(
                    "SELECT * FROM mahasiswa WHERE nama LIKE '%" + nama + "%'"
                );

                while (rs.next()) {
                    System.out.println(
                        rs.getString("nim") + " - " +
                        rs.getString("nama") + " - " +
                        rs.getInt("semester")
                    );
                }

            } else if (pilih == 2) {
                // ✏️ UPDATE
                System.out.print("Masukkan NIM: ");
                String nim = input.nextLine();

                System.out.print("Nama baru: ");
                String namaBaru = input.nextLine();

                System.out.print("Semester baru: ");
                int semester = input.nextInt();

                PreparedStatement ps = conn.prepareStatement(
                    "UPDATE mahasiswa SET nama=?, semester=? WHERE nim=?"
                );

                ps.setString(1, namaBaru);
                ps.setInt(2, semester);
                ps.setString(3, nim);

                ps.executeUpdate();
                System.out.println("Data berhasil diupdate!");

            } else if (pilih == 3) {
                // 🗑️ DELETE
                System.out.print("Masukkan NIM: ");
                String nim = input.nextLine();

                PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM mahasiswa WHERE nim=?"
                );

                ps.setString(1, nim);
                ps.executeUpdate();

                System.out.println("Data berhasil dihapus!");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}