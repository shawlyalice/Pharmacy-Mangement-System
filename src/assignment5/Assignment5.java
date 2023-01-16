/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Shawly Rohman
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          BlockingQueue<String> q = new ArrayBlockingQueue<>(14);// CREATE A BLOCKING QUEUE//
        Producer producer1 = new Producer(q, "Producer 1:");
        Consumer consumer1 = new Consumer(q, "Consumer 1:");
        
          
    }
    
}
