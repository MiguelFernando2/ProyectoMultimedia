/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iterfaz;

import org.jaudiotagger.tag.FieldKey; // metadatos acceso
import org.jaudiotagger.audio.AudioFile; // acceder
import org.jaudiotagger.audio.AudioFileIO; // Per entrada y salida
import org.jaudiotagger.tag.Tag; //Repres etiquetas
import org.jaudiotagger.audio.exceptions.CannotReadException;// se lanza cuando si no se lee audio
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;// cuando es invalido
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;// cuando de solo lectura
import org.jaudiotagger.tag.TagException;

import java.util.List; // lista ordenada
import java.io.File; // manejo de archivo Eliminar, lectura etc. 
import java.io.IOException; // error etrada/salida
import java.nio.file.Files; // trabaja Archivo Eli. creacion
import java.util.ArrayList; // Almacenar datos de for. ordenada
import java.util.HashMap; // acceso a los valores
import java.util.HashSet; // alamcena elementos unicos.
import java.util.Iterator; // correr coleccion for. ordenada
import java.util.Map; // acceso/modificacion
import java.util.Set; // no duplicados

import java.util.stream.Collectors; // manipulacion de flujo (streams)

import javax.sound.sampled.Clip; // reproduccion audio

import javax.swing.JFileChooser; // GUI acceso a archivos
import javax.swing.JFrame; // INTERFAZ
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; // modelo tabla JTable

import logica.ReproductorMP3; //contiene la logica 

public class Pantalla extends JFrame {

