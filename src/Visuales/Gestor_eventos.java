/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visuales;

import Base_de_Datos.Gestion;
import clases.Evento;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utiles.Secuencias_cadenas;
import static utiles.Secuencias_cadenas.sonNumeros;
import utiles.Tupla;

/**
 *
 * @author SchWarZer
 */
public class Gestor_eventos extends javax.swing.JFrame {

    /**
     * Creates new form GestorEventos
     */
    
    private Gestion G = new Gestion();
    private Vector<Tupla<Integer,String>> eventos;
    private Vector<Tupla<Integer,String>> eventosNombre;
    private Vector<Tupla<Integer,String>> eventosSeleccionados;
    private int eventosAnno;
    private String eventosDimension;
    
    private Evento eventoTemp;
            
    public Gestor_eventos() {
        initComponents();
        
        
        eventos = G.obtenerEventos();
        eventosNombre = new Vector<>();
        eventosSeleccionados = new Vector<>();
        eventosAnno = 0;
        eventosDimension = "";
        setTitle("Gestión de eventos");
        setLocationRelativeTo(null);
        setResizable(false);
        
        Vector<String> dimensiones = G.obtenerDimensiones();
        for(int i = 0; i < dimensiones.size(); i++){
            dimensionEvento.addItem(dimensiones.elementAt(i));
        }
        dimensionEvento.addItem("Todas");
        
        actualizarTablaEventos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logrosSeleccion = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLogros = new javax.swing.JTable();
        agregarLogro = new javax.swing.JButton();
        eliminarLogro = new javax.swing.JButton();
        cambiarValor = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        eventosMenu = new javax.swing.JPopupMenu();
        editarLogros = new javax.swing.JMenuItem();
        EliminarEvento = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEventos = new javax.swing.JTable();
        nombreEvento = new javax.swing.JLabel();
        nombreEventoT = new javax.swing.JTextField();
        annoEvento = new javax.swing.JLabel();
        annoEventoT = new javax.swing.JTextField();
        dimensionEvento = new javax.swing.JComboBox<>();
        nuevoEvento = new javax.swing.JButton();
        ButtonFinalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tablaLogros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaLogros);

