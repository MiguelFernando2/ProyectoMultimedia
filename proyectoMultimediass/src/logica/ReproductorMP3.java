
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
    private AdvancedPlayer reproductor; 
    private Thread reproductorThread; //hilo ejecuta la repro 
    private volatile boolean reproduciendo; 
    private Clip reproductorClip; // Se mantiene solo para archivos MP3
    
    
    public void detener() {
        if (reproductor != null) {
            reproductor.close(); // Cerrar el reproductor
            reproductor = null; // Restablecer reproductor
        }
        if (reproductorThread != null) { //hilo
            reproduciendo = false;
            reproductorThread = null; // Libera el recurso del hilo
        System.out.println("Reproducción detenida.");
        }
    }

    private void reproducirMP3(String rutaArchivo) {
        detener(); //llama

        reproduciendo = true; 

        reproductorThread = new Thread(() -> { // nuevo hilo
            
            try (FileInputStream archivo = new FileInputStream(rutaArchivo)) { // asegura que se cierre
                reproductor = new AdvancedPlayer(archivo);
                reproductor.play();
            } catch (JavaLayerException e) {
                System.out.println("Error al reproducir el archivo MP3: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error al abrir el archivo MP3: " + e.getMessage());
            } finally { // Restablezca al finalizar
                reproduciendo = false; 
                reproductor = null; 
            }
        });

        reproductorThread.start(); // Iniciar el hilo de reproducción
    }
    
    private String obtenerExtension(String rutaArchivo) {
        int i = rutaArchivo.lastIndexOf('.'); // busca el .
        if (i > 0 && i < rutaArchivo.length() - 1) { 
            return rutaArchivo.substring(i + 1).toLowerCase();// extrae la subacadena conviere minuscula
        }
        return ""; //vacia
    }
    // ruta archuvo
    public void reproducir(String rutaArchivo) {
        String extension = obtenerExtension(rutaArchivo);
        
        switch (extension) {
            case "mp3":
                reproducirMP3(rutaArchivo);
                break;
            default:
                System.out.println("Formato no soportado: " + extension);
                break;
        }
    }

    public void pausar() {
        if (reproductor != null && reproduciendo) {
            detener(); // Detener la reproducción
            System.out.println("Reproducción pausada.");
        } else {
            System.out.println("Error: reproductor no ha sido inicializado o no se está reproduciendo.");
        }
    }

    public Clip getClip() {
        return reproductorClip;
    }
}
