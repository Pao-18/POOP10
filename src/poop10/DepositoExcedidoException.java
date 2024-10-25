/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop10;

/**
 * Excepción que se lanza al realizar un deposito que excede el límite
 * Hereda de la clase Exception
 * @author Janet García
 */
public class DepositoExcedidoException extends Exception{
    /**
     * Constructor vació 
     */
    public DepositoExcedidoException() {
    }
    /**
     * Constructor lleno
     * @param message Describe motivo del error(deposito excedido)
     */
    public DepositoExcedidoException(String message){
        super(message);
    }
    
}
