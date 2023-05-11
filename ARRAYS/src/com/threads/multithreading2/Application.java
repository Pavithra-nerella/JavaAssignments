package com.threads.multithreading2;


    class StartThreads implements Runnable{

        public void run() {
            for(int n=0; n<8; n++) {
                System.out.println("Hi there! " + n);

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public class Application {

        public static void main(String[] args) {
            Thread thread1 = new Thread(new StartThreads());
            Thread thread2 = new Thread(new StartThreads());

            thread1.start();
            thread2.start();
        }
    }


