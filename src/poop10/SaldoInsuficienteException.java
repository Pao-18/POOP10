/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop10;

/**
 * Excepción para intentar realizar un retiro en la cuenta
 * Hereda de la clse Exception
 * @author Janet García
 */
public class SaldoInsuficienteException extends Exception {
    /**
     * Constructor vació 
     */
    public SaldoInsuficienteException() {
    }
    /**
     * Constructor lleno
     * @param message Describe el motivo del error que es el saldo insuficiente 
     */
    public SaldoInsuficienteException(String message) {
        super(message);
    }
   
}
