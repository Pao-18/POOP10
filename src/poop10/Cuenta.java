/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author Janet García
 * 
 * Clase que representa una cuenta bancaria 
 */
public class Cuenta {
    private double saldo;
    private int retirosRealizados; 
    
    /**
     * Constructor vacío
     */
    public Cuenta() {
    }
    /**
     * Constructor lleno 
     * @param saldo Saldo inicial de la cuenta 
     */
    public Cuenta(double saldo) {
        this.saldo = saldo;
        this.retirosRealizados=0;
    }
    /**
     * Método que devuelve saldo actual de la cuenta
     * @return Saldo siponible en la cuenta 
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Método para actualizar es estado del saldo
     * @param saldo Nuevo saldo de la cuenta 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Método para realizar un depósito en la cuenta
     * @param monto Monto a depositar 
     * @throws DepositoExcedidoException Si el monto excede los 20,000 
     */
    public void depositar(double monto) throws DepositoExcedidoException{
        if (monto > 20000){
            throw new DepositoExcedidoException ("No se permite este movimiento");
        }
        saldo += monto;
    }
    /**
     * Método para realizar un retiro de la cuenta 
     * @param monto Monto a retirar 
     * @throws SaldoInsuficienteException Saldo insuficiente para realizar la operación
     * @throws RetirosExcedidosException Si se eccede el número de retiros(3)
     */
    public void retirar(double monto) throws SaldoInsuficienteException, RetirosExcedidosException {
        if (retirosRealizados >=3){
            throw new RetirosExcedidosException("Se alcanzó el límite de retiros");
        }
        if (monto > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar");
        } else {
            saldo -= monto;
            retirosRealizados++;
        }
    }
    /**
     * Método que permite consultar el saldo actual de la cuenta 
     * @return Saldo actual disponible en la cuenta
     */
    public double consultarSaldo(){
        return getSaldo();
    }
    /**
     * Método para representar la cuenta en forma de cadena
     * @return Candena que represneta el saldo de la cuenta  
     */
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
    
   
}