
package ExtendsThread2;

/**
 *
 * @author 20201pf.cc0050
 */

public class Main2 {
    
    public static void main(String[] args) {
        // Soma.
        /*ExtendsThread2 thread1 = new ExtendsThread2("S");
        thread1.start();*/
        
        // Subtração.
        /*ExtendsThread2 thread2 = new ExtendsThread2("Sub");
        thread2.start();*/
        
        // Muultiplicação.
        ExtendsThread2 thread3 = new ExtendsThread2("M");
        thread3.start();
        
        // Divisão.
        /*ExtendsThread2 thread4 = new ExtendsThread2("D");
        thread4.start();*/
    }
}