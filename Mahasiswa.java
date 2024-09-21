/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.tm5;

/**
 *
 * @author zahidahhanumalzahra
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class Mahasiswa extends javax.swing.JFrame {

    private JTextField jTextFieldNIM;
    private JTextField jTextFieldNama;
    private JTextField jTextFieldAlamat;
    private JButton jButtonSimpan;

    public Mahasiswa() {
        initComponents();
    }

    private void initComponents() {
        jTextFieldNIM = new JTextField();
        jTextFieldNama = new JTextField();
        jTextFieldAlamat = new JTextField();
        jButtonSimpan = new JButton("Simpan");

        jButtonSimpan.addActionListener(evt -> {
            String nim = jTextFieldNIM.getText();
            String nama = jTextFieldNama.getText();
            String alamat = jTextFieldAlamat.getText();
            simpanDataMahasiswa(nim, nama, alamat);
        });

        // Menambahkan komponen ke layout
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNIM)
                    .addComponent(jTextFieldNama)
                    .addComponent(jTextFieldAlamat)
                    .addComponent(jButtonSimpan))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(jTextFieldNIM)
                .addComponent(jTextFieldNama)
                .addComponent(jTextFieldAlamat)
                .addComponent(jButtonSimpan)
        );

        add(panel);
        pack();
    }

    private void simpanDataMahasiswa(String nim, String nama, String alamat) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            String url = "jdbc:postgresql://localhost:5432/Mahasiswa";
            String user = "postgres"; // Ganti dengan username PostgreSQL
            String password = "197300"; // Ganti dengan password PostgreSQL
            conn = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO Mahasiswa (NIM, Nama, Alamat) VALUES (?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nim);
            ps.setString(2, nama);
            ps.setString(3, alamat);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Mahasiswa().setVisible(true));
    }
}