    static Pantalla getInstance() { 
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    private Clip clip;
    List<String> duplicateFiles;//almacena
    Set<String> fileNames = new HashSet<>(); //asegurar
    private Object reproductorThread; // segundo plano
    public Pantalla() {
        this.setSize(1300, 610);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// detener 
        this.setLocationRelativeTo(null);
        
        this.setTitle("Proyecto Multimedia");
        
        this.duplicateFiles = new ArrayList<>();
      //  this.fileNames = new ArrayList<>(); 
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Musica = new javax.swing.JButton();
        Imagen = new javax.swing.JButton();
        Video = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        tamañototal = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Pausar = new javax.swing.JButton();
        Reproducir = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        abrirDuplicado = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldBusqueda = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        mostrarArchivosMasGrandes = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        moverArchivo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        seleccionar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hs.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        Musica.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Musica.setText("MUSICA");
        Musica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicaActionPerformed(evt);
            }
        });

        Imagen.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Imagen.setText("IMAGEN");
        Imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagenActionPerformed(evt);
            }
        });

        Video.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        Video.setForeground(new java.awt.Color(51, 51, 51));
        Video.setText("VIDEO");
        Video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VideoActionPerformed(evt);
            }
        });

        menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Extencion", "Artista", "Album", "Genero", "Duracion", "Año", "Ruta", "Tamaño MB"
            }
        ));
        jScrollPane1.setViewportView(menu);

        tamañototal.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        tamañototal.setText("CALCULAR TAMAÑO:");
        tamañototal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañototalActionPerformed(evt);
            }
        });

        jTextField1.setText(" 0.00");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("TAMAÑO:");

        jLabel4.setText("MB");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tamañototal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tamañototal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Pausar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Pausar.setText("PAUSAR");
        Pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausarActionPerformed(evt);
            }
        });

        Reproducir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Reproducir.setText("REPRODUCIR");
        Reproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReproducirActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        abrirDuplicado.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        abrirDuplicado.setText("DUPLICADOS");
        abrirDuplicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirDuplicadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abrirDuplicado, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Reproducir, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(Pausar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pausar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abrirDuplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setText("    BUSQUEDA DE ARCHIVO POR NOMBRE, ARTISTA O ALBUM");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("INGRESE SU BUSQUEDA");

        jTextFieldBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBusquedaActionPerformed(evt);
            }
        });

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBusqueda)
                    .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel6.setText("ARCHIVOS GRANDES");

        mostrarArchivosMasGrandes.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        mostrarArchivosMasGrandes.setText("MOSTRAR");
        mostrarArchivosMasGrandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarArchivosMasGrandesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarArchivosMasGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarArchivosMasGrandes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        atras.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        atras.setText("REGRESAR");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        moverArchivo.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        moverArchivo.setText("MOVER MUSICA");
        moverArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverArchivoActionPerformed(evt);
            }
        });

        seleccionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1069, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Musica, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(228, 228, 228)
                                        .addComponent(Video, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(moverArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Musica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Video, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moverArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(263, 263, 263)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagenActionPerformed
        imagenes nuevaVentana = new imagenes();
    
    // Hacer visible la nueva ventana
        nuevaVentana.setVisible(true); // sobre pantalla
    }//GEN-LAST:event_ImagenActionPerformed
    private final List<String[]> datosOriginales = new ArrayList<>(); // alamacen
    private void MusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicaActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Per. elegir
    
    int resultado;
    
    resultado = fileChooser.showOpenDialog(this); // obtener ruta carpeta
    if (resultado == JFileChooser.APPROVE_OPTION) {
        File folder = fileChooser.getSelectedFile();
        
        List<File> listOfFiles = buscarMusicaRecursivamente(folder); //muetra lista

        DefaultTableModel model = new DefaultTableModel(new String[]{"Nombre", "Extensión", "Artista", "Álbum", "Género", "Duración", "Año", "Ruta", "Tamaño MB"}, 0);
        menu.setModel(model);
        
        // Limpiar listas y el modelo de la tabla
        fileNames.clear(); 
        duplicateFiles.clear(); 

        if (listOfFiles != null) {
            for (int i = 0; i < listOfFiles.size(); i++) {// recorre
                File file = listOfFiles.get(i);
                if (file.isFile()) {
                    String nombre = file.getName();
                    String extension = getFileExtension(file);
                    String artista = "Desconocido";
                    String album = "Desconocido";
                    String genero = "Desconocido";
                    String duracion = "Desconocido";
                    String año = "Desconocido";
                    String ruta = file.getAbsolutePath();
                    long tamaño = file.length();
                    
                    double tamañoMB = tamaño / (1024.0 * 1024.0);

                    //jaudioTagger
                    try {
                        AudioFile audioFile = AudioFileIO.read(file);
                        Tag tag = audioFile.getTag();
    
                        if (tag != null) {
                            artista = tag.getFirst(FieldKey.ARTIST) != null ? tag.getFirst(FieldKey.ARTIST) : "Desconocido";
                            album = tag.getFirst(FieldKey.ALBUM) != null ? tag.getFirst(FieldKey.ALBUM) : "Desconocido";
                            genero = tag.getFirst(FieldKey.GENRE) != null ? tag.getFirst(FieldKey.GENRE) : "Desconocido";
                            año = tag.getFirst(FieldKey.YEAR) != null ? tag.getFirst(FieldKey.YEAR) : "Desconocido";
                        }
                        int trackLength = audioFile.getAudioHeader().getTrackLength(); 
                        duracion = formatDuration(trackLength); 
                    } catch (IOException | CannotReadException | InvalidAudioFrameException | ReadOnlyFileException | TagException e) {
                        System.out.println("Error al leer el archivo de audio: " + e.getMessage());
                        e.printStackTrace();  //ayuda a identificar problemas.
                    }

                    // Comprobar duplicados
                    if (fileNames.contains(nombre)) {
                        duplicateFiles.add(nombre);
                    } else {
                        fileNames.add(nombre);
                    }

                    // Agregar fila al modelo de la tabla
                    String[] fila = new String[]{
                        nombre, extension, artista, album, genero, duracion, año, ruta, String.format("%.2f", tamañoMB)
                    };
                    model.addRow(fila);
                    datosOriginales.add(fila);
                }
            }
        }    
    }        
}

private List<File> buscarMusicaRecursivamente(File carpeta) { // explora
    List<File> archivosMusica = new ArrayList<>(); // declara lista arch, alamcenara
    
    File[] archivos = carpeta.listFiles(); // obtener arreglo, todo
    if (archivos != null) { // verificar si hay algo enla carpeta
        for (int i = 0; i < archivos.length; i++) {
            File archivo = archivos[i];
            
            if (archivo.isDirectory()) { //recursion
                archivosMusica.addAll(buscarMusicaRecursivamente(archivo));
            } else if (archivo.isFile() && //si tiene musica 
                       (archivo.getName().endsWith(".mp3") || archivo.getName().endsWith(".wav"))) { // Solo incluye MP3 y WAV
                archivosMusica.add(archivo);//
            }
        }
    }
    
    return archivosMusica; 
}

