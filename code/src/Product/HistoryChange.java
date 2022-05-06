package Product;

import DAO.ProductDAO;
import Model.Product;
import java.time.ZonedDateTime;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HistoryChange extends javax.swing.JPanel {

    private ProductDAO pdao;
    DefaultTableModel ModelPD;

    public HistoryChange() {
        initComponents();
        hisTable();
    }

    public void hisTable() {
        pdao = new ProductDAO();

        ModelPD = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        hisTable.setModel(ModelPD);
        ModelPD.addColumn("User Name");
        ModelPD.addColumn("Time");
        ModelPD.addColumn("Action");
        ModelPD.addColumn("ProductID");
        ModelPD.addColumn("Name");
        ModelPD.addColumn("Amount");
        ModelPD.addColumn("Price Origin");
        ModelPD.addColumn("Price");

        hisTable.getColumnModel().getColumn(0).setMinWidth(80);
        hisTable.getColumnModel().getColumn(0).setMaxWidth(80);
        hisTable.getColumnModel().getColumn(1).setMinWidth(150);
        hisTable.getColumnModel().getColumn(1).setMaxWidth(150);
        hisTable.getColumnModel().getColumn(2).setMinWidth(100);
        hisTable.getColumnModel().getColumn(2).setMaxWidth(100);
        hisTable.getColumnModel().getColumn(3).setMinWidth(100);
        hisTable.getColumnModel().getColumn(3).setMaxWidth(100);
        hisTable.getColumnModel().getColumn(4).setMinWidth(250);
        hisTable.getColumnModel().getColumn(4).setMaxWidth(250);
        hisTable.getColumnModel().getColumn(5).setMinWidth(100);
        hisTable.getColumnModel().getColumn(5).setMaxWidth(100);
        hisTable.getColumnModel().getColumn(6).setMinWidth(100);
        hisTable.getColumnModel().getColumn(6).setMaxWidth(100);
        hisTable.getColumnModel().getColumn(7).setMinWidth(300);
        hisTable.getColumnModel().getColumn(7).setMaxWidth(300);
        hisTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        setDataPDtable(pdao.getListProducttg());
    }

    public void setDataPDtable(List<Product> PDList) {
        for (Product PD : PDList) {
            ModelPD.addRow(new Object[]{
                PD.getUserName(), PD.getTimeInsert(), PD.getActionType(),
                PD.getProductIDtg(), PD.getProductNametg(), PD.getAmounttg(),
                PD.getPriceOrigintg(), PD.getPricetg()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        hisTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("History Change");

        hisTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(hisTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public static void main(String[] args) {
        System.out.println(ZonedDateTime.now());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable hisTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
