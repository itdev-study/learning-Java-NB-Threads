/*
 * This demo runs single Thread
 */
package learning.java.nb.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CurrentSingleThreadDemoAPP {
    static Thread t;
    public static void main(String[] args) {         
        t = Thread.currentThread();
        System.out.println("Name of current thread of this app is:" + t);
        t.setName("New ThreadName");
        System.out.println("New name of current thread of this app is:" + t);
        try {
            int i = 10;
            while (i > 0) {
                System.out.println("Number iteration of MainThread: "+i); 
                Thread.sleep(1000);
                i--;
            }
        } catch (InterruptedException ex) {
                Logger.getLogger(CurrentSingleThreadDemoAPP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
