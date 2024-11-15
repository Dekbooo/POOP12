/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * Clase que implementa la interfaz {@code Runnable} para la creación de un hilo
 * con capacidades de sincronización.
 * <p>
 * Esta clase representa un hilo que realiza operaciones sincronizadas sobre un
 * recurso compartido, demostrando el uso de sincronización con la interfaz Runnable.
 * </p>
 * 
 * @see Thread
 * @see Runnable
 * @see RecursoCompartido
 * @see POOP12
 * 
 * @author poo03alu09
 * @version 1.1
 */
public class HiloR implements Runnable {
    private final RecursoCompartido recurso;

    /**
     * Constructor que asigna un recurso compartido al hilo.
     *
     * @param recurso el recurso compartido que utilizará el hilo
     */
    public HiloR(RecursoCompartido recurso) {
        this.recurso = recurso;
    }

    /**
     * Método {@code run} que contiene la lógica de ejecución sincronizada del hilo.
     * <p>
     * Este método realiza un ciclo de 10 iteraciones. En cada iteración, incrementa
     * de manera sincronizada el contador del recurso compartido y muestra el valor
     * actual junto con el nombre del hilo.
     * </p>
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int valorActual = recurso.incrementar();
            System.out.println("Iteración " + i + " " + 
                             Thread.currentThread().getName() +
                             " - Contador: " + valorActual);
            
            try {
                Thread.sleep(100); // Pequeña pausa para simular trabajo
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + 
                                 " fue interrumpido");
            }
        }
        System.out.println("Termina el " + Thread.currentThread().getName());
    }
}
