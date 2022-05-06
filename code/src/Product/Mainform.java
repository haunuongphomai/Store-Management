package Product;

import Model.Product;
import Nhanvien.StaffTab;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;

public class Mainform extends javax.swing.JFrame {

    private SearchTab STab;
    private SortTab SRTab;
    private AddTab ATab;
    private RemoveTab RTab;
    private ModifyTab MTab;
    private ExcelTab ETab;
    private HistoryChange HChange;
    private StaffTab SfTab;
    List<Product> PDList;

    int mouseX;
    int mouseY;

    public Mainform() {
        initComponents();
        setLocationRelativeTo(null);
        mainTab.setLayout(new BorderLayout());
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.black));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        searchButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        sortButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        addButton = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        removeButton = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        modifyButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        excelButton = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        hisButton = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        staffButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        mainTab = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setFocusable(false);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(8, 32, 50));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(240, 165, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("STORE MANAGEMENT");
        jTextField1.setFocusable(false);
        jTextField1.setPreferredSize(new java.awt.Dimension(610, 28));
        jTextField1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTextField1MouseDragged(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setFloatable(false);
        jToolBar1.add(jSeparator10);

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.setToolTipText("Allows you to search for product information.");
        searchButton.setFocusable(false);
        searchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(searchButton);
        jToolBar1.add(jSeparator1);

        sortButton.setBackground(new java.awt.Color(255, 255, 255));
        sortButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        sortButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/filter.png"))); // NOI18N
        sortButton.setText("Sort");
        sortButton.setToolTipText("Sort products by price and name.");
        sortButton.setFocusable(false);
        sortButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sortButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(sortButton);
        jToolBar1.add(jSeparator2);

        addButton.setBackground(new java.awt.Color(255, 255, 255));
        addButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add.png"))); // NOI18N
        addButton.setText("Add");
        addButton.setToolTipText("Add a new product.");
        addButton.setFocusable(false);
        addButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(addButton);
        jToolBar1.add(jSeparator6);

        removeButton.setBackground(new java.awt.Color(255, 255, 255));
        removeButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete-button.png"))); // NOI18N
        removeButton.setText("Remove");
        removeButton.setToolTipText("Delete a product.");
        removeButton.setFocusable(false);
        removeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        removeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(removeButton);
        jToolBar1.add(jSeparator7);

        modifyButton.setBackground(new java.awt.Color(255, 255, 255));
        modifyButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        modifyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit.png"))); // NOI18N
        modifyButton.setText("Modify");
        modifyButton.setFocusable(false);
        modifyButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modifyButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(modifyButton);
        jToolBar1.add(jSeparator3);

        excelButton.setBackground(new java.awt.Color(255, 255, 255));
        excelButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        excelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xlsx.png"))); // NOI18N
        excelButton.setText("Excel File");
        excelButton.setFocusable(false);
        excelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        excelButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        excelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(excelButton);
        jToolBar1.add(jSeparator8);

        hisButton.setBackground(new java.awt.Color(255, 255, 255));
        hisButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        hisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/clock.png"))); // NOI18N
        hisButton.setText("HistoryChange");
        hisButton.setFocusable(false);
        hisButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hisButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        hisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hisButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(hisButton);
        jToolBar1.add(jSeparator4);

        staffButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        staffButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/staff.png"))); // NOI18N
        staffButton.setText("Staff");
        staffButton.setFocusable(false);
        staffButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        staffButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        staffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(staffButton);

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/exit.png"))); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));

        mainTab.setBackground(new java.awt.Color(255, 255, 255));
        mainTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9)
                    .addComponent(mainTab)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainTab, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (STab == null) {
            STab = new SearchTab();
            mainTab.addTab("Search", STab);
    }//GEN-LAST:event_searchButtonActionPerformed
        mainTab.setSelectedComponent(STab);
        STab.tablePD();
    }
    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        if (SRTab == null) {
            SRTab = new SortTab();
            mainTab.addTab("Sort", SRTab);
        }
        mainTab.setSelectedComponent(SRTab);
        SRTab.tableSort();
    }//GEN-LAST:event_sortButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (ATab == null) {
            ATab = new AddTab();
            mainTab.addTab("Add", ATab);
        }
        mainTab.setSelectedComponent(ATab);
        ATab.tableAdd();
    }//GEN-LAST:event_addButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        if (RTab == null) {
            RTab = new RemoveTab();
            mainTab.addTab("Remove Tab", RTab);
        }
        mainTab.setSelectedComponent(RTab);
        RTab.delTable();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        if (MTab == null) {
            MTab = new ModifyTab();
            mainTab.addTab("Modify", MTab);
        }
        mainTab.setSelectedComponent(MTab);
        MTab.modifyTable();
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jTextField1MousePressed

    private void jTextField1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_jTextField1MouseDragged

    private void excelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelButtonActionPerformed
        if (ETab == null) {
            ETab = new ExcelTab();
            mainTab.addTab("Excel", ETab);
        }
        mainTab.setSelectedComponent(ETab);
        ETab.Excel();
    }//GEN-LAST:event_excelButtonActionPerformed

    private void hisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hisButtonActionPerformed
        if (HChange == null) {
            HChange = new HistoryChange();
            mainTab.addTab("HistoryChange", HChange);
        }
        mainTab.setSelectedComponent(HChange);
        HChange.hisTable();
    }//GEN-LAST:event_hisButtonActionPerformed

    private void staffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffButtonActionPerformed
        if (SfTab == null) {
            SfTab = new StaffTab();
            mainTab.addTab("Staff", SfTab);
        }
        mainTab.setSelectedComponent(SfTab);
        SfTab.tableST();
    }//GEN-LAST:event_staffButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) throws InterruptedException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton excelButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton hisButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTabbedPane mainTab;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton sortButton;
    private javax.swing.JButton staffButton;
    // End of variables declaration//GEN-END:variables
}
