/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * Clase que extiende de {@code Thread} para la creación de un hilo personalizado
 * con capacidades de sincronización.
 * <p>
 * Esta clase representa un hilo que realiza operaciones sincronizadas sobre un
 * recurso compartido, garantizando la consistencia de los datos en un entorno multihilo.
 * </p>
 * 
 * @see Thread
 * @see RecursoCompartido
 * @see POOP12
 * 
 * @author poo03alu09
 * @version 1.1
 */
public class Hilo extends Thread {
    private final RecursoCompartido recurso;

    /**
     * Constructor que crea un nuevo hilo con el nombre especificado y
     * le asigna un recurso compartido.
     *
     * @param name el nombre que se asignará al hilo
     * @param recurso el recurso compartido que utilizará el hilo
     */
    public Hilo(String name, RecursoCompartido recurso) {
        super(name);
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
            System.out.println("Iteración " + i + " hilo " + getName() + 
                             " - Contador: " + valorActual);
            
            try {
                Thread.sleep(100); // Pequeña pausa para simular trabajo
            } catch (InterruptedException e) {
                System.out.println(getName() + " fue interrumpido");
            }
        }
        System.out.println("Termina " + getName());
    }
}
