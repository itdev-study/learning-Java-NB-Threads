/*
 * This demo runs Main - Threads Sync Demo
 */
package learning.java.nb.threads.multithread.sync;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultilThreadsImplementsRunnableSyncDemoAPP {  
    
    public static void main(String[] args) {  
        ChildrenThread childrenThread1;
        ChildrenThread childrenThread2;
        childrenThread1 = new ChildrenThread("ChildrenThread1");      
        childrenThread2 = new ChildrenThread("ChildrenThread2");  
        for(int i=10;i>0;i--){
                System.out.println("Number iteration of MainThread: "+i); 
//                    try {
//                        mainThread.sleep(100);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(MultilThreadsImplementsRunnableDemoAPP.class.getName()).log(Level.SEVERE, null, ex);
//                    }                
            }
        System.out.println(Thread.currentThread()+" ended");
    }    
}

class ChildrenThread implements Runnable{
    Thread childThread;
    ChildrenThread(String childThreadName){
        childThread = new Thread(this,childThreadName);
        childThread.start();
    }
    public void run() {   
            for(int i2=10;i2>0;i2--){
                System.out.println("Number iteration of Child: "+ Thread.currentThread() + "" + i2); 
//                    try {
//                        childThread.sleep(100);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(ChildrenThread.class.getName()).log(Level.SEVERE, null, ex);
//                    }               
            }
            System.out.println(Thread.currentThread()+" ended");
    }
}