private String formatDuration(int segundos) {
    int minutos = segundos / 60;
    int segundosRestantes = segundos % 60;
    return String.format("%02d:%02d", minutos, segundosRestantes);
    }//GEN-LAST:event_MusicaActionPerformed
    
    private void VideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VideoActionPerformed
    videos nuevaVentana = new videos();
    
    // Hacer visible la nueva ventana
        nuevaVentana.setVisible(true); //sobre pantalla
    }//GEN-LAST:event_VideoActionPerformed
    private final ReproductorMP3 reproductor = new ReproductorMP3(); //variable
    private void ReproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReproducirActionPerformed
    int selectedRow = menu.getSelectedRow();  // obtener fila
        if (selectedRow != -1) { // fila seleccionada correcta que no sea -1
            
            String rutaArchivo = (String) menu.getValueAt(selectedRow, 7); // obtener valor ruta 7 
            System.out.println("Ruta del archivo: " + rutaArchivo); // Mensaje de depuración

        // Si hay un reproductor anterior, deténlo
            reproductor.detener(); // Detén el reproductor anterior

        // Reproducir el archivo seleccionado
        reproductor.reproducir(rutaArchivo); 
        } else {
            System.out.println("No se seleccionó ningún archivo de música.");
        }                     
    }//GEN-LAST:event_ReproducirActionPerformed

    private void PausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausarActionPerformed
    if (reproductor != null) {
        reproductor.pausar(); // Llama al método pausar en ReproductorMP3
    } else {
        System.out.println("Error: reproductor no ha sido inicializado.");
    }
    }//GEN-LAST:event_PausarActionPerformed

    private void tamañototalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañototalActionPerformed
    DefaultTableModel model = (DefaultTableModel) menu.getModel(); // Obtiene el modelo de la tabla
    double tamañoTotal = 0;

    // Iterar sobre las filas del modelo de la tabla
    for (int i = 0; i < model.getRowCount(); i++) {
        String tamañoStr = (String) model.getValueAt(i, 8); // La columna de tamaño está en el índice 8
        double tamañoMB = Double.parseDouble(tamañoStr); // Convertir a double
        tamañoTotal += tamañoMB; // Sumar al total
    }

    // Mostrar el tamaño total
        jTextField1.setText(String.format("%.2f MB", tamañoTotal));

    }//GEN-LAST:event_tamañototalActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    DefaultTableModel model = (DefaultTableModel) menu.getModel();

    // Verifica si hay filas en la tabla
    if (model.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "La tabla está vacía.");
        return; // Salir si no hay datos
    }

    // Obtiene la fila seleccionada
    int filaSeleccionada = menu.getSelectedRow(); // Obtén el índice de la fila seleccionada para eliminar

    // Verifica si se ha seleccionado una fila
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un archivo para eliminar.");
        return; // Salir si no se seleccionó nada
    }

    // Obtiene la ruta del archivo que se va a eliminar
    String rutaArchivo = (String) model.getValueAt(filaSeleccionada, 7); // Suponiendo que la ruta está en la columna 7

    // Confirmación antes de eliminar
    int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar el archivo: " + rutaArchivo + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
    
    if (respuesta == JOptionPane.YES_OPTION) { // si dice si
        File archivoAEliminar = new File(rutaArchivo); // cree objeto
        
        // Intentar eliminar el archivo del sistema de archivos
        if (archivoAEliminar.exists() && archivoAEliminar.delete()) { // Verifica que el archivo existe antes de eliminarlo
            model.removeRow(filaSeleccionada); // Eliminar la fila de la tabla
            JOptionPane.showMessageDialog(this, "El archivo ha sido eliminado permanentemente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar el archivo. Asegúrese de que no esté en uso y que la ruta sea correcta.");
        }
    }
    }//GEN-LAST:event_eliminarActionPerformed

    private void abrirDuplicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirDuplicadoActionPerformed
    DefaultTableModel model = (DefaultTableModel) menu.getModel(); // gestionar los datos
    
    // Verifica si hay filas en la tabla
    if (model.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "La tabla está vacía.");
        return; // Salir si no hay datos
    }

    Map<String, List<String[]>> archivos = new HashMap<>(); // Crear un mapa para guardar los nombres y sus rutas ayuda a agrupar 

    // Recopilar las rutas de los archivos
    for (int i = 0; i < model.getRowCount(); i++) {
        String nombreArchivo = (String) model.getValueAt(i, 0); // Nombre en la columna 0
        String rutaArchivo = (String) model.getValueAt(i, 7); // Ruta en la columna 7
        
        // Normalizar el nombre de archivo
        if (nombreArchivo != null && !nombreArchivo.trim().isEmpty() && rutaArchivo != null && !rutaArchivo.trim().isEmpty()) {
            nombreArchivo = nombreArchivo.trim().toLowerCase(); // convierte a minuscula
            rutaArchivo = rutaArchivo.trim();

            // Agregar la ruta al mapa
            archivos.putIfAbsent(nombreArchivo, new ArrayList<>());
            archivos.get(nombreArchivo).add(new String[] {
                (String) model.getValueAt(i, 0), // Nombre
                (String) model.getValueAt(i, 1), // Extensión
                (String) model.getValueAt(i, 2), // Artista
                (String) model.getValueAt(i, 3), // Álbum
                (String) model.getValueAt(i, 4), // Género
                (String) model.getValueAt(i, 5), // Duración
                (String) model.getValueAt(i, 6), // Año
                rutaArchivo, // Ruta
                (String) model.getValueAt(i, 8)  // Tamaño
            });
        }
    }

    // Lista para almacenar los duplicados
    List<String[]> archivosDuplicados = new ArrayList<>();

    // Verificar duplicados con nombres
    for (Iterator<Map.Entry<String, List<String[]>>> iterator = archivos.entrySet().iterator(); iterator.hasNext();) {
        Map.Entry<String, List<String[]>> entry = iterator.next();
        if (entry.getValue().size() > 1) { // Si hay más de un archivo con el mismo nombre
            archivosDuplicados.addAll(entry.getValue()); // Añadir todos los duplicados a la lista
        }
    }

    model.setRowCount(0); // Limpiar todas las filas del JTable

    // Agregar los archivos duplicados al modelo de la tabla
    if (archivosDuplicados.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se encontraron archivos duplicados.");
    } else {
        for (int i = 0; i < archivosDuplicados.size(); i++) {
            String[] archivo = archivosDuplicados.get(i);
            model.addRow(archivo); // Agregar cada fila de archivo duplicado a la tabla
        }
        JOptionPane.showMessageDialog(this, "Se encontraron " + archivosDuplicados.size() + " archivos duplicados.");
    }
    }//GEN-LAST:event_abrirDuplicadoActionPerformed

    private void jTextFieldBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaActionPerformed
       buscarActionPerformed(evt);
    }//GEN-LAST:event_jTextFieldBusquedaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
    String textoBuscado = jTextFieldBusqueda.getText().toLowerCase();// convierte a minuscula
    DefaultTableModel modeloTabla = (DefaultTableModel) menu.getModel(); // Obtiene el modelo de tu tabla
    modeloTabla.setRowCount(0); // Limpiar tabla antes de mostrar resultados

    // Verifica si hay datos originales
    if (datosOriginales.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay datos para buscar.");
        return; // Salir si no hay datos
    }

    // Usar un conjunto para almacenar rutas únicas y evitar duplicados
    Set<String> rutasUnicas = new HashSet<>();
    List<String[]> archivosEncontrados = new ArrayList<>();

    // Recorrer los datos originales y filtrar coincidencias
    for (int i = 0; i < datosOriginales.size(); i++) {
        String[] archivo = datosOriginales.get(i);
        String nombreArchivo = archivo[0]; 
        String artista = archivo[2];
        String album = archivo[3]; 
        String rutaArchivo = archivo[7]; 

    // Comprobar si hay coincidencias
        if (nombreArchivo.toLowerCase().contains(textoBuscado) ||
            artista.toLowerCase().contains(textoBuscado) ||
            album.toLowerCase().contains(textoBuscado)) {

        // Verificar si la ruta ya se ha agregado
            if (rutasUnicas.add(rutaArchivo)) { 
                archivosEncontrados.add(archivo); 
            }
        }
    }

    // Agregar los archivos encontrados al modelo de la tabla
    if (archivosEncontrados.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se encontraron resultados para: " + textoBuscado);
    } else {
        for (int i = 0; i < archivosEncontrados.size(); i++) {
            String[] archivo = archivosEncontrados.get(i);
            modeloTabla.addRow(archivo); // Agregar cada fila de archivo encontrado a la tabla
        }
        JOptionPane.showMessageDialog(this, "Se encontraron " + archivosEncontrados.size() + " archivos.");
    }
    }//GEN-LAST:event_buscarActionPerformed

    private void mostrarArchivosMasGrandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarArchivosMasGrandesActionPerformed
    List<File> archivosGrandes = new ArrayList<>();
    
    for (int i = 0; i < datosOriginales.size(); i++) {
        String[] fila = datosOriginales.get(i);
    // el nombre de archivo para buscar el archivo en el sistema
        File file = new File(fila[7]); // La ruta está en la posición 7
        if (file.exists()) {
            archivosGrandes.add(file);
        }
    }

    // Ordenar los archivos por tamaño de forma descendente
    archivosGrandes.sort((f1, f2) -> Long.compare(f2.length(), f1.length()));

    // Limitar a los primeros 10 archivos
    List<File> top10Archivos = archivosGrandes.stream().limit(10).collect(Collectors.toList());

    // Actualizar la tabla con los archivos más grandes
    DefaultTableModel model = new DefaultTableModel(new String[]{"Nombre", "Extensión", "Artista", "Álbum", "Género", "Duración", "Año", "Ruta", "Tamaño MB"}, 0);
    for (int i = 0; i < top10Archivos.size(); i++) {
        File file = top10Archivos.get(i);
        String nombre = file.getName();
        String extension = getFileExtension(file);
        String artista = "Desconocido";  
        String album = "Desconocido";    
        String genero = "Desconocido";   
        String duracion = "Desconocido";  
        String año = "Desconocido";       
        String ruta = file.getAbsolutePath();
        long tamaño = file.length();
        double tamañoMB = tamaño / (1024.0 * 1024.0);

    // Agregar fila al modelo de la tabla
        String[] fila = new String[]{
            nombre, extension, artista, album, genero, duracion, año, ruta, String.format("%.2f", tamañoMB)
        };
        model.addRow(fila);
    }

    menu.setModel(model);
    }//GEN-LAST:event_mostrarArchivosMasGrandesActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
    DefaultTableModel model = (DefaultTableModel) menu.getModel();
    model.setRowCount(0); // Limpia todas las filas

    // Vuelve a llenar la tabla con datos originales
    for (int i = 0; i < datosOriginales.size(); i++) {
        String[] fila = datosOriginales.get(i);
        model.addRow(fila); // Agrega las filas originales a la tabla
    }
    }//GEN-LAST:event_atrasActionPerformed

    private void moverArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverArchivoActionPerformed
    
    int filaSeleccionada = menu.getSelectedRow(); // Obtener la fila seleccionada

    // Verificar si se seleccionó una fila
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una canción de la tabla.");
        return; // Salir si no hay selección
    }
    
    // Obtener la ruta del archivo de la columna correspondiente
    String rutaArchivo = (String) menu.getValueAt(filaSeleccionada, 7); // La columna de la ruta es la 7

    System.out.println("Ruta del archivo: " + rutaArchivo); // Mensaje de depuración
    
    // Crear un objeto File para el archivo seleccionado
    File archivoSeleccionado = new File(rutaArchivo);
    
    // Verificar si el archivo existe
    if (!archivoSeleccionado.exists()) {
        JOptionPane.showMessageDialog(this, "El archivo seleccionado no existe en la ruta: " + rutaArchivo);
        return;
    }
    
    // Mostrar un JFileChooser para seleccionar la carpeta de destino
    JFileChooser carpetaChooser = new JFileChooser();
    carpetaChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int resultadoCarpeta = carpetaChooser.showOpenDialog(this);
    
    // Si se selecciona una carpeta
    if (resultadoCarpeta == JFileChooser.APPROVE_OPTION) {
        File carpetaDestino = carpetaChooser.getSelectedFile();
        File archivoDestino = new File(carpetaDestino, archivoSeleccionado.getName());
        
        // Verificar si el archivo destino ya existe
        if (archivoDestino.exists()) {
            JOptionPane.showMessageDialog(this, "Ya existe un archivo con el mismo nombre en la carpeta de destino.");
            return;
        }
        
        // Mover el archivo
        try {
            Files.move(archivoSeleccionado.toPath(), archivoDestino.toPath()); //Se intenta mover el archivo utilizando el método Files.move().
            JOptionPane.showMessageDialog(this, "Archivo movido con éxito a: " + archivoDestino.getAbsolutePath());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al mover el archivo: " + e.getMessage());
        }
    }

    }//GEN-LAST:event_moverArchivoActionPerformed

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
     
    }//GEN-LAST:event_seleccionarActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Pantalla().setVisible(true);
        });
    }
    
    private String getFileExtension(File file) {
        String name = file.getName();
        int lastIndexOfDot = name.lastIndexOf('.');
        if (lastIndexOfDot > 0 && lastIndexOfDot < name.length() - 1) {
            return name.substring(lastIndexOfDot + 1);
        }
        return "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Imagen;
    private javax.swing.JButton Musica;
    private javax.swing.JButton Pausar;
    private javax.swing.JButton Reproducir;
    private javax.swing.JButton Video;
    private javax.swing.JButton abrirDuplicado;
    private javax.swing.JButton atras;
    private javax.swing.JButton buscar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldBusqueda;
    private javax.swing.JTable menu;
    private javax.swing.JButton mostrarArchivosMasGrandes;
    private javax.swing.JButton moverArchivo;
    private javax.swing.JComboBox<String> seleccionar;
    private javax.swing.JButton tamañototal;
    // End of variables declaration//GEN-END:variables

}