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
public class Consumer implements Runnable {
    BlockingQueue<String> q;
    Thread t;
    String name;
     Consumer(BlockingQueue<String> q, String name) {
        this.q = q;
        this.name = name;
        t = new Thread(this, name);
        t.start();
    }


    @Override
    public void run() {
        System.out.println(name + "started...");
        while (true) {
            try {
                if (q.isEmpty()) {
                    System.out.println(name + ": Queue is empty...");
                    Thread.sleep(2000);
                }
                System.out.println(name + "Consumed " + q.take() + " from the buffer " + "\nFull Space : " + q.size());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
    

