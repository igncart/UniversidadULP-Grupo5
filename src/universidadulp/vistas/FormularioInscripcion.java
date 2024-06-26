/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadulp.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadulp.accesoADatos.AlumnoData;
import universidadulp.accesoADatos.InscripcionData;
import universidadulp.accesoADatos.MateriaData;
import universidadulp.entidades.Alumno;
import universidadulp.entidades.Inscripcion;
import universidadulp.entidades.Materia;

/**
 *
 * @author IGNACIO
 */
public class FormularioInscripcion extends javax.swing.JInternalFrame {

    private List<Materia> listaMat;
    private List<Alumno> listaAlu;
    
    private InscripcionData inscData;
    private MateriaData matData;
    private AlumnoData aluData;
    
    private DefaultTableModel modelo;
    
    public FormularioInscripcion() {
        initComponents();
        
        aluData = new AlumnoData();
        listaAlu = aluData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        matData = new MateriaData();
        
        cargarAlumnos();
        armarCabeceraTabla();
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbInscribir = new javax.swing.JButton();
        jbAnularInsc = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbSelecAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrbMatInsc = new javax.swing.JRadioButton();
        jrbMatNoInsc = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInsc = new javax.swing.JTable();

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnularInsc.setText("Anular inscripcion");
        jbAnularInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripción");

        jLabel2.setText("Seleccione un alumno:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Listado de materias");

        jrbMatInsc.setText("Materias inscriptas");
        jrbMatInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMatInscActionPerformed(evt);
            }
        });

        jrbMatNoInsc.setText("Materias NO inscriptas");
        jrbMatNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMatNoInscActionPerformed(evt);
            }
        });

        TablaInsc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ));
        jScrollPane1.setViewportView(TablaInsc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbMatInsc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbMatNoInsc)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbSelecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jbInscribir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAnularInsc)
                        .addGap(68, 68, 68)
                        .addComponent(jbSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbSelecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMatInsc)
                    .addComponent(jrbMatNoInsc))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnularInsc)
                    .addComponent(jbSalir))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbMatInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMatInscActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        jrbMatNoInsc.setSelected(false);
        cargarDatosInscriptas();
        jbAnularInsc.setEnabled(true);
        jbInscribir.setEnabled(false);
        
    }//GEN-LAST:event_jrbMatInscActionPerformed

    private void jrbMatNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMatNoInscActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        jrbMatInsc.setSelected(false);
        cargarDatosNoInscriptas();
        jbAnularInsc.setEnabled(false);
        jbInscribir.setEnabled(true);
    }//GEN-LAST:event_jrbMatNoInscActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = TablaInsc.getSelectedRow();
        if(filaSeleccionada != -1){
            Alumno a = (Alumno) jcbSelecAlumno.getSelectedItem();
            
            int idMateria = (Integer)modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria= (String)modelo.getValueAt(filaSeleccionada, 1);
            int anio=(Integer) modelo.getValueAt(filaSeleccionada, 2);
            Materia m=new Materia(idMateria, nombreMateria, anio,true);
            
            Inscripcion i=new Inscripcion(a,m,0);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();            
            
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = TablaInsc.getSelectedRow();
        if(filaSeleccionada != -1){
            Alumno a = (Alumno)jcbSelecAlumno.getSelectedItem();
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
            borrarFilaTabla();
        }else{
            JOptionPane.showMessageDialog(null, "Usted debe seleccionar una fila de la tabla");
        }
    }//GEN-LAST:event_jbAnularInscActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaInsc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnularInsc;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbSelecAlumno;
    private javax.swing.JRadioButton jrbMatInsc;
    private javax.swing.JRadioButton jrbMatNoInsc;
    // End of variables declaration//GEN-END:variables
    
    private void cargarAlumnos(){   //carga alumnos al combo box
        for (Alumno alumno : listaAlu) {
            jcbSelecAlumno.addItem(alumno);
        }
    }
    
    private void armarCabeceraTabla(){
        ArrayList<Object> filaCabecera= new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        
        TablaInsc.setModel(modelo);
    }
    
    public void borrarFilaTabla(){
        int indice=modelo.getRowCount()-1;
        
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    public void cargarDatosNoInscriptas(){
        Alumno selec = (Alumno)jcbSelecAlumno.getSelectedItem();
        listaMat = inscData.obtenerMateriasNOCursadas(selec.getIdAlumno());
        
        for (Materia materia : listaMat) {
            modelo.addRow(new Object[] {materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
        }
    } 
    
    public void cargarDatosInscriptas(){
        Alumno selec = (Alumno)jcbSelecAlumno.getSelectedItem();
        List <Materia> lista = (ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno() );
        
        for (Materia materia : lista) {
            modelo.addRow(new Object[] {materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
        }
    }
}
