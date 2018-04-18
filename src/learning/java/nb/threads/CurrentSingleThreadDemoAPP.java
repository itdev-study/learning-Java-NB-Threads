/*
 * This demo runs single Thread
 */
package learning.java.nb.threads;

public class CurrentSingleThreadDemoAPP {

    public static void main(String[] args) {         
        Thread t = Thread.currentThread();
        System.out.println("Demo of Threads in Java" + t);
        t.setName("Name of current thread of this app");
        
        
    }
    
}
