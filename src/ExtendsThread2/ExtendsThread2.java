
package ExtendsThread2;

import java.util.Scanner;

/**
 *
 * @author 20201pf.cc0050
 */

public class ExtendsThread2 extends Thread {
    
    public ExtendsThread2(String operacao) {
        super(operacao);
    }
    
    public void run() {
        try {
            Scanner entrada = new Scanner(System.in); // Cria uma instância da classe Scanner.
            
            System.out.println("Informe o primeiro número: ");
            String numero1 = entrada.nextLine();
            
            System.out.println("Informe o segundo número: ");
            String numero2 = entrada.nextLine();
            
            double numeroConvertido1 = Double.parseDouble(numero1);
            double numeroConvertido2 = Double.parseDouble(numero2);
            double resultadoOperacao;
            
            if(this.getName() == "S") {
                resultadoOperacao = numeroConvertido1 + numeroConvertido2;
                System.out.println("Resultado: " + resultadoOperacao);
            } else if(this.getName() == "Sub") {
                resultadoOperacao = numeroConvertido1 - numeroConvertido2;
                System.out.println("Resultado: " + resultadoOperacao);
            } else if(this.getName() == "M") {
                resultadoOperacao = numeroConvertido1 * numeroConvertido2;
                System.out.println("Resultado: " + resultadoOperacao);
            } else if(this.getName() == "D") {
                resultadoOperacao = numeroConvertido1 / numeroConvertido2;
                System.out.println("Resultado: " + resultadoOperacao);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   
}