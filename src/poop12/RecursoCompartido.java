/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * Clase que representa un recurso compartido entre hilos.
 * <p>
 * Esta clase contiene un contador compartido y métodos sincronizados para
 * incrementar y obtener su valor de manera segura en un entorno multihilo.
 * </p>
 * 
 * @author poo03alu09
 * @version 1.0
 */
public class RecursoCompartido {
    private int contador = 0;
    
    /**
     * Incrementa el contador de manera sincronizada.
     * <p>
     * Este método está sincronizado para garantizar que solo un hilo
     * puede modificar el contador a la vez, evitando condiciones de carrera.
     * </p>
     * 
     * @return el valor actualizado del contador
     */
    public synchronized int incrementar() {
        return ++contador;
    }
    
    /**
     * Obtiene el valor actual del contador de manera sincronizada.
     * 
     * @return el valor actual del contador
     */
    public synchronized int getContador() {
        return contador;
    }
}
