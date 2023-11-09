/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visuales;

/**
 *
 * @author joanmanuel
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setTitle("Ventana Principal");
        
        annadirEstudiantesEvento.setText("Añadir estudiantes a un nuevo evento");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        crearNuevaBrigada = new javax.swing.JButton();
        annadirEstudiantesEvento = new javax.swing.JButton();
        ICI = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        gestorBrigadas = new javax.swing.JMenu();
        gestorCarreras = new javax.swing.JMenuItem();
        brigadasExistentes = new javax.swing.JMenuItem();
        gestorEventos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestor de fichas de estudiantes");

        crearNuevaBrigada.setText("Crear nueva brigada");
        crearNuevaBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearNuevaBrigadaActionPerformed(evt);
            }
        });

        annadirEstudiantesEvento.setText("Añadir estudiantes a una brigada");
        annadirEstudiantesEvento.setAutoscrolls(true);
        annadirEstudiantesEvento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        annadirEstudiantesEvento.setInheritsPopupMenu(true);
        annadirEstudiantesEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annadirEstudiantesEventoActionPerformed(evt);
            }
        });

        ICI.setText("Calcular el ICI");
        ICI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICIActionPerformed(evt);
            }
        });

        gestorBrigadas.setText("Gestores");

        gestorCarreras.setText("Gestor de Carreras");
        gestorCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestorCarrerasActionPerformed(evt);
            }
        });
        gestorBrigadas.add(gestorCarreras);

        brigadasExistentes.setText("Gestor de Brigadas");
        brigadasExistentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                brigadasExistentesMouseReleased(evt);
            }
        });
        gestorBrigadas.add(brigadasExistentes);

        gestorEventos.setText("Gestor de Eventos");
        gestorEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestorEventosActionPerformed(evt);
            }
        });
        gestorBrigadas.add(gestorEventos);

        jMenuBar1.add(gestorBrigadas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearNuevaBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ICI, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(annadirEstudiantesEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearNuevaBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ICI, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(annadirEstudiantesEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestorEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestorEventosActionPerformed

        Gestor_eventos GE = new Gestor_eventos();
        GE.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gestorEventosActionPerformed

    private void brigadasExistentesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brigadasExistentesMouseReleased
        Gestor_brigada gestorBrigada = new Gestor_brigada(1);
        gestorBrigada.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_brigadasExistentesMouseReleased

    private void gestorCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestorCarrerasActionPerformed
        Gestor_carreras GC = new Gestor_carreras(true);
        GC.setVisible(true);
        dispose();
    }//GEN-LAST:event_gestorCarrerasActionPerformed

    private void crearNuevaBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearNuevaBrigadaActionPerformed
       
        Gestor_carreras GC = new Gestor_carreras(false);
        GC.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_crearNuevaBrigadaActionPerformed

    private void annadirEstudiantesEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annadirEstudiantesEventoActionPerformed
        
        Gestor_brigada GB = new Gestor_brigada(3);
        GB.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_annadirEstudiantesEventoActionPerformed

    private void ICIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICIActionPerformed
        
        Gestor_brigada GB = new Gestor_brigada(2);
        GB.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_ICIActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ICI;
    private javax.swing.JButton annadirEstudiantesEvento;
    private javax.swing.JMenuItem brigadasExistentes;
    private javax.swing.JButton crearNuevaBrigada;
    private javax.swing.JMenu gestorBrigadas;
    private javax.swing.JMenuItem gestorCarreras;
    private javax.swing.JMenuItem gestorEventos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}