        agregarLogro.setText("Agregar logro");
        agregarLogro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarLogroActionPerformed(evt);
            }
        });

        eliminarLogro.setText("Eliminar logro");
        eliminarLogro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarLogroActionPerformed(evt);
            }
        });

        cambiarValor.setText("Cambiar valor");
        cambiarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarValorActionPerformed(evt);
            }
        });

        finalizar.setText("Finalizar");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logrosSeleccionLayout = new javax.swing.GroupLayout(logrosSeleccion.getContentPane());
        logrosSeleccion.getContentPane().setLayout(logrosSeleccionLayout);
        logrosSeleccionLayout.setHorizontalGroup(
            logrosSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logrosSeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logrosSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(logrosSeleccionLayout.createSequentialGroup()
                        .addComponent(agregarLogro)
                        .addGap(71, 71, 71)
                        .addComponent(eliminarLogro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(cambiarValor)
                        .addGap(71, 71, 71)
                        .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        logrosSeleccionLayout.setVerticalGroup(
            logrosSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logrosSeleccionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(logrosSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarLogro)
                    .addComponent(eliminarLogro)
                    .addComponent(cambiarValor)
                    .addComponent(finalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        editarLogros.setText("Editar Logros");
        editarLogros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarLogrosActionPerformed(evt);
            }
        });
        eventosMenu.add(editarLogros);

        EliminarEvento.setText("Eliminar Evento");
        eventosMenu.add(EliminarEvento);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tablaEventos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaEventos);

        nombreEvento.setText("Buscar evento por nombre");

        nombreEventoT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreEventoTKeyReleased(evt);
            }
        });

        annoEvento.setText("Buscar evento por año");

        annoEventoT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                annoEventoTKeyReleased(evt);
            }
        });

        dimensionEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimensionEventoActionPerformed(evt);
            }
        });

        nuevoEvento.setText("Nuevo evento");
        nuevoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoEventoActionPerformed(evt);
            }
        });

        ButtonFinalizar.setText("Atrás");
        ButtonFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonFinalizarMouseClicked(evt);
            }
        });

        jLabel1.setText("Buscar evento por extensión");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreEvento)
                            .addComponent(jLabel1)
                            .addComponent(annoEvento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dimensionEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonFinalizar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(annoEventoT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nombreEventoT, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nuevoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 105, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreEvento)
                    .addComponent(nombreEventoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevoEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annoEvento)
                    .addComponent(annoEventoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dimensionEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonFinalizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreEventoTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreEventoTKeyReleased
        
        if (sonNumeros(evt.getKeyChar())) {
            Character caracterEtrada = evt.getKeyChar();
            String reeplazo = nombreEventoT.getText().replaceAll(caracterEtrada.toString(), "");
            nombreEventoT.setText(reeplazo);
        }
        
        eventosNombre.removeAllElements();

        if(nombreEventoT.getText().equals("")){
            actualizarTablaEventos();
            return;
        }
        String temp = nombreEventoT.getText();

        if(temp.length() >= 3){
        for (int i = 0; i < eventos.size(); i++) {
            if (Secuencias_cadenas.mayor_subcadena(temp, (String)G.obtenerNombreEvento(eventos.elementAt(i).getN1()))) {
                eventosNombre.add(eventos.elementAt(i));
            }
        }
        actualizarTablaEventos();
        }
        
    }//GEN-LAST:event_nombreEventoTKeyReleased

    private void annoEventoTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_annoEventoTKeyReleased
        
         char X = evt.getKeyChar();
        Secuencias_cadenas.borrarLetras(X, annoEventoT);
        if (annoEventoT.getText().equals("")) {
            eventosAnno=0;
            actualizarTablaEventos();
            return;
        }
        eventosAnno = Integer.parseInt(annoEventoT.getText());

        if (eventosAnno >= 100 && eventosAnno < 10000) {
            actualizarTablaEventos();
        }
        
    }//GEN-LAST:event_annoEventoTKeyReleased

    private void nuevoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoEventoActionPerformed
       
        Editor_eventos EE = new Editor_eventos();
        EE.setVisible(true);
        eventosMenu.setVisible(false);
        dispose();      
    }//GEN-LAST:event_nuevoEventoActionPerformed

    private void dimensionEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimensionEventoActionPerformed
         String seleccion = (String) dimensionEvento.getSelectedItem();
        if (seleccion.equals("Todas")) {
            eventosDimension = "";
            actualizarTablaEventos();
            return;
        }
        eventosDimension = (String)dimensionEvento.getSelectedItem();

        actualizarTablaEventos();
    }//GEN-LAST:event_dimensionEventoActionPerformed

    private void editarLogrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarLogrosActionPerformed
       
        eventosMenu.setVisible(false);
        logrosSeleccion.setVisible(true);
        
        logrosSeleccion.setLocation(this.getLocationOnScreen());
        logrosSeleccion.setSize(624, 473);
        eventoTemp = G.obtenerEvento(eventosSeleccionados.elementAt(tablaEventos.getSelectedRow()).getN1());
        logrosSeleccion.setTitle("Editor de logros del evento "+ eventoTemp.getNombre() +" del año "+eventoTemp.getAnno().substring(eventoTemp.getAnno().length()-4));
        actualizarTablaLogros(eventoTemp);
        
    }//GEN-LAST:event_editarLogrosActionPerformed

    private void agregarLogroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarLogroActionPerformed
        
        String logro = JOptionPane.showInputDialog(null, "Escriba el nombre del logro");
        if(logro != null && !logro.equals("")){
            G.agregarLogro(new Tupla<>(logro, 0), eventoTemp);
        }
        actualizarTablaLogros(eventoTemp);
        
    }//GEN-LAST:event_agregarLogroActionPerformed

    private void eliminarLogroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarLogroActionPerformed
        
        int fila = tablaLogros.getSelectedRow();
        
        if(fila > -1){
            
            Tupla<String, Integer> logro = new Tupla<>((String)tablaLogros.getValueAt(fila, 0), (Integer)tablaLogros.getValueAt(fila, 1));
            G.eliminarLogro(logro, eventoTemp);
            actualizarTablaLogros(eventoTemp);
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay ningún logro seleccionado en la tabla");
        }
        
    }//GEN-LAST:event_eliminarLogroActionPerformed

    private void cambiarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarValorActionPerformed
        int fila = tablaLogros.getSelectedRow();
        
        if(fila > -1){
            try {
                
            int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el valor del logro"));
        if(valor < 0){
            JOptionPane.showMessageDialog(null, "El número debe ser mayor que 0", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
            if(valor != 0){
            Tupla<String, Integer> logro = new Tupla<>((String)tablaLogros.getValueAt(fila, 0), valor);
            G.agregarLogro(logro, eventoTemp);
            actualizarTablaLogros(eventoTemp);
        }
                    } catch (HeadlessException | NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Debe escribir un número", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay ningún logro seleccionado en la tabla");
        }
    }//GEN-LAST:event_cambiarValorActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        
        logrosSeleccion.setVisible(false);
        
    }//GEN-LAST:event_finalizarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       eventosMenu.setVisible(false);
        Main M = new Main();
        M.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        eventosMenu.setVisible(false);
    }//GEN-LAST:event_formMouseClicked

    private void ButtonFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonFinalizarMouseClicked
       eventosMenu.setVisible(false);
        Main M = new Main();
        M.setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonFinalizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonFinalizar;
    private javax.swing.JMenuItem EliminarEvento;
    private javax.swing.JButton agregarLogro;
    private javax.swing.JLabel annoEvento;
    private javax.swing.JTextField annoEventoT;
    private javax.swing.JButton cambiarValor;
    private javax.swing.JComboBox<String> dimensionEvento;
    private javax.swing.JMenuItem editarLogros;
    private javax.swing.JButton eliminarLogro;
    private javax.swing.JPopupMenu eventosMenu;
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog logrosSeleccion;
    private javax.swing.JLabel nombreEvento;
    private javax.swing.JTextField nombreEventoT;
    private javax.swing.JButton nuevoEvento;
    private javax.swing.JTable tablaEventos;
    private javax.swing.JTable tablaLogros;
    // End of variables declaration//GEN-END:variables


     private void actualizarTablaEventos() {

        DefaultTableModel d = new DefaultTableModel(){
            @Override
             public boolean isCellEditable(int row, int column) {
                return false;         
             };
        };
        Object[] OBJ = new Object[3];
        d.addColumn("Evento");
        d.addColumn("Año");
        d.addColumn("Dimensión");
        
        eventosSeleccionados = new Vector<>();
        if(eventosNombre.isEmpty()&& !nombreEventoT.getText().equals("")){
            System.err.println("Error");
        }
        else if(eventosAnno == 0 && eventosDimension.equals("") && eventosNombre.isEmpty()){
            eventosSeleccionados = eventos;
        }
        
        else if(eventosAnno != 0 && eventosDimension.equals("") && eventosNombre.isEmpty()){
            for(int i = 0; i < eventos.size(); i++){
                if(eventosAnno == Integer.parseInt(eventos.elementAt(i).getN2().substring(eventos.elementAt(i).getN2().length()-4))){
                    eventosSeleccionados.add(eventos.elementAt(i));
                }
            }
        }
        else if(eventosAnno == 0 && !eventosDimension.equals("") && eventosNombre.isEmpty()){
            for(int i = 0; i < eventos.size(); i++){
                if(G.obtenerDimensionEvento(eventos.elementAt(i).getN1()).equals(eventosDimension)){
                    eventosSeleccionados.add(eventos.elementAt(i));
                }
            }
        }
        else if(eventosAnno == 0 && eventosDimension.equals("") && !eventosNombre.isEmpty()){
            for(int i = 0; i < eventos.size(); i++){
                if(eventosNombre.contains(eventos.elementAt(i))){
                    eventosSeleccionados.add(eventos.elementAt(i));
                }
            }
        }
        else if(eventosAnno != 0 && !eventosDimension.equals("") && eventosNombre.isEmpty()){
            for(int i = 0; i < eventos.size(); i++){
                if(G.obtenerDimensionEvento(eventos.elementAt(i).getN1()).equals(eventosDimension) && eventosAnno == Integer.parseInt(eventos.elementAt(i).getN2().substring(eventos.elementAt(i).getN2().length()-4))){
                    eventosSeleccionados.add(eventos.elementAt(i));
                }
            }
        }
        else if(eventosAnno == 0 && !eventosDimension.equals("") && !eventosNombre.isEmpty()){
            for(int i = 0; i < eventos.size(); i++){
                if(G.obtenerDimensionEvento(eventos.elementAt(i).getN1()).equals(eventosDimension) && eventosNombre.contains(eventos.elementAt(i))){
                    eventosSeleccionados.add(eventos.elementAt(i));
                }
            }
        }
        else if(eventosAnno != 0 && eventosDimension.equals("") && !eventosNombre.isEmpty()){
            for(int i = 0; i < eventos.size(); i++){
                if(eventosAnno == Integer.parseInt(eventos.elementAt(i).getN2().substring(eventos.elementAt(i).getN2().length()-4)) && eventosNombre.contains(eventos.elementAt(i))){
                    eventosSeleccionados.add(eventos.elementAt(i));
                }
            }
        }
        else{
            for(int i = 0; i < eventos.size(); i++){
                if(eventosAnno == Integer.parseInt(eventos.elementAt(i).getN2().substring(eventos.elementAt(i).getN2().length()-4)) && eventosNombre.contains(eventos.elementAt(i)) && G.obtenerDimensionEvento(eventos.elementAt(i).getN1()).equals(eventosDimension)){
                    eventosSeleccionados.add(eventos.elementAt(i));
                }
            }
        }

        for (int i = 0; i < eventosSeleccionados.size(); i++) {
            OBJ[0] = G.obtenerNombreEvento(eventosSeleccionados.elementAt(i).getN1());
            OBJ[1] = eventosSeleccionados.elementAt(i).getN2();
            OBJ[2] = G.obtenerDimensionEvento(eventosSeleccionados.elementAt(i).getN1());
            d.addRow(OBJ);
        }

        tablaEventos = new JTable(d);

        tablaEventos.setFont(new Font("arial", Font.BOLD, 14));
        tablaEventos.setRowHeight(30);
        tablaEventos.setShowGrid(true);

        jScrollPane1.setViewportView(tablaEventos);

        tablaEventos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tablaEventos.rowAtPoint(e.getPoint());

                if (fila > -1) {
                   eventosMenu.setVisible(true);
                   eventosMenu.setLocation(e.getXOnScreen(),e.getYOnScreen());

                }
            }
        });

    }

    private void actualizarTablaLogros(Evento eventoTemp) {

         DefaultTableModel d = new DefaultTableModel(){
           @Override
             public boolean isCellEditable(int row, int column) {
                return false;         
             };
         };
        Object[] OBJ = new Object[2];
        d.addColumn("Logro");
        d.addColumn("Valor");
        
        
        Vector<Tupla<String, Integer>> logros = G.obtenerLogrosEvento(eventoTemp);

        for (int i = 0; i < logros.size(); i++) {
            OBJ[0] = logros.elementAt(i).getN1();
            OBJ[1] = logros.elementAt(i).getN2();
            d.addRow(OBJ);
        }

        tablaLogros = new JTable(d);

        tablaLogros.setFont(new Font("arial", Font.BOLD, 14));
        tablaLogros.setRowHeight(30);
        tablaLogros.setShowGrid(true);

        jScrollPane2.setViewportView(tablaLogros);

        
    }
}
