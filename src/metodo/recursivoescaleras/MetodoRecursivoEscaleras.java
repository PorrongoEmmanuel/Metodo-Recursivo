
package metodo.recursivoescaleras;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MetodoRecursivoEscaleras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodoRecursivoEscaleras esc= new MetodoRecursivoEscaleras();
        esc.bajarescalera(20);
            
        }
         public void bajarescalera(int escalones){
             if(escalones==0){//caso base
                 System.out.println("has terminado de bajar la escalera");
                 
             }else{
                 try {
                     //dominio, division de problema  original en (problema -1)
                     Thread.sleep(500);
                     System.out.println("bajando escalon " + escalones);
                     //haciendo uso de la reecursividad
                     bajarescalera(escalones -1);
                 } catch (InterruptedException ex) {
                     Logger.getLogger(MetodoRecursivoEscaleras.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
    }
    
}
