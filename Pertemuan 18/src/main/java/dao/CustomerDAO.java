package dao;

import config.KoneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerDAO {

    public boolean simpan(
            String id,
            String nama,
            String alamat,
            String hp,
            String ktp) {

        try {

            Connection con =
                    KoneksiDB.getConnection();

            String sql =
                    "INSERT INTO customer VALUES(?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, id);
            ps.setString(2, nama);
            ps.setString(3, alamat);
            ps.setString(4, hp);
            ps.setString(5, ktp);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}