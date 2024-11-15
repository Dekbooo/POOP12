/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 * Clase principal de la aplicación que demuestra la creación y ejecución de
 * hilos sincronizados en Java.
 * <p>
 * La clase {@code POOP12} contiene el método {@code main} en el que se crean y
 * ejecutan múltiples hilos que comparten un recurso común, demostrando el uso
 * de sincronización tanto con herencia de Thread como con implementación de Runnable.
 * </p>
 * 
 * @author poo03alu09
 * @version 1.1
 */
public class POOP12 {
    /**
     * Método principal que inicia la ejecución de la aplicación con hilos sincronizados.
     * <p>
     * Crea un recurso compartido y múltiples hilos que acceden a él de manera
     * sincronizada, demostrando tanto el uso de la clase Thread como de la
     * interfaz Runnable.
     * </p>
     *
     * @param args los argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        // Ejemplo usando la clase Hilo (extends Thread)
        RecursoCompartido recurso = new RecursoCompartido();
        Hilo h1 = new Hilo("Hilo1", recurso);
        Hilo h2 = new Hilo("Hilo2", recurso);
        Hilo h3 = new Hilo("Hilo3", recurso);
        
        h1.start();
        h2.start();
        h3.start();
        
        // Ejemplo usando HiloR (implements Runnable)
        RecursoCompartido recursoR = new RecursoCompartido();
        new Thread(new HiloR(recursoR), "hiloR1").start();
        new Thread(new HiloR(recursoR), "hiloR2").start();
        new Thread(new HiloR(recursoR), "hiloR3").start();
    }
}