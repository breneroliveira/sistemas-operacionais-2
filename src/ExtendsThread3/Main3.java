
package ExtendsThread3;

import java.util.Calendar;

/**
 *
 * @author brener
 */

public class Main3 {
    
    public static void main(String[] args) {
        Calendar dataHoraAtuais = Calendar.getInstance();
        
        ExtendsThread3 thread1 = new ExtendsThread3("tweet enviado.");
        thread1.start();
        
        ExtendsThread3 thread2 = new ExtendsThread3(dataHoraAtuais);
        thread2.start();
    }   
}