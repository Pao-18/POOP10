/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 * Método principal que ejemplifica el manejo de excepciones
 * personalizadas y comunes en Java,
 * @author Janet Gracía
 * 
 */
public class POOP10 {

    /**
     * Método principal que muestra ejemplos del manejo de excepciones
     * @param args the command line arguments
     * @throws DepositoExcedidoException Refiere a cuando el deposito excede el límite
     * @throws RetirosExcedididosException Refiere al número permtido de retiros
     */
    public static void main(String[] args) throws DepositoExcedidoException, RetirosExcedidosException {
        // TODO code application logic here
        System.out.println("Hola mundo");
        int a = 5; //java.lang.RuntimeException es el fully qualify name 
        float c= (float)a/2; // lo casteamos para que se pudiera llevar a cabo la divispon de foma correcta
        System.out.println(c);
        
        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            b[i]= i*10;
        }
        try {
        for (int i = 0; i <= 5; i++) { //el indice 5 esta fuera de los lìmites de 5 
            System.out.println(b[i]);
            
        }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Excepcion de desbordamiento de memoria");
        }
        System.out.println("hola eh sobrevivido");
        
        try { 
        float d = 4/0;
        System.out.println(d);
        }catch (ArithmeticException ex){
            System.out.println("Excepcion aritmetica");
        }
        
        
        float n = miMetodoDivision(100, 2);
        System.out.println(n);
        
        try{
        float m = miMetodoDivision(100, 0);
        System.out.println(m);
    }catch(ArithmeticException ex){
            System.out.println("Excepcion Aritmetica parmeada");
            System.out.println(ex.getStackTrace()); //manda una direccion 
            ex.printStackTrace();
    }
        System.out.println("A pesar de todo seguimos con el programa, ya no se interrumpe");
        float x = miMetodoDivision(20,5);
        System.out.println(x);
        
        try{
        int w = suma(3,5);
    }catch(UnsupportedOperationException ex){
            System.out.println("Excepcion de operacion no soportada");
            System.out.println("Atributo mensaje ");
            System.out.println(ex.getMessage());
    }
        System.out.println("###########");
        
        //Aqui
        try {
        Cuenta cuenta = new Cuenta(10000);
        System.out.println(cuenta.consultarSaldo());
        
        cuenta.depositar(1000);  
        System.out.println(cuenta.consultarSaldo());
        
        try {
            cuenta.depositar(25000);  
        } catch (DepositoExcedidoException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        cuenta.retirar(3000);
        cuenta.retirar(2000);
        cuenta.retirar(1000);
        System.out.println(cuenta.consultarSaldo());

        
        try {
            cuenta.retirar(500);  
        } catch (RetirosExcedidosException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    } catch (SaldoInsuficienteException e) {
        System.out.println("Exception: Saldo insuficiente");
    }

        }
    
    /**
     * 
     * Metodo para realizar la división entre dos números enteros
     * Se lanza un excepción aritmética si el divisior el cero
     * @param f Dividendo 
     * @param f0 Divisor 
     * @return Resultado de la división
     * @throws ArithmeticException es la división es sobre cero(0)
     */
    private static float miMetodoDivision(int f, int f0) throws ArithmeticException {
        return f/f0;
    }
    /**
     * Metodo que lanza un excepción fecticia de operación No soportada
     * @param i primer operando 
     * @param i0 segundo operando 
     * @return Resultado de la suma 
     * @throws UnsupportedOperationException siempre que se llama
     */
    private static int suma(int i, int i0) {
        //Excepcion ficticia 
        throw new UnsupportedOperationException("Operacion aun no soportada"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
