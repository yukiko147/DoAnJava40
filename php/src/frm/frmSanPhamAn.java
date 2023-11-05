
package frm;

import main.hungnguyen;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;


public class frmSanPhamAn extends javax.swing.JFrame {

    /**
     * Creates new form frmSanPhamAn
     */
    public frmSanPhamAn() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSanPham_spa = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbbMaLoaiSanPham_SanPhamAn = new javax.swing.JComboBox<>();
        txtGiaNhap_SanPhamAn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGiaBan_SanPhamAn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenSanPham_SanPhamAn = new javax.swing.JTextField();
        txtMaSanPham_SanPhamAn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbbHangSanXuat_SanPhamAn = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtChuThich_SanPhamAn = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        btnHienlai_SanPhamAn = new javax.swing.JButton();
        txtTonKho_SanPhamAn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham_spa = new javax.swing.JTable();
        labelHinhAnhAn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelSanPham_spa.setBackground(new java.awt.Color(204, 204, 255));
        jPanelSanPham_spa.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelSanPham_spaComponentShown(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("Tên Sản PHẩm");

        jLabel1.setText("Mã Sản Phẩm");

        jLabel3.setText("Loại Sản Phẩm");

        cbbMaLoaiSanPham_SanPhamAn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbMaLoaiSanPham_SanPhamAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaLoaiSanPham_SanPhamAnActionPerformed(evt);
            }
        });

        txtGiaNhap_SanPhamAn.setEditable(false);

        jLabel4.setText("Giá Nhập");

        txtGiaBan_SanPhamAn.setEditable(false);

        jLabel5.setText("Giá Bán");

        txtTenSanPham_SanPhamAn.setEditable(false);

        txtMaSanPham_SanPhamAn.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenSanPham_SanPhamAn)
                    .addComponent(txtGiaBan_SanPhamAn)
                    .addComponent(cbbMaLoaiSanPham_SanPhamAn, 0, 162, Short.MAX_VALUE)
                    .addComponent(txtGiaNhap_SanPhamAn)
                    .addComponent(txtMaSanPham_SanPhamAn)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaSanPham_SanPhamAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtTenSanPham_SanPhamAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbbMaLoaiSanPham_SanPhamAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaNhap_SanPhamAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaBan_SanPhamAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel9.setText("Hãng Sản Xuất");

        cbbHangSanXuat_SanPhamAn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Tồn Kho");

        jLabel11.setText("Chiếc");

        txtChuThich_SanPhamAn.setEditable(false);
        txtChuThich_SanPhamAn.setColumns(20);
        txtChuThich_SanPhamAn.setRows(5);
        jScrollPane2.setViewportView(txtChuThich_SanPhamAn);

        jLabel12.setText("Chú Thích");

        btnHienlai_SanPhamAn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnHienlai_SanPhamAn.setText("Hiện lại");
        btnHienlai_SanPhamAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienlai_SanPhamAnActionPerformed(evt);
            }
        });

        txtTonKho_SanPhamAn.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(28, 28, 28)
                            .addComponent(cbbHangSanXuat_SanPhamAn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtTonKho_SanPhamAn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnHienlai_SanPhamAn, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbbHangSanXuat_SanPhamAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txtTonKho_SanPhamAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHienlai_SanPhamAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        tblSanPham_spa.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSanPham_spa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPham_spaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham_spa);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Sản Phẩm Đã Ẩn");

        javax.swing.GroupLayout jPanelSanPham_spaLayout = new javax.swing.GroupLayout(jPanelSanPham_spa);
        jPanelSanPham_spa.setLayout(jPanelSanPham_spaLayout);
        jPanelSanPham_spaLayout.setHorizontalGroup(
            jPanelSanPham_spaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSanPham_spaLayout.createSequentialGroup()
                .addGroup(jPanelSanPham_spaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSanPham_spaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSanPham_spaLayout.createSequentialGroup()
                            .addGap(363, 363, 363)
                            .addComponent(jLabel7))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(labelHinhAnhAn, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanelSanPham_spaLayout.setVerticalGroup(
            jPanelSanPham_spaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSanPham_spaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSanPham_spaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSanPham_spaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelHinhAnhAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1176, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelSanPham_spa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(15, Short.MAX_VALUE)
                    .addComponent(jPanelSanPham_spa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbbMaLoaiSanPham_SanPhamAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaLoaiSanPham_SanPhamAnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMaLoaiSanPham_SanPhamAnActionPerformed

    private void tblSanPham_spaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPham_spaMouseClicked
        int viTriDongVuaBam = tblSanPham_spa.getSelectedRow();
        txtMaSanPham_SanPhamAn.setText(tblSanPham_spa.getValueAt(viTriDongVuaBam, 1).toString());
        txtTenSanPham_SanPhamAn.setText(tblSanPham_spa.getValueAt(viTriDongVuaBam, 2).toString());
        txtGiaNhap_SanPhamAn.setText(tblSanPham_spa.getValueAt(viTriDongVuaBam, 4).toString());
        txtGiaBan_SanPhamAn.setText(tblSanPham_spa.getValueAt(viTriDongVuaBam, 5).toString());
        txtTonKho_SanPhamAn.setText(tblSanPham_spa.getValueAt(viTriDongVuaBam, 7).toString());
        txtChuThich_SanPhamAn.setText(tblSanPham_spa.getValueAt(viTriDongVuaBam, 9).toString());
        

        main.hungnguyen.frmTC.setSelectedCombobox(tblSanPham_spa.getValueAt(viTriDongVuaBam, 3).toString(), cbbMaLoaiSanPham_SanPhamAn);
        main.hungnguyen.frmTC.setSelectedCombobox(tblSanPham_spa.getValueAt(viTriDongVuaBam, 6).toString(), cbbHangSanXuat_SanPhamAn);
    }//GEN-LAST:event_tblSanPham_spaMouseClicked

    private void jPanelSanPham_spaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelSanPham_spaComponentShown
       LayDuLieuSanPham("0");
       
        cbbMaLoaiSanPham_SanPhamAn.setModel(main.hungnguyen.frmTC.LayDuLieucbb("LoaiSanPham", "TenLoaiSanPham", "MaLoaiSanPham"));
        cbbHangSanXuat_SanPhamAn.setModel(main.hungnguyen.frmTC.LayDuLieucbb("HangSanXuat", "TenHangSanXuat", "MaHangSanXuat"));
    }//GEN-LAST:event_jPanelSanPham_spaComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          LayDuLieuSanPham("0");
        cbbMaLoaiSanPham_SanPhamAn.setModel(main.hungnguyen.frmTC.LayDuLieucbb("LoaiSanPham", "TenLoaiSanPham", "MaLoaiSanPham"));
        cbbHangSanXuat_SanPhamAn.setModel(main.hungnguyen.frmTC.LayDuLieucbb("HangSanXuat", "TenHangSanXuat", "MaHangSanXuat"));

    }//GEN-LAST:event_formWindowOpened

    private void btnHienlai_SanPhamAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienlai_SanPhamAnActionPerformed
        String MaSanPham,  TrangThai ;
        MaSanPham = txtMaSanPham_SanPhamAn.getText();
                
       
        TrangThai = "1";
    
        String cautruyvan = "update  SanPham set "
                + "TrangThai=" + TrangThai + " where MaSanPham= " + MaSanPham;
        System.out.println(cautruyvan);
        boolean kiemtra = true;
        if (kiemtra) {
            hungnguyen.connection.ExcuteQueryUpdateDB(cautruyvan);
            System.out.println("Đã Sửa Thành Công Sản Phẩm");
        } else {
            main.hungnguyen.frmTC.ThongBao("Không thể ", "Sửa Sản Phẩm", 2);
        }
      LayDuLieuSanPham("0");
      ResSanPham();
      main.hungnguyen.frmTC.LayDuLieuSanPham("1");
    }//GEN-LAST:event_btnHienlai_SanPhamAnActionPerformed
  public void ResSanPham(){
        txtMaSanPham_SanPhamAn.setText("");
        txtTenSanPham_SanPhamAn.setText("");
        txtGiaNhap_SanPhamAn.setText("");
        txtGiaBan_SanPhamAn.setText("");
        txtTonKho_SanPhamAn.setText("");
        txtChuThich_SanPhamAn.setText("");
        cbbMaLoaiSanPham_SanPhamAn.setSelectedIndex(0);
        cbbHangSanXuat_SanPhamAn.setSelectedIndex(0);
 }
    public void LayDuLieuSanPham(String TrangThai) {
        String cautruyvan = "";
        System.out.println("vào được đây rồi");
        cautruyvan = "select MaSanPham,SanPham.TenSanPham,SanPham.LoaiSanPham,GiaNhap,GiaBan,HangsanXuat.TenHangSanXuat as THSX,TonKho,LoaiSanPham.TenLoaiSanPham"
                + " as TenLoaiSanPham,Image,SanPham.ChuThich from SanPham,LoaiSanPham,HangSanXuat where "
                + "SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai="+TrangThai;
        ResultSet rs = hungnguyen.connection.ExcuteQueryGetTable(cautruyvan);
        Object[] obj = new Object[]{"STT", "Mã Sản Phẩm", "Tên sản phẩm", "Loại sản phẩm", "Giá nhập", "Giá bán", "Hãng sản Xuất", "Tồn kho","ảnh", "Chú Thích"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblSanPham_spa.setModel(tableModel);
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
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmSanPhamAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSanPhamAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSanPhamAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSanPhamAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSanPhamAn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienlai_SanPhamAn;
    private javax.swing.JComboBox<String> cbbHangSanXuat_SanPhamAn;
    private javax.swing.JComboBox<String> cbbMaLoaiSanPham_SanPhamAn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelSanPham_spa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelHinhAnhAn;
    private javax.swing.JTable tblSanPham_spa;
    private javax.swing.JTextArea txtChuThich_SanPhamAn;
    private javax.swing.JTextField txtGiaBan_SanPhamAn;
    private javax.swing.JTextField txtGiaNhap_SanPhamAn;
    private javax.swing.JTextField txtMaSanPham_SanPhamAn;
    private javax.swing.JTextField txtTenSanPham_SanPhamAn;
    private javax.swing.JTextField txtTonKho_SanPhamAn;
    // End of variables declaration//GEN-END:variables
}
