package Product;

import DAO.ProductDAO;
import Model.Product;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTab extends javax.swing.JPanel {

    ProductDAO PdDAO;
    DefaultTableModel ModelPD;

    public ExcelTab() {
        initComponents();
        excelTable();
    }

    public void excelTable() {
        PdDAO = new ProductDAO();
        ModelPD = new DefaultTableModel() {
            @Override //Không cho người dùng edit table
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        excelTable.setModel(ModelPD);
        ModelPD.addColumn("ID");
        ModelPD.addColumn("Name");
        ModelPD.addColumn("Amount");
        ModelPD.addColumn("Price Origin");
        ModelPD.addColumn("Price");

        excelTable.getColumnModel().getColumn(0).setMinWidth(80);
        excelTable.getColumnModel().getColumn(0).setMaxWidth(80);
        excelTable.getColumnModel().getColumn(1).setMinWidth(300);
        excelTable.getColumnModel().getColumn(1).setMaxWidth(300);
        excelTable.getColumnModel().getColumn(2).setMinWidth(100);
        excelTable.getColumnModel().getColumn(2).setMaxWidth(100);
        excelTable.getColumnModel().getColumn(3).setMinWidth(100);
        excelTable.getColumnModel().getColumn(3).setMaxWidth(100);
        excelTable.getColumnModel().getColumn(4).setMinWidth(150);
        excelTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        setDataPDtable(PdDAO.getListProduct());
    }

    private void setDataPDtable(List<Product> PDList) {
        for (Product PD : PDList) {
            ModelPD.addRow(new Object[]{
                PD.getProductID(), PD.getProductName(), PD.getAmount(),
                PD.getPriceOrigin(), PD.getPrice()
            });
        }
    }

    public void Excel() {
        JFileChooser excelFile = new JFileChooser("C:\\Users\\Dai Phuc\\Desktop");
        int excelChooser = excelFile.showSaveDialog(null);

        if (excelChooser == JFileChooser.APPROVE_OPTION) {

            XSSFWorkbook excel = new XSSFWorkbook();
            XSSFSheet excelSheet = excel.createSheet("Product");

            XSSFRow excelRow = null;
            XSSFCell excelCell = null;

            excelRow = excelSheet.createRow(0);

            excelRow.createCell(0).setCellValue("Product ID");

            excelRow.createCell(1).setCellValue("Product Name");

            excelRow.createCell(2).setCellValue("Origin Price");

            excelRow.createCell(3).setCellValue("Price");

            excelRow.createCell(4).setCellValue("Amount");

            for (int i = 0; i < ModelPD.getRowCount(); i++) {

                excelRow = excelSheet.createRow(i + 1);

                for (int j = 0; j < ModelPD.getColumnCount(); j++) {

                    excelCell = excelRow.createCell(j);
                    excelCell.setCellValue(ModelPD.getValueAt(i, j).toString());

                }
            }

            FileOutputStream excelaFIS;
            BufferedOutputStream excelBOU;

            try {
                excelaFIS = new FileOutputStream(excelFile.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelaFIS);
                excel.write(excelBOU);
                excelBOU.close();
                excel.close();
                JOptionPane.showMessageDialog(null, "Succesfully Exported");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        excelTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Excel");

        excelTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        excelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        excelTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(excelTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable excelTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
