/*
 * This demo runs Main - Chaild Thread
 */
package learning.java.nb.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TwoThreadsDemoAPP {
    static Thread mainThread;
    public static void main(String[] args) {  
        new ChildrenThread();
        mainThread = Thread.currentThread();
        System.out.println("Native name of main thread:" + mainThread);
        mainThread.setName("NewMainThreadName");
        System.out.println("New name of main thread: " + mainThread);
        int i = 10;
        while (i > 0) {
           System.out.println("Number int implemention of MainThread: "+i); 
            try {
                mainThread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(TwoThreadsDemoAPP.class.getName()).log(Level.SEVERE, null, ex);
            }
            i--;
        }
        System.out.println("Main thread execution ended");
    }    
}

class ChildrenThread implements Runnable{
    Thread childThread;
    ChildrenThread(){
        childThread = new Thread(this,"New ChildrenThread");
        childThread.start();
    }
    public void run() {   
            int i2 = 10;
            while (i2 > 0) {
                System.out.println("Number int of ChildrenThread: "+i2);
                i2--;   
            try { 
                  childThread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ChildrenThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Chaild thread execution ended");
    }
}
