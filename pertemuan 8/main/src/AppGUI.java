import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.io.FileWriter;

public class AppGUI extends JFrame {

    DefaultTableModel model;
    JTable table;

    public AppGUI() {
        setTitle("Aplikasi Mahasiswa");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        model = new DefaultTableModel();
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Semester");

        table = new JTable(model);

        JButton btnLoad = new JButton("Tampilkan Data");
        JButton btnCetak = new JButton("Cetak Laporan");

        btnLoad.addActionListener(e -> loadData());
        btnCetak.addActionListener(e -> cetak());

        JPanel panel = new JPanel();
        panel.add(btnLoad);
        panel.add(btnCetak);

        add(new JScrollPane(table), "Center");
        add(panel, "South");
    }

    Connection getKoneksi() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_mahasiswa",
                "root",
                ""
        );
    }

    void loadData() {
        try {
            model.setRowCount(0);

            Connection c = getKoneksi();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM mahasiswa");

            while (r.next()) {
                model.addRow(new Object[]{
                        r.getString("nim"),
                        r.getString("nama"),
                        r.getInt("semester")
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    void cetak() {
        try {
            Connection c = getKoneksi();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM mahasiswa");

            FileWriter f = new FileWriter("laporan.txt");

            while (r.next()) {
                f.write(r.getString("nim") + " - "
                        + r.getString("nama") + " - "
                        + r.getInt("semester") + "\n");
            }

            f.close();
            JOptionPane.showMessageDialog(this, "Laporan dibuat!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public static void main(String[] args) {
        new AppGUI().setVisible(true);
    }
}