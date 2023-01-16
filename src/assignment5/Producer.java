/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Shawly Rohman
 */
public class Producer implements Runnable  {
    
    BlockingQueue<String> q;
    Thread t;
    String name;
    Producer(BlockingQueue<String> q, String name) {
        this.q = q;
        this.name = name;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        
        System.out.println(name + "started...");
        int i = 0;
        while (true) {
            try {

                if (q.size() >= 14 ) {
                    System.out.println(name + ": Queue is full...");
                    Thread.sleep(2000);
                }
                i++;
                q.put("Data " + i);
                System.out.println(name + " Data " + i + " is inserted in the buffer" + "\nEmpty Space : " + q.remainingCapacity() + "\nFull Space : " + q.size());

                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
       
        
    }
    
}
