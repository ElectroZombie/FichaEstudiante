/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visuales;

import Base_de_Datos.Gestion;
import clases.Brigada;
import clases.DatosEstudiante;
import clases.Estudiante;
import clases.Nota;
import utiles.ReporteAlumnos;
import com.itextpdf.text.DocumentException;
import utiles.RadioButtonEditor;
import utiles.RadioButtonRenderer;
import com.toedter.calendar.JYearChooser;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utiles.Secuencias_cadenas;
import utiles.Tupla;
import dialogs.AbstractFrame;
import dialogs.ConfirmDialog;
import dialogs.MessageDialog;

public class Editor_brigada extends AbstractFrame {
    
    private final Gestion G = new Gestion();
    private final Vector<Estudiante> estudiantes;
    private final Brigada B;
    private Vector<Tupla<Integer, String>> eventosBrigada;
    private Vector<Tupla<Integer, String>> eventos;
    private Vector<Tupla<Integer, String>> eventosEliminados = new Vector<>();
    private Vector<JCheckBox> radioButtonEventos = new Vector<>();
    private boolean actualizacion;
    private Vector<String> dimensiones = new Vector<>();
    private boolean openMain;
    
    private HashSet<Integer> eventosAnnadidosID;

    public Editor_brigada(String Carr) {
        initComponents();
        openMain = true;
        B = null;
        actualizacion = false;
        estudiantes = new Vector<>();
        actualizarTabla(estudiantes);
        setTitle("Editor de Brigada");
        setResizable(false);
        setLocationRelativeTo(null);
        Carrera_seleccionada.setText(Carr);
        Anno_seleccionado.setText("1");
        ButtonReporteEstudiantes.setEnabled(false);
        JYearChooser YC = new JYearChooser();
        int Anno_actual = YC.getYear();
        for (int i = Anno_actual - 5; i <= Anno_actual + 5; i++) {
            Annos.addItem(i + "");
        }
        
        eventosBrigada = new Vector<>();
        eventosAnnadidosID = new HashSet<>();
        eventos = G.obtenerEventos();
        
        Pasar_anno.setEnabled(false);
        EditarEstudiante.setEnabled(false);
        agregarEventos.setEnabled(false);
        
    }
    
    public Editor_brigada(Brigada B) {
        initComponents();
        openMain = true;
        actualizacion = true;
        estudiantes = B.getEstudiantes();
        actualizarTabla(estudiantes);
        setTitle("Editor de Brigada");
        setResizable(false);
        setLocationRelativeTo(null);
        this.B = B;
        if(!B.getEstudiantes().isEmpty()){
        ButtonReporteEstudiantes.setEnabled(true);
        }
        else{
            ButtonReporteEstudiantes.setEnabled(false);
        }
        Carrera_seleccionada.setText(B.getCarrera());
        Anno_seleccionado.setText(B.getAnno_brigada() + "");

        eventosBrigada = new Vector<>();
        eventos = G.obtenerEventosAnno(B.getAnno());
        eventosAnnadidosID = G.obtenerBrigadaEventosH(B);
        
        for(int i = 0; i < eventos.size(); i++){
            if(eventosAnnadidosID.contains(eventos.elementAt(i).getN1())){
                eventosBrigada.add(eventos.elementAt(i));
            }
        }
        
        
        Pasar_anno.setEnabled(true);
        
        EditarEstudiante.setEnabled(true);
        
        Annos.setEnabled(false);
        Annos.addItem(B.getAnno() + "");
        
        dimensiones = G.obtenerDimensiones();
        for (int i = 0; i < dimensiones.size(); i++) {
            dimensionComboBox.addItem(dimensiones.elementAt(i));
        }
    }

