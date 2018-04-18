/*
 * This demo runs Main - Chaild Thread
 */
package learning.java.nb.threads.multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultilThreadsImplementsRunnableDemoAPP {  
    
    public static void main(String[] args) {  
        ChildrenThread childrenThread1;
        ChildrenThread childrenThread2;
        childrenThread1 = new ChildrenThread();      
        childrenThread2 = new ChildrenThread();  
        for(int i=10;i>0;i--){
                System.out.println("Number iteration of MainThread: "+i); 
//                    try {
//                        mainThread.sleep(100);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(MultilThreadsImplementsRunnableDemoAPP.class.getName()).log(Level.SEVERE, null, ex);
//                    }                
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
            for(int i2=10;i2>0;i2--){
                System.out.println("Number iteration of Child: "+ Thread.currentThread() + "" + i2); 
//                    try {
//                        childThread.sleep(100);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(ChildrenThread.class.getName()).log(Level.SEVERE, null, ex);
//                    }               
            }
            System.out.println("Child thread execution ended");
    }
}
