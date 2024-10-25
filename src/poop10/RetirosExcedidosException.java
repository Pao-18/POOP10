/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop10;

/**
 * Excepción que se lanza cuando se intenta hacer un retiro 
 * Hereda de la clase Exception
 * @author Janet García
 */
public class RetirosExcedidosException extends Exception{
    
    /**
     * Constructor vació 
     */
    public RetirosExcedidosException() {
    }
    /**
     * Constructor lleno 
     * @param message 
     */
    public RetirosExcedidosException(String message) {
        super(message);
    }
    
    
}
