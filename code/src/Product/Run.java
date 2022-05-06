package Product;

import javax.swing.JOptionPane;

public class Run extends javax.swing.JFrame {

    public Run() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        LoadingLabel = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(8, 32, 50));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadingLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        LoadingLabel.setForeground(new java.awt.Color(240, 165, 0));
        LoadingLabel.setText("Loading...");
        Background.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        LoadingValue.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(240, 165, 0));
        LoadingValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LoadingValue.setText("0%");
        Background.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 40, -1));

        LoadingBar.setPreferredSize(new java.awt.Dimension(147, 11));
        Background.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 880, 20));

        jLabel1.setFont(new java.awt.Font("Corbel Light", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Phan Ba Dai Phuc B1910688");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 280, 60));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 2, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 165, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("PRODUCT");
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 350, 80));

        jLabel3.setFont(new java.awt.Font("Corbel Light", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("MANAGEMENT");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 310, 60));

        jLabel4.setFont(new java.awt.Font("Corbel Light", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Tutor: Tran Cong An");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 280, 60));

        jLabel5.setFont(new java.awt.Font("Corbel Light", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Duong Huynh Hao B1910633");
        Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 280, 60));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) throws InterruptedException {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Run.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Run.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Run.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Run.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        Run it = new Run();
        it.setVisible(true);
        try {
            for (int i = 0; i <= 100; i += 4) {
                Thread.sleep(100);
                it.LoadingValue.setText(i + "%");

                if (i == 10) {
                    it.LoadingLabel.setText("Opening...");
                }

                if (i == 40) {
                    it.LoadingLabel.setText("Loading...");
                }

                if (i == 60) {
                    it.LoadingLabel.setText("Conneting to database...");

                }

                if (i == 75) {
                    it.LoadingLabel.setText("Launching application");
                }

                it.LoadingBar.setValue(i);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        it.setVisible(false);

        for (int i = 0; i <= 100; i += 2) {
            Thread.sleep(100);
            new Mainform().setVisible(true);
            break;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
