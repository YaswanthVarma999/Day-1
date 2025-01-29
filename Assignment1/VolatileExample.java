package com.wt;

class VolatileExample {
    
    // volatile variable
    private static volatile boolean flag = false;

    static class ThreadA extends Thread {
        public void run() {
            // Thread A will wait until flag becomes true
            while (!flag) {
                // Busy-wait loop
            }
            System.out.println("Thread A: Flag is true, Thread A is ending.");
        }
    }

    static class ThreadB extends Thread {
        public void run() {
            try {
                // Simulating some work
                Thread.sleep(1000);  // Delay to ensure ThreadA is waiting
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;  // Change the value of flag
            System.out.println("Thread B: Flag set to true.");
        }
    }

    public static void main(String[] args) {
        ThreadA tA = new ThreadA();
        ThreadB tB = new ThreadB();
        
        tA.start();
        tB.start();
    }
}

