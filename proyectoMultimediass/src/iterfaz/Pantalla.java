/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iterfaz;



import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.sound.sampled.Clip;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import logica.ReproductorMP3;

public class Pantalla extends JFrame {
    private Clip clip;
    List<String> duplicateFiles;
    Set<String> fileNames = new HashSet<>();
    public Pantalla() {
        this.setSize(960, 510);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        Reproducir = new javax.swing.JButton();
        Pausar = new javax.swing.JButton();
        Detener = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

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
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Extencion", "Artista", "Album", "Genero", "Duracion", "Año", "Ruta", "Tamaño"
            }
        ));
        jScrollPane1.setViewportView(menu);

        Reproducir.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        Reproducir.setText("Reproducir");
        Reproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReproducirActionPerformed(evt);
            }
        });

        Pausar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        Pausar.setText("PAUSAR");
        Pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausarActionPerformed(evt);
            }
        });

        Detener.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Detener.setText("DETENER");
        Detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetenerActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(Musica, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(154, 154, 154)
                            .addComponent(Video, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(167, 167, 167)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Detener, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(Reproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(Pausar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Musica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Video, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pausar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Detener, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Reproducir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagenActionPerformed
        
    }//GEN-LAST:event_ImagenActionPerformed

    private void MusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicaActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    
    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File folder = fileChooser.getSelectedFile();
        File[] listOfFiles = folder.listFiles((dir, name) -> name.endsWith(".mp3") || name.endsWith(".wav"));

        DefaultTableModel model = new DefaultTableModel(new String[]{"Nombre", "Extensión", "Artista", "Álbum", "Género", "Duración", "Año", "Ruta", "Tamaño"}, 0);
        menu.setModel(model);
        model.setRowCount(0);
        fileNames.clear(); // Limpiar nombres de archivos antes de agregar nuevos
        duplicateFiles.clear(); // Limpiar duplicados

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    String nombre = file.getName();
                    String extension = getFileExtension(file);
                    String artista = ""; // Completar según tu lógica
                    String album = ""; // Completar según tu lógica
                    String genero = ""; // Completar según tu lógica
                    String duracion = ""; // Completar según tu lógica
                    String año = ""; // Completar según tu lógica
                    String ruta = file.getAbsolutePath();
                    long tamaño = file.length();
                    
                    // Comprobar duplicados
                    if (fileNames.contains(nombre)) {
                        duplicateFiles.add(nombre);
                    } else {
                        fileNames.add(nombre);
                    }

                    model.addRow(new Object[]{nombre, extension, artista, album, genero, duracion, año, ruta, tamaño});
                }
            }
        }    
        
        if (!duplicateFiles.isEmpty()) {
            System.out.println("Archivos duplicados: " + duplicateFiles);
        } 
    }        
    }//GEN-LAST:event_MusicaActionPerformed

    private void VideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VideoActionPerformed

    private void ReproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReproducirActionPerformed
    int selectedRow = menu.getSelectedRow(); 
    if (selectedRow != -1) { 
        String rutaArchivo = (String) menu.getValueAt(selectedRow, 7); 

        // Reproducir el archivo seleccionado
        ReproductorMP3 reproductor = new ReproductorMP3();
        reproductor.reproducir(rutaArchivo);
        
        this.clip = reproductor.getClip(); 
    } else {
        System.out.println("No se seleccionó ningún archivo de música.");
    }                                           
    }//GEN-LAST:event_ReproducirActionPerformed

    private void DetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetenerActionPerformed
        if (clip != null) {
            clip.stop(); // Detiene la reproducción
            clip.close(); // Cierra el clip
        }// TODO add your handling code here:
    }//GEN-LAST:event_DetenerActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void PausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausarActionPerformed
    if (clip != null) {
        clip.start();
    } else {
        // Muestra un mensaje de error o maneja el caso cuando clip es null
        System.out.println("Error: clip no ha sido inicializado.");
    }
    }//GEN-LAST:event_PausarActionPerformed

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
    private javax.swing.JButton Detener;
    private javax.swing.JButton Imagen;
    private javax.swing.JButton Musica;
    private javax.swing.JButton Pausar;
    private javax.swing.JButton Reproducir;
    private javax.swing.JButton Video;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable menu;
    // End of variables declaration//GEN-END:variables

    private void setLocale(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
