import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) {
        try {
            // koneksi database
            String url = "jdbc:mysql://localhost:3306/db_mahasiswa";
            String user = "root";
            String pass = "";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);

            // ambil data
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM mahasiswa");

            // header laporan
            System.out.println("==========================================");
            System.out.println("        LAPORAN DATA MAHASISWA           ");
            System.out.println("==========================================");
            System.out.printf("%-20s %-25s %-10s\n", "NIM", "NAMA", "SEMESTER");
            System.out.println("--------------------------------------------------------------");

            // buat file laporan
            FileWriter fw = new FileWriter("laporan.txt");
            fw.write("===== LAPORAN DATA MAHASISWA =====\n");
            fw.write("NIM\t\tNAMA\t\tSEMESTER\n");

            // looping data
            while (rs.next()) {
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                int semester = rs.getInt("semester");

                // tampil di console
                System.out.printf("%-20s %-25s %-10d\n", nim, nama, semester);

                // simpan ke file
                fw.write(nim + " - " + nama + " - " + semester + "\n");
            }

            fw.close();

            System.out.println("==========================================");
            System.out.println("Laporan berhasil ditampilkan & disimpan!");
            System.out.println("File: laporan.txt");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}