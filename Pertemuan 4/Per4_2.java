import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Nama class UTAMA harus sama dengan nama file: pertemuan4.java
public class pertemuan4 { 
    public static void main(String[] args) {
        // Membuat Jendela Utama
        JFrame frame = new JFrame("Program Utama");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Menggunakan layout null agar bisa setBounds manual
        frame.setLocationRelativeTo(null); // Agar muncul di tengah layar

        // Label Judul di Frame Utama
        JLabel label = new JLabel("MEMANGGIL - MENAMPILKAN FRAME LAIN");
        label.setBounds(50, 40, 350, 30);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(label);

        // Tombol untuk memanggil frame lain
        JButton tombolPanggil = new JButton("PANGGIL FRAME");
        tombolPanggil.setBounds(125, 100, 200, 40);
        frame.add(tombolPanggil);

        // Logika Klik Tombol
        tombolPanggil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Memanggil class FrameKedua
                new FrameKedua().setVisible(true);
            }
        });

        // Menampilkan Frame Utama
        frame.setVisible(true);
    }
}

// Class Jendela Kedua (TIDAK boleh pakai kata 'public' jika di satu file yang sama)
class FrameKedua extends JFrame {
    public FrameKedua() {
        setTitle("Frame Yang Dipanggil");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Menutup hanya frame ini
        setLayout(null);
        setLocationRelativeTo(null);

        // Label Judul di Frame Kedua
        JLabel judul = new JLabel("FRAME YANG DIPANGGIL");
        judul.setBounds(125, 20, 200, 30);
        judul.setHorizontalAlignment(SwingConstants.CENTER);
        add(judul);

        // Input NIM
        JLabel lblNim = new JLabel("NIM");
        lblNim.setBounds(50, 80, 100, 30);
        add(lblNim);

        JTextField txtNim = new JTextField();
        txtNim.setBounds(180, 80, 180, 30);
        add(txtNim);

        // Input Nama
        JLabel lblNama = new JLabel("Nama Mahasiswa");
        lblNama.setBounds(50, 130, 150, 30);
        add(lblNama);

        JTextField txtNama = new JTextField();
        txtNama.setBounds(180, 130, 180, 30);
        add(txtNama);
    }
}
