package Barberia;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Barbero extends javax.swing.JPanel {

    private Interfaz objInterfaz;
    private int tiempo;

    public Barbero(Interfaz vtnInterfaz) {
        initComponents();
        this.objInterfaz = vtnInterfaz;

        new Thread(() -> {
            while (true) {
                tiempo = getRandomNumberInRange(10, 15);

                this.ocultarCliente();
                this.jLabel1.setText("Desocupado");
                this.jLabel1.setForeground(new Color(51, 255, 51));
                this.pausarHilo(2);

                if (objInterfaz.evaluarSillaOcupada()) {
                    objInterfaz.llenarFila();
                    this.mostrarCliente();

                    this.jLabel1.setText("Ocupado");
                    System.out.println("El tiempo asignado es: " + tiempo);
                    this.jLabel1.setForeground(new Color(204, 204, 0));
                    this.pausarHilo(tiempo);

                    this.jLabel1.setText("Cobrando");
                    this.jLabel1.setForeground(new Color(204, 0, 0));
                    this.pausarHilo(2);
                    this.ocultarCliente();
                }
            }
        }).start();
    }

    public int getRandomNumberInRange(int min, int max) {//Este es mi contador para cada uno de los clientes que serán atendidos por mis Barberos.
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public void pausarHilo(int seconds) {
        try {//Este try catch lo eh considerado ya que puede generarse al hacer los datos aleatorios.
            Thread.sleep(seconds * 1000);//El Sleep, lo multiplico por 1000 ya que quiero que me arroje un contador con numeros enteros de 2 cifras.
        } catch (InterruptedException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ocultarCliente() {
        this.jLabelatencion1.setVisible(false);
    }

    public void mostrarCliente() {
        this.jLabelatencion1.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBarberoS = new javax.swing.JLabel();
        jLabelBarberoA = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelatencion1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(180, 280));
        setPreferredSize(new java.awt.Dimension(180, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBarberoS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero (1).png"))); // NOI18N
        add(jLabelBarberoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 70));

        jLabelBarberoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero.png"))); // NOI18N
        add(jLabelBarberoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/barbero.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 30, 60, 70));

        jLabelatencion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/avatar.png"))); // NOI18N
        add(jLabelatencion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Disponible");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBarberoA;
    private javax.swing.JLabel jLabelBarberoS;
    private javax.swing.JLabel jLabelatencion1;
    // End of variables declaration//GEN-END:variables
}
