
package frm;

import main.hungnguyen;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import javafx.scene.control.ComboBox;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmTrangChu extends javax.swing.JFrame {

   
    public frmTrangChu() {
        initComponents();

       
    }
    int tam = 0;
    ImageIcon icon;
    String imageLocation = "bg.jpg";
    String imageName;
    Calendar cal = Calendar.getInstance();

    int day = cal.get(Calendar.DAY_OF_MONTH);
    int month = cal.get(Calendar.MONTH) + 1;
    int year = cal.get(Calendar.YEAR);

    Date dt = cal.getTime();
// Dinh dang lai hien thi thong tin ngay gio ra man hinh
    SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy");

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tbljpanel = new javax.swing.JTabbedPane();
        jTabbedPaneQuanLySanPham = new javax.swing.JTabbedPane();
        jPanelSanPham = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblTenSanPham_SanPham = new javax.swing.JLabel();
        lblMaSanPham_SanPham = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbbMaLoaiSanPham_SanPham = new javax.swing.JComboBox<>();
        txtGiaNhap_SanPham = new javax.swing.JTextField();
        lblGiaNhap_SanPham = new javax.swing.JLabel();
        txtGiaBan_SanPham = new javax.swing.JTextField();
        lblGiaBan = new javax.swing.JLabel();
        txtTenSanPham_SanPham = new javax.swing.JTextField();
        txtMaSanPham_SanPham = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbbHangSanXuat_SanPham = new javax.swing.JComboBox<>();
        lblTonKho_SanPham = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtChuThich_SanPham = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        btnThem_SanPham = new javax.swing.JButton();
        bntSua_SanPham = new javax.swing.JButton();
        btnXoa_SanPham = new javax.swing.JButton();
        btnReset_SanPham = new javax.swing.JButton();
        txtTonKho_SanPham = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        labelHinhAnh = new javax.swing.JLabel();
        jPanelLoaiSanPham = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLoaiSanPham_LoaiSanPham = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTenLoaiSanPham_LoaiSanPham = new javax.swing.JTextField();
        btnThem_LoaiSanPham = new javax.swing.JButton();
        btnSua_LoaiSanPham = new javax.swing.JButton();
        btnXoa_LoaiSanPham = new javax.swing.JButton();
        txtMaLoaiSanPham_LoaiSanPham = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSanPham_LoaiSanPham = new javax.swing.JTable();
        jLabel74 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel_KhachHang = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        tblKhachHang_KhachHang = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        lblMaKhachHang_KhachHang = new javax.swing.JLabel();
        lblTenKhachHang_KhachHang = new javax.swing.JLabel();
        txtMaKhachHang_KhachHang = new javax.swing.JTextField();
        txtTenKhachHang_KhachHang = new javax.swing.JTextField();
        rbtnNam_KhachHang = new javax.swing.JRadioButton();
        rbtnNu_KhachHang = new javax.swing.JRadioButton();
        lblNgaySinh_KhachHang = new javax.swing.JLabel();
        lblGioiTinh_KhachHang = new javax.swing.JLabel();
        lblDiaChi_KhachHang = new javax.swing.JLabel();
        txtDiaChi_KhachHang = new javax.swing.JTextField();
        lblSDT_KhachHang = new javax.swing.JLabel();
        txtSDT_KhachHang = new javax.swing.JTextField();
        cbbLoaiKhachHang_KhachHang = new javax.swing.JComboBox<>();
        lblLoaiKhachHang_KhachHang = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtGhiChu_KhachHang = new javax.swing.JTextPane();
        btnThem_KhachHang = new javax.swing.JButton();
        btnSua_KhachHang = new javax.swing.JButton();
        btnXoa_KhachHang = new javax.swing.JButton();
        btnReset_KhachHang = new javax.swing.JButton();
        cbbNgay = new javax.swing.JComboBox<>();
        cbbThang = new javax.swing.JComboBox<>();
        cbbNam = new javax.swing.JComboBox<>();
        lblLoiMaKhachHang_KhachHang4 = new javax.swing.JLabel();
        lblLoiMaKhachHang_KhachHang5 = new javax.swing.JLabel();
        jTabbedPaneNhanVien = new javax.swing.JTabbedPane();
        jPanelNhanVien = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblNhanVien_NhanVien = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        lblTenNhanVien_NhanVien = new javax.swing.JLabel();
        lblMaNhanVien_NhanVien = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtTenNhanVien_NhanVien = new javax.swing.JTextField();
        txtMaNhanVien_NhanVien = new javax.swing.JTextField();
        rbtnNam_NhanVien = new javax.swing.JRadioButton();
        rbtnNu_NhanVien = new javax.swing.JRadioButton();
        cbbNgaySinh_NhanVien = new javax.swing.JComboBox<>();
        cbbThangSinh_NhanVien = new javax.swing.JComboBox<>();
        cbbNamSinh_NhanVien = new javax.swing.JComboBox<>();
        cbbNgayVaoLam_NhanVien = new javax.swing.JComboBox<>();
        cbbNamVaoLam_NhanVien = new javax.swing.JComboBox<>();
        cbbThangVaoLam_NhanVien = new javax.swing.JComboBox<>();
        lblDiaChi_NhanVien = new javax.swing.JLabel();
        lblSDT_NhanVien = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtChuThich_NhanVien = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        btnThem_NhanVien = new javax.swing.JButton();
        btnSua_NhanVien = new javax.swing.JButton();
        btnXoa_NhanVien = new javax.swing.JButton();
        btnReset_NhanVien = new javax.swing.JButton();
        txtDiaChi_NhanVien = new javax.swing.JTextField();
        txtSoDT_NhanVien = new javax.swing.JTextField();
        cbbChucVu_NhanVien = new javax.swing.JComboBox<>();
        jPanelChucVu = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblChucVu_ChucVu = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblNhanVien_ChucVu = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnThem_ChucVu = new javax.swing.JButton();
        btnSua_ChucVu = new javax.swing.JButton();
        txtMaChucVu_ChucVu = new javax.swing.JTextField();
        btnReset_ChucVu = new javax.swing.JButton();
        txtTenChucVu_ChucVu = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtChuThich_ChucVu = new javax.swing.JTextArea();
        jPanelTaiKhoan = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblTaiKhoan_TaiKhoan = new javax.swing.JTable();
        btnThem_TaiKhoan = new javax.swing.JButton();
        btnXoa_TaiKhoan = new javax.swing.JButton();
        btnSua_TaiKhoan = new javax.swing.JButton();
        btnReset_TaiKhoan = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtUser_TaiKhoan = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cbbQuyen_TaiKhoan = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtChuThich_TaiKhoan = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        txtPassword_TaiKhoan = new javax.swing.JPasswordField();
        jLabel55 = new javax.swing.JLabel();
        txtID_TaiKhoan = new javax.swing.JTextField();
        cbbTenNhanVien_TaiKhoan = new javax.swing.JComboBox<>();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanelThongKe = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelDangXuat = new javax.swing.JPanel();
        jPanelMe = new javax.swing.JPanel();
        lblAbout = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trang Chính");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbljpanel.setBackground(new java.awt.Color(255, 255, 255));
        tbljpanel.setForeground(new java.awt.Color(255, 51, 51));
        tbljpanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tbljpanel.setToolTipText("San pham ne");

        jTabbedPaneQuanLySanPham.setBackground(new java.awt.Color(255, 255, 255));

        jPanelSanPham.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSanPham.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelSanPhamComponentShown(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel4.setBackground(new java.awt.Color(102, 255, 204));

        lblTenSanPham_SanPham.setText("Tên Sản PHẩm");

        lblMaSanPham_SanPham.setText("Mã Sản Phẩm");

        jLabel3.setText("Loại Sản Phẩm");

        cbbMaLoaiSanPham_SanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đồ điện tử", "Đồ gia dụng", "Quần áo", "Khác" }));
        cbbMaLoaiSanPham_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaLoaiSanPham_SanPhamActionPerformed(evt);
            }
        });

        lblGiaNhap_SanPham.setText("Giá Nhập");

        lblGiaBan.setText("Giá Bán");

        txtMaSanPham_SanPham.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaSanPham_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(lblGiaNhap_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenSanPham_SanPham)
                            .addComponent(lblGiaBan))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGiaBan_SanPham)
                            .addComponent(txtTenSanPham_SanPham)
                            .addComponent(txtMaSanPham_SanPham)
                            .addComponent(cbbMaLoaiSanPham_SanPham, 0, 232, Short.MAX_VALUE)
                            .addComponent(txtGiaNhap_SanPham)))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSanPham_SanPham)
                    .addComponent(txtMaSanPham_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenSanPham_SanPham)
                    .addComponent(txtTenSanPham_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbbMaLoaiSanPham_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaNhap_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGiaNhap_SanPham))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaBan_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGiaBan))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel9.setText("Hãng Sản Xuất");

        cbbHangSanXuat_SanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apple", "Samsung", "Toshiba", "Khác" }));

        lblTonKho_SanPham.setText("Tồn Kho");

        jLabel11.setText("Chiếc");

        txtChuThich_SanPham.setColumns(20);
        txtChuThich_SanPham.setRows(5);
        jScrollPane2.setViewportView(txtChuThich_SanPham);

        jLabel12.setText("Chú Thích");

        btnThem_SanPham.setText("Thêm");
        btnThem_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_SanPhamActionPerformed(evt);
            }
        });

        bntSua_SanPham.setText("Sửa");
        bntSua_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSua_SanPhamActionPerformed(evt);
            }
        });

        btnXoa_SanPham.setText("Xóa");
        btnXoa_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_SanPhamActionPerformed(evt);
            }
        });

        btnReset_SanPham.setText("Reset");
        btnReset_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_SanPhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(28, 28, 28)
                            .addComponent(cbbHangSanXuat_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(lblTonKho_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtTonKho_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnThem_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnXoa_SanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntSua_SanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset_SanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(cbbHangSanXuat_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTonKho_SanPham)
                    .addComponent(jLabel11)
                    .addComponent(txtTonKho_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntSua_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27)
                .addComponent(btnXoa_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnReset_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sản Phẩm ", "Tên Sản Phẩm", "Loại Sản Phẩm", "Giá Nhập", "Giá Bán", "Nhà Sản Xuất", "Tồn Kho", "ảnh", "Chú Thích"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);
        if (tblSanPham.getColumnModel().getColumnCount() > 0) {
            tblSanPham.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblSanPham.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        javax.swing.GroupLayout jPanelSanPhamLayout = new javax.swing.GroupLayout(jPanelSanPham);
        jPanelSanPham.setLayout(jPanelSanPhamLayout);
        jPanelSanPhamLayout.setHorizontalGroup(
            jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                .addGroup(jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSanPhamLayout.setVerticalGroup(
            jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSanPhamLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(labelHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneQuanLySanPham.addTab("Sản Phẩm", jPanelSanPham);

        jPanelLoaiSanPham.setBackground(new java.awt.Color(204, 204, 255));
        jPanelLoaiSanPham.setPreferredSize(new java.awt.Dimension(1030, 600));
        jPanelLoaiSanPham.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanelLoaiSanPhamComponentAdded(evt);
            }
        });
        jPanelLoaiSanPham.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelLoaiSanPhamComponentShown(evt);
            }
        });

        tblLoaiSanPham_LoaiSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Mã Loại Sản Phẩm ", "Tên Loại Sản Phẩm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLoaiSanPham_LoaiSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaiSanPham_LoaiSanPhamMouseClicked(evt);
            }
        });
        tblLoaiSanPham_LoaiSanPham.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblLoaiSanPham_LoaiSanPhamComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(tblLoaiSanPham_LoaiSanPham);
        if (tblLoaiSanPham_LoaiSanPham.getColumnModel().getColumnCount() > 0) {
            tblLoaiSanPham_LoaiSanPham.getColumnModel().getColumn(0).setMinWidth(30);
            tblLoaiSanPham_LoaiSanPham.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblLoaiSanPham_LoaiSanPham.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        jLabel13.setText("Mã Loại Sản Phẩm");

        jLabel14.setText("Tên Loại Sản Phẩm");

        btnThem_LoaiSanPham.setText("Thêm");
        btnThem_LoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_LoaiSanPhamActionPerformed(evt);
            }
        });

        btnSua_LoaiSanPham.setText("Sửa");
        btnSua_LoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_LoaiSanPhamActionPerformed(evt);
            }
        });

        btnXoa_LoaiSanPham.setText("Reset");
        btnXoa_LoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_LoaiSanPhamActionPerformed(evt);
            }
        });

        txtMaLoaiSanPham_LoaiSanPham.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenLoaiSanPham_LoaiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txtMaLoaiSanPham_LoaiSanPham)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnThem_LoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnSua_LoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(btnXoa_LoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMaLoaiSanPham_LoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTenLoaiSanPham_LoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem_LoaiSanPham)
                    .addComponent(btnSua_LoaiSanPham)
                    .addComponent(btnXoa_LoaiSanPham))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));

        tblSanPham_LoaiSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sản Phẩm ", "Tên Sản Phẩm", "Loại Sản Phẩm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblSanPham_LoaiSanPham);
        if (tblSanPham_LoaiSanPham.getColumnModel().getColumnCount() > 0) {
            tblSanPham_LoaiSanPham.getColumnModel().getColumn(0).setMinWidth(30);
            tblSanPham_LoaiSanPham.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblSanPham_LoaiSanPham.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 51, 255));
        jLabel74.setText(" Sản Phẩm");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel74)
                .addGap(889, 889, 889))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 51, 255));
        jLabel73.setText("Loại Sản Phẩm");

        javax.swing.GroupLayout jPanelLoaiSanPhamLayout = new javax.swing.GroupLayout(jPanelLoaiSanPham);
        jPanelLoaiSanPham.setLayout(jPanelLoaiSanPhamLayout);
        jPanelLoaiSanPhamLayout.setHorizontalGroup(
            jPanelLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                .addGroup(jPanelLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                        .addGroup(jPanelLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                                .addGap(364, 364, 364)
                                .addComponent(jLabel73)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLoaiSanPhamLayout.setVerticalGroup(
            jPanelLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel73)
                .addGap(18, 18, 18)
                .addGroup(jPanelLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPaneQuanLySanPham.addTab("Loại Sản Phẩm", jPanelLoaiSanPham);

        tbljpanel.addTab(" Sản Phẩm", new javax.swing.ImageIcon(getClass().getResource("/images/sanpham.png")), jTabbedPaneQuanLySanPham); // NOI18N

        jPanel_KhachHang.setBackground(new java.awt.Color(102, 255, 204));
        jPanel_KhachHang.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel_KhachHangComponentShown(evt);
            }
        });

        tblKhachHang_KhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Khách Hàng", "Tên Khách Hàng", "Ngày Sinh", "Giới Tính", "Dịa Chỉ", "SDT", "Loại Khách Hàng", "Ghi Chú"
            }
        ));
        tblKhachHang_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHang_KhachHangMouseClicked(evt);
            }
        });
        jScrollPane24.setViewportView(tblKhachHang_KhachHang);

        jLabel56.setText("Khách Hàng");

        lblMaKhachHang_KhachHang.setText("Mã KH");

        lblTenKhachHang_KhachHang.setText("Tên KH");

        txtMaKhachHang_KhachHang.setEditable(false);

        txtTenKhachHang_KhachHang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenKhachHang_KhachHangFocusLost(evt);
            }
        });
        txtTenKhachHang_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhachHang_KhachHangActionPerformed(evt);
            }
        });
        txtTenKhachHang_KhachHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenKhachHang_KhachHangKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTenKhachHang_KhachHangKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbtnNam_KhachHang);
        rbtnNam_KhachHang.setText("Nam");

        buttonGroup1.add(rbtnNu_KhachHang);
        rbtnNu_KhachHang.setText("Nữ");

        lblNgaySinh_KhachHang.setText("Ngày Sinh");

        lblGioiTinh_KhachHang.setText("Giới Tính");

        lblDiaChi_KhachHang.setText("Địa Chỉ");

        txtDiaChi_KhachHang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaChi_KhachHangFocusLost(evt);
            }
        });

        lblSDT_KhachHang.setText("SDT");

        txtSDT_KhachHang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSDT_KhachHangFocusLost(evt);
            }
        });

        cbbLoaiKhachHang_KhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblLoaiKhachHang_KhachHang.setText("Loại KH");

        jLabel85.setText("Ghi Chú");

        jScrollPane25.setViewportView(txtGhiChu_KhachHang);

        btnThem_KhachHang.setText("Thêm");
        btnThem_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_KhachHangActionPerformed(evt);
            }
        });

        btnSua_KhachHang.setText("Sửa");
        btnSua_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_KhachHangActionPerformed(evt);
            }
        });

        btnXoa_KhachHang.setText("Xóa");
        btnXoa_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_KhachHangActionPerformed(evt);
            }
        });

        btnReset_KhachHang.setText("Reset");
        btnReset_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_KhachHangActionPerformed(evt);
            }
        });

        cbbThang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThangItemStateChanged(evt);
            }
        });
        cbbThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbThangActionPerformed(evt);
            }
        });

        lblLoiMaKhachHang_KhachHang4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblLoiMaKhachHang_KhachHang4.setForeground(new java.awt.Color(255, 0, 51));

        lblLoiMaKhachHang_KhachHang5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblLoiMaKhachHang_KhachHang5.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel_KhachHangLayout = new javax.swing.GroupLayout(jPanel_KhachHang);
        jPanel_KhachHang.setLayout(jPanel_KhachHangLayout);
        jPanel_KhachHangLayout.setHorizontalGroup(
            jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addGap(474, 474, 474)
                        .addComponent(jLabel56))
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                                .addComponent(lblNgaySinh_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblMaKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTenKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblGioiTinh_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                                        .addComponent(rbtnNam_KhachHang)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                        .addComponent(rbtnNu_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtMaKhachHang_KhachHang)
                                    .addComponent(txtTenKhachHang_KhachHang))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDiaChi_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSDT_KhachHang)
                                    .addComponent(lblLoaiKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel85))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSDT_KhachHang)
                                    .addComponent(jScrollPane25)
                                    .addComponent(cbbLoaiKhachHang_KhachHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDiaChi_KhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblLoiMaKhachHang_KhachHang5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThem_KhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua_KhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa_KhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset_KhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(520, Short.MAX_VALUE))
            .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(lblLoiMaKhachHang_KhachHang4, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                    .addGap(833, 833, 833)))
        );
        jPanel_KhachHangLayout.setVerticalGroup(
            jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKhachHang_KhachHang)
                    .addComponent(txtMaKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiaChi_KhachHang)
                    .addComponent(txtDiaChi_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem_KhachHang))
                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblLoiMaKhachHang_KhachHang5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSDT_KhachHang)
                            .addComponent(txtSDT_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua_KhachHang))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLoaiKhachHang_KhachHang)
                            .addComponent(cbbLoaiKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoa_KhachHang))
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenKhachHang_KhachHang)
                            .addComponent(txtTenKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgaySinh_KhachHang)
                            .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblGioiTinh_KhachHang))
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnNam_KhachHang)
                            .addComponent(rbtnNu_KhachHang)))
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset_KhachHang))
                    .addComponent(jLabel85))
                .addContainerGap())
            .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KhachHangLayout.createSequentialGroup()
                    .addContainerGap(616, Short.MAX_VALUE)
                    .addComponent(lblLoiMaKhachHang_KhachHang4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
        );

        tbljpanel.addTab("Khách Hàng", new javax.swing.ImageIcon(getClass().getResource("/images/khachHang.png")), jPanel_KhachHang); // NOI18N

        jTabbedPaneNhanVien.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPaneNhanVienComponentShown(evt);
            }
        });

        jPanelNhanVien.setBackground(new java.awt.Color(102, 255, 204));
        jPanelNhanVien.setPreferredSize(new java.awt.Dimension(1030, 600));
        jPanelNhanVien.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelNhanVienComponentShown(evt);
            }
        });

        tblNhanVien_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh ", "Giới Tính", "Ngày Vào Làm", "Chức Vụ", "Địa Chỉ", "Số ĐT", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVien_NhanVienMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblNhanVien_NhanVien);
        if (tblNhanVien_NhanVien.getColumnModel().getColumnCount() > 0) {
            tblNhanVien_NhanVien.getColumnModel().getColumn(0).setResizable(false);
            tblNhanVien_NhanVien.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        jPanel15.setBackground(new java.awt.Color(102, 255, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel16.setBackground(new java.awt.Color(102, 255, 204));

        lblTenNhanVien_NhanVien.setText("Tên Nhân Viên");

        lblMaNhanVien_NhanVien.setText("Mã Nhân Viên");

        jLabel45.setText("Ngày Sinh");

        jLabel46.setText("Giới Tính");

        jLabel47.setText("Ngày Vào Làm");

        txtMaNhanVien_NhanVien.setEditable(false);

        buttonGroup1.add(rbtnNam_NhanVien);
        rbtnNam_NhanVien.setText("Nam");
        rbtnNam_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNam_NhanVienActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnNu_NhanVien);
        rbtnNu_NhanVien.setText("Nữ");

        cbbThangSinh_NhanVien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThangSinh_NhanVienItemStateChanged(evt);
            }
        });

        cbbThangVaoLam_NhanVien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbThangVaoLam_NhanVienItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaNhanVien_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(lblTenNhanVien_NhanVien))
                .addGap(23, 23, 23)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(cbbNgayVaoLam_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbThangVaoLam_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbNamVaoLam_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTenNhanVien_NhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNhanVien_NhanVien, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(cbbNgaySinh_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbbThangSinh_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                        .addComponent(rbtnNam_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)))
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnNu_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbNamSinh_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaNhanVien_NhanVien)
                    .addComponent(txtMaNhanVien_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNhanVien_NhanVien)
                    .addComponent(txtTenNhanVien_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbNgaySinh_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbThangSinh_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbNamSinh_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnNam_NhanVien)
                        .addComponent(rbtnNu_NhanVien)))
                .addGap(25, 25, 25)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(cbbNgayVaoLam_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNamVaoLam_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbThangVaoLam_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDiaChi_NhanVien.setText("Địa Chỉ");

        lblSDT_NhanVien.setText("Số ĐT");

        txtChuThich_NhanVien.setColumns(20);
        txtChuThich_NhanVien.setRows(5);
        jScrollPane8.setViewportView(txtChuThich_NhanVien);

        jLabel51.setText("Chú Thích");

        jLabel52.setText("Chức Vụ");

        btnThem_NhanVien.setText("Thêm");
        btnThem_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_NhanVienActionPerformed(evt);
            }
        });

        btnSua_NhanVien.setText("Sửa");
        btnSua_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_NhanVienActionPerformed(evt);
            }
        });

        btnXoa_NhanVien.setText("Xóa");
        btnXoa_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_NhanVienActionPerformed(evt);
            }
        });

        btnReset_NhanVien.setText("Reset");
        btnReset_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_NhanVienActionPerformed(evt);
            }
        });

        txtDiaChi_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChi_NhanVienActionPerformed(evt);
            }
        });

        txtSoDT_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDT_NhanVienActionPerformed(evt);
            }
        });

        cbbChucVu_NhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDiaChi_NhanVien)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                            .addComponent(lblSDT_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiaChi_NhanVien)
                    .addComponent(txtSoDT_NhanVien)
                    .addComponent(cbbChucVu_NhanVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnThem_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnXoa_NhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset_NhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addComponent(btnSua_NhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(408, 408, 408))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbbChucVu_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel52)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiaChi_NhanVien)
                            .addComponent(txtDiaChi_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSDT_NhanVien)
                            .addComponent(txtSoDT_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSua_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(btnXoa_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnReset_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel51))
                        .addGap(10, 10, 10))
                    .addComponent(jScrollPane8))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelNhanVienLayout = new javax.swing.GroupLayout(jPanelNhanVien);
        jPanelNhanVien.setLayout(jPanelNhanVienLayout);
        jPanelNhanVienLayout.setHorizontalGroup(
            jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNhanVienLayout.setVerticalGroup(
            jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneNhanVien.addTab("Nhân Viên", jPanelNhanVien);

        jPanelChucVu.setBackground(new java.awt.Color(204, 204, 255));
        jPanelChucVu.setPreferredSize(new java.awt.Dimension(1030, 600));
        jPanelChucVu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelChucVuComponentShown(evt);
            }
        });

        tblChucVu_ChucVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Chức Vụ", "Tên Chức Vụ", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChucVu_ChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChucVu_ChucVuMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblChucVu_ChucVu);
        if (tblChucVu_ChucVu.getColumnModel().getColumnCount() > 0) {
            tblChucVu_ChucVu.getColumnModel().getColumn(0).setMinWidth(30);
            tblChucVu_ChucVu.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblChucVu_ChucVu.getColumnModel().getColumn(0).setMaxWidth(30);
            tblChucVu_ChucVu.getColumnModel().getColumn(1).setMinWidth(90);
            tblChucVu_ChucVu.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblChucVu_ChucVu.getColumnModel().getColumn(1).setMaxWidth(90);
        }

        jPanel20.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        tblNhanVien_ChucVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã Nhân Viên", "Tên Nhân Viên", "Chức Vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tblNhanVien_ChucVu);
        if (tblNhanVien_ChucVu.getColumnModel().getColumnCount() > 0) {
            tblNhanVien_ChucVu.getColumnModel().getColumn(0).setMinWidth(30);
            tblNhanVien_ChucVu.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblNhanVien_ChucVu.getColumnModel().getColumn(0).setMaxWidth(30);
            tblNhanVien_ChucVu.getColumnModel().getColumn(1).setMinWidth(90);
            tblNhanVien_ChucVu.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblNhanVien_ChucVu.getColumnModel().getColumn(1).setMaxWidth(90);
            tblNhanVien_ChucVu.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel7.setText("Chức Vụ");

        jLabel8.setText("Nhân Viên");

        jLabel25.setText("Mã Chức Vụ");

        jLabel26.setText("Tên Chức Vụ");

        jLabel27.setText("Ghi Chú");

        btnThem_ChucVu.setText("Thêm");
        btnThem_ChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_ChucVuActionPerformed(evt);
            }
        });

        btnSua_ChucVu.setText("Sửa");
        btnSua_ChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_ChucVuActionPerformed(evt);
            }
        });

        txtMaChucVu_ChucVu.setEditable(false);
        txtMaChucVu_ChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaChucVu_ChucVuActionPerformed(evt);
            }
        });

        btnReset_ChucVu.setText("Reset");
        btnReset_ChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_ChucVuActionPerformed(evt);
            }
        });

        txtChuThich_ChucVu.setColumns(20);
        txtChuThich_ChucVu.setRows(5);
        jScrollPane13.setViewportView(txtChuThich_ChucVu);

        javax.swing.GroupLayout jPanelChucVuLayout = new javax.swing.GroupLayout(jPanelChucVu);
        jPanelChucVu.setLayout(jPanelChucVuLayout);
        jPanelChucVuLayout.setHorizontalGroup(
            jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChucVuLayout.createSequentialGroup()
                .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChucVuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                            .addComponent(jScrollPane12)))
                    .addGroup(jPanelChucVuLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel7)))
                .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChucVuLayout.createSequentialGroup()
                        .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChucVuLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel25)))
                            .addGroup(jPanelChucVuLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelChucVuLayout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addGap(13, 13, 13))
                                    .addComponent(btnThem_ChucVu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(71, 71, 71)
                        .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenChucVu_ChucVu)
                            .addGroup(jPanelChucVuLayout.createSequentialGroup()
                                .addComponent(txtMaChucVu_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanelChucVuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSua_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnReset_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(172, 172, 172)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanelChucVuLayout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelChucVuLayout.setVerticalGroup(
            jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChucVuLayout.createSequentialGroup()
                .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelChucVuLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelChucVuLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8)
                        .addGap(13, 13, 13))
                    .addGroup(jPanelChucVuLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaChucVu_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(33, 33, 33)
                        .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenChucVu_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(36, 36, 36)
                        .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanelChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem_ChucVu)
                            .addComponent(btnSua_ChucVu)
                            .addComponent(btnReset_ChucVu))
                        .addGap(60, 60, 60)))
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jTabbedPaneNhanVien.addTab("Chức Vụ", jPanelChucVu);

        jPanelTaiKhoan.setBackground(new java.awt.Color(204, 204, 255));
        jPanelTaiKhoan.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelTaiKhoanComponentShown(evt);
            }
        });

        tblTaiKhoan_TaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "", "Mã Nhân Viên ", "Tên Nhân Viên ", "User", "Password", "Quyền", "Chú Thích"
            }
        ));
        tblTaiKhoan_TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTaiKhoan_TaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblTaiKhoan_TaiKhoan);
        if (tblTaiKhoan_TaiKhoan.getColumnModel().getColumnCount() > 0) {
            tblTaiKhoan_TaiKhoan.getColumnModel().getColumn(0).setMinWidth(30);
            tblTaiKhoan_TaiKhoan.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblTaiKhoan_TaiKhoan.getColumnModel().getColumn(0).setMaxWidth(30);
            tblTaiKhoan_TaiKhoan.getColumnModel().getColumn(2).setMinWidth(90);
            tblTaiKhoan_TaiKhoan.getColumnModel().getColumn(2).setPreferredWidth(90);
            tblTaiKhoan_TaiKhoan.getColumnModel().getColumn(2).setMaxWidth(90);
        }

        btnThem_TaiKhoan.setText("Thêm ");
        btnThem_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_TaiKhoanActionPerformed(evt);
            }
        });

        btnXoa_TaiKhoan.setText("Xóa");

        btnSua_TaiKhoan.setText("Sửa");
        btnSua_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_TaiKhoanActionPerformed(evt);
            }
        });

        btnReset_TaiKhoan.setText("Reset");

        jLabel18.setText("Tên Nhân Viên");

        jLabel21.setText("User");

        jLabel22.setText("Password");

        jLabel23.setText("Quyền");

        cbbQuyen_TaiKhoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel24.setText("Chú Thích");

        txtChuThich_TaiKhoan.setColumns(20);
        txtChuThich_TaiKhoan.setRows(5);
        jScrollPane9.setViewportView(txtChuThich_TaiKhoan);

        jLabel41.setText("Tài Khoản");

        txtPassword_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword_TaiKhoanActionPerformed(evt);
            }
        });

        jLabel55.setText("ID");

        txtID_TaiKhoan.setEditable(false);

        cbbTenNhanVien_TaiKhoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelTaiKhoanLayout = new javax.swing.GroupLayout(jPanelTaiKhoan);
        jPanelTaiKhoan.setLayout(jPanelTaiKhoanLayout);
        jPanelTaiKhoanLayout.setHorizontalGroup(
            jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(283, 283, 283))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTaiKhoanLayout.createSequentialGroup()
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(jLabel41))
                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 618, Short.MAX_VALUE)
                        .addComponent(btnReset_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSua_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnThem_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(btnXoa_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(txtID_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUser_TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(txtPassword_TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(cbbQuyen_TaiKhoan, 0, 132, Short.MAX_VALUE)
                                    .addComponent(cbbTenNhanVien_TaiKhoan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel22)
                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(46, 46, 46))
        );
        jPanelTaiKhoanLayout.setVerticalGroup(
            jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(cbbTenNhanVien_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUser_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(cbbQuyen_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa_TaiKhoan)
                            .addComponent(btnThem_TaiKhoan))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset_TaiKhoan)
                            .addComponent(btnSua_TaiKhoan))
                        .addGap(173, 173, 173))
                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPaneNhanVien.addTab("Tài Khoản", jPanelTaiKhoan);

        tbljpanel.addTab("Nhân Viên", new javax.swing.ImageIcon(getClass().getResource("/images/nhanvien.png")), jTabbedPaneNhanVien); // NOI18N

        jPanelThongKe.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane19.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Doanh thu theo năm");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Tổng kết 2021:");

        javax.swing.GroupLayout jPanelThongKeLayout = new javax.swing.GroupLayout(jPanelThongKe);
        jPanelThongKe.setLayout(jPanelThongKeLayout);
        jPanelThongKeLayout.setHorizontalGroup(
            jPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThongKeLayout.createSequentialGroup()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 883, Short.MAX_VALUE))
            .addGroup(jPanelThongKeLayout.createSequentialGroup()
                .addGroup(jPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelThongKeLayout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel1))
                    .addGroup(jPanelThongKeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelThongKeLayout.setVerticalGroup(
            jPanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jTabbedPane7.addTab("Thống Kê", jPanelThongKe);

        tbljpanel.addTab("Doanh Thu", new javax.swing.ImageIcon(getClass().getResource("/images/doanhthu.png")), jTabbedPane7); // NOI18N

        jPanelDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelDangXuatMouseClicked(evt);
            }
        });
        jPanelDangXuat.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelDangXuatComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanelDangXuatLayout = new javax.swing.GroupLayout(jPanelDangXuat);
        jPanelDangXuat.setLayout(jPanelDangXuatLayout);
        jPanelDangXuatLayout.setHorizontalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1543, Short.MAX_VALUE)
        );
        jPanelDangXuatLayout.setVerticalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        tbljpanel.addTab("đăng Xuất", new javax.swing.ImageIcon(getClass().getResource("/images/thoat.png")), jPanelDangXuat); // NOI18N

        jPanelMe.setBackground(new java.awt.Color(0, 204, 0));
        jPanelMe.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelMeComponentShown(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 204));
        jLabel15.setText("Nhóm 4:\nNguyễn Xuân Hùng\n");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("Lớp: 21CT111");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 204));
        jLabel5.setText("Tài Hoàng Tuyên (Leader) ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText(" JaVa Cuối Kỳ 40%");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 0));
        jLabel10.setText("Đề Tài: Quản Lý Bán Hàng");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 204));
        jLabel16.setText("Đỗ Ngọc Thắng");

        javax.swing.GroupLayout jPanelMeLayout = new javax.swing.GroupLayout(jPanelMe);
        jPanelMe.setLayout(jPanelMeLayout);
        jPanelMeLayout.setHorizontalGroup(
            jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMeLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 483, Short.MAX_VALUE)
                        .addComponent(lblAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
            .addGroup(jPanelMeLayout.createSequentialGroup()
                .addGroup(jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMeLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMeLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addGroup(jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMeLayout.setVerticalGroup(
            jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addComponent(jLabel10)
                .addGap(55, 55, 55)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanelMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addGroup(jPanelMeLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel15.getAccessibleContext().setAccessibleName("Nhóm 4:\nNguyễn Xuân Hùng\nTài Hoàng Tuyên (Leader)\nĐỗ Ngọc Thắng");

        tbljpanel.addTab("About Me", new javax.swing.ImageIcon(getClass().getResource("/images/me.png")), jPanelMe); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbljpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(tbljpanel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frmDangNhap frmDN = new frmDangNhap();
        frmDN.show();
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnXoa_LoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_LoaiSanPhamActionPerformed

    }//GEN-LAST:event_btnXoa_LoaiSanPhamActionPerformed

    private void cbbMaLoaiSanPham_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaLoaiSanPham_SanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMaLoaiSanPham_SanPhamActionPerformed

    private void txtPassword_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword_TaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword_TaiKhoanActionPerformed

    private void txtSoDT_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDT_NhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoDT_NhanVienActionPerformed

    private void txtDiaChi_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChi_NhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChi_NhanVienActionPerformed

    private void jPanelDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDangXuatMouseClicked

    }//GEN-LAST:event_jPanelDangXuatMouseClicked

    private void jPanelDangXuatComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelDangXuatComponentShown
        frmDangNhap frmdn = new frmDangNhap();
        frmdn.show();
        this.dispose();
    }//GEN-LAST:event_jPanelDangXuatComponentShown

    private void jPanelNhanVienComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelNhanVienComponentShown

 
    }//GEN-LAST:event_jPanelNhanVienComponentShown

    private void jPanelSanPhamComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelSanPhamComponentShown

    }//GEN-LAST:event_jPanelSanPhamComponentShown

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
       
        int viTriDongVuaBam = tblSanPham.getSelectedRow();
        
        setSelectedCombobox(tblSanPham.getValueAt(viTriDongVuaBam, 3).toString(), cbbMaLoaiSanPham_SanPham);
        setSelectedCombobox(tblSanPham.getValueAt(viTriDongVuaBam, 6).toString(), cbbHangSanXuat_SanPham);
        txtMaSanPham_SanPham.setText(tblSanPham.getValueAt(viTriDongVuaBam, 1).toString());
        txtTenSanPham_SanPham.setText(tblSanPham.getValueAt(viTriDongVuaBam, 2).toString());
        txtGiaNhap_SanPham.setText(tblSanPham.getValueAt(viTriDongVuaBam, 4).toString());
        txtGiaBan_SanPham.setText(tblSanPham.getValueAt(viTriDongVuaBam, 5).toString());
        txtTonKho_SanPham.setText(tblSanPham.getValueAt(viTriDongVuaBam, 7).toString());
        txtChuThich_SanPham.setText(tblSanPham.getValueAt(viTriDongVuaBam, 9).toString());
    

    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnThem_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_SanPhamActionPerformed
        String TenSanPham, MaLoaiSanPham, GiaNhap, GiaBan, HangSanXuat, TonKho, TrangThai, Image, ChuThich;
        TenSanPham = txtTenSanPham_SanPham.getText();
        MaLoaiSanPham = GetCbbSelected(cbbMaLoaiSanPham_SanPham);
        GiaNhap = txtGiaNhap_SanPham.getText();
        GiaBan = txtGiaBan_SanPham.getText();
        HangSanXuat = GetCbbSelected(cbbHangSanXuat_SanPham);
        TonKho = txtTonKho_SanPham.getText();
        TrangThai = "1";
        ChuThich = txtChuThich_SanPham.getText();
      

//        String cautruyvan = "insert into SanPham "
//                + "values(N'" + TenSanPham + "'," + MaLoaiSanPham + "," + HangSanXuat + "," + GiaNhap + "," + GiaBan + "," + TonKho + "," + TrangThai  + "',N'" + ChuThich + "')";

            String cautruyvan = "insert into SanPham "
                    + "values(N'" + TenSanPham + "'," + MaLoaiSanPham + "," + HangSanXuat + "," + GiaNhap + "," + GiaBan + "," + TonKho + "," + TrangThai  + ",N'" + ChuThich + "')";

       System.out.println(cautruyvan);
        boolean kiemtra = KiemTraNhanSanPham(0);
        if (kiemtra) {
            hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
        } else {
              System.out.println("Thất Bại");
        }
        LayDuLieuSanPham("1");
    }//GEN-LAST:event_btnThem_SanPhamActionPerformed

    private void bntSua_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSua_SanPhamActionPerformed
        String MaSanPham, TenSanPham, LoaiSanPham, GiaNhap, GiaBan, HangSanXuat, TonKho, TrangThai, Image, ChuThich;
        MaSanPham = txtMaSanPham_SanPham.getText();
        TenSanPham = txtTenSanPham_SanPham.getText();
        LoaiSanPham = GetCbbSelected(cbbMaLoaiSanPham_SanPham);
        GiaNhap = txtGiaNhap_SanPham.getText();
        GiaBan = txtGiaBan_SanPham.getText();
        HangSanXuat = GetCbbSelected(cbbHangSanXuat_SanPham);
        TonKho = txtTonKho_SanPham.getText();
        TrangThai = "1";
       

        ChuThich = txtChuThich_SanPham.getText();
        String cautruyvan = "update  SanPham set "
                + "TenSanPham =" + "N'" + TenSanPham + "',LoaiSanPham=" + LoaiSanPham + ",HangSanXuat="
                + HangSanXuat + ",GiaNhap=" + GiaNhap + ",GiaBan=" + GiaBan + ",TonKho=" + TonKho
                + ",TrangThai=" + TrangThai  + "',ChuThich =N'" + ChuThich + "' where MaSanPham=" + MaSanPham;
        System.out.println(cautruyvan);
        boolean kiemtra = KiemTraNhanSanPham(1);
        if (kiemtra) {
            hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Sửa Thành Công Sản Phẩm");
        } else {
             System.out.println("Thất Bại");
        }
        LayDuLieuSanPham("1");
    }//GEN-LAST:event_bntSua_SanPhamActionPerformed

    private void btnReset_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_SanPhamActionPerformed
        ResSanPham();
    }//GEN-LAST:event_btnReset_SanPhamActionPerformed
    public void ResSanPham() {
        txtMaSanPham_SanPham.setText("");
        txtTenSanPham_SanPham.setText("");
        txtGiaNhap_SanPham.setText("");
        txtGiaBan_SanPham.setText("");
        txtTonKho_SanPham.setText("");
        txtChuThich_SanPham.setText("");
        cbbMaLoaiSanPham_SanPham.setSelectedIndex(0);
        cbbHangSanXuat_SanPham.setSelectedIndex(0);
    }   

    private void jPanel_KhachHangComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel_KhachHangComponentShown
        rbtnNam_KhachHang.setSelected(true);
        layDuLieuKhachHang();
        cbbLoaiKhachHang_KhachHang.setModel(LayDuLieucbb("LoaiKhachHang", "TenLoaiKhachHang", "MaLoaiKhachHang"));
        for (int i = 1; i < 32; i++) {
            cbbNgay.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThang.addItem(String.valueOf(i));
        }
        for (int i = year; i > 1950; i--) {
            cbbNam.addItem(String.valueOf(i));
        }

    }//GEN-LAST:event_jPanel_KhachHangComponentShown

    private void jPanelLoaiSanPhamComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelLoaiSanPhamComponentShown
        layDuLieuLoaiSanPham();
        System.out.println("vô sản Phẩm");

    }//GEN-LAST:event_jPanelLoaiSanPhamComponentShown

    private void jPanelLoaiSanPhamComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanelLoaiSanPhamComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelLoaiSanPhamComponentAdded

    private void tblLoaiSanPham_LoaiSanPhamComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblLoaiSanPham_LoaiSanPhamComponentShown

    }//GEN-LAST:event_tblLoaiSanPham_LoaiSanPhamComponentShown

    private void btnThem_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_NhanVienActionPerformed
        String MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, NgayVaoLam, ChucVu, DiaChi, SoDT, GhiChu;
        MaNhanVien = txtMaNhanVien_NhanVien.getText();
        if (rbtnNam_NhanVien.isSelected()) {
            GioiTinh = "1";
        } else {
            GioiTinh = "0";
        }
        ChucVu = GetCbbSelected(cbbChucVu_NhanVien);
        TenNhanVien = txtTenNhanVien_NhanVien.getText();
        String ngay, thang, nam;
        ngay = cbbNgaySinh_NhanVien.getSelectedItem().toString();
        thang = cbbThangSinh_NhanVien.getSelectedItem().toString();
        nam = cbbNamSinh_NhanVien.getSelectedItem().toString();
        NgaySinh = nam + "-" + thang + "-" + ngay;
        String ngayv, thangv, namv;
        ngayv = cbbNgayVaoLam_NhanVien.getSelectedItem().toString();
        thangv = cbbThangVaoLam_NhanVien.getSelectedItem().toString();
        namv = cbbNamVaoLam_NhanVien.getSelectedItem().toString();
        NgayVaoLam = namv + "-" + thangv + "-" + ngayv;
        DiaChi = txtDiaChi_NhanVien.getText();
        SoDT = txtSoDT_NhanVien.getText();
        GhiChu = txtChuThich_NhanVien.getText();
        String cautruyvan = "insert into NhanVien values(" + "N'" + TenNhanVien
                + "','" + NgaySinh + "'," + GioiTinh + ",'" + NgayVaoLam + "',"
                + ChucVu + ",N'" + DiaChi + "','" + SoDT + "',N'" + GhiChu + "')";
        
        boolean kiemtra = KiemTraNhapNhanVien(0);
        if (kiemtra) {
            hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
            System.out.println(cautruyvan);
        } else {
            System.out.println("Thất Bại");
        }
        layDuLieuNhanVien();
    }//GEN-LAST:event_btnThem_NhanVienActionPerformed

    private void tblNhanVien_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVien_NhanVienMouseClicked
        int viTriDongVuaBam = tblNhanVien_NhanVien.getSelectedRow();
        txtMaNhanVien_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 1).toString());
        txtTenNhanVien_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 2).toString());
        txtDiaChi_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 7).toString());
        txtSoDT_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 8).toString());
        txtChuThich_NhanVien.setText(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 9).toString());
        setSelectedCombobox(tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 6).toString(), cbbChucVu_NhanVien);
        String gioitinh = tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 4).toString();
        if (gioitinh.equals("Nam")) {
            rbtnNam_NhanVien.setSelected(true);
            rbtnNu_NhanVien.setSelected(false);
        } else {
            rbtnNu_NhanVien.setSelected(true);
            rbtnNam_NhanVien.setSelected(false);
        }
        String ngaysinh = tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 3).toString();
        System.out.println("" + ngaysinh);
        String strngay, strthang, strnam;
        strngay = ngaysinh.substring(8, 10);
        strthang = ngaysinh.substring(5, 7);
        strnam = ngaysinh.substring(0, 4);
        int ngay, thang, nam;
        ngay = Integer.valueOf(strngay);
        thang = Integer.valueOf(strthang);
        nam = Integer.valueOf(strnam);
        cbbNgaySinh_NhanVien.setSelectedItem(String.valueOf(ngay));
        cbbThangSinh_NhanVien.setSelectedItem(String.valueOf(thang));
        cbbNamSinh_NhanVien.setSelectedItem(String.valueOf(nam));
        String ngayVaoLam = tblNhanVien_NhanVien.getValueAt(viTriDongVuaBam, 5).toString();
        System.out.println("" + ngayVaoLam);
        String strngayv, strthangv, strnamv;
        strngayv = ngayVaoLam.substring(8, 10);
        strthangv = ngayVaoLam.substring(5, 7);
        strnamv = ngayVaoLam.substring(0, 4);
        int ngayv, thangv, namv;
        ngayv = Integer.valueOf(strngayv);
        thangv = Integer.valueOf(strthangv);
        namv = Integer.valueOf(strnamv);
        cbbNgayVaoLam_NhanVien.setSelectedItem(String.valueOf(ngayv));
        cbbThangVaoLam_NhanVien.setSelectedItem(String.valueOf(thangv));
        cbbNamVaoLam_NhanVien.setSelectedItem(String.valueOf(namv));

    }//GEN-LAST:event_tblNhanVien_NhanVienMouseClicked

    private void jPanelMeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelMeComponentShown
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("huy.jpg"));
            icon = new ImageIcon(img);

            lblAbout.setIcon(icon);
        } catch (IOException e) {

        }
        try {
            playSound("buongdoitaynhaura.wav");
        } catch (Exception e) {
        }

        ve();
    }//GEN-LAST:event_jPanelMeComponentShown
    public void playSound(String soundName) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
    private void btnSua_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_NhanVienActionPerformed
        String MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, NgayVaoLam, ChucVu, DiaChi, SoDT, GhiChu;
        MaNhanVien = txtMaNhanVien_NhanVien.getText();
        if (rbtnNam_NhanVien.isSelected()) {
            GioiTinh = "1";
        } else {
            GioiTinh = "0";
        }
        ChucVu = GetCbbSelected(cbbChucVu_NhanVien);
        TenNhanVien = txtTenNhanVien_NhanVien.getText();
        String ngay, thang, nam;
        ngay = cbbNgaySinh_NhanVien.getSelectedItem().toString();
        thang = cbbThangSinh_NhanVien.getSelectedItem().toString();
        nam = cbbNamSinh_NhanVien.getSelectedItem().toString();
        NgaySinh = nam + "-" + thang + "-" + ngay;
        String ngayv, thangv, namv;
        ngayv = cbbNgayVaoLam_NhanVien.getSelectedItem().toString();
        thangv = cbbThangVaoLam_NhanVien.getSelectedItem().toString();
        namv = cbbNamVaoLam_NhanVien.getSelectedItem().toString();
        NgayVaoLam = namv + "-" + thangv + "-" + ngayv;
        DiaChi = txtDiaChi_NhanVien.getText();
        SoDT = txtSoDT_NhanVien.getText();
        GhiChu = txtChuThich_NhanVien.getText();
        String cautruyvan = "update NhanVien set TenNhanVien=" + "N'" + TenNhanVien
                + "',NgaySinh='" + NgaySinh + "',GioiTinh=" + GioiTinh
                + ",NgayVaoLam='" + NgayVaoLam + "',ChucVu="
                + ChucVu + ",DiaChi=N'" + DiaChi + "',SoDT='" + SoDT + "',GhiChu=N'" + GhiChu + "'where MaNhanVien=" + MaNhanVien;
        boolean kiemtra = KiemTraNhapNhanVien(1);
        if (kiemtra) {
            hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã sửa Thành Công");
        } else {
            ThongBao("Không thể sửa Nhân Viên", "lỗi", 2);
        }
        layDuLieuNhanVien();
    }//GEN-LAST:event_btnSua_NhanVienActionPerformed

    private void btnReset_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_NhanVienActionPerformed
        ResNhanVien();

    }//GEN-LAST:event_btnReset_NhanVienActionPerformed
    public void ResNhanVien() {
        txtMaNhanVien_NhanVien.setText("");
        txtTenNhanVien_NhanVien.setText("");
        cbbNgaySinh_NhanVien.setSelectedItem("25");
        cbbThangSinh_NhanVien.setSelectedItem("12");
        cbbNamSinh_NhanVien.setSelectedItem("1996");
        cbbNgayVaoLam_NhanVien.setSelectedItem("25");
        cbbThangVaoLam_NhanVien.setSelectedItem("12");
        cbbNamVaoLam_NhanVien.setSelectedItem("1996");
        txtDiaChi_NhanVien.setText("");
        txtSoDT_NhanVien.setText("");
        txtChuThich_NhanVien.setText("");
        cbbChucVu_NhanVien.setSelectedIndex(0);
        rbtnNam_NhanVien.setSelected(true);
        rbtnNu_NhanVien.setSelected(false);

    }
    private void jPanelTaiKhoanComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelTaiKhoanComponentShown
        layDuLieuTaiKhoan();
        cbbQuyen_TaiKhoan.setModel(LayDuLieucbb("Quyen", "TenQuyen", "MaQuyen"));
        cbbTenNhanVien_TaiKhoan.setModel(LayDuLieucbb("NhanVien", "TenNhanVien", "MaNhanVien"));
    }//GEN-LAST:event_jPanelTaiKhoanComponentShown

    private void tblTaiKhoan_TaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTaiKhoan_TaiKhoanMouseClicked

        int viTriDongVuaBam = tblTaiKhoan_TaiKhoan.getSelectedRow();
        txtID_TaiKhoan.setText(tblTaiKhoan_TaiKhoan.getValueAt(viTriDongVuaBam, 1).toString());
        txtUser_TaiKhoan.setText(tblTaiKhoan_TaiKhoan.getValueAt(viTriDongVuaBam, 3).toString());
        txtPassword_TaiKhoan.setText(tblTaiKhoan_TaiKhoan.getValueAt(viTriDongVuaBam, 4).toString());
        txtChuThich_TaiKhoan.setText(tblTaiKhoan_TaiKhoan.getValueAt(viTriDongVuaBam, 6).toString());
        setSelectedCombobox(tblTaiKhoan_TaiKhoan.getValueAt(viTriDongVuaBam, 2).toString(), cbbTenNhanVien_TaiKhoan);
        setSelectedCombobox(tblTaiKhoan_TaiKhoan.getValueAt(viTriDongVuaBam, 5).toString(), cbbQuyen_TaiKhoan);


    }//GEN-LAST:event_tblTaiKhoan_TaiKhoanMouseClicked

    private void btnThem_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_TaiKhoanActionPerformed
        String ID, MaNhanVien, TenDangNhap, Password, Quyen, ChuThich;
        ID = txtID_TaiKhoan.getText();
        MaNhanVien = GetCbbSelected(cbbTenNhanVien_TaiKhoan);
        TenDangNhap = txtUser_TaiKhoan.getText();
        Password = String.valueOf(txtPassword_TaiKhoan.getPassword()).trim();
        Quyen = GetCbbSelected(cbbQuyen_TaiKhoan);
        ChuThich = txtChuThich_TaiKhoan.getText();
        String cautruyvan = "insert into Users values(" + MaNhanVien
                + " ,'" + TenDangNhap + "' , '" + Password + "' ," + Quyen
                + ", N'" + ChuThich + "')";
        System.out.println(cautruyvan);
        boolean kiemtra = true;
        if (kiemtra) {
            hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
        } else {
            ThongBao("Không thể Thêm tài Khoản", "lỗi", 2);
        }
        layDuLieuTaiKhoan();
    }//GEN-LAST:event_btnThem_TaiKhoanActionPerformed

    private void btnSua_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_TaiKhoanActionPerformed
        String ID, MaNhanVien, TenDangNhap, Password, Quyen, ChuThich;
        ID = txtID_TaiKhoan.getText();
        MaNhanVien = GetCbbSelected(cbbTenNhanVien_TaiKhoan);
        TenDangNhap = txtUser_TaiKhoan.getText();
        Password = String.valueOf(txtPassword_TaiKhoan.getPassword()).trim();
        Quyen = GetCbbSelected(cbbQuyen_TaiKhoan);
        ChuThich = txtChuThich_TaiKhoan.getText();
        String cautruyvan = "update  Users set MaNhanVien=" + MaNhanVien
                + " ,TenDangNhap='" + TenDangNhap + "' ,Password= '" + Password + "' ,Quyen=" + Quyen
                + ",ChuThich= N'" + ChuThich + "'Where ID=" + ID;
        boolean kiemtra = true;
        if (kiemtra) {
            hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Sửa Thành Công tài khoản có id=" + ID);
        } else {
            ThongBao("Không thể Sửa tài Khoản với Tên đăng nhập là =" + TenDangNhap, "lỗi", 2);
        }
        layDuLieuTaiKhoan();
    }//GEN-LAST:event_btnSua_TaiKhoanActionPerformed

    private void cbbThangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThangItemStateChanged

        String thang = cbbThang.getSelectedItem().toString();
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        String thanght;
        if (tam == 0) {
            thanght = "0";
        } else {
            thanght = cbbNgay.getSelectedItem().toString();
        }
        tam = 1;

        if (thang.equals("4") || thang.equals("6") || thang.equals("9") || thang.equals("11")) {
            cbbNgay.setModel(cbbmodel);
            for (int i = 1; i < 31; i++) {
                cbbNgay.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 31) {
                cbbNgay.setSelectedItem(thanght);
            }
        } else if (thang.equals("1") || thang.equals("3") || thang.equals("5")
                || thang.equals("7") || thang.equals("8") || thang.equals("12") || thang.equals("10")) {

            cbbNgay.setModel(cbbmodel);
            for (int i = 1; i < 32; i++) {
                cbbNgay.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 32) {
                cbbNgay.setSelectedItem(thanght);
            }
        } else {
            cbbNgay.setModel(cbbmodel);
            for (int i = 1; i < 29; i++) {
                cbbNgay.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 29) {
                cbbNgay.setSelectedItem(thanght);
            }
        }
    }//GEN-LAST:event_cbbThangItemStateChanged

    private void cbbThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbThangActionPerformed

    }//GEN-LAST:event_cbbThangActionPerformed

    private void btnThem_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_KhachHangActionPerformed
        String MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, DiaChi, SDT, LoaiKhachHang, ChuThich;
        MaKhachHang = txtMaKhachHang_KhachHang.getText();
        TenKhachHang = txtTenKhachHang_KhachHang.getText();
        String ngay, thang, nam;
        ngay = cbbNgay.getSelectedItem().toString();
        thang = cbbThang.getSelectedItem().toString();
        nam = cbbNam.getSelectedItem().toString();
        NgaySinh = nam + "-" + thang + "-" + ngay;
        if (rbtnNam_KhachHang.isSelected()) {
            GioiTinh = "1";
        } else {
            GioiTinh = "0";
        }
        DiaChi = txtDiaChi_KhachHang.getText();
        SDT = txtSDT_KhachHang.getText();
        LoaiKhachHang = GetCbbSelected(cbbLoaiKhachHang_KhachHang);
        ChuThich = txtGhiChu_KhachHang.getText();
        String cautruyvan = "insert into KhachHang values("
                + " N'" + TenKhachHang + "' , '" + NgaySinh + "' ," + GioiTinh
                + ",N'" + DiaChi + "','" + SDT + "'," + LoaiKhachHang + ", N'" + ChuThich + "')";
        boolean kiemtra = KiemTraNhapKhachHang(0);
        if (kiemtra) {
            hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
              System.out.println(cautruyvan);

        } else {
            System.out.println("Thêm Thất Bại");
        }
        layDuLieuKhachHang();

    }//GEN-LAST:event_btnThem_KhachHangActionPerformed

    private void tblKhachHang_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHang_KhachHangMouseClicked
        int viTriDongVuaBam = tblKhachHang_KhachHang.getSelectedRow();

        txtMaKhachHang_KhachHang.setText(tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 1).toString());
        txtTenKhachHang_KhachHang.setText(tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 2).toString());
        txtDiaChi_KhachHang.setText(tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 5).toString());
        txtSDT_KhachHang.setText(tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 6).toString());
        txtGhiChu_KhachHang.setText(tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 8).toString());
        setSelectedCombobox(tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 7).toString(), cbbLoaiKhachHang_KhachHang);
        String gioitinh = tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 4).toString();

        if (gioitinh.equals("Nam")) {
            rbtnNam_KhachHang.setSelected(true);
            rbtnNu_KhachHang.setSelected(false);
        } else {
            rbtnNam_KhachHang.setSelected(false);
            rbtnNu_KhachHang.setSelected(true);
        }
        String ngaysinh = tblKhachHang_KhachHang.getValueAt(viTriDongVuaBam, 3).toString();
        System.out.println("" + ngaysinh);
        String strngay, strthang, strnam;
        strngay = ngaysinh.substring(8, 10);
        strthang = ngaysinh.substring(5, 7);
        strnam = ngaysinh.substring(0, 4);
        int ngay, thang, nam;
        ngay = Integer.valueOf(strngay);
        thang = Integer.valueOf(strthang);
        nam = Integer.valueOf(strnam);
        cbbNgay.setSelectedItem(String.valueOf(ngay));
        cbbThang.setSelectedItem(String.valueOf(thang));
        cbbNam.setSelectedItem(String.valueOf(nam));
        lblMaKhachHang_KhachHang.setForeground(Color.black);
        lblTenKhachHang_KhachHang.setForeground(Color.black);
        lblDiaChi_KhachHang.setForeground(Color.black);
        lblSDT_KhachHang.setForeground(Color.black);
    }//GEN-LAST:event_tblKhachHang_KhachHangMouseClicked

    private void btnSua_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_KhachHangActionPerformed
        String MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, DiaChi, SDT, LoaiKhachHang, ChuThich;
        MaKhachHang = txtMaKhachHang_KhachHang.getText();
        TenKhachHang = txtTenKhachHang_KhachHang.getText();
        String ngay, thang, nam;
        ngay = cbbNgay.getSelectedItem().toString();
        thang = cbbThang.getSelectedItem().toString();
        nam = cbbNam.getSelectedItem().toString();
        NgaySinh = nam + "-" + thang + "-" + ngay;
        if (rbtnNam_KhachHang.isSelected()) {
            GioiTinh = "1";
        } else {
            GioiTinh = "0";
        }
        DiaChi = txtDiaChi_KhachHang.getText();
        SDT = txtSDT_KhachHang.getText();
        LoaiKhachHang = GetCbbSelected(cbbLoaiKhachHang_KhachHang);
        ChuThich = txtGhiChu_KhachHang.getText();
        String cautruyvan = "update  KhachHang set "
                + "TenKhachHang= N'" + TenKhachHang + "' , NgaySinh='" + NgaySinh + "' ,GioiTinh=" + GioiTinh
                + ",DiaChi=N'" + DiaChi + "',SDT='" + SDT + "',LoaiKhachHang=" + LoaiKhachHang + ",GhiChu= N'" + ChuThich + "'where MaKhachHang=" + MaKhachHang;
        System.out.println(cautruyvan);
        boolean kiemtra = KiemTraNhapKhachHang(1);
        if (kiemtra) {
            hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã sủa Thành Công");
        } else {
            System.out.println("Sửa thất bại");
        }
        layDuLieuKhachHang();
    }//GEN-LAST:event_btnSua_KhachHangActionPerformed

    private void btnReset_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_KhachHangActionPerformed
        ResKhachHang();
    }//GEN-LAST:event_btnReset_KhachHangActionPerformed
    public void ResKhachHang() {
        String MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, DiaChi, SDT, LoaiKhachHang, ChuThich;
        txtMaKhachHang_KhachHang.setText("");
        txtTenKhachHang_KhachHang.setText("");
        cbbNgay.setSelectedIndex(1);
        cbbThang.setSelectedIndex(1);
        cbbNam.setSelectedIndex(20);
        txtDiaChi_KhachHang.setText("");
        txtSDT_KhachHang.setText("");
        cbbLoaiKhachHang_KhachHang.setSelectedIndex(1);
        txtGhiChu_KhachHang.setText("");
    }   

    private void tblLoaiSanPham_LoaiSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiSanPham_LoaiSanPhamMouseClicked

        int viTriDongVuaBam = tblLoaiSanPham_LoaiSanPham.getSelectedRow();
        txtMaLoaiSanPham_LoaiSanPham.setText(tblLoaiSanPham_LoaiSanPham.getValueAt(viTriDongVuaBam, 1).toString());
        txtTenLoaiSanPham_LoaiSanPham.setText(tblLoaiSanPham_LoaiSanPham.getValueAt(viTriDongVuaBam, 2).toString());

        LayDuLieuSanPhamofLoaiSanPham(txtMaLoaiSanPham_LoaiSanPham.getText());
    }//GEN-LAST:event_tblLoaiSanPham_LoaiSanPhamMouseClicked

    private void btnSua_LoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_LoaiSanPhamActionPerformed
        String MaLoaiSanPham, TenLoai;
        MaLoaiSanPham = txtMaLoaiSanPham_LoaiSanPham.getText();
        TenLoai = txtTenLoaiSanPham_LoaiSanPham.getText();
        String cautruyvan = "update LoaiSanPham set"
                + " TenLoaiSanPham=N'" + TenLoai + "'where MaLoaiSanPham=" + MaLoaiSanPham;
        if (!txtTenLoaiSanPham_LoaiSanPham.equals("")) {
            hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã sửa Thành Công");
        } else {
            ThongBao("Bạn chưa nhập tên loại sản phẩm", TenLoai, i);
        }
        layDuLieuLoaiSanPham();
    }//GEN-LAST:event_btnSua_LoaiSanPhamActionPerformed

    private void btnThem_LoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_LoaiSanPhamActionPerformed
        String MaLoaiSanPham, TenLoai;
        MaLoaiSanPham = txtMaLoaiSanPham_LoaiSanPham.getText();
        TenLoai = txtTenLoaiSanPham_LoaiSanPham.getText();
        String cautruyvan = "insert into LoaiSanPham values("
                + " N'" + TenLoai + "')";
        System.out.println(cautruyvan);
        boolean kiemtra = true;
        if (!txtTenLoaiSanPham_LoaiSanPham.equals("")) {
            hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
        } else {
            ThongBao("Bạn chưa nhập tên loại sản phẩm", TenLoai, i);
        }
        layDuLieuLoaiSanPham();
    }//GEN-LAST:event_btnThem_LoaiSanPhamActionPerformed
    public int tam1 = 0;
    private void cbbThangSinh_NhanVienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThangSinh_NhanVienItemStateChanged
        String thang = cbbThangSinh_NhanVien.getSelectedItem().toString();
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        String thanght;
        if (tam == 0) {
            thanght = "0";
        } else {
            thanght = cbbNgaySinh_NhanVien.getSelectedItem().toString();
        }
        tam = 1;

        if (thang.equals("4") || thang.equals("6") || thang.equals("9") || thang.equals("11")) {
            cbbNgaySinh_NhanVien.setModel(cbbmodel);
            for (int i = 1; i < 31; i++) {
                cbbNgaySinh_NhanVien.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 31) {
                cbbNgaySinh_NhanVien.setSelectedItem(thanght);
            }
        } else if (thang.equals("1") || thang.equals("3") || thang.equals("5")
                || thang.equals("7") || thang.equals("8") || thang.equals("12") || thang.equals("10")) {

            cbbNgaySinh_NhanVien.setModel(cbbmodel);
            for (int i = 1; i < 32; i++) {
                cbbNgaySinh_NhanVien.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 32) {
                cbbNgaySinh_NhanVien.setSelectedItem(thanght);
            }
        } else {
            cbbNgaySinh_NhanVien.setModel(cbbmodel);
            for (int i = 1; i < 29; i++) {
                cbbNgaySinh_NhanVien.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 29) {
                cbbNgaySinh_NhanVien.setSelectedItem(thanght);
            }
        }

    }//GEN-LAST:event_cbbThangSinh_NhanVienItemStateChanged

    private void cbbThangVaoLam_NhanVienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbThangVaoLam_NhanVienItemStateChanged
        String thang = cbbThangVaoLam_NhanVien.getSelectedItem().toString();
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        String thanght;
        if (tam == 0) {
            thanght = "0";
        } else {
            thanght = cbbNgayVaoLam_NhanVien.getSelectedItem().toString();
        }
        tam = 1;

        if (thang.equals("4") || thang.equals("6") || thang.equals("9") || thang.equals("11")) {
            cbbNgayVaoLam_NhanVien.setModel(cbbmodel);
            for (int i = 1; i < 31; i++) {
                cbbNgayVaoLam_NhanVien.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 31) {
                cbbNgayVaoLam_NhanVien.setSelectedItem(thanght);
            }
        } else if (thang.equals("1") || thang.equals("3") || thang.equals("5")
                || thang.equals("7") || thang.equals("8") || thang.equals("12") || thang.equals("10")) {

            cbbNgayVaoLam_NhanVien.setModel(cbbmodel);
            for (int i = 1; i < 32; i++) {
                cbbNgayVaoLam_NhanVien.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 32) {
                cbbNgayVaoLam_NhanVien.setSelectedItem(thanght);
            }
        } else {
            cbbNgayVaoLam_NhanVien.setModel(cbbmodel);
            for (int i = 1; i < 29; i++) {
                cbbNgayVaoLam_NhanVien.addItem(String.valueOf(i));
            }
            if (Integer.valueOf(thanght) < 29) {
                cbbNgayVaoLam_NhanVien.setSelectedItem(thanght);
            }
        }

    }//GEN-LAST:event_cbbThangVaoLam_NhanVienItemStateChanged

    private void jTabbedPaneNhanVienComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPaneNhanVienComponentShown
 rbtnNam_NhanVien.setSelected(true);
        layDuLieuNhanVien();
        cbbChucVu_NhanVien.setModel(LayDuLieucbb("ChucVu", "TenChucVu", "MaChucVu"));
        for (int i = 1; i < 32; i++) {
            cbbNgaySinh_NhanVien.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThangSinh_NhanVien.addItem(String.valueOf(i));
        }
        for (int i = 2016; i > 1950; i--) {
            cbbNamSinh_NhanVien.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 32; i++) {
            cbbNgayVaoLam_NhanVien.addItem(String.valueOf(i));
        }
        for (int i = 1; i < 13; i++) {
            cbbThangVaoLam_NhanVien.addItem(String.valueOf(i));
        }
        for (int i = 2016; i > 2000; i--) {
            cbbNamVaoLam_NhanVien.addItem(String.valueOf(i));
        }
    }//GEN-LAST:event_jTabbedPaneNhanVienComponentShown

    private void rbtnNam_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNam_NhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnNam_NhanVienActionPerformed

    private void btnXoa_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_SanPhamActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_btnXoa_SanPhamActionPerformed
    public boolean XoaSanPham() {
        String MaSanPham = txtMaSanPham_SanPham.getText();
        String cautruyvan = "delete SanPham where MaSanPham=" + MaSanPham;
        String ctvKiemThu = "select count(MaCTHD) as SoChiTietHoaDon"
                + " from SanPham,ChiTietHoaDon where SanPham.MaSanPham=ChiTietHoaDon.MaSanPham and SanPham.MaSanPham=" + MaSanPham;
        ResultSet rs1 = main.hungnguyen.connection.ExcuteQueryGetTable(ctvKiemThu);
        String ctvKiemThu2 = "select count(MaCTPN) as SoChiTietPhieuNhap"
                + " from SanPham,ChiTietPhieuNhap where SanPham.MaSanPham=ChiTietPhieuNhap.MaSanPham and SanPham.MaSanPham=" + MaSanPham;
        ResultSet rs2 = main.hungnguyen.connection.ExcuteQueryGetTable(ctvKiemThu2);
        int so1 = 0, so2 = 0;

        try {
            if (rs1.next()) {
                so1 = rs1.getInt("SoChiTietHoaDon");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        try {

            if (rs2.next()) {
                so2 = rs2.getInt("SoChiTietPhieuNhap");
                if (rs2.getInt("SoChiTietPhieuNhap") == 0 && so1 == 0) {
                    main.hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
                    System.out.println("đã xóa");
                    LayDuLieuSanPham("1");
                    return true;
                } else {
                    ThongBao("không thể xóa bởi có trong " + so1 + "  Chi tiết hóa đơn hóa đơn \n và có trong "
                            + so2 + "  chi tiết phiếu Nhập", "báo lỗi", 2);
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
    private void btnXoa_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_KhachHangActionPerformed

        String MaKhachHang = txtMaKhachHang_KhachHang.getText();
        if (!MaKhachHang.equals("")) {
            String cautruyvan = "delete KhachHang where MaKhachHang=" + MaKhachHang;
            String ctvKiemThu = "select count(MaHoaDon) as SoPhieuMua"
                    + " from KhachHang,HoaDon where KhachHang.MaKhachHang=HoaDon.MaKhachHang"
                    + " and  KhachHang.MaKhachHang=" + MaKhachHang;
            ResultSet rs1 = main.hungnguyen.connection.ExcuteQueryGetTable(ctvKiemThu);
            System.out.println(ctvKiemThu);
            int so1 = 0;
            try {
                if (rs1.next()) {
                    so1 = rs1.getInt("SoPhieuMua");
                    if (rs1.getInt("SoPhieuMua") == 0) {
                        main.hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
                        System.out.println("đã xóa");
                        layDuLieuKhachHang();
                        ResKhachHang();
                    } else {
                        ThongBao("không thể xóa bởi Khách Hàng đã có " + so1 + " hóa đơn!", "báo lỗi", 2);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            ThongBao("bạn chưa nhập Mã khách hàng", "lỗi khi cố muốn xóa mà không thèm nhập mã", 2);
        }
    }//GEN-LAST:event_btnXoa_KhachHangActionPerformed

    private void btnXoa_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_NhanVienActionPerformed

        String MaNhanVien = txtMaNhanVien_NhanVien.getText();
        if (!MaNhanVien.equals("")) {
            String cautruyvan = "delete NhanVien where MaNhanVien=" + MaNhanVien;
            String ctvKiemThu = "select count(MaHoaDon) as SoHoaDon"
                    + " from NhanVien,HoaDon where NhanVien.MaNhanVien=HoaDon.MaNhanVien and NhanVien.MaNhanVien=" + MaNhanVien;
            ResultSet rs1 = main.hungnguyen.connection.ExcuteQueryGetTable(ctvKiemThu);
            String ctvKiemThu2 = "select count(MaPhieuNhap) as SoPhieuNhap"
                    + " from NhanVien,PhieuNhap where NhanVien.MaNhanVien=PhieuNhap.MaNhanVien and NhanVien.MaNhanVien=" + MaNhanVien;
            ResultSet rs2 = main.hungnguyen.connection.ExcuteQueryGetTable(ctvKiemThu2);
            int so1 = 0, so2 = 0;

            try {
                if (rs1.next()) {
                    so1 = rs1.getInt("SoHoaDon");
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            try {

                if (rs2.next()) {
                    so2 = rs2.getInt("SoPhieuNhap");
                    if (rs2.getInt("SoPhieuNhap") == 0 && so1 == 0) {
                        main.hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
                        System.out.println("đã xóa");
                        layDuLieuNhanVien();
                        ResNhanVien();
                    } else {
                        ThongBao("không thể xóa bởi có trong " + so1 + " hóa đơn \n và có trong "
                                + so2 + "   phiếu Nhập", "báo lỗi", 2);
                    }
                }

            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        } else {
            ThongBao("bạn chưa nhập mã nhân viên", "lỗi khi cố xóa nhân viên mà chưa click chuột vô anh ấy", 2);
        }
    }//GEN-LAST:event_btnXoa_NhanVienActionPerformed

    private void txtTenKhachHang_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhachHang_KhachHangActionPerformed

    private void txtTenKhachHang_KhachHangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHangKeyPressed

    }//GEN-LAST:event_txtTenKhachHang_KhachHangKeyPressed

    private void txtTenKhachHang_KhachHangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHangKeyTyped

    }//GEN-LAST:event_txtTenKhachHang_KhachHangKeyTyped

    private void txtTenKhachHang_KhachHangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHangFocusLost
        lblTenKhachHang_KhachHang.setForeground(Color.black);
    }//GEN-LAST:event_txtTenKhachHang_KhachHangFocusLost

    private void txtDiaChi_KhachHangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaChi_KhachHangFocusLost
       lblDiaChi_KhachHang.setForeground(Color.black);
    }//GEN-LAST:event_txtDiaChi_KhachHangFocusLost

    private void txtSDT_KhachHangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDT_KhachHangFocusLost
         lblSDT_KhachHang.setForeground(Color.black);
    }//GEN-LAST:event_txtSDT_KhachHangFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    if(frmDangNhap.quyen==2){
        System.out.println("phạm hoàng huy");
    }
    }//GEN-LAST:event_formWindowOpened

    private void jPanelChucVuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelChucVuComponentShown
        layDuLieuChucVu();
    }//GEN-LAST:event_jPanelChucVuComponentShown

    private void btnReset_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_ChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReset_ChucVuActionPerformed

    private void txtMaChucVu_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaChucVu_ChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaChucVu_ChucVuActionPerformed

    private void btnSua_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_ChucVuActionPerformed
        String MaChucVu, TenChucVu, DiaChi, GhiChu;
        MaChucVu = txtMaChucVu_ChucVu.getText();
        TenChucVu = txtTenChucVu_ChucVu.getText();
        GhiChu = txtChuThich_ChucVu.getText();
        String cautruyvan = "update  ChucVu set TenChucVu="
        + " N'" + TenChucVu + "',GhiChu= N'" + GhiChu + "'Where MaChucVu=" + MaChucVu;
        System.out.println(cautruyvan);
        boolean kiemtra = true;
        if (kiemtra) {
            hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Sửa Thành Công");
        } else {
            ThongBao("Không thể Sửa chức Vụ", "lỗi", 2);
        }
        layDuLieuChucVu();
    }//GEN-LAST:event_btnSua_ChucVuActionPerformed

    private void btnThem_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_ChucVuActionPerformed
        String MaChucVu, TenChucVu, DiaChi, GhiChu;
        MaChucVu = txtMaChucVu_ChucVu.getText();
        TenChucVu = txtTenChucVu_ChucVu.getText();
        GhiChu = txtChuThich_ChucVu.getText();
        String cautruyvan = "insert into ChucVu values("
        + " N'" + TenChucVu + "', N'" + GhiChu + "')";
        System.out.println(cautruyvan);
        boolean kiemtra = true;
        if (kiemtra) {
            hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Thêm Thành Công");
        } else {
            ThongBao("Không thể Thêm chức Vụ", "lỗi", 2);
        }
        layDuLieuChucVu();
    }//GEN-LAST:event_btnThem_ChucVuActionPerformed

    private void tblChucVu_ChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChucVu_ChucVuMouseClicked
        int viTriDongVuaBam = tblChucVu_ChucVu.getSelectedRow();
        txtMaChucVu_ChucVu.setText(tblChucVu_ChucVu.getValueAt(viTriDongVuaBam, 1).toString());
        txtTenChucVu_ChucVu.setText(tblChucVu_ChucVu.getValueAt(viTriDongVuaBam, 2).toString());
        txtChuThich_ChucVu.setText(tblChucVu_ChucVu.getValueAt(viTriDongVuaBam, 3).toString());
        layDuLieuNhanVienofChucVu(txtMaChucVu_ChucVu.getText());
    }//GEN-LAST:event_tblChucVu_ChucVuMouseClicked

    
    public boolean KiemTraNhapKhachHang(int ts) {
        String MaKhachHang, TenKhachHang, Ngaysinh, DiaChi, SDT;
        boolean kiemtra = false;
        MaKhachHang = txtMaKhachHang_KhachHang.getText();
        TenKhachHang = txtTenKhachHang_KhachHang.getText();
        String ngay, thang, nam, ThongBao = "";
        ngay = cbbNgay.getSelectedItem().toString();
        thang = cbbThang.getSelectedItem().toString();
        nam = cbbNam.getSelectedItem().toString();
        Ngaysinh = nam + "-" + thang + "-" + ngay;
        DiaChi = txtDiaChi_KhachHang.getText();
        SDT = txtSDT_KhachHang.getText();
        if (MaKhachHang.equals("") && ts == 1) {
            ThongBao += "bạn chưa chọn khách hàng để lấy  Mã Khách Hàng\n";
            lblMaKhachHang_KhachHang.setForeground(Color.red);
        }
        if (TenKhachHang.equals("")) {
            ThongBao += "bạn chưa Nhập Tên Khách Hàng\n";
            lblTenKhachHang_KhachHang.setForeground(Color.red);
        }
        if (DiaChi.equals("")) {
            lblDiaChi_KhachHang.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Địa Chỉ\n";
        }
        if (SDT.equals("")) {
            lblSDT_KhachHang.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Số ĐT \n";
        }
        if (ThongBao.equals("")) {
            kiemtra = true;
            lblDiaChi_KhachHang.setForeground(Color.black);
            lblSDT_KhachHang.setForeground(Color.black);
            lblMaKhachHang_KhachHang.setForeground(Color.black);
            lblTenKhachHang_KhachHang.setForeground(Color.black);
        } else {
            kiemtra = false;
            ThongBao(ThongBao, "lỗi nhập liệu", 2);
        }
        return kiemtra;
    }

          public boolean KiemTraEmail(String email){
        boolean kq=false;
       String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern v = Pattern.compile(EMAIL_PATTERN);
        Matcher m= v.matcher(email);
        kq=m.matches();
        return kq;
   }
 
        public boolean KiemTraNhapNhanVien(int ts) {
        String MaNhanVien, TenNhanVien, DiaChi, SDT;
        boolean kiemtra = false;
        MaNhanVien = txtMaNhanVien_NhanVien.getText();
        TenNhanVien = txtTenNhanVien_NhanVien.getText();
        String  ThongBao = "";
        DiaChi = txtDiaChi_NhanVien.getText();
        SDT = txtSoDT_NhanVien.getText();
        if (MaNhanVien.equals("") && ts == 1) {
            ThongBao += "bạn chưa chọn khách hàng để lấy  Mã Khách Hàng\n";
            lblMaNhanVien_NhanVien.setForeground(Color.red);
        }
        if (TenNhanVien.equals("")) {
            ThongBao += "bạn chưa Nhập Tên Nhân Viên\n";
            lblTenNhanVien_NhanVien.setForeground(Color.red);
        }
        if (DiaChi.equals("")) {
            lblDiaChi_NhanVien.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Địa Chỉ\n";
        }
        if (SDT.equals("")) {
            lblSDT_NhanVien.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Số ĐT \n";
        }
        if (ThongBao.equals("")) {
            kiemtra = true;
            lblMaNhanVien_NhanVien.setForeground(Color.black);
            lblSDT_NhanVien.setForeground(Color.black);
            lblTenNhanVien_NhanVien.setForeground(Color.black);
            lblDiaChi_NhanVien.setForeground(Color.black);
        } else {
            kiemtra = false;
            ThongBao(ThongBao, "lỗi nhập liệu", 2);
        }
        return kiemtra;
    }
          public boolean KiemTraNhanSanPham(int ts) {
        String MaSanPham, TenSanPham, GiaNhap,GiaBan,TonKho;
        boolean kiemtra = false;
        MaSanPham = txtMaSanPham_SanPham.getText();
        TenSanPham = txtTenSanPham_SanPham.getText();
        TonKho= txtTonKho_SanPham.getText().trim();
        String  ThongBao = "";
        GiaNhap = txtGiaNhap_SanPham.getText();
        GiaBan = txtGiaBan_SanPham.getText();
        if (MaSanPham.equals("") && ts == 1) {
            ThongBao += "bạn chưa chọn khách hàng để lấy  Mã Khách Hàng\n";
            lblMaSanPham_SanPham.setForeground(Color.red);
        }
        if (TenSanPham.equals("")) {
            ThongBao += "bạn chưa Nhập Tên Sản Phẩm\n";
            lblTenSanPham_SanPham.setForeground(Color.red);
        }
        if (GiaNhap.equals("")) {
            lblGiaNhap_SanPham.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Giá Bán\n";
        }
        if (GiaBan.equals("")) {
            lblGiaBan.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Giá Bán \n";
        }
              try {
                  int bien =Integer.valueOf(GiaNhap);
              } catch (Exception e) {
                  ThongBao+="Giá Nhập Phải là số !\n";
              }
               try {
                  int bien =Integer.valueOf(GiaBan);
              } catch (Exception e) {
                  ThongBao+="Giá Bán Phải là số !\n";
              }
              try {
                   if (Integer.valueOf(GiaNhap)>Integer.valueOf(GiaBan)) {
            lblGiaBan.setForeground(Color.red);
            ThongBao += "Nhập Giá Bán Phải Lớn Hơn Giá Nhập \n";
        } 
              } catch (Exception e) {
              }
      
         if (TonKho.equals("")) {
            lblTonKho_SanPham.setForeground(Color.red);
            ThongBao += "bạn chưa Nhập Tồn Kho \n";
        }
        if (ThongBao.equals("")) {
            kiemtra = true;
            lblTenSanPham_SanPham.setForeground(Color.black);
            lblMaSanPham_SanPham.setForeground(Color.black);
            lblGiaBan.setForeground(Color.black);
             lblTonKho_SanPham.setForeground(Color.black);
            lblGiaNhap_SanPham.setForeground(Color.black);
        } else {
            kiemtra = false;
            ThongBao(ThongBao, "lỗi nhập liệu", 2);
        }
        return kiemtra;
    }



    public int GetGiaSanPham(String MaSP) {
        int Gia = 0;
        String cautruyvan = "select * from SanPham where MaSanPham=" + MaSP;
        ResultSet rs = main.hungnguyen.connection.ExcuteQueryGetTable(cautruyvan);
        try {
            if (rs.next()) {
                Gia = rs.getInt("Giaban");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return Gia;
    }

    public String GetCbbSelected(JComboBox cbb) {
        Object[] obj = cbb.getSelectedObjects();
        displayvalueModel item = (displayvalueModel) obj[0];
        return item.displayvalue.toString();

    }

    public String GetMaSanPham() {
        return txtMaSanPham_SanPham.getText();
    }

    public void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }

    public void setSelectedCombobox(String cbbselected, JComboBox cbb) {
        for (int i = 0; i < cbb.getItemCount(); i++) {
            Object obj = cbb.getItemAt(i);
            if (obj != null) {
                displayvalueModel m = (displayvalueModel) obj;
                if (cbbselected.trim().equals(m.displayMember)) {
                    cbb.setSelectedItem(m);
                }
            }
        }
    }
    


    public void LayDuLieuSanPham(String TrangThai) {
        String cautruyvan = "";
        cautruyvan = "select MaSanPham,SanPham.TenSanPham,SanPham.LoaiSanPham,GiaNhap,GiaBan,HangsanXuat.TenHangSanXuat as THSX,TonKho,LoaiSanPham.TenLoaiSanPham"
                + " as TenLoaiSanPham,Image,SanPham.ChuThich from SanPham,LoaiSanPham,HangSanXuat where "
                + "SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=" + TrangThai;
        ResultSet rs = hungnguyen.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Sản Phẩm", "Tên sản phẩm", "Loại sản phẩm", "Giá nhập", "Giá bán", "Hãng sản Xuất", "Tồn kho", "ảnh", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblSanPham.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[10];
                item[0] = c;
                item[1] = rs.getInt("MaSanPham");
                item[2] = rs.getString("TenSanPham");
                item[3] = rs.getString("TenLoaiSanPham");
                item[4] = rs.getInt("GiaNhap");
                item[5] = rs.getInt("GiaBan");
                item[6] = rs.getString("THSX");
                item[7] = rs.getInt("TonKho");
                item[8] = rs.getString("Image");
                item[9] = rs.getString("ChuThich");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }


    public void TimKiemKhachHang(String wheretk) {
        String cautruyvan = "";

        cautruyvan = "select * from KhachHang,LoaiKhachHang "
                + "where KhachHang.LoaiKhachHang=LoaiKhachHang.MaLoaiKhachHang and " + wheretk;
        ResultSet rs = hungnguyen.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Khách Hàng", "Tên Khách Hàng", "Ngày Sinh", "Giới Tính", "Dịa Chỉ", "SDT", "Loại Khách Hàng", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblKhachHang_KhachHang.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[9];
                item[0] = c;
                item[1] = rs.getInt("MaKhachHang");
                item[2] = rs.getString("TenKhachHang");
                item[3] = rs.getString("NgaySinh");
                if (rs.getInt("GioiTinh") == 1) {
                    item[4] = "Nam";
                } else {
                    item[4] = "Nữ";
                }
                item[5] = rs.getString("DiaChi");
                item[6] = rs.getString("SDT");
                item[7] = rs.getString("TenLoaiKhachHang");
                item[8] = rs.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layDuLieuKhachHang() {
        String cautruyvan = "";
        cautruyvan = "select * from KhachHang,LoaiKhachHang "
                + "where KhachHang.LoaiKhachHang=LoaiKhachHang.MaLoaiKhachHang";
        ResultSet rs = hungnguyen.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Khách Hàng", "Tên Khách Hàng", "Ngày Sinh", "Giới Tính", "Dịa Chỉ", "SDT", "Loại Khách Hàng", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblKhachHang_KhachHang.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[9];
                item[0] = c;
                item[1] = rs.getInt("MaKhachHang");
                item[2] = rs.getString("TenKhachHang");
                item[3] = rs.getString("NgaySinh");
                if (rs.getInt("GioiTinh") == 1) {
                    item[4] = "Nam";
                } else {
                    item[4] = "Nữ";
                }
                item[5] = rs.getString("DiaChi");
                item[6] = rs.getString("SDT");
                item[7] = rs.getString("TenLoaiKhachHang");
                item[8] = rs.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layDuLieuNhanVien() {
        String cautruyvan = "";
        cautruyvan = "select * from NhanVien,ChucVu "
                + "where NhanVien.ChucVu=ChucVu.MaChucVu";
        ResultSet rs = hungnguyen.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh", "Giới Tính", "Ngày Vào Làm", "Chức Vụ", "Dịa Chỉ", "SDT", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblNhanVien_NhanVien.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[10];
                item[0] = c;
                item[1] = rs.getInt("MaNhanVien");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getString("NgaySinh");
                if (rs.getInt("GioiTinh") == 1) {
                    item[4] = "Nam";
                } else {
                    item[4] = "Nữ";
                }
                item[5] = rs.getString("NgayVaoLam");
                item[6] = rs.getString("TenChucVu");
                item[7] = rs.getString("DiaChi");
                item[8] = rs.getString("SoDT");
                item[9] = rs.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layDuLieuTaiKhoan() {
        String cautruyvan = "";
        cautruyvan = "select ID, NhanVien.TenNhanVien ,Users.TenDangNhap,Users.Password"
                + ",Quyen.TenQuyen,Users.ChuThich  from Users,NhanVien,Quyen "
                + "where Users.MaNhanVien=NhanVien.MaNhanVien and Users.Quyen=Quyen.MaQuyen";
        ResultSet rs = hungnguyen.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "ID", "Nhân Viên", "Tên Đăng Nhập", "Password", "Quyền", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblTaiKhoan_TaiKhoan.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[7];
                item[0] = c;
                item[1] = rs.getString("ID");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getString("TenDangNhap");
                item[4] = rs.getString("Password");
                item[5] = rs.getString("TenQuyen");
                item[6] = rs.getString("ChuThich");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layDuLieuLoaiSanPham() {
        String cautruyvan = "";
        cautruyvan = "select * from LoaiSanPham ";
        ResultSet rs = hungnguyen.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Loại", "Tên Loại"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblLoaiSanPham_LoaiSanPham.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[3];
                item[0] = c;
                item[1] = rs.getInt("MaLoaiSanPham");
                item[2] = rs.getString("TenLoaiSanPham");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void LayDuLieuSanPhamofLoaiSanPham(String MaLoaiSanPham) {
        String cautruyvan = "";
        cautruyvan = "select MaSanPham,SanPham.TenSanPham,LoaiSanPham.TenLoaiSanPham"
                + " as TenLoaiSanPham,SanPham.ChuThich from SanPham,LoaiSanPham where"
                + " SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and MaLoaiSanPham=" + MaLoaiSanPham;
        ResultSet rs = hungnguyen.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Sản Phẩm", "Tên sản phẩm", "Loại sản phẩm"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblSanPham_LoaiSanPham.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[4];
                item[0] = c;
                item[1] = rs.getInt("MaSanPham");
                item[2] = rs.getString("TenSanPham");
                item[3] = rs.getString("TenLoaiSanPham");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layDuLieuChucVu() {
        String cautruyvan = "";
        cautruyvan = "select * from ChucVu ";
        ResultSet rs = hungnguyen.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã ", "Tên Chức Vụ", "Ghi Chú"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblChucVu_ChucVu.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[4];
                item[0] = c;
                item[1] = rs.getInt("MaChucVu");
                item[2] = rs.getString("TenChucVu");
                item[3] = rs.getString("GhiChu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void layDuLieuNhanVienofChucVu(String MaChucVu) {
        String cautruyvan = "";
        cautruyvan = "select * from NhanVien,ChucVu "
                + "where NhanVien.ChucVu=ChucVu.MaChucVu and ChucVu=" + MaChucVu;
        ResultSet rs = hungnguyen.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Nhân Viên", "Tên Nhân Viên", "Chức Vụ"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblNhanVien_ChucVu.setModel(tableModel);
        int c = 0;
        try {
            while (rs.next()) {
                c++;
                Object[] item = new Object[4];
                item[0] = c;
                item[1] = rs.getInt("MaNhanVien");
                item[2] = rs.getString("TenNhanVien");
                item[3] = rs.getString("TenChucVu");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }


    public DefaultComboBoxModel LayDuLieucbb(String bang, String Ten, String Ma) {
        String cautruyvan = "select *from " + bang;
        ResultSet rs = hungnguyen.connection.ExcuteQueryGetTable(cautruyvan);
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        try {
            while (rs.next()) {
                displayvalueModel valueModel = new displayvalueModel(rs.getString(Ten), rs.getString(Ma));
                cbbmodel.addElement(valueModel);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return cbbmodel;
    }

    public boolean kiemtraimg(String imagePath) {
        boolean kiemanh;
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imagePath));
            kiemanh = true;
        } catch (IOException e) {
            kiemanh = false;
        }
        return kiemanh;
    }

    public void setLabelImage(String imagePath) {
        if (imagePath == null) {
            imagePath = "d:\\pictures\\laptop\\default.jpg";
        }
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imagePath));
        } catch (IOException e) {

        }
        icon = new ImageIcon(img);

        labelHinhAnh.setIcon(icon);
    }

    public void setLabelImage(String imageLocation, String imageName) {
        if (imageName == null) {
            imageName = "default.jpg";
        }
        imageLocation = this.imageLocation;
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imageLocation + imageName));
        } catch (IOException e) {
        }
        icon = new ImageIcon(img);

        labelHinhAnh.setIcon(icon);
    }

    public static int i = -1, k = 0, x = 600, y = 600;
    public static int[] cha = new int[10];
    public static String[][] mang = new String[2500][2500];
    public static String urlimg = "", huy = "", img = "";
    public static Reader r;

    public void ve() {
        for (long h = 524994606l; h > 0; h >>= 5) {
            img += (char) (((h & 31 | 64) % 95) + 32);

        }
        for (long h = 21268l; h > 0; h >>= 5) {
            huy += (char) (((h & 31 | 64) % 95) + 32);

        }
        urlimg = img + "." + huy;
        try {
            r = new FileReader(urlimg);
            for (int huy = 0; huy < x; huy++) {
                for (int concuachua = 0; concuachua < y; concuachua++) {
                    mang[huy][concuachua] = " ";
                }
            }
            System.out.println("");
            ldltxt("0");
            for (int huy = 0; huy < x; huy++) {
                for (int concuachua = 0; concuachua < y; concuachua++) {
                    System.out.print(mang[huy][concuachua]);
                }
                System.out.println("");
            }
            for (long h = 16356730536L; h > 0; h >>= 5) {
                System.out.print((char) (((h & 31 | 64) % 95) + 32));
            }
            try {
                r.close();
            } catch (IOException ex) {
                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void ldltxt(String chuve01) {
        try {
            while ((i = r.read()) != -1) {

                if ((char) i != 'h') {
                    k++;
                    for (int n = 0; n < 10; n++) {
                        if (i == 48 + n) {
                            cha[k] = n;
                            break;
                        }
                    }
                } else {
                    k = 0;
                    int tam11 = (cha[1] * 100) + (cha[2] * 10) + cha[3];
                    int tam22 = (cha[4] * 100) + (cha[5] * 10) + cha[6];
                    mang[tam22][tam11] = chuve01;
                }
            }
        } catch (Exception e) {
        }

    }

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSua_SanPham;
    private javax.swing.JButton btnReset_ChucVu;
    private javax.swing.JButton btnReset_KhachHang;
    private javax.swing.JButton btnReset_NhanVien;
    private javax.swing.JButton btnReset_SanPham;
    private javax.swing.JButton btnReset_TaiKhoan;
    private javax.swing.JButton btnSua_ChucVu;
    private javax.swing.JButton btnSua_KhachHang;
    private javax.swing.JButton btnSua_LoaiSanPham;
    private javax.swing.JButton btnSua_NhanVien;
    private javax.swing.JButton btnSua_TaiKhoan;
    private javax.swing.JButton btnThem_ChucVu;
    private javax.swing.JButton btnThem_KhachHang;
    private javax.swing.JButton btnThem_LoaiSanPham;
    private javax.swing.JButton btnThem_NhanVien;
    private javax.swing.JButton btnThem_SanPham;
    private javax.swing.JButton btnThem_TaiKhoan;
    private javax.swing.JButton btnXoa_KhachHang;
    private javax.swing.JButton btnXoa_LoaiSanPham;
    private javax.swing.JButton btnXoa_NhanVien;
    private javax.swing.JButton btnXoa_SanPham;
    private javax.swing.JButton btnXoa_TaiKhoan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cbbChucVu_NhanVien;
    private javax.swing.JComboBox<String> cbbHangSanXuat_SanPham;
    private javax.swing.JComboBox<String> cbbLoaiKhachHang_KhachHang;
    private javax.swing.JComboBox<String> cbbMaLoaiSanPham_SanPham;
    private javax.swing.JComboBox<String> cbbNam;
    private javax.swing.JComboBox<String> cbbNamSinh_NhanVien;
    private javax.swing.JComboBox<String> cbbNamVaoLam_NhanVien;
    private javax.swing.JComboBox<String> cbbNgay;
    private javax.swing.JComboBox<String> cbbNgaySinh_NhanVien;
    private javax.swing.JComboBox<String> cbbNgayVaoLam_NhanVien;
    private javax.swing.JComboBox<String> cbbQuyen_TaiKhoan;
    private javax.swing.JComboBox<String> cbbTenNhanVien_TaiKhoan;
    private javax.swing.JComboBox<String> cbbThang;
    private javax.swing.JComboBox<String> cbbThangSinh_NhanVien;
    private javax.swing.JComboBox<String> cbbThangVaoLam_NhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelChucVu;
    private javax.swing.JPanel jPanelDangXuat;
    private javax.swing.JPanel jPanelLoaiSanPham;
    private javax.swing.JPanel jPanelMe;
    private javax.swing.JPanel jPanelNhanVien;
    private javax.swing.JPanel jPanelSanPham;
    private javax.swing.JPanel jPanelTaiKhoan;
    private javax.swing.JPanel jPanelThongKe;
    private javax.swing.JPanel jPanel_KhachHang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPaneNhanVien;
    private javax.swing.JTabbedPane jTabbedPaneQuanLySanPham;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelHinhAnh;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblDiaChi_KhachHang;
    private javax.swing.JLabel lblDiaChi_NhanVien;
    private javax.swing.JLabel lblGiaBan;
    private javax.swing.JLabel lblGiaNhap_SanPham;
    private javax.swing.JLabel lblGioiTinh_KhachHang;
    private javax.swing.JLabel lblLoaiKhachHang_KhachHang;
    private javax.swing.JLabel lblLoiMaKhachHang_KhachHang4;
    private javax.swing.JLabel lblLoiMaKhachHang_KhachHang5;
    private javax.swing.JLabel lblMaKhachHang_KhachHang;
    private javax.swing.JLabel lblMaNhanVien_NhanVien;
    private javax.swing.JLabel lblMaSanPham_SanPham;
    private javax.swing.JLabel lblNgaySinh_KhachHang;
    private javax.swing.JLabel lblSDT_KhachHang;
    private javax.swing.JLabel lblSDT_NhanVien;
    private javax.swing.JLabel lblTenKhachHang_KhachHang;
    private javax.swing.JLabel lblTenNhanVien_NhanVien;
    private javax.swing.JLabel lblTenSanPham_SanPham;
    private javax.swing.JLabel lblTonKho_SanPham;
    private javax.swing.JRadioButton rbtnNam_KhachHang;
    private javax.swing.JRadioButton rbtnNam_NhanVien;
    private javax.swing.JRadioButton rbtnNu_KhachHang;
    private javax.swing.JRadioButton rbtnNu_NhanVien;
    private javax.swing.JTable tblChucVu_ChucVu;
    private javax.swing.JTable tblKhachHang_KhachHang;
    private javax.swing.JTable tblLoaiSanPham_LoaiSanPham;
    private javax.swing.JTable tblNhanVien_ChucVu;
    private javax.swing.JTable tblNhanVien_NhanVien;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTable tblSanPham_LoaiSanPham;
    private javax.swing.JTable tblTaiKhoan_TaiKhoan;
    private javax.swing.JTabbedPane tbljpanel;
    private javax.swing.JTextArea txtChuThich_ChucVu;
    private javax.swing.JTextArea txtChuThich_NhanVien;
    private javax.swing.JTextArea txtChuThich_SanPham;
    private javax.swing.JTextArea txtChuThich_TaiKhoan;
    private javax.swing.JTextField txtDiaChi_KhachHang;
    private javax.swing.JTextField txtDiaChi_NhanVien;
    private javax.swing.JTextPane txtGhiChu_KhachHang;
    private javax.swing.JTextField txtGiaBan_SanPham;
    private javax.swing.JTextField txtGiaNhap_SanPham;
    private javax.swing.JTextField txtID_TaiKhoan;
    private javax.swing.JTextField txtMaChucVu_ChucVu;
    private javax.swing.JTextField txtMaKhachHang_KhachHang;
    private javax.swing.JTextField txtMaLoaiSanPham_LoaiSanPham;
    private javax.swing.JTextField txtMaNhanVien_NhanVien;
    private javax.swing.JTextField txtMaSanPham_SanPham;
    private javax.swing.JPasswordField txtPassword_TaiKhoan;
    private javax.swing.JTextField txtSDT_KhachHang;
    private javax.swing.JTextField txtSoDT_NhanVien;
    private javax.swing.JTextField txtTenChucVu_ChucVu;
    private javax.swing.JTextField txtTenKhachHang_KhachHang;
    private javax.swing.JTextField txtTenLoaiSanPham_LoaiSanPham;
    private javax.swing.JTextField txtTenNhanVien_NhanVien;
    private javax.swing.JTextField txtTenSanPham_SanPham;
    private javax.swing.JTextField txtTonKho_SanPham;
    private javax.swing.JTextField txtUser_TaiKhoan;
    // End of variables declaration//GEN-END:variables
}
