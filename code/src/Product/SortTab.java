package Product;

import DAO.ProductDAO;
import Model.Product;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SortTab extends javax.swing.JPanel {

    ProductDAO PdDAO;
    DefaultTableModel ModelPD;
    List<Product> PDList;

    public SortTab() {
        initComponents();
        tableSort();
    }

    public void tableSort() {
        PdDAO = new ProductDAO();
        ModelPD = new DefaultTableModel() {
            @Override //Không cho người dùng edit table
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tableSort.setModel(ModelPD);
        ModelPD.addColumn("ID");
        ModelPD.addColumn("Name");
        ModelPD.addColumn("Amount");
        ModelPD.addColumn("Price Origin");
        ModelPD.addColumn("Price");

        tableSort.getColumnModel().getColumn(0).setMinWidth(80);
        tableSort.getColumnModel().getColumn(0).setMaxWidth(80);
        tableSort.getColumnModel().getColumn(1).setMinWidth(300);
        tableSort.getColumnModel().getColumn(1).setMaxWidth(300);
        tableSort.getColumnModel().getColumn(2).setMinWidth(100);
        tableSort.getColumnModel().getColumn(2).setMaxWidth(100);
        tableSort.getColumnModel().getColumn(3).setMinWidth(100);
        tableSort.getColumnModel().getColumn(3).setMaxWidth(100);
        tableSort.getColumnModel().getColumn(4).setMinWidth(150);
        tableSort.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        setDataPDtable(PdDAO.getListProduct());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableSort = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ascCheck = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        desCheck = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        atoz = new javax.swing.JCheckBox();
        ztoa = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tableSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableSort.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSort.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableSort);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel1.setText("Sort by price: ");

        ascCheck.setBackground(new java.awt.Color(255, 255, 255));
        ascCheck.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        ascCheck.setText("Ascending");
        ascCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascCheckActionPerformed(evt);
            }
        });

        desCheck.setBackground(new java.awt.Color(255, 255, 255));
        desCheck.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        desCheck.setText("Descending");
        desCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desCheckActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel2.setText("Sort by name: ");

        atoz.setBackground(new java.awt.Color(255, 255, 255));
        atoz.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        atoz.setText("A-Z");
        atoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atozActionPerformed(evt);
            }
        });

        ztoa.setBackground(new java.awt.Color(255, 255, 255));
        ztoa.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        ztoa.setText("Z-A");
        ztoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ztoaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sort");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ascCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atoz)
                        .addGap(18, 18, 18)
                        .addComponent(ztoa)
                        .addGap(31, 31, 31)))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ascCheck)
                    .addComponent(desCheck)
                    .addComponent(jLabel2)
                    .addComponent(atoz)
                    .addComponent(ztoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ascCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascCheckActionPerformed
        ModelPD.setRowCount(0);
        if (ascCheck.isSelected()) {
            desCheck.setSelected(false);
            ztoa.setSelected(false);
            atoz.setSelected(false);
            ProductDAO pdao = new ProductDAO();
            PDList = pdao.Sort(3);
            PDList.forEach(Product -> {
                ModelPD.addRow(new Object[]{Product.getProductID(),
                    Product.getProductName(), Product.getAmount(), Product.getPriceOrigin(), Product.getPrice()});
            });
        } else {
            tableSort();
        }
    }//GEN-LAST:event_ascCheckActionPerformed

    private void atozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atozActionPerformed
        ModelPD.setRowCount(0);
        if (atoz.isSelected()) {
            ztoa.setSelected(false);
            ascCheck.setSelected(false);
            desCheck.setSelected(false);
            ProductDAO pdao = new ProductDAO();
            PDList = pdao.Sort(1);
            PDList.forEach(Product -> {
                ModelPD.addRow(new Object[]{Product.getProductID(),
                    Product.getProductName(), Product.getAmount(), Product.getPriceOrigin(), Product.getPrice()});
            });
        } else {
            tableSort();
        }
    }//GEN-LAST:event_atozActionPerformed

    private void ztoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ztoaActionPerformed
        ModelPD.setRowCount(0);
        if (ztoa.isSelected()) {
            atoz.setSelected(false);
            ascCheck.setSelected(false);
            desCheck.setSelected(false);
            ProductDAO pdao = new ProductDAO();
            PDList = pdao.Sort(2);
            PDList.forEach(Product -> {
                ModelPD.addRow(new Object[]{Product.getProductID(),
                    Product.getProductName(), Product.getAmount(), Product.getPriceOrigin(), Product.getPrice()});
            });
        } else {
            tableSort();
        }
    }//GEN-LAST:event_ztoaActionPerformed

    private void desCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desCheckActionPerformed
        ModelPD.setRowCount(0);
        if (desCheck.isSelected()) {
            ascCheck.setSelected(false);
            atoz.setSelected(false);
            ztoa.setSelected(false);
            ProductDAO pdao = new ProductDAO();
            PDList = pdao.Sort(4);
            PDList.forEach(Product -> {
                ModelPD.addRow(new Object[]{Product.getProductID(),
                    Product.getProductName(), Product.getAmount(), Product.getPriceOrigin(), Product.getPrice()});
            });
        } else {
            tableSort();
        }
    }//GEN-LAST:event_desCheckActionPerformed

    public void setDataPDtable(List<Product> PDList) {
        ModelPD.setRowCount(0);
        for (Product PD : PDList) {
            ModelPD.addRow(new Object[]{
                PD.getProductID(), PD.getProductName(), PD.getAmount(),
                PD.getPriceOrigin(), PD.getPrice()
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ascCheck;
    private javax.swing.JCheckBox atoz;
    private javax.swing.JCheckBox desCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableSort;
    private javax.swing.JCheckBox ztoa;
    // End of variables declaration//GEN-END:variables

}
