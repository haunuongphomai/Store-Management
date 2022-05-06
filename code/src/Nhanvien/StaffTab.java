package Nhanvien;

import DAO.StaffDAO;
import Model.Staff;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StaffTab extends javax.swing.JPanel {

    StaffDAO std;
    DefaultTableModel tableModel;
    String findByName = "";

    public StaffTab() {
        initComponents();
        tableST();
    }

    public void tableST() {
        std = new StaffDAO();
        tableModel = new DefaultTableModel() {
            @Override //Không cho người dùng edit table
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tableST.setModel(tableModel);
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Gender");
        tableModel.addColumn("DOB");
        tableModel.addColumn("Salary");
        tableModel.addColumn("Email");
        tableModel.addColumn("Phone");

        tableST.getColumnModel().getColumn(0).setMinWidth(50);
        tableST.getColumnModel().getColumn(0).setMaxWidth(50);
        tableST.getColumnModel().getColumn(1).setMinWidth(150);
        tableST.getColumnModel().getColumn(1).setMaxWidth(150);
        tableST.getColumnModel().getColumn(2).setMinWidth(50);
        tableST.getColumnModel().getColumn(2).setMaxWidth(50);
        tableST.getColumnModel().getColumn(3).setMinWidth(80);
        tableST.getColumnModel().getColumn(3).setMaxWidth(80);
        tableST.getColumnModel().getColumn(4).setMinWidth(80);
        tableST.getColumnModel().getColumn(4).setMaxWidth(80);
        tableST.getColumnModel().getColumn(5).setMinWidth(150);
        tableST.getColumnModel().getColumn(5).setMaxWidth(150);
        tableST.getColumnModel().getColumn(6).setMinWidth(150);
        tableST.getColumnModel().getColumn(6).setMaxWidth(150);
        tableST.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        setDataSTtable(std.getListStaff());
    }

    private void setDataSTtable(List<Staff> STList) {
        for (Staff ST : STList) {
            tableModel.addRow(new Object[]{
                ST.getStaffID(), ST.getStaffName(), ST.getGender(),
                ST.getDOB(), ST.getSalary(), ST.getEmail(), ST.getPhone()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtName = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        modifyBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        txtID = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableST = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Staff Management");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 26));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 940, 10));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 180, -1));
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 180, -1));
        add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 180, -1));
        add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 180, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 180, -1));
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 180, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel4.setText("ID:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel5.setText("Gender:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel6.setText("Date Of Birth:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 20));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel7.setText("Salary:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 20));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel8.setText("Email:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 20));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel9.setText("Phone:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/id-card.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, -1));

        modifyBtn.setBackground(new java.awt.Color(255, 255, 255));
        modifyBtn.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        modifyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/floppy-disk.png"))); // NOI18N
        modifyBtn.setText("Save");
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });
        add(modifyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 110, -1));

        removeBtn.setBackground(new java.awt.Color(255, 255, 255));
        removeBtn.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        removeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete.png"))); // NOI18N
        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        resetBtn.setBackground(new java.awt.Color(255, 255, 255));
        resetBtn.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh-page.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 110, -1));

        txtID.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 20, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 300, 430));

        tableST.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tableST.getTableHeader().setReorderingAllowed(false);
        tableST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableST);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 660, 380));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel10.setText("Search: ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, 20));

        txtSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchCaretUpdate(evt);
            }
        });
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 200, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel11.setText("Name:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed
        try {
            int row = tableST.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Please select row!", "Error Warning", JOptionPane.ERROR_MESSAGE);
            } else if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Name cannot be null");
                txtName.setBackground(new Color(255, 123, 123));
            } else if (txtGender.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Gender cannot be null");
                txtGender.setBackground(new Color(255, 123, 123));
            } else if (txtDOB.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Date of birth cannot be null");
                txtDOB.setBackground(new Color(255, 123, 123));
            } else if (txtSalary.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Salary cannot be null");
                txtPhone.setBackground(new Color(255, 123, 123));
            } else if (txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Email cannot be null");
                txtEmail.setBackground(new Color(255, 123, 123));
            } else if (txtPhone.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Phone cannot be null");
            } else {
                txtName.setBackground(Color.white);
                txtGender.setBackground(Color.white);
                txtDOB.setBackground(Color.white);
                txtSalary.setBackground(Color.white);
                txtEmail.setBackground(Color.white);
                txtPhone.setBackground(Color.white);

                Staff sf = new Staff();
                sf.setStaffID(Integer.parseInt(txtID.getText()));
                sf.setStaffName(txtName.getText());
                sf.setGender(txtGender.getText());
                sf.setDOB(txtDOB.getText());
                sf.setSalary(Integer.parseInt(txtSalary.getText()));
                sf.setEmail(txtEmail.getText());
                sf.setPhone(txtPhone.getText());

                StaffDAO std = new StaffDAO();
                std.modifyStaff(sf);
                tableST();
                JOptionPane.showMessageDialog(this, "Modify Successful");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_modifyBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        try {
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Name cannot be null");
                txtName.setBackground(new Color(255, 123, 123));
            } else if (txtGender.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Gender cannot be null");
                txtGender.setBackground(new Color(255, 123, 123));
            } else if (txtDOB.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Date of birth cannot be null");
                txtDOB.setBackground(new Color(255, 123, 123));
            } else if (txtSalary.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Salary cannot be null");
                txtPhone.setBackground(new Color(255, 123, 123));
            } else if (txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Email cannot be null");
                txtEmail.setBackground(new Color(255, 123, 123));
            } else if (txtPhone.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Phone cannot be null");
            } else {
                txtName.setBackground(Color.white);
                txtGender.setBackground(Color.white);
                txtDOB.setBackground(Color.white);
                txtSalary.setBackground(Color.white);
                txtEmail.setBackground(Color.white);
                txtPhone.setBackground(Color.white);

                Staff sf = new Staff();
                sf.setStaffName(txtName.getText());
                sf.setGender(txtGender.getText());
                sf.setDOB(txtDOB.getText());
                sf.setSalary(Integer.parseInt(txtSalary.getText()));
                sf.setEmail(txtEmail.getText());
                sf.setPhone(txtPhone.getText());

                StaffDAO std = new StaffDAO();
                std.addStaff(sf);
                tableST();
                JOptionPane.showMessageDialog(this, "Add Successful");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_addBtnActionPerformed


    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        txtID.setText("");
        txtName.setText("");
        txtGender.setText("");
        txtDOB.setText("");
        txtSalary.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        int row = tableST.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select row!", "Error Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure ?", "Notification", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                int ID = Integer.valueOf(tableST.getValueAt(row, 0).toString());
                std.removeStaff(ID);
                tableST();
            }
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void tableSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSTMouseClicked
        DefaultTableModel model = (DefaultTableModel) tableST.getModel();
        int selectedRowIndex = tableST.getSelectedRow();
        txtID.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtName.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtGender.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtDOB.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txtSalary.setText(model.getValueAt(selectedRowIndex, 4).toString());
        txtEmail.setText(model.getValueAt(selectedRowIndex, 5).toString());
        txtPhone.setText(model.getValueAt(selectedRowIndex, 6).toString());
    }//GEN-LAST:event_tableSTMouseClicked

    private void txtSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchCaretUpdate
        tableModel.setRowCount(0);
        findByName = txtSearch.getText();
        List<Staff> STList = new ArrayList<Staff>();
        setDataSTtable(std.findStafftByName(findByName));
    }//GEN-LAST:event_txtSearchCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTable tableST;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
