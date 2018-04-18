/*
 * This demo runs Child Extends Thread
 */
package learning.java.nb.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TwoThreadsExtendsThreadDemo {
    public static void main(String[] args) {   
        new ChildThread();        
        System.out.println("Name of current thread of this app is:" + Thread.currentThread());        
        try {
            for(int i=10;i>0;i--){
                System.out.println("Number iteration of MainThread: "+i); 
                Thread.sleep(100);
                i--;
            }
        } catch (InterruptedException ex) {
                Logger.getLogger(TwoThreadsExtendsThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
}

class ChildThread extends Thread{
    ChildThread(){
        start();
    }    
    public void run(){
        for(int i2=10;i2>0;i2--){
           System.out.println("Number iteration of ChildThread: "+i2);  
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChildThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


