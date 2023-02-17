package Barberia;

import javax.swing.DefaultListModel;

public class Interfaz extends javax.swing.JFrame {

    public DefaultListModel modelo;

    public Interfaz() {
        initComponents();
        this.ocultarEspera();
        
        this.modelo = new DefaultListModel();
    }

    public void ocultarEspera() {
        this.Espera1.setVisible(false);
        this.Espera2.setVisible(false);
        this.Espera3.setVisible(false);
        this.Espera4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Espera1 = new javax.swing.JLabel();
        Espera2 = new javax.swing.JLabel();
        Espera3 = new javax.swing.JLabel();
        Espera4 = new javax.swing.JLabel();
        jButtonAgregarProceso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProcesosFuera = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabelestado1 = new javax.swing.JLabel();
        jLabelestado2 = new javax.swing.JLabel();
        jLabelestado3 = new javax.swing.JLabel();
        jLabeLacum1 = new javax.swing.JLabel();
        jLabelacum2 = new javax.swing.JLabel();
        jLabelacum3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlContenedor = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Espera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(Espera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        Espera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(Espera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        Espera3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(Espera3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        Espera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(Espera4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        jButtonAgregarProceso.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jButtonAgregarProceso.setText("Agregar Cliente");
        jButtonAgregarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarProcesoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregarProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluqueria.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setText("Los Hermanos Carrasco");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 280, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluqueria.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jListProcesosFuera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jListProcesosFuera);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, 350));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ESTADO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 60, -1));

        jLabelestado1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jLabelestado2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jLabelestado3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jLabeLacum1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jPanel1.add(jLabeLacum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 70, 20));

        jLabelacum2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jPanel1.add(jLabelacum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 60, 20));

        jLabelacum3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jPanel1.add(jLabelacum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 50, 20));

        jPanel2.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 510, 20));

        jPanel3.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 50, 220));

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 360, -1));

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Lista de espera");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedor.setLayout(new javax.swing.BoxLayout(pnlContenedor, javax.swing.BoxLayout.X_AXIS));
        jScrollPane2.setViewportView(pnlContenedor);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 450, 230));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Agregar Barberos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        jPanel5.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarProcesoActionPerformed
        modelo.addElement("Cliente en espera");
        jListProcesosFuera.setModel(modelo);
        
        if (modelo.getSize() > -1) {
            verificarEspera();
        }
    }//GEN-LAST:event_jButtonAgregarProcesoActionPerformed

    public void llenarFila() {
        if (modelo.getSize() > 0) {
            modelo.removeElementAt(modelo.getSize() - 1);
            ocuparSillaEspera(0);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pnlContenedor.add(new Barbero(this));
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean evaluarSillaOcupada() {
        System.out.println(Espera4.isVisible());
        if (this.Espera4.isVisible()) {
            desocuparSillaEspera(0);
            return true;
        }
        if (this.Espera3.isVisible()) {
            desocuparSillaEspera(1);
            return true;
        }
        if (this.Espera2.isVisible()) {
            desocuparSillaEspera(2);
            return true;
        }
        if (this.Espera1.isVisible()) {
            desocuparSillaEspera(3);
            return true;
        }
        return false;
    }

    public void ocuparSillaEspera(int silla) {
        switch (silla) {
            case 0:
                Espera4.setVisible(true);
                break;
            case 1:
                Espera3.setVisible(true);
                break;
            case 2:
                Espera2.setVisible(true);
                break;
            case 3:
                Espera1.setVisible(true);
                break;
            default:
                break;
        }
    }

    private void verificarEspera() {
        if (!this.Espera4.isVisible()) {
            this.Espera4.setVisible(true);
            modelo.removeElementAt(modelo.getSize() - 1);
            return;
        }
        if (!this.Espera3.isVisible()) {
            this.Espera3.setVisible(true);
            modelo.removeElementAt(modelo.getSize() - 1);
            return;
        }
        if (!this.Espera2.isVisible()) {
            this.Espera2.setVisible(true);
            modelo.removeElementAt(modelo.getSize() - 1);
            return;
        }
        if (!this.Espera1.isVisible()) {
            this.Espera1.setVisible(true);
            modelo.removeElementAt(modelo.getSize() - 1);
            return;
        }
    }

    public void desocuparSillaEspera(int silla) {
        switch (silla) {
            case 0:
                Espera4.setVisible(false);
                break;
            case 1:
                Espera3.setVisible(false);
                break;
            case 2:
                Espera2.setVisible(false);
                break;
            case 3:
                Espera1.setVisible(false);
                break;
            default:
                break;
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Espera1;
    private javax.swing.JLabel Espera2;
    private javax.swing.JLabel Espera3;
    private javax.swing.JLabel Espera4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregarProceso;
    private javax.swing.JLabel jLabeLacum1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelacum2;
    private javax.swing.JLabel jLabelacum3;
    private javax.swing.JLabel jLabelestado1;
    private javax.swing.JLabel jLabelestado2;
    private javax.swing.JLabel jLabelestado3;
    private javax.swing.JList<String> jListProcesosFuera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlContenedor;
    // End of variables declaration//GEN-END:variables
}
