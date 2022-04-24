
package ExtendsThread3;

import java.util.Calendar;

/**
 *
 * @author brener
 */

public class ExtendsThread3 extends Thread {
    
    public ExtendsThread3(String operacao) {
        super(operacao);
    }

    ExtendsThread3(Calendar dataHoraAtuais) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println("Tweet status: " + this.getName());
                Thread.sleep((long)(Math.random() * 8000));
                
                System.out.println("Data e hora atuais: " + this.getName());
                Thread.sleep((long)(Math.random() * 10000));
            }
        } catch (Exception e) {
            
        }
    }
}