/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visuales;

import Base_de_Datos.Gestion;
import clases.Brigada;
import dialogs.AbstractFrame;
import dialogs.MessageDialog;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utiles.Secuencias_cadenas;
import static utiles.Secuencias_cadenas.sonNumeros;


/**
 *
 * @author joanmanuel
 */
public class Gestor_brigada extends AbstractFrame {

    private Gestion g;
    private Vector<String> carreras;
    private Vector<String> BrigadasCarrera;
    private Integer BrigadasAnno;
    private Integer BrigadasAnnoB;
    private int opcion;
    private boolean openMain;
    private Vector<Brigada> Brigadas;

    JFrame antecesor;
    
    private Vector<Brigada> BrigadasSeleccionadas;

    public Gestor_brigada(int opcion) {

        initComponents();
        g = new Gestion();
        BrigadasAnno = 0;
        BrigadasAnnoB = 0;
        setTitle("Gestor de Brigada");
        setResizable(false);
        setLocationRelativeTo(null);
        this.opcion = opcion;
        openMain = true;
        carreras = g.obtener_carreras();

        BrigadasCarrera = new Vector<>();
        Brigadas = g.obtenerBrigadas();
        BrigadasSeleccionadas = new Vector<>();
        actualizarTablaBrigadas(Brigadas);

        for (int i = 1; i <= 5; i++) {
            ComboBoxAnnos.addItem(i + "");
        }

        if (opcion == 1) {
            editar.setText("Editar");
        } else {
            editar.setText("Seleccionar");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableBrigadasExistentes = new javax.swing.JTable();
        editar = new javax.swing.JButton();
        LabelBeigadasExistentes = new javax.swing.JLabel();
        carreraBrigada = new javax.swing.JTextField();
        ButtonCancelar = new javax.swing.JButton();
        ComboBoxAnnos = new javax.swing.JComboBox<>();
        annoBrigada = new javax.swing.JLabel();
        anno = new javax.swing.JLabel();
        annoLabel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        TableBrigadasExistentes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableBrigadasExistentes);

        editar.setText("Editar brigada seleccionada");
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarMouseClicked(evt);
            }
        });

        LabelBeigadasExistentes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelBeigadasExistentes.setText("Nombre de la carrera");

        carreraBrigada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                carreraBrigadaKeyReleased(evt);
            }
        });

        ButtonCancelar.setText("Atrás");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        ComboBoxAnnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        ComboBoxAnnos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                ComboBoxAnnosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        annoBrigada.setText("Año de la brigada");

        anno.setText("Año");

        annoLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                annoLabelKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(annoBrigada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxAnnos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(anno)
                        .addGap(24, 24, 24)
                        .addComponent(annoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelBeigadasExistentes, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carreraBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBeigadasExistentes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carreraBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxAnnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(annoBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anno)
                            .addComponent(annoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar)
                    .addComponent(ButtonCancelar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carreraBrigadaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carreraBrigadaKeyReleased
        if (sonNumeros(evt.getKeyChar())) {
            Character caracterEtrada = evt.getKeyChar();
            String reeplazo = carreraBrigada.getText().replaceAll(caracterEtrada.toString(), "");
            carreraBrigada.setText(reeplazo);
        }
        if (carreraBrigada.getText().equals("")) {
            actualizarTablaBrigadas(Brigadas);
            return;
        }
        BrigadasCarrera.removeAllElements();
        String temp = carreraBrigada.getText();

        for (int i = 0; i < carreras.size(); i++) {
            if (Secuencias_cadenas.mayor_subcadena(temp, carreras.elementAt(i))) {
                BrigadasCarrera.add(carreras.elementAt(i));
            }
        }
        actualizarTablaBrigadas(Brigadas, BrigadasAnno, BrigadasAnnoB, BrigadasCarrera);


    }//GEN-LAST:event_carreraBrigadaKeyReleased

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {

        int fila = TableBrigadasExistentes.getSelectedRow();
        String carr = (String) TableBrigadasExistentes.getValueAt(fila, 0);
        int anno = (int) TableBrigadasExistentes.getValueAt(fila, 1);
        int annoB = (int) TableBrigadasExistentes.getValueAt(fila, 2);

        switch (opcion) {
            case 1 -> {
                if (BrigadasSeleccionadas.isEmpty()) {
                    for (int i = 0; i < Brigadas.size(); i++) {
                        if (Brigadas.elementAt(i).getAnno() == anno && Brigadas.elementAt(i).getAnno_brigada() == annoB && Brigadas.elementAt(i).getCarrera().equals(carr)) {
                            Editor_brigada EB = new Editor_brigada(Brigadas.elementAt(i));
                            EB.setVisible(true);
                            openMain = false;
                            dispose();
                        }
                    }
                }
                for (int i = 0; i < BrigadasSeleccionadas.size(); i++) {
                    if (BrigadasSeleccionadas.elementAt(i).getAnno() == anno && BrigadasSeleccionadas.elementAt(i).getAnno_brigada() == annoB && BrigadasSeleccionadas.elementAt(i).getCarrera().equals(carr)) {
                        Editor_brigada EB = new Editor_brigada(BrigadasSeleccionadas.elementAt(i));
                        EB.setVisible(true);
                        openMain = false;
                        dispose();
                    }
                }
            }
            case 2 -> {
                if (BrigadasSeleccionadas.isEmpty()) {
                    for (int i = 0; i < Brigadas.size(); i++) {
                        if (Brigadas.elementAt(i).getAnno() == anno && Brigadas.elementAt(i).getAnno_brigada() == annoB && Brigadas.elementAt(i).getCarrera().equals(carr)) {
                            int m = g.obtenerSumaValoresEventos(Brigadas.elementAt(i));
                            if (m == 0) {
                                return;
                            }
                            ICI ici = new ICI(Brigadas.elementAt(i));
                            ici.setVisible(true);
                            openMain = false;
                            dispose();
                        }
                    }
                }
                for (int i = 0; i < BrigadasSeleccionadas.size(); i++) {
                    if (BrigadasSeleccionadas.elementAt(i).getAnno() == anno && BrigadasSeleccionadas.elementAt(i).getAnno_brigada() == annoB && BrigadasSeleccionadas.elementAt(i).getCarrera().equals(carr)) {
                        int m = g.obtenerSumaValoresEventos(Brigadas.elementAt(i));
                        if (m == 0) {
                            return;
                        }
                        ICI ici = new ICI(BrigadasSeleccionadas.elementAt(i));
                        ici.setVisible(true);
                        openMain = false;
                        dispose();
                    }
                }
            }
            case 3 -> {
                if (BrigadasSeleccionadas.isEmpty()) {
                    for (int i = 0; i < Brigadas.size(); i++) {
                        if (Brigadas.elementAt(i).getAnno() == anno && Brigadas.elementAt(i).getAnno_brigada() == annoB && Brigadas.elementAt(i).getCarrera().equals(carr)) {
                            if(g.obtenerEventosBrigada(Brigadas.elementAt(i)).isEmpty()){
                                MessageDialog messageDialog = new MessageDialog("Esta brigada no tiene eventos. Añada eventos a la brigada en el editor de brigada", "", Language.ES,this);
                                messageDialog.setVisible(true);
                                this.setEnabled(false);
                                return;
                            }
                            if(!g.brigadaTieneEstudiantes(Brigadas.elementAt(i))){
                                MessageDialog messageDialog = new MessageDialog("Esta brigada no tiene estudiantes. Añada estudiantes a la brigada en el editor de brigada", "",Language.ES, this);
                                messageDialog.setVisible(true);
                                this.setEnabled(false);
                                return;
                            }
                            Evento_estudiante EE = new Evento_estudiante(Brigadas.elementAt(i));
                            EE.setVisible(true);
                            dispose();
                        }
                    }
                }
                for (int i = 0; i < BrigadasSeleccionadas.size(); i++) {
                    if (BrigadasSeleccionadas.elementAt(i).getAnno() == anno && BrigadasSeleccionadas.elementAt(i).getAnno_brigada() == annoB && BrigadasSeleccionadas.elementAt(i).getCarrera().equals(carr)) {
                        if(g.obtenerEventosBrigada(Brigadas.elementAt(i)).isEmpty()){
                                MessageDialog messageDialog = new MessageDialog("Esta brigada no tiene eventos. Añada eventos a la brigada en el editor de brigada", "", Language.ES,this);
                                messageDialog.setVisible(true);
                                this.setEnabled(false);
                                return;
                            }
                        if(!g.brigadaTieneEstudiantes(Brigadas.elementAt(i))){
                            MessageDialog messageDialog = new MessageDialog("Esta brigada no tiene estudiantes. Añada estudiantes a la brigada en el editor de brigada", "",Language.ES, this);
                                messageDialog.setVisible(true);
                                this.setEnabled(false);
                                return;
                        }
                        Evento_estudiante EE = new Evento_estudiante(BrigadasSeleccionadas.elementAt(i));
                        EE.setVisible(true);
                        dispose();
                    }
                }
                openMain = false;
            }
            
        }

    }

    private void ComboBoxAnnosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_ComboBoxAnnosPopupMenuWillBecomeInvisible
        String seleccion = (String) ComboBoxAnnos.getSelectedItem();
        if (seleccion.equals("Todos")) {
            BrigadasAnnoB = 0;
            actualizarTablaBrigadas(Brigadas);
            return;
        }
        BrigadasAnnoB = Integer.parseInt((String) ComboBoxAnnos.getSelectedItem());

        actualizarTablaBrigadas(Brigadas, BrigadasAnno, BrigadasAnnoB, BrigadasCarrera);

    }//GEN-LAST:event_ComboBoxAnnosPopupMenuWillBecomeInvisible

    private void annoLabelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_annoLabelKeyReleased

        char X = evt.getKeyChar();
        Secuencias_cadenas.borrarLetras(X, annoLabel);
        if (annoLabel.getText().equals("")) {
            BrigadasAnno = 0;
            actualizarTablaBrigadas(Brigadas);
            return;
        }
        BrigadasAnno = Integer.parseInt(annoLabel.getText());

        if (BrigadasAnno >= 100 && BrigadasAnno < 10000) {
            actualizarTablaBrigadas(Brigadas, BrigadasAnno, BrigadasAnnoB, BrigadasCarrera);
        }

    }//GEN-LAST:event_annoLabelKeyReleased

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed

        dispose();
        
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (openMain) {
            Main m = new Main();
            m.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JComboBox<String> ComboBoxAnnos;
    private javax.swing.JLabel LabelBeigadasExistentes;
    private javax.swing.JTable TableBrigadasExistentes;
    private javax.swing.JLabel anno;
    private javax.swing.JLabel annoBrigada;
    private javax.swing.JTextField annoLabel;
    private javax.swing.JTextField carreraBrigada;
    private javax.swing.JButton editar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void actualizarTablaBrigadas(Vector<Brigada> V) {
        DefaultTableModel df = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        ;
        };
        TableBrigadasExistentes = new JTable(df);

        DefaultTableModel d = new DefaultTableModel();
        jScrollPane1.setViewportView(TableBrigadasExistentes);
        df.addColumn("Carrera");
        df.addColumn("Año");
        df.addColumn("Año escolar");

        Object[] ob = new Object[3];
        for (int i = 0; i < V.size(); i++) {
            ob[0] = V.elementAt(i).getCarrera();
            ob[1] = V.elementAt(i).getAnno();
            ob[2] = V.elementAt(i).getAnno_brigada();
            df.addRow(ob);
        }

    }

    private void actualizarTablaBrigadas(Vector<Brigada> V, Integer BA, Integer BAB, Vector<String> BC) {
        DefaultTableModel df = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        ;
        };
        TableBrigadasExistentes = new JTable(df);
        jScrollPane1.setViewportView(TableBrigadasExistentes);
        df.addColumn("Carrera");
        df.addColumn("Año");
        df.addColumn("Año escolar");

        BrigadasSeleccionadas = new Vector<>();
        if (BA != 0 && BAB == 0 && BC.isEmpty()) {
            for (int i = 0; i < V.size(); i++) {
                if (Secuencias_cadenas.mayor_subcadena((V.elementAt(i).getAnno() + ""), (BA + ""))) {
                    BrigadasSeleccionadas.add(V.elementAt(i));
                }
            }
        } else if (BA != 0 && BAB != 0 && BC.isEmpty()) {
            for (int i = 0; i < V.size(); i++) {
                if (Secuencias_cadenas.mayor_subcadena((V.elementAt(i).getAnno() + ""), (BA + "")) && BAB == V.elementAt(i).getAnno_brigada()) {
                    BrigadasSeleccionadas.add(V.elementAt(i));
                }
            }
        } else if (BA != 0 && BAB == 0 && !BC.isEmpty()) {
            for (int i = 0; i < V.size(); i++) {
                if (Secuencias_cadenas.mayor_subcadena((V.elementAt(i).getAnno() + ""), (BA + "")) && BC.contains(V.elementAt(i).getCarrera())) {
                    BrigadasSeleccionadas.add(V.elementAt(i));
                }
            }
        } else if (BA == 0 && BAB != 0 && BC.isEmpty()) {
            for (int i = 0; i < V.size(); i++) {
                if (BAB == V.elementAt(i).getAnno_brigada()) {
                    BrigadasSeleccionadas.add(V.elementAt(i));
                }
            }
        } else if (BA == 0 && BAB != 0 && !BC.isEmpty()) {
            for (int i = 0; i < V.size(); i++) {
                if (BAB == V.elementAt(i).getAnno_brigada() && BC.contains(V.elementAt(i).getCarrera())) {
                    BrigadasSeleccionadas.add(V.elementAt(i));
                }
            }

        } else if (BA == 0 && BAB == 0 && !BC.isEmpty()) {
            for (int i = 0; i < V.size(); i++) {
                if (BC.contains(V.elementAt(i).getCarrera())) {
                    BrigadasSeleccionadas.add(V.elementAt(i));
                }
            }
        } else {
            for (int i = 0; i < V.size(); i++) {
                if (Secuencias_cadenas.mayor_subcadena((V.elementAt(i).getAnno() + ""), (BA + "")) && BAB == V.elementAt(i).getAnno_brigada() && BC.contains(V.elementAt(i).getCarrera())) {
                    BrigadasSeleccionadas.add(V.elementAt(i));
                }
            }
        }
        Object[] ob = new Object[3];
        for (int i = 0; i < BrigadasSeleccionadas.size(); i++) {
            ob[0] = BrigadasSeleccionadas.elementAt(i).getCarrera();
            ob[1] = BrigadasSeleccionadas.elementAt(i).getAnno();
            ob[2] = BrigadasSeleccionadas.elementAt(i).getAnno_brigada();
            df.addRow(ob);
        }

    }
}