    @Override
    public void confirmDialog_returnValue(Object O, int seleccion) {
    
        boolean opcion = (boolean)O;
        
        if(!opcion){
            return;
        }
        
        if (G.obtener_annos_carrera(B.getCarrera()) <= B.getAnno_brigada()) {
            if(B.getAnno_brigada()==1){
                
                MessageDialog messageDialog = new MessageDialog("No se puede pasar de año a esta brigada. La carrera solo tiene " + B.getAnno_brigada() + " año", "", Language.ES,this);
                
                openMain = true;
                return; 
            }
            
            MessageDialog messageDialog = new MessageDialog("No se puede pasar de año a esta brigada. La carrera solo tiene " + B.getAnno_brigada() + " años", "", Language.ES,this);
           
            openMain = true;
            return;
        }
        Brigada new_brigada = new Brigada(B.getCarrera(), B.getAnno() + 1, B.getAnno_brigada() + 1, B.getEstudiantes());
        G.agregar_brigada(new_brigada);
        Editor_brigada EB = new Editor_brigada(new_brigada);
        EB.setVisible(true);
        dispose();
    
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregar_estudiante = new javax.swing.JDialog();
        nombre = new javax.swing.JLabel();
        nombreT = new javax.swing.JTextField();
        CI = new javax.swing.JLabel();
        CIT = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();
        MenuEstudiantes = new javax.swing.JPopupMenu();
        EditarEstudiante = new javax.swing.JMenuItem();
        EliminarEstudiante = new javax.swing.JMenuItem();
        agregarEvento = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEventos = new javax.swing.JTable();
        aceptar = new javax.swing.JButton();
        dimension = new javax.swing.JLabel();
        dimensionComboBox = new javax.swing.JComboBox<>();
        Carrera_seleccionada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEst = new javax.swing.JTable();
        Anno_brigada = new javax.swing.JLabel();
        Finalizar = new javax.swing.JButton();
        Agregar_estudiante = new javax.swing.JButton();
        Carrera = new javax.swing.JLabel();
        Anno_seleccionado = new javax.swing.JLabel();
        Anno = new javax.swing.JLabel();
        Annos = new javax.swing.JComboBox<>();
        Pasar_anno = new javax.swing.JButton();
        agregarEventos = new javax.swing.JButton();
        ButtonReporteEstudiantes = new javax.swing.JButton();

        nombre.setText("Nombre y Apellidos:");

        nombreT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreTKeyReleased(evt);
            }
        });

        CI.setText("Carnet de Identidad:");

        CIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CITKeyReleased(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agregar_estudianteLayout = new javax.swing.GroupLayout(agregar_estudiante.getContentPane());
        agregar_estudiante.getContentPane().setLayout(agregar_estudianteLayout);
        agregar_estudianteLayout.setHorizontalGroup(
            agregar_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregar_estudianteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(agregar_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(agregar_estudianteLayout.createSequentialGroup()
                        .addComponent(nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreT, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(agregar_estudianteLayout.createSequentialGroup()
                        .addComponent(CI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(agregar_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Aceptar)
                            .addComponent(CIT))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        agregar_estudianteLayout.setVerticalGroup(
            agregar_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregar_estudianteLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(agregar_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(nombreT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregar_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CI)
                    .addComponent(CIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Aceptar)
                .addContainerGap())
        );

        EditarEstudiante.setText("Editar Estudiante");
        EditarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEstudianteActionPerformed(evt);
            }
        });
        MenuEstudiantes.add(EditarEstudiante);

        EliminarEstudiante.setText("Eliminar Estudiante");
        EliminarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEstudianteActionPerformed(evt);
            }
        });
        MenuEstudiantes.add(EliminarEstudiante);

        agregarEvento.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                agregarEventoWindowOpened(evt);
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
        jScrollPane2.setViewportView(tablaEventos);

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        dimension.setText("Dimensión");

        dimensionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        dimensionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimensionComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agregarEventoLayout = new javax.swing.GroupLayout(agregarEvento.getContentPane());
        agregarEvento.getContentPane().setLayout(agregarEventoLayout);
        agregarEventoLayout.setHorizontalGroup(
            agregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarEventoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(agregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarEventoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(agregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dimensionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(agregarEventoLayout.createSequentialGroup()
                                .addComponent(dimension)
                                .addGap(0, 112, Short.MAX_VALUE))))
                    .addComponent(aceptar))
                .addContainerGap())
        );
        agregarEventoLayout.setVerticalGroup(
            agregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(agregarEventoLayout.createSequentialGroup()
                        .addComponent(dimension)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dimensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(aceptar)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        TablaEst.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaEst);

        Anno_brigada.setText("Año de brigada:");

        Finalizar.setText("Finalizar");
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });

        Agregar_estudiante.setText("Agregar estudiante");
        Agregar_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_estudianteActionPerformed(evt);
            }
        });

        Carrera.setText("Carrera:");

        Anno.setText("Año:");

        Pasar_anno.setText("Pasar de año a la brigada");
        Pasar_anno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pasar_annoActionPerformed(evt);
            }
        });

        agregarEventos.setText("Agregar eventos");
        agregarEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEventosActionPerformed(evt);
            }
        });

        ButtonReporteEstudiantes.setText("Generar reporte de los estudiantes");
        ButtonReporteEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReporteEstudiantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Finalizar)
                    .addComponent(agregarEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Anno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Annos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Pasar_anno)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Anno_brigada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Anno_seleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Carrera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Carrera_seleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Agregar_estudiante)
                    .addComponent(ButtonReporteEstudiantes))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Carrera, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(Carrera_seleccionada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Anno_brigada)
                            .addComponent(Anno_seleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Anno)
                            .addComponent(Annos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(Pasar_anno)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonReporteEstudiantes)
                        .addGap(127, 127, 127)
                        .addComponent(Agregar_estudiante)
                        .addGap(18, 18, 18)
                        .addComponent(agregarEventos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Finalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Agregar_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_estudianteActionPerformed
        
        agregar_estudiante.setVisible(true);
        agregar_estudiante.setSize(500, 300);
        agregar_estudiante.setLocationRelativeTo(null);

    }//GEN-LAST:event_Agregar_estudianteActionPerformed

    private void nombreTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTKeyReleased
        if (Secuencias_cadenas.sonNumeros(evt.getKeyChar())) {
            
            Character caracterEtrada = evt.getKeyChar();
            String reeplazo = nombreT.getText().replaceAll(caracterEtrada.toString(), "");
            nombreT.setText(reeplazo);
        }
    }//GEN-LAST:event_nombreTKeyReleased

    private void CITKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CITKeyReleased
        
        Secuencias_cadenas.borrarLetras(evt.getKeyChar(), CIT);
        

    }//GEN-LAST:event_CITKeyReleased

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        
        String[] nombres = nombreT.getText().split(" ");
        
        if (nombres.length < 3) {
            MessageDialog messageDialog = new MessageDialog("El nombre completo del estudiante es incorrecto, pues debe tener al menos dos apellidos", "", Language.ES,this);
            return;
        }
        
        if (!Secuencias_cadenas.carnetIdentidadCorrecto(CIT.getText())) {
            MessageDialog messageDialog = new MessageDialog("El carnet de identidad es incorrecto", "", Language.ES,this);
            return;
        }
        
        Estudiante E = new Estudiante(nombreT.getText(), CIT.getText());
        
        boolean flag = G.agregar_estudiante(E, Carrera_seleccionada.getText());
        if (flag) {
            
            estudiantes.add(E);
            actualizarTabla(estudiantes);
            agregar_estudiante.setVisible(false);
            CIT.setText("");
            nombreT.setText("");
        } else {
            MessageDialog messageDialog = new MessageDialog("Ya existe un estudiante con este carnet de identidad", "", Language.ES,this);
            
        }
        if (actualizacion) {
            G.agregarEstudianteBrigada(E, B);
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void EditarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEstudianteActionPerformed
        if (G.existeDatosEstudiante(estudiantes.elementAt(TablaEst.getSelectedRow()).getCI())) {
            DatosEstudiante de = G.obtenerDatosEsttudiante(estudiantes.elementAt(TablaEst.getSelectedRow()));
            Editor_estudiante EE = new Editor_estudiante(estudiantes.elementAt(TablaEst.getSelectedRow()), Carrera_seleccionada.getText(), B, de);
            EE.setVisible(true);
            openMain = false;
            this.dispose();
        } else {
            Editor_estudiante EE = new Editor_estudiante(estudiantes.elementAt(TablaEst.getSelectedRow()), Carrera_seleccionada.getText(), B);
            EE.setVisible(true);
            openMain = false;
            this.dispose();
        }
        MenuEstudiantes.setVisible(false);
    }//GEN-LAST:event_EditarEstudianteActionPerformed

    private void EliminarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEstudianteActionPerformed
        
        Estudiante E = estudiantes.elementAt(TablaEst.getSelectedRow());
        estudiantes.remove(E);
        
        if (actualizacion) {
            G.agregarEstudianteBrigada(E, null);
        }
        
        actualizarTabla(estudiantes);
        MenuEstudiantes.setVisible(false);

    }//GEN-LAST:event_EliminarEstudianteActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
        
        Brigada brigada = null;
        if (!actualizacion) {
            brigada = new Brigada(Carrera_seleccionada.getText(), Integer.parseInt((String) Annos.getSelectedItem()), Integer.parseInt(Anno_seleccionado.getText()), estudiantes);
            if(G.existeBrigada(brigada)){
                
                String S = "Ya existe una brigada de primer año de la carrera \"" + Carrera_seleccionada.getText() + "\" en el año " + brigada.getAnno();
                MessageDialog messageDialog = new MessageDialog(S, "", Language.ES,this);
            
                return;
            }
            G.agregar_brigada(brigada);
        } else {
            brigada = new Brigada(Carrera_seleccionada.getText(), B.getAnno(), B.getAnno_brigada(), estudiantes);
            G.actualizarBrigada(brigada);
        }
        
        if (actualizacion) {
            G.actualizarEventosBrigada(brigada, eventosBrigada, eventosEliminados);
            dispose();
        } else {
            openMain = false;
            Editor_brigada EB = new Editor_brigada(brigada);
            EB.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_FinalizarActionPerformed

    private void Pasar_annoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pasar_annoActionPerformed
        openMain = false;
        ConfirmDialog confirmDialog = new ConfirmDialog(1, "Desea pasar de año la brigada", "",Language.ES, this);
        
    }//GEN-LAST:event_Pasar_annoActionPerformed

    private void agregarEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEventosActionPerformed
        
        agregarEvento.setVisible(true);
        agregarEvento.setSize(800, 600);
        agregarEvento.setLocationRelativeTo(null);
        
        actualizarTablaEventos((String) dimensionComboBox.getSelectedItem());

    }//GEN-LAST:event_agregarEventosActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        
        agregarEvento.setVisible(false);

    }//GEN-LAST:event_aceptarActionPerformed

    private void agregarEventoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_agregarEventoWindowOpened

    }//GEN-LAST:event_agregarEventoWindowOpened

    private void dimensionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimensionComboBoxActionPerformed
        
        actualizarTablaEventos((String) dimensionComboBox.getSelectedItem());
        
    }//GEN-LAST:event_dimensionComboBoxActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        MenuEstudiantes.setVisible(false);
    }//GEN-LAST:event_formMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        MenuEstudiantes.setVisible(false);
        if (openMain) {
            Main m = new Main();
            m.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosed

    private void ButtonReporteEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReporteEstudiantesActionPerformed
        try {
            Vector<Tupla<DatosEstudiante,Vector<Nota>>> datosEstudiantes= new Vector<>();
            for (int i = 0; i < B.getEstudiantes().size(); i++) {
                if(G.existeDatosEstudiante(B.getEstudiantes().elementAt(i).getCI())){
                    
                    Vector<Nota> notas=G.obtenerNotas(G.obtener_carrera(B.getCarrera()), B.getEstudiantes().elementAt(i), B.getAnno_brigada());
                    
                    DatosEstudiante datos = G.obtenerDatosEsttudiante(B.getEstudiantes().elementAt(i));
                    
                    Tupla<DatosEstudiante,Vector<Nota>> tupla= new Tupla<>(datos,notas);
                    
                    datosEstudiantes.add(tupla);
                }
            }
            ReporteAlumnos al = new ReporteAlumnos(datosEstudiantes, B);
            if(al.GenerarReporte()){
                MessageDialog messageDialog = new MessageDialog("Reporte creado exitosamente en el escritorio", "Información del sistema", Language.ES,this);
            
        }
        } catch (DocumentException ex) {
            Logger.getLogger(Editor_brigada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonReporteEstudiantesActionPerformed
    
    private void actualizarTabla(Vector<Estudiante> V) {
        DefaultTableModel df = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;                
            }
        ;
        };
        TablaEst = new JTable(df);
        jScrollPane1.setViewportView(TablaEst);
        df.addColumn("Nombre del estudiante");
        df.addColumn("Carnet de Identidad");
        
        Object[] ob = new Object[2];
        for (int i = 0; i < V.size(); i++) {
            ob[0] = (String) V.elementAt(i).getNombre_estudiante();
            ob[1] = (String) V.elementAt(i).getCI();
            
            df.addRow(ob);
        }
        
        TablaEst.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = TablaEst.rowAtPoint(e.getPoint());
                
                if (fila > -1) {
                    MenuEstudiantes.setLocation(e.getLocationOnScreen());
                    MenuEstudiantes.setVisible(true);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Agregar_estudiante;
    private javax.swing.JLabel Anno;
    private javax.swing.JLabel Anno_brigada;
    private javax.swing.JLabel Anno_seleccionado;
    private javax.swing.JComboBox<String> Annos;
    private javax.swing.JButton ButtonReporteEstudiantes;
    private javax.swing.JLabel CI;
    private javax.swing.JTextField CIT;
    private javax.swing.JLabel Carrera;
    private javax.swing.JLabel Carrera_seleccionada;
    private javax.swing.JMenuItem EditarEstudiante;
    private javax.swing.JMenuItem EliminarEstudiante;
    private javax.swing.JButton Finalizar;
    private javax.swing.JPopupMenu MenuEstudiantes;
    private javax.swing.JButton Pasar_anno;
    private javax.swing.JTable TablaEst;
    private javax.swing.JButton aceptar;
    private javax.swing.JDialog agregarEvento;
    private javax.swing.JButton agregarEventos;
    private javax.swing.JDialog agregar_estudiante;
    private javax.swing.JLabel dimension;
    private javax.swing.JComboBox<String> dimensionComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreT;
    private javax.swing.JTable tablaEventos;
    // End of variables declaration//GEN-END:variables

    private void actualizarTablaEventos(String dimension) {
        
        DefaultTableModel d = new DefaultTableModel() {
            
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 2;
            }
        ;
        };
        Object[] OBJ = new Object[3];
        d.addColumn("Evento");
        d.addColumn("Año");
        d.addColumn("Selección");
        radioButtonEventos = new Vector<>();
        
        if (dimension.equals("Todos")) {
            for (int i = 0; i < eventos.size(); i++) {
                OBJ[0] = G.obtenerNombreEvento(eventos.elementAt(i).getN1());
                radioButtonEventos.add(new JCheckBox("", false));
                OBJ[1] = eventos.elementAt(i).getN2();
                OBJ[2] = radioButtonEventos.lastElement();
                for (int j = 0; j < eventosBrigada.size(); j++) {
                    if (eventosBrigada.elementAt(j).getN1().equals(eventos.elementAt(i).getN1()) && eventosBrigada.elementAt(j).getN2().equals(eventos.elementAt(i).getN2())) {
                        radioButtonEventos.lastElement().setSelected(true);
                        break;
                    }
                }
                d.addRow(OBJ);
            }
        }
        else{
        for (int i = 0; i < eventos.size(); i++) {
            if(Integer.parseInt(eventos.elementAt(i).getN2().substring(eventos.elementAt(i).getN2().length()-4)) == B.getAnno() && G.obtenerDimensionEvento(eventos.elementAt(i), dimension)){
            OBJ[0] = G.obtenerNombreEvento(eventos.elementAt(i).getN1());
            radioButtonEventos.add(new JCheckBox("", false));
            OBJ[1] = eventos.elementAt(i).getN2();
            OBJ[2] = radioButtonEventos.lastElement();

                if (eventosAnnadidosID.contains(eventos.elementAt(i).getN1())) {
                    radioButtonEventos.lastElement().setSelected(true);

            }
            d.addRow(OBJ);
            }
        }
        }
        

        tablaEventos = new JTable(d);
        
        tablaEventos.setFont(new Font("arial", Font.BOLD, 14));
        tablaEventos.setRowHeight(30);
        tablaEventos.setShowGrid(true);
        
        tablaEventos.getColumn("Selección").setCellRenderer(
                new RadioButtonRenderer());
        tablaEventos.getColumn("Selección").setCellEditor(
                new RadioButtonEditor(new JCheckBox()));
        jScrollPane2.setViewportView(tablaEventos);
        
        tablaEventos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tablaEventos.rowAtPoint(e.getPoint());
                
                if (fila > -1) {
                    
                    int pos = 0;
                    
                    for (int i = 0; i < eventos.size(); i++) {
                        if (G.obtenerNombreEvento(eventos.elementAt(i).getN1()).equals(tablaEventos.getValueAt(fila, 0)) && eventos.elementAt(i).getN2().equals(tablaEventos.getValueAt(fila, 1))) {
                            pos = i;
                            break;
                        }
                    }
                    if (radioButtonEventos.elementAt(fila).isSelected()) {
                        eventosBrigada.add(eventos.elementAt(pos));
                        eventosAnnadidosID.add(eventos.elementAt(pos).getN1());
                        if (eventosEliminados.contains(eventos.elementAt(pos))) {
                            eventosEliminados.remove(eventos.elementAt(pos));
                        }
                        
                    } else {
                        eventosEliminados.add(eventos.elementAt(pos));
                        if (eventosBrigada.contains(eventos.elementAt(pos))) {
                            eventosBrigada.remove(eventos.elementAt(pos));
                            eventosAnnadidosID.remove(eventos.elementAt(pos).getN1());
                        }
                    }
                    
                }
            }
        });
        
    }
}
