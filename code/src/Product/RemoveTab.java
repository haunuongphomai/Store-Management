package Product;

import DAO.ProductDAO;
import Model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveTab extends javax.swing.JPanel {

    ProductDAO PdDAO;
    DefaultTableModel ModelPD;
    String findByName = "";

    public RemoveTab() {
        initComponents();
        delTable();
    }

    public void delTable() {
        PdDAO = new ProductDAO();

        ModelPD = new DefaultTableModel() {
            @Override //Không cho người dùng edit table
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        delTable.setModel(ModelPD);
        ModelPD.addColumn("ID");
        ModelPD.addColumn("Name");
        ModelPD.addColumn("Amount");
        ModelPD.addColumn("Price Origin");
        ModelPD.addColumn("Price");

        delTable.getColumnModel().getColumn(0).setMinWidth(80);
        delTable.getColumnModel().getColumn(0).setMaxWidth(80);
        delTable.getColumnModel().getColumn(1).setMinWidth(300);
        delTable.getColumnModel().getColumn(1).setMaxWidth(300);
        delTable.getColumnModel().getColumn(2).setMinWidth(100);
        delTable.getColumnModel().getColumn(2).setMaxWidth(100);
        delTable.getColumnModel().getColumn(3).setMinWidth(100);
        delTable.getColumnModel().getColumn(3).setMaxWidth(100);
        delTable.getColumnModel().getColumn(4).setMinWidth(150);
        delTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        setDataPDtable(PdDAO.getListProduct());
    }

    private void setDataPDtable(List<Product> PDList) {
        ModelPD.setRowCount(0);
        for (Product PD : PdDAO.findProductByName(findByName)) {
            ModelPD.addRow(new Object[]{
                PD.getProductID(), PD.getProductName(), PD.getAmount(),
                PD.getPriceOrigin(), PD.getPrice()
            });
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        delTable = new javax.swing.JTable();
        removeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        removeSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        delTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        delTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(delTable);

        removeButton.setBackground(new java.awt.Color(255, 255, 255));
        removeButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete.png"))); // NOI18N
        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Remove Products");

        removeSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                removeSearchCaretUpdate(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel2.setText("Search:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(removeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed

        int row = delTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select row!", "Error Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure ?", "Notification", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                int ID = Integer.valueOf(delTable.getValueAt(row, 0).toString());
                PdDAO.removeProduct(ID);
                delTable();
            }
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void removeSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_removeSearchCaretUpdate
        findByName = removeSearch.getText();
        List<Product> PDList = new ArrayList<Product>();
        setDataPDtable(PDList);
    }//GEN-LAST:event_removeSearchCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable delTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField removeSearch;
    // End of variables declaration//GEN-END:variables
}
