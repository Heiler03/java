package gui;


public class Maestrosview extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Maestrosview() {
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

        bg = new javax.swing.JPanel();
        label_usuario = new javax.swing.JLabel();
        caja_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        label_contraseña = new javax.swing.JLabel();
        caja_usuario1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        label_sesion = new javax.swing.JLabel();
        btnext = new javax.swing.JButton();
        labelbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_usuario.setBackground(new java.awt.Color(255, 255, 255));
        label_usuario.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        label_usuario.setForeground(new java.awt.Color(0, 0, 0));
        label_usuario.setText("Usuario");
        bg.add(label_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 90, 30));

        caja_usuario.setBackground(new java.awt.Color(255, 145, 76));
        caja_usuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        caja_usuario.setForeground(new java.awt.Color(102, 102, 102));
        caja_usuario.setText("Ingrese su nombre de usuario");
        caja_usuario.setBorder(null);
        caja_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_usuarioActionPerformed(evt);
            }
        });
        bg.add(caja_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 200, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 320, -1));

        label_contraseña.setBackground(new java.awt.Color(255, 255, 255));
        label_contraseña.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        label_contraseña.setForeground(new java.awt.Color(0, 0, 0));
        label_contraseña.setText("Contraseña");
        bg.add(label_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 140, 30));

        caja_usuario1.setBackground(new java.awt.Color(255, 145, 76));
        caja_usuario1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        caja_usuario1.setForeground(new java.awt.Color(102, 102, 102));
        caja_usuario1.setText("Ingrese su contraseña");
        caja_usuario1.setBorder(null);
        caja_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_usuario1ActionPerformed(evt);
            }
        });
        bg.add(caja_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 210, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 320, -1));

        label_sesion.setBackground(new java.awt.Color(255, 255, 255));
        label_sesion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        label_sesion.setForeground(new java.awt.Color(0, 0, 0));
        label_sesion.setText("INICIO DE SESIÓN");
        bg.add(label_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 207, 30));

        btnext.setBackground(new java.awt.Color(255, 145, 76));
        btnext.setIcon(new javax.swing.ImageIcon("C:\\Users\\HeilerGa\\Documents\\NetBeansProjects\\horario\\src\\main\\java\\resources\\forwad.png")); // NOI18N
        btnext.setText("Next");
        btnext.setBorder(null);
        bg.add(btnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, -1, -1));

        labelbg.setIcon(new javax.swing.ImageIcon("C:\\Users\\HeilerGa\\Documents\\NetBeansProjects\\horario\\src\\main\\java\\resources\\background-sesion.jpeg")); // NOI18N
        labelbg.setText("jLabel1");
        bg.add(labelbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caja_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja_usuarioActionPerformed

    private void caja_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_usuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja_usuario1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnext;
    private javax.swing.JTextField caja_usuario;
    private javax.swing.JTextField caja_usuario1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_contraseña;
    private javax.swing.JLabel label_sesion;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JLabel labelbg;
    // End of variables declaration//GEN-END:variables
}
