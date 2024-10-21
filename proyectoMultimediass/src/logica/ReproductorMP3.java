/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import java.io.FileInputStream;
import java.io.IOException;
import javax.sound.sampled.Clip;


public class ReproductorMP3 {

    private Thread reproductorThread;
    
    public void reproducir(String rutaArchivo) {
        try {
            if (reproductorThread != null && reproductorThread.isAlive()) {
                // Detener el reproductor si ya está en reproducción
                reproductorThread.interrupt();
            }

            reproductorThread = new Thread(() -> {
                try (FileInputStream archivo = new FileInputStream(rutaArchivo)) {
                    AdvancedPlayer reproductor = new AdvancedPlayer(archivo);
                    reproductor.play();
                } catch (JavaLayerException | IOException e) {
                    System.out.println("Error al reproducir el archivo: " + e.getMessage());
                }
            });

            reproductorThread.start(); // Iniciar el hilo de reproducción
        } catch (Exception e) {
            System.out.println("Error al iniciar la reproducción: " + e.getMessage());
        }
    }


     void setVisible(boolean b) {
         throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     }
    public Clip getClip() {
    return null;
}
}