/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

/**
 *
 * @author Heiler
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public Admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgpanel = new javax.swing.JPanel();
        cmbcra = new javax.swing.JComboBox<>();
        cmbsmt = new javax.swing.JComboBox<>();
        labelcarreras = new javax.swing.JLabel();
        labelSemestre = new javax.swing.JLabel();
        titulodeeleccion = new javax.swing.JLabel();
        tituloeleccion2 = new javax.swing.JLabel();
        Sticker = new javax.swing.JLabel();
        btnext1 = new javax.swing.JButton();
        labelbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgpanel.setPreferredSize(new java.awt.Dimension(845, 500));
        bgpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbcra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Elige una carrera", "Informatica", "Turismo", "Administracion" }));
        bgpanel.add(cmbcra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 140, -1));

        cmbsmt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Elige un semestre", "Semestre 1", "Semestre 2", "Semestre 3", "Semestre 4", "Semestre 5" }));
        cmbsmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsmtActionPerformed(evt);
            }
        });
        bgpanel.add(cmbsmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 140, -1));

        labelcarreras.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        labelcarreras.setForeground(new java.awt.Color(0, 0, 0));
        labelcarreras.setText("Carreras");
        bgpanel.add(labelcarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 80, 30));

        labelSemestre.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        labelSemestre.setForeground(new java.awt.Color(0, 0, 0));
        labelSemestre.setText("Semestre");
        bgpanel.add(labelSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 222, 90, 30));

        titulodeeleccion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        titulodeeleccion.setForeground(new java.awt.Color(0, 0, 0));
        titulodeeleccion.setText("Bienvenid@");
        bgpanel.add(titulodeeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 140, 40));

        tituloeleccion2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tituloeleccion2.setForeground(new java.awt.Color(0, 0, 0));
        tituloeleccion2.setText("Selecciona el horario que deseas ver");
        bgpanel.add(tituloeleccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 330, 20));

        Sticker.setIcon(new javax.swing.ImageIcon("C:\\Users\\HeilerGa\\Documents\\NetBeansProjects\\horario\\src\\main\\java\\resources\\hojasticker.png")); // NOI18N
        bgpanel.add(Sticker, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 60, 40));

        btnext1.setBackground(new java.awt.Color(255, 145, 76));
        btnext1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HeilerGa\\Documents\\NetBeansProjects\\horario\\src\\main\\java\\resources\\forwad.png")); // NOI18N
        btnext1.setText("Next");
        btnext1.setBorder(null);
        btnext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnext1ActionPerformed(evt);
            }
        });
        bgpanel.add(btnext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        labelbg.setIcon(new javax.swing.ImageIcon("C:\\Users\\HeilerGa\\Documents\\NetBeansProjects\\horario\\src\\main\\java\\resources\\background-inicio.jpeg")); // NOI18N
        bgpanel.add(labelbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbsmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsmtActionPerformed

    private void btnext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnext1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sticker;
    private javax.swing.JPanel bgpanel;
    private javax.swing.JButton btnext1;
    private javax.swing.JComboBox<String> cmbcra;
    private javax.swing.JComboBox<String> cmbsmt;
    private javax.swing.JLabel labelSemestre;
    private javax.swing.JLabel labelbg;
    private javax.swing.JLabel labelcarreras;
    private javax.swing.JLabel titulodeeleccion;
    private javax.swing.JLabel tituloeleccion2;
    // End of variables declaration//GEN-END:variables
